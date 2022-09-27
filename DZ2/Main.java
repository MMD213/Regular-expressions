import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        Pattern pattern = Pattern.compile("(M\\w+)");
        Matcher matcher = pattern.matcher(" Makarov Ivanov Merculov");
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
