package site.golets.java11;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunner {

    public static void main(String[] args) throws IOException, URISyntaxException {
        Path path = Paths.get(ClassLoader.getSystemResource("testFile.txt").toURI());
         // Files.readString JAVA 11
        String fileContent = Files.readString(path);
        System.out.println(fileContent);

        String newFileContent = fileContent.replace("line", "step");
        Files.writeString(Paths.get("newFile.txt"), newFileContent);
    }

}
