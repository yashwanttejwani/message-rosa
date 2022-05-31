package messagerosa.xml;

import messagerosa.core.model.XMessage;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class XMessageParserTest {

    @Test
    void parse() throws FileNotFoundException, JAXBException {
        InputStream inputStream = new FileInputStream("~/message-rosa/src/test/java/messagerosa/xml/" + "testMessage.xml");
        XMessage message = XMessageParser.parse(inputStream);
        System.out.println(message.toXML());
        assertEquals(1, 1);
    }
}