package messagerosa.core.model;

public enum StylingTag {
	LIST("list"), 
	QUICKREPLYBTN("buttonsForListItems"),
	IMAGE("image"),
	AUDIO("audio"),
	VIDEO("video");

	private String name;

	StylingTag(String stylingTag) {
	    name=stylingTag;
	}

	public String toString() {
		return name;
	}
	
	public static StylingTag getEnumByText(String code) {
		for (StylingTag e : StylingTag.values()) {
			if (e.name.equals(code))
				return e;
		}
		return null;
	}
}