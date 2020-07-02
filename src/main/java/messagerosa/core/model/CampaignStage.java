package messagerosa.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class CampaignStage {
    public enum State {
        STARTING,
        ONGOING,
        COMPLETED
    }
    int stage;
    State state;

}
