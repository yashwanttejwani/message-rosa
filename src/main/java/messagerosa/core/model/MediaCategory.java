package messagerosa.core.model;

public enum MediaCategory {
	IMAGE("image"),
	AUDIO("audio"),
	VIDEO("video"),
	VOICE("voice"),
	FILE("file");

    private String name;

    MediaCategory(String mediaCategory) {
        name=mediaCategory;
    }

    public String toString(){
        return name;
    }

    public static String getEnumByString(String code){
        for(MediaCategory e : MediaCategory.values()){
            if(e.name.equals(code)) return e.name();
        }
        return null;
    }
}
