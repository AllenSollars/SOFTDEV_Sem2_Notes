import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws Exception {
        // String FILE_NAME = "src/testFile.txt";
        // Path newFilePath = Paths.get(FILE_NAME);
        // try {
        // Files.createFile(newFilePath);
        // } catch (FileAlreadyExistsException ex) {
        // System.out.println("File already exists");
        // }

        // File newFile = new File(FILE_NAME);
        // boolean success = newFile.createNewFile();

        // if(success){
        // System.out.println("File Created");
        // }else{
        // System.out.println("File not created");
        // }

        // try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME)) {
        // }

        // try {
        // FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
        // fileOutputStream.close();
        // } catch (FileNotFoundException ex) {
        // System.out.println("File cannot be created");
        // }

        // String str = "Hello World";
        // FileWriter fileWriter = new FileWriter(FILE_NAME);
        // BufferedWriter writer = new BufferedWriter(fileWriter);
        // writer.write(str);
        // writer.close();

        double x = 7;
        double y = x / 5;
        double z = x + y;
        System.out.println(z);



        // String str = "Hello World";
        // FileWriter fileWriter = new FileWriter(FILE_NAME, true);
        // BufferedWriter writer = new BufferedWriter(fileWriter);
        // writer.append(str);
        // writer.append("\n");
        // // Call more writer.append to add to the file before closing
        // writer.close();

    }
}
