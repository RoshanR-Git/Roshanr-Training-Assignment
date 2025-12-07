package exception;
import java.util.regex.*;

public class PhoneValidation {
    public static void main(String[] args) {

        String[] phones = {
            "001-765-989-3421",
            "+1-456-765-9345"
        };

        String regex = "^(\\+?\\d{1,3})-(\\d{3})-(\\d{3})-(\\d{4})$";

        Pattern pattern = Pattern.compile(regex);

        for(String phone : phones){
            Matcher matcher = pattern.matcher(phone);
            if(matcher.matches()){
                System.out.println(phone + " -> VALID");
            } else {
                System.out.println(phone + " -> INVALID");
            }
        }
    }
}
