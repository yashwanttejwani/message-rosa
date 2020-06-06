package messagerosa.core.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessageThread {
    private int offset;
    private String startDate;
    private String lastMessageId;
}
