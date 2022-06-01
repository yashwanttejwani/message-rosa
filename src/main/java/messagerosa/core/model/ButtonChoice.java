package messagerosa.core.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ButtonChoice {
    private String key;
    private String text;
}
