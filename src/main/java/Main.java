import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final String USERNAME = "";
    private static final String PASSWORD = ""; // BE WARY OF STORING YOUR PASSWORD UNENCRYPTED

    private static final String CONNECTIONS_FILE = "data/connections.txt";

    public static void main(String[] args) throws IOException {

        LinkedinDriver driver = new LinkedinDriver();

        driver.login(USERNAME, PASSWORD);

        Scanner reader = new Scanner(new File(CONNECTIONS_FILE));

        while (reader.hasNextLine()) {
            driver.addConnection(reader.nextLine());
        }

        reader.close();

        driver.quit();

    }

}
