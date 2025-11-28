package gr.aueb.cf.cf9.ch9;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NioReadWrite {
    public static void main(String[] args) {
        Path source = Path.of("C:\\Users\\jimro\\IdeaProjects\\Cf9Dev\\src\\gr\\aueb\\cf\\cf9\\ch9\\aueb.logo.jpg");
        Path target = Path.of("C:\\Users\\jimro\\IdeaProjects\\Cf9Dev\\src\\gr\\aueb\\cf\\cf9\\ch9\\aueb.logo-copy.jpg");
        Path textTarget = Path.of("C:\\Users\\jimro\\IdeaProjects\\Cf9Dev\\src\\gr\\aueb\\cf\\cf9\\ch9\\nio-hello.jpg");
        try{
            textWriter(textTarget);
            textReader(textTarget);
            binaryReadWrite(source, target);
        } catch (IOException e) {
            System.out.println("Η αντιγραφή απέτυχε");
        }


    }

    public static void textWriter(Path path) throws IOException {
        Files.createDirectories(path.getParent());
        Files.writeString(
                path,
                "Hello Coding",
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    }

    public static void textReader(Path path) throws IOException{
        String text = Files.readString(                // Functional Programming
                     path,
                     StandardCharsets.UTF_8
        );
        System.out.println(text);
    }

    public static void binaryReadWrite(Path source, Path target) throws IOException {
        try (var sourceStream = Files.newInputStream(source);
             var targetStream = Files.newOutputStream(target)) {

            sourceStream.transferTo(targetStream);  // Efficient binary copy!
            System.out.println("Binary copy completed!");

        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
