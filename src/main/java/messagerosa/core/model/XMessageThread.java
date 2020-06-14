package messagerosa.core.model;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class XMessageThread {
    private int offset; // normal form or simple chat..
    @NotNull
    private String startDate;
    @NotNull
    private String lastMessageId; // last incoming msgId
}
