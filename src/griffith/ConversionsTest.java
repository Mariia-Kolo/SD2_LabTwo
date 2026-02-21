//Mariia Kolodiazhna
//3149166

package griffith;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversionsTest {

    Conversions conv = new Conversions();

    @Test
    void testEuroToDollar(){
        assertEquals(11.0, conv.euroToDollar(10), 0.01);
        assertEquals(0.0, conv.euroToDollar(0), 0.01);
        assertEquals(-11.0, conv.euroToDollar(-10), 0.01);
    }

    @Test
    void testDollarToEuro(){
        assertEquals(10.0, conv.dollarToEuro(11), 0.01);
        assertEquals(0.0, conv.dollarToEuro(0), 0.01);
        assertTrue(conv.dollarToEuro(-11) < 0);
    }

    @Test
    void testStringToInteger (){
        assertEquals(100, conv.stringToInteger("100"));
        assertEquals(-50, conv.stringToInteger("-50"));
        assertThrows(NumberFormatException.class,
                () -> conv.stringToInteger("abc"));
    }

    @Test
   void testIntegerToString (){
       assertEquals("10", conv.integerToString(10));
       assertEquals("-10", conv.integerToString(-10));
       assertEquals("0", conv.integerToString(0));
    }

    void terstSwitchCase(){

    }

}