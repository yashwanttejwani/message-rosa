package messagerosa.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SenderReceiverInfo {

	// persist
	private String userID; //PhoneNo
	private ArrayList<String> groups;
	private String campaignID;
	private String formID;
	private boolean bot;
	private boolean broadcast;
	private Map<String, String> meta;
	private DeviceType deviceType;
	private String deviceID; //UUID
	private String encryptedDeviceID; //Encrypted Device String
}
