package messagerosa.core.model;

import java.io.Serializable;
import java.io.StringWriter;
import java.time.Instant;
import java.util.ArrayList;

import javax.persistence.MappedSuperclass;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@MappedSuperclass
public class XMessage implements Serializable {
	public enum MessageState {
		NOT_SENT,
		FAILED_TO_DELIVER,
		DELIVERED,
		READ,
		REPLIED
	}

	//Persist
	private String app;

	//Persist
	private MessageID messageID;

	@NotNull
	private SenderReceiverInfo to;
	@NotNull
	private SenderReceiverInfo from;
	@NotNull

	//Persist
	private String channelURI; // whatsapp
	@NotNull

	//Persist
	private String providerURI; // gupshup

	//Persist
	@NotNull
	private Long timestamp;

	private String userState;
	private String encryptionProtocol;

	private MessageState messageState;

	private String lastMessageID;

	private ConversationStage conversationStage;
	
	@NotNull
	private ArrayList<Transformer> transformers; // -1 no transfer like ms3 transforms msg to next msg

	private XMessageThread thread;
	private XMessagePayload payload;

	public String style(String provider, String channel) {
		return this.payload.getText();
	}

	public String toXML() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(XMessage.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		StringWriter sw = new StringWriter();
		marshaller.marshal(this, sw);
		return sw.toString();
	}

	public void completeTransform() {
		transformers.remove(0);
	}

	public String getChannel(){
		return channelURI;
	}

	public String getProvider(){
		return providerURI;
	}

	public long secondsSinceLastMessage(){
		long messageTime = this.timestamp;
		long currentTimestamp = Instant.now().getEpochSecond();
		return currentTimestamp - messageTime;
	}

	public void setChannel(String channel){
		this.channelURI =channel;
	}

	public void setProvider(String provider){
		this.providerURI = provider;
	}

	public void setNextDestination(String destination){
		if(destination.equals("Outbound")){
			this.transformers = new ArrayList<>();

		}else{
			this.setNextDestination(TransformerRegistry.getName(transformers.get(0).getId()));
		}
	}

	public String getCampaign(){
		System.out.println("Called getCampaign");
		return "ResumeBuilder";
	}

	public String getMessageStateString(){
		return this.messageState.name();
	}
}
