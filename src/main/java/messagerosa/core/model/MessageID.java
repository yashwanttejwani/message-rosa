package messagerosa.core.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageID {
   private String id;
   private String gupshupMessageID;
   private String whatsappMessageID;
}
