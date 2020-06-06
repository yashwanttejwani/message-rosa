package messagerosa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class XMessage implements Serializable {

    private String messageId;

    private SenderReceiverInfo to;

    private SenderReceiverInfo from;

    private String channelURI;

    private String providerURI;

    private String timestamp;

    private String userState;

    private String encryptionProtocol;

    private ArrayList<Transformers> transformers;

    private MessageThread thread;


}
