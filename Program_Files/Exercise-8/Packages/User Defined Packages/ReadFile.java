import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("Srija.txt");

        try {
            Scanner reader = new Scanner(file);
            System.out.println("Reading file contents:\n");

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
