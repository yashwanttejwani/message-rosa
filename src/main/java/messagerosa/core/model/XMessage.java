package messagerosa.core.model;

import java.io.Serializable;
import java.io.StringWriter;
import java.util.ArrayList;

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
public class XMessage implements Serializable {
	private String messageId;
	@NotNull
	private SenderReceiverInfo to;
	@NotNull
	private SenderReceiverInfo from;
	@NotNull
	private String channelURI; // whatsapp
	@NotNull
	private String providerURI; // gupshup
	@NotNull
	private String timestamp;

	private String userState;
	private String encryptionProtocol;
	
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

}
