import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {

    CountLetters countLetters;

    @Before
    public void setup(){
        countLetters = new CountLetters();
    }

    @Test
    public void HappyhashMapper() {
        Map<Character, Integer> hm= new HashMap<>();
        hm.put('a',2);
        hm.put('l',1);
        hm.put('m',1);
        assertEquals(hm,countLetters.hashMapper("alma"));
    }
    @Test
    public void HappyhashMapper_EmptyString() {
        Map<Character, Integer> hm= new HashMap<>();
        assertEquals(hm,countLetters.hashMapper(""));
    }

}