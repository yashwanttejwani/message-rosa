package messagerosa.core.model;

public enum MessageMediaError {
    PAYLOAD_TO_LARGE("payloadTooLarge"),
    EMPTY_RESPONSE("emptyResponse");
    private String name;

    MessageMediaError(String name) {
        this.name = name;
    }

    @Override
    public String toString() {return name;}

    public static MessageMediaError getErrorByText(String text){
        for (MessageMediaError e : MessageMediaError.values()){
            if(e.name.equals(text))
                return e;
        }
        return null;
    }
}

