package messagerosa.core.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageID {
   private String ID;
   private String gupshupMessageID;
   private String whatsappMessageID;
}
