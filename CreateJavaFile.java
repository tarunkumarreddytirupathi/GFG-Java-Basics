
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateJavaFile {

    public static void main(String[] args) {
        // Create a scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Remove spaces from the input string
        String modifiedString = inputString.replace(" ", "-");

        String javaFileContent = "/* \n"
                + //
                "\n"
                + //
                "\n"
                + //
                "\n"
                + //
                "\n"
                + //
                "copy the below code and execute in GFG\n"
                + //
                "\n"
                + //
                "\n"
                + //
                "\n"
                + //
                "\n"
                + //
                "*/";
        // Define the filename for the new Java file
        String javaFilename = modifiedString + ".java";

        // Write the content to the new Java file
        try (FileWriter fileWriter = new FileWriter(javaFilename)) {
            fileWriter.write(javaFileContent);
            System.out.println("Java file '" + javaFilename + "' has been created with the modified string.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Close the scanner
        scanner.close();
    }
}
