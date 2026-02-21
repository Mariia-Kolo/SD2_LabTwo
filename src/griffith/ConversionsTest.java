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

    void testStringToInteger (){

    }

   void testIntegerToString (){

    }

    void terstSwitchCase(){

    }

}