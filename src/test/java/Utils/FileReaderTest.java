package Utils;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void readTextFile() {
        List<String> test = FileReader.readTextFile();
        String testString = test.get(0).substring(0,7);
        Assert.assertEquals("manager",testString);
    }
}