package Utils;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FileReaderTest {

    @Test
    void readTextFile() {
        List<String> test = UserFileReader.readTextFile();
        Boolean dataPresent = test.isEmpty();

        Assertions.assertFalse(dataPresent);
    }
}