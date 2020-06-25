package messagerosa.xml;

import messagerosa.core.model.XMessage;
import messagerosa.xml.exception.InvalidStructureException;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.kxml2.io.KXmlParser;
import org.xmlpull.v1.XmlPullParserException;

import javax.xml.bind.JAXBException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import static junit.framework.TestCase.assertEquals;
import static messagerosa.utils.ResourcePathHelper.r;
import static org.junit.jupiter.api.Assertions.*;

class ElementParserTest {

    private static Path PRIMARY_XMESSAGE_PATH;

    @Before
    public void setUp() {
        PRIMARY_XMESSAGE_PATH = r("testMessage.xml");
    }

    @Test
    public void parseInternalInstances() throws IOException, JAXBException {
        InputStream inputStream = new FileInputStream("/Users/apple/chaks/experiments/java/message-rosa/src/test/java/messagerosa/xml/" +"testMessage.xml");
        XMessage message = XMessageParser.parse(inputStream);
        Assertions.assertEquals(1, 1);
    }
}