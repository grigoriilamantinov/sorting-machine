import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {

    private static final String GET_MESSAGE_BUBBLE = "bubbleMessage";
    private static final String GET_MESSAGE_INSERTION = "insertionMessage";
    private static final String GET_MESSAGE_QUICK_SORTING = "quickSortingMessage";


    public PropertiesLoader() {
        this.loadDataSourceProperties();
    }

    private final Properties properties = new Properties();

    private void loadDataSourceProperties() {
        FileInputStream stream;
        try {
            stream = new FileInputStream(
                "G:\\JAVA\\projects\\sorting-machine\\src\\main\\resources\\connection.properties"
            );
            properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getMessageAboutBubble() {
        return properties.getProperty(GET_MESSAGE_BUBBLE);
    }

    public String getMessageAboutQuickSorting() {
        return properties.getProperty(GET_MESSAGE_QUICK_SORTING);
    }

    public String getMessageAboutInsertion() {
        return properties.getProperty(GET_MESSAGE_INSERTION);
    }
}
