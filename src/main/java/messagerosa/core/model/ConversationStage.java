package messagerosa.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class ConversationStage {
    public enum State {
        STARTING,
        ONGOING,
        COMPLETED
    }
    int stage;
    State state;

}
