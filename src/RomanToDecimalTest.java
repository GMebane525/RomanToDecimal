import static org.junit.Assert.*;

/**
 * Junit test for RomanToDecimal class
 */

public class RomanToDecimalTest {

    @org.junit.Test
    public void romanToDecimal() {
        assertEquals(RomanToDecimal.romanToDecimal("XIV"), 14);
        assertEquals(RomanToDecimal.romanToDecimal("I"), 1);
        assertEquals(RomanToDecimal.romanToDecimal("V"), 5);
        assertEquals(RomanToDecimal.romanToDecimal("X"), 10);
        assertEquals(RomanToDecimal.romanToDecimal("XIII"), 13);
        assertEquals(RomanToDecimal.romanToDecimal("LIII"), 53);
        assertEquals(RomanToDecimal.romanToDecimal("MIII"), 1003);
        assertEquals(RomanToDecimal.romanToDecimal("DIII"), 503);
        assertEquals(RomanToDecimal.romanToDecimal("MIX"), 1009);
        assertEquals(RomanToDecimal.romanToDecimal("MIX"), 1009);
        assertEquals(RomanToDecimal.romanToDecimal("MCXI"), 1111);


        assertEquals(RomanToDecimal.romanToDecimal("hi mom"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("GIL"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("Mebane"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("GXI"), -1);

        assertEquals(RomanToDecimal.romanToDecimal("IVIVIV"), 16);
        assertEquals(RomanToDecimal.romanToDecimal("IXIX"), 20);
        assertEquals(RomanToDecimal.romanToDecimal("IXIVIXIV"), 30);
        assertEquals(RomanToDecimal.romanToDecimal("XLIXXLIX"), 120);

        assertNotEquals(RomanToDecimal.romanToDecimal("IXIXIXIV"), 1000);
        assertNotEquals(RomanToDecimal.romanToDecimal("VIVIVIV"), 900);
    }
}