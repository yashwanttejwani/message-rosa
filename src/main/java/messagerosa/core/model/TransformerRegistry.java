package messagerosa.core.model;

public class TransformerRegistry {


    public static String getName(String id) {
        switch (id){
            case "1":
                return "Broadcast";
            case "2":
                return "Form";
            case "3":
                return "Menu";
            case "4":
                return "Outbound";
            case "5":
                return "PDF";
        }
        return null;
    }

    public static String getID(String name) {
        switch (name){
            case "Broadcast":
                return "1";
            case "Menu":
                return "3";
            case "Outbound":
                return "4";
            case "PDF":
                return "5";
            default:
                return "2"; //Form
        }
    }
}
