import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("test.txt");

            writer.write("Hello Java!");
            writer.write("\nWelcome to File Handling.");

            writer.close();

            System.out.println("Data written successfully");

        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }
}