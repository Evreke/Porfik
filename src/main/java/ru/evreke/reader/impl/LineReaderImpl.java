package ru.evreke.reader.impl;

import ru.evreke.reader.api.LineReader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Возвращает строку из файла. Умеет неблокирующее и блокирующее чтение.
 * @author Antipin.A.A.
 * 11/10/20
 */
public class LineReaderImpl implements LineReader {

    @Override
    public String readLine(Path filePath, Integer lineNumber) throws IOException {
        if (lineNumber == 0) {
            throw new IllegalArgumentException("Строки нумеруются с 1");
        }
        try {
            return Files.readAllLines(filePath).get(--lineNumber);
        } catch (IOException e) {
            throw new IOException("Не удалось прочесть файл");
        }
    }

    @Override
    public String readLine(File filePath, Integer lineNumber) {
        // Твой код тут
        return null;
    }
}
