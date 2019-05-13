import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RaindropsTest {

    @Test
    public void numbers() {
        Raindrops test = new Raindrops();
        String pling = test.numbers(3);
        assertEquals("Pling", pling);

        String plang = test.numbers(10);
        assertEquals("Plang", plang);

        String plong = test.numbers(14);
        assertEquals("Plong", plong);

        String number = test.numbers(8);
        assertEquals("8", number);

        String plingplang = test.numbers(15);
        assertEquals("PlingPlang", plingplang);

        String plingplong = test.numbers(21);
        assertEquals("PlingPlong", plingplong);

        String plangplong = test.numbers(35);
        assertEquals("PlangPlong", plangplong);

        String plingplangplong = test.numbers(105);
        assertEquals("PlingPlangPlong", plingplangplong);
    }
}