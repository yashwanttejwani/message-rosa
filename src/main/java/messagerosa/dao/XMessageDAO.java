package messagerosa.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class XMessageDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String gupshupMessageID;
    private String whatsappMessageID;
    private String userId;
    private String fromId;
    private String channel;
    private String provider;
    private Long timestamp;
    private String messageState;
    private String xMessage;
    private String app;
    private String auxData;
}
