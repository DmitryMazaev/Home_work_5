import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;

/**
 * Копирование файлов внутри директории в новую директорию /backup.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Files.createDirectory(Path.of("./backup"));
        DirectoryStream<Path> directory = Files.newDirectoryStream(Path.of("."));
        for (Path file : directory) {
            if (Files.isDirectory(file)) continue;
            Files.copy(file, Path.of("./backup/" + file.toString()));
            }
    }
}
