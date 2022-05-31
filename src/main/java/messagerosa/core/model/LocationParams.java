package messagerosa.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocationParams {
    private double longitude;
    private double latitude;
    private String address;
    private String url;
    private String name;
}
