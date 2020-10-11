package ru.evreke.reader.api;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public interface LineReader {
    String readLine(Path filePath, Integer lineNumber) throws IOException;
    String readLine(File filePath, Integer lineNumber);
}
