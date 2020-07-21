package messagerosa.core.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageId {
   private String Id;
   private String gupshupMessageId;
   private String whatsappMessageId;
}
