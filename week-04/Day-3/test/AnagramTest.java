import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram anagram;

    @Before
    public void setup() {
        anagram = new Anagram();
    }

    @Test
    public void stringLengthCompareble_SameLenght() {
        String string1="alma";
        String string2 ="aaml";
        assertTrue(anagram.stringLengthCompareble(string1,string2));
    }
    @Test
    public void stringLengthCompareble_DifferentLenght() {
        String string1="alma";
        String string2 ="aamasfafal";
        assertFalse(anagram.stringLengthCompareble(string1,string2));
    }


    @Test
    public void isAnagram_False() {
        String string1="alma";
        String string2 ="aamasfafal";
        assertFalse(anagram.IsAnagram(string1,string2));
    }
    @Test
    public void isAnagram_True() {
        String string1="aldj";
        String string2 ="aljd";
        assertTrue(anagram.IsAnagram(string1,string2));
    }
}