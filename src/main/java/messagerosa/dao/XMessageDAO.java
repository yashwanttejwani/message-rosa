package messagerosa.dao;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "x_message")
public class XMessageDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "gupshup_message_id")
    private String gupshupMessageId;
    @Column(nullable = false, name = "whatsapp_message_id")
    private String whatsappMessageId;
    private String userId;
    private String fromId;
    private String channel;
    private String provider;
    private LocalDateTime timestamp;
    private String messageState;
    private String xMessage;
    private String app;
    private String auxData;
}
