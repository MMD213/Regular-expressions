import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mit {
    void search() {

        Pattern pattern = Pattern.compile("(M\\w+)");
        Matcher matcher = pattern.matcher("Makarov Merculov Ivanov");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
