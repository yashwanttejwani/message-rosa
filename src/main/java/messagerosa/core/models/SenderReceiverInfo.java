package messagerosa.core.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SenderReceiverInfo {

    private String userIdentifier;

    private String campaignId;

    private String formId;

    private boolean bot;

    private boolean broadcast;
}
