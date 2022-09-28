import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mit {
    void Gas() {

        Pattern pattern = Pattern.compile("(M\\w+)");
        Matcher matcher = pattern.matcher("Makarov Merculov Ivanov");
        boolean found = matcher.matches();
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}


