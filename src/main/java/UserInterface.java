import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringJoiner;

public class UserInterface {
    public String getMessageAboutBubble(PropertiesLoader loader) {
        File file = new File(loader.getMessageAboutBubble());
        return this.formatMessage(file);
    }

    private String formatMessage(File file) {
        StringJoiner joiner = new StringJoiner("\n");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                joiner.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return joiner.toString();
    }
}
