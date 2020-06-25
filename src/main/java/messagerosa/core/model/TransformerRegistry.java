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
}
