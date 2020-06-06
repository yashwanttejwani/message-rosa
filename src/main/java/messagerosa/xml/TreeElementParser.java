package messagerosa.xml;

import messagerosa.core.models.XMessage;
import messagerosa.xml.exception.InvalidStructureException;
import org.kxml2.io.KXmlParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chakshu
 * @author umang
 */
public class TreeElementParser extends ElementParser<XMessage> {
    private final int multiplicity;
    private final String instanceId;

    private static final String INSTANCE_ELEMENT = "instance";
    private static final String ID_ATTR = "id";

    public TreeElementParser(KXmlParser parser, int multiplicity, String instanceId) {
        super(parser);
        this.multiplicity = multiplicity;
        this.instanceId = instanceId;
    }

    @Override
    public XMessage parse() throws InvalidStructureException, IOException, XmlPullParserException {
        final int depth = parser.getDepth();
        final XMessage element = new XMessage(parser.getName(), multiplicity);
        for (int i = 0; i < parser.getAttributeCount(); ++i) {
            element.setAttribute(parser.getAttributeNamespace(i), parser.getAttributeName(i), parser.getAttributeValue(i));
        }

        final Map<String, Integer> multiplicitiesByName = new HashMap<>();

        // loop parses all siblings at a given depth
        while (parser.getDepth() >= depth) {
            switch (nextNonWhitespace()) {
                case KXmlParser.START_TAG:
                    String name = parser.getName();
                    final Integer multiplicity = multiplicitiesByName.get(name);
                    int newMultiplicity = (multiplicity != null) ? multiplicity + 1 : 0;
                    multiplicitiesByName.put(name, newMultiplicity);
                    XMessage childTreeElement = new TreeElementParser(parser, newMultiplicity, instanceId).parse();
                    //TODO: Add the above element to parent XMessage
                    break;
                case KXmlParser.END_TAG:
                    return element;
                case KXmlParser.TEXT:
                    element.setValue(parser.getText().trim());
                    break;
                default:
                    throw new InvalidStructureException(
                            "Exception while trying to parse an XML Tree, got something other than tags and text", parser);
            }
        }

        return element;
    }
}

