import ru.evreke.reader.api.LineReader;
import ru.evreke.reader.impl.LineReaderImpl;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws IOException, URISyntaxException {
        LineReader reader = new LineReaderImpl();
        reader.readLine(Paths.get(ClassLoader.getSystemResource("sample.txt").toURI()), 2);
        // Твой код ниже
    }
}
