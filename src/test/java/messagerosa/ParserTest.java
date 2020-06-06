package messagerosa;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class ParserTest {


    @Test
    public void testForItalicStrikethrough(){
        String test1 = "We'll see you at ~_*4PM*_~";
        List<Parser.Style> parsed = Parser.parse(test1);
        assertEquals(parsed.get(0).getStart(), 17);
        assertEquals(parsed.get(0).getEnd(), 25);
        assertEquals(parsed.get(1).getStart(), 18);
        assertEquals(parsed.get(1).getEnd(), 24);
        assertEquals(parsed.get(2).getStart(), 19);
        assertEquals(parsed.get(2).getEnd(), 23);
    }

    @Test
    public void testForMultipleSpansSeparated(){
        String monospacedString = " We *expect* to see you at ~4PM~ 6PM.";
        List<Parser.Style> parsed = Parser.parse(monospacedString);
        assertEquals(parsed.get(0).getKeyword(), "*");
        assertEquals(parsed.get(0).getStart(), 4);
        assertEquals(parsed.get(0).getEnd(), 11);
        assertEquals(parsed.get(1).getKeyword(), "~");
        assertEquals(parsed.get(1).getStart(), 27);
        assertEquals(parsed.get(1).getEnd(), 31);
    }

    @Test
    public void testForMonospacedChars(){
        String monospacedString = " Use the ```Message``` API to notify users.";
        List<Parser.Style> parsed = Parser.parse(monospacedString);
        assertEquals(parsed.get(0).getKeyword(), "```");
        assertEquals(parsed.get(0).getStart(), 9);
        assertEquals(parsed.get(0).getEnd(), 21);
        assertEquals(parsed.size(), 1);
    }
}