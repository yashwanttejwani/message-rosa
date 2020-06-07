package messagerosa.core.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessagePayload implements Serializable {
    private String text;
    private MessageMedia media;
    private LocationParams location;
    private ContactCard contactCard;

}
