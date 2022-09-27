import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        Pattern pattern = Pattern.compile("(([0-1]\\d|2\\[0-4])\\:\\d\\d)");
        Matcher matcher = pattern.matcher("Завтрак в 09:00, ужин в 18:00, обед в 13:00, обед в 121:00");
        while (matcher.find()){
            System.out.println(matcher.group() + " ");
        }
        System.out.println("");
    }
}
