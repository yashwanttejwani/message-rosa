package messagerosa.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.io.StringWriter;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class XMessage implements Serializable {

    private String messageId;

    private SenderReceiverInfo to;

    private SenderReceiverInfo from;

    private String channelURI;

    private String providerURI;

    private String timestamp;

    private String userState;

    private String encryptionProtocol;

    private ArrayList<Transformer> transformers;

    private MessageThread thread;

    private MessagePayload payload;

    public String style(String provider, String channel){
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

    public void completeTransform(){
        transformers.remove(0);
    }

}
