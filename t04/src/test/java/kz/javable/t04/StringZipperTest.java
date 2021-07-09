package kz.javable.t04;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringZipperTest {
    static StringZipper stringZipper;
    static Random random;

    @BeforeAll
    static void setUp() {
        stringZipper = new StringZipper();
        random = new Random();
    }

    @Test
    void testEmptyString() {
        assertEquals("", stringZipper.zipString(" !#"));
    }

    @Test
    void testOneDigitString() {
        assertEquals("1", stringZipper.zipString("1"));
    }

    @Test
    void testTwoNeighborDigitString() {
        assertEquals("1:2", stringZipper.zipString("1,2"));
    }

    @Test
    void testTwoDigitString() {
        assertEquals("4;6", stringZipper.zipString("4,6"));
    }

    @Test
    void testTreeNeighborDigitString() {
        assertEquals("5:7", stringZipper.zipString("7,6,5"));
    }

    @Test
    void testFourNeighborDigitString() {
        assertEquals("-1:2", stringZipper.zipString("-1,2,1,0,"));
    }

    @Test
    void testTwoArraysString() {
        assertEquals("-1:2;4:6", stringZipper.zipString("-1,2,1,0,4,5,6"));
    }

    @Test
    void testOneHugeArraysString() {
        int start = random.nextInt();
        int length = random.nextInt(100000);
        String expected = String.format("%d:%d", start, start + length - 1);

        assertEquals(expected, stringZipper.zipString(generateString(start, length)));
    }

    @Test
    void testTwoHugeArraysString() {
        int start1 = random.nextInt();
        int length1 = random.nextInt(10000);
        int start2 = start1 + length1 + 1 + random.nextInt(100);
        int length2 = random.nextInt(10000);

        var expected = String.format("%d:%d;%d:%d", start1, start1 + length1 - 1, start2, start2 + length2 - 1);
        var input = String.format("%s %s", generateString(start1, length1), generateString(start2, length2));

        assertEquals(expected, stringZipper.zipString(input));
    }

    @Test
    void testOneHugeArraysWithNonPunctuationSymbolString() {
        String delimeters = "!@#$%^&*(){}[].,:;";
        int start = random.nextInt();
        int length = random.nextInt(100);
        String expected = String.format("%d:%d", start, start + length - 1);
        assertEquals(expected, stringZipper.zipString(generateString(start, length, Character.toString(delimeters.charAt(random.nextInt(delimeters.length()))))));
    }

    String generateString(int start, int length, String d) {
        String[] a = new String[length];
        for (int i = start; i < start + length; i++) {
            a[i - start] = Integer.toString(i);
        }
        return String.join(d, a);
    }

    String generateString(int start, int length) {
        return generateString(start, length, " ");
    }


}