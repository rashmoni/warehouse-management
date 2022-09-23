package Utils;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

class FileReaderTest {

    @Test
    void readTextFile() {
        List<String> test = UserFileReader.readTextFile();
        Boolean dataPresent = test.isEmpty();

        Assert.assertFalse(dataPresent);
    }
}