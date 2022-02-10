package messagerosa.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class XMessagePayload {
	private String text;
	private MessageMedia media;
	private LocationParams location;
	private ContactCard contactCard;
	private ArrayList<ButtonChoice> buttonChoices;
	private String stylingTag;
	private String flow;
	private Integer questionIndex;
}
