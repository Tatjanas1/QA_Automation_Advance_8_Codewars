import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HW8_2Test {

    @Test
    void boolToWord() {
      assertEquals(HW8_2.boolToWord(true),"Yes");
      assertEquals(HW8_2.boolToWord(false),"No");
    }
    @Test
    public void testBasics()
    {
        System.out.println("Basic Tests");
        assertThat(HW8_2.basicMath("+", 4, 7), is(11));
        assertThat(HW8_2.basicMath("-", 15, 18), is(-3));
        assertThat(HW8_2.basicMath("*", 5, 5), is(25));
        assertThat(HW8_2.basicMath("/", 49, 7), is(7));
    }
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1},HW8_2.reverse(5));
    }
    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, HW8_2.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, HW8_2.stringToArray("I love arrays they are my favorite"));
    }
    @Test
    public void testSomething() {
        assertEquals("IF-RUDYARD KIPLING", HW8_2.correct(HW8_2.correct("1F-RUDYARD K1PL1NG")));
        assertEquals("ROBERT MERLE - THE DAY OF THE DOLPHIN", HW8_2.correct(HW8_2.correct("R0BERT MERLE - THE DAY 0F THE D0LPH1N")));
        assertEquals("RICHARD P. FEYNMAN - THE FEYNMAN LECTURES ON PHYSICS", HW8_2.correct(HW8_2.correct("R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5")));
        assertEquals("RICHARD P. FEYNMAN - STATISTICAL MECHANICS", HW8_2.correct(HW8_2.correct("R1CHARD P. FEYNMAN - 5TAT15T1CAL MECHAN1C5")));
        assertEquals("STEPHEN HAWKING - A BRIEF HISTORY OF TIME", HW8_2.correct(HW8_2.correct("5TEPHEN HAWK1NG - A BR1EF H15T0RY 0F T1ME")));
        assertEquals("STEPHEN HAWKING - THE UNIVERSE IN A NUTSHELL", HW8_2.correct(HW8_2.correct("5TEPHEN HAWK1NG - THE UN1VER5E 1N A NUT5HELL")));
        assertEquals("ERNEST HEMINGWAY - A FARWELL TO ARMS", HW8_2.correct(HW8_2.correct("ERNE5T HEM1NGWAY - A FARWELL T0 ARM5")));
        assertEquals("ERNEST HEMINGWAY - FOR WHOM THE BELL TOLLS", HW8_2.correct(HW8_2.correct("ERNE5T HEM1NGWAY - F0R WH0M THE BELL T0LL5")));
        assertEquals("ERNEST HEMINGWAY - THE OLD MAN AND THE SEA", HW8_2.correct(HW8_2.correct("ERNE5T HEM1NGWAY - THE 0LD MAN AND THE 5EA")));
        assertEquals("J. R. R. TOLKIEN - THE LORD OF THE RINGS", HW8_2.correct(HW8_2.correct("J. R. R. T0LK1EN - THE L0RD 0F THE R1NG5")));
        assertEquals("J. D. SALINGER - THE CATCHER IN THE RYE", HW8_2.correct(HW8_2.correct("J. D. 5AL1NGER - THE CATCHER 1N THE RYE")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE PHILOSOPHER'S STONE", HW8_2.correct(HW8_2.correct("J. K. R0WL1NG - HARRY P0TTER AND THE PH1L050PHER'5 5T0NE")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE CHAMBER OF SECRETS", HW8_2.correct(HW8_2.correct("J. K. R0WL1NG - HARRY P0TTER AND THE CHAMBER 0F 5ECRET5")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE PRISONER OF Azkaban", HW8_2.correct(HW8_2.correct("J. K. R0WL1NG - HARRY P0TTER AND THE PR150NER 0F Azkaban")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE GOBLET OF FIRE", HW8_2.correct(HW8_2.correct("J. K. R0WL1NG - HARRY P0TTER AND THE G0BLET 0F F1RE")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE ORDER OF PHOENIX", HW8_2.correct(HW8_2.correct("J. K. R0WL1NG - HARRY P0TTER AND THE 0RDER 0F PH0EN1X")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE HALF-BLOOD PRINCE", HW8_2.correct(HW8_2.correct("J. K. R0WL1NG - HARRY P0TTER AND THE HALF-BL00D PR1NCE")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE DEATHLY HALLOWS", HW8_2.correct(HW8_2.correct("J. K. R0WL1NG - HARRY P0TTER AND THE DEATHLY HALL0W5")));
        assertEquals("URSULA K. LE GUIN - A WIZARD OF EARTHSEA", HW8_2.correct(HW8_2.correct("UR5ULA K. LE GU1N - A W1ZARD 0F EARTH5EA")));
        assertEquals("URSULA K. LE GUIN - THE TOMBS OF ATUAN", HW8_2.correct(HW8_2.correct("UR5ULA K. LE GU1N - THE T0MB5 0F ATUAN")));
        assertEquals("URSULA K. LE GUIN - THE FARTHEST SHORE", HW8_2.correct(HW8_2.correct("UR5ULA K. LE GU1N - THE FARTHE5T 5H0RE")));
        assertEquals("URSULA K. LE GUIN - TALES FROM EARTHSEA", HW8_2.correct(HW8_2.correct("UR5ULA K. LE GU1N - TALE5 FR0M EARTH5EA")));
    }
}