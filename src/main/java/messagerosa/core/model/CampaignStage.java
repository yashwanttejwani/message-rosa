package messagerosa.core.model;

public class CampaignStage {
    public enum State {
        STARTING,
        ONGOING,
        COMPLETED
    }
    String stage;
    State state;

}
