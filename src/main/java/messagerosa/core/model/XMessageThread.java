package messagerosa.core.model;

import com.sun.istack.NotNull;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class XMessageThread {
    private int offset; // normal form or simple chat..
    @NotNull
    private String startDate;
    @NotNull
    private String lastMessageId; // last incoming msgId
}
