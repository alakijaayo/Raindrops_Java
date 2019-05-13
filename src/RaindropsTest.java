import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RaindropsTest {

    @Test
    public void numbers() {
        Raindrops test = new Raindrops();
        String pling = test.numbers(3);
        String plang = test.numbers(10);
        String plong = test.numbers(14);
        String number = test.numbers(8);
        String plingplang = test.numbers(15);
        String plingplong = test.numbers(21);
        String plangplong = test.numbers(35);
        String plingplangplong = test.numbers(105);
        assertEquals("Pling", pling);
        assertEquals("Plang", plang);
        assertEquals("Plong", plong);
        assertEquals("8", number);
        assertEquals("PlingPlang", plingplang);
        assertEquals("PlingPlong", plingplong);
        assertEquals("PlangPlong", plangplong);
        assertEquals("PlingPlangPlong", plingplangplong);
    }
}