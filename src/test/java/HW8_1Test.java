import org.junit.Test;

import static org.junit.Assert.*;


public class HW8_1Test {

    @Test
    public void testFixed() {
        assertEquals("S.H", HW8_1.abbrevName("Sam Harris"));
        assertEquals("P.F", HW8_1.abbrevName("Patrick Feenan"));
        assertEquals("E.C", HW8_1.abbrevName("Evan Cole"));
        assertEquals("P.F", HW8_1.abbrevName("P Favuzzi"));
        assertEquals("D.M", HW8_1.abbrevName("David Mendieta"));
    }

    @Test
    public void fixedTest() {
        assertTrue(HW8_1.feast("great blue heron", "garlic nann"));
        assertTrue(HW8_1.feast("chickadee", "chocolate cake"));
        assertFalse(HW8_1.feast("brown bear", "bear claw"));
    }
    @Test
    public void tests() {
        assertEquals("ttlheoiscstk", HW8_1.tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", HW8_1.tripleTrouble("aa","bb","cc"));
        assertEquals("Batman", HW8_1.tripleTrouble("Bm", "aa", "tn"));
        assertEquals("LexLuthor", HW8_1.tripleTrouble("LLh","euo","xtr"));
    }
    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", HW8_1.position2('a'));
        assertEquals("Position of alphabet: 26", HW8_1.position2('z'));
        assertEquals("Position of alphabet: 5", HW8_1.position2('e'));
    }
    @Test
    public void sampleTests() {
        assertEquals(21, HW8_1.arrayPlusArray2(new int[]{1,2,3}, new int[]{4,5,6}));
        assertEquals(-21, HW8_1.arrayPlusArray2(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        assertEquals(15, HW8_1.arrayPlusArray2(new int[]{0,0,0}, new int[]{4,5,6}));
        assertEquals(2100, HW8_1.arrayPlusArray2(new int[]{100,200,300}, new int[]{400,500,600}));
    }
}