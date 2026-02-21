//Mariia Kolodiazhna
//3149166

package griffith;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversionsTest {

    Conversions conv = new Conversions();

    @Test
    void testEuroToDollar(){
        assertEquals(10.0, conv.euroToDollar(9), 0.01);
        assertEquals(0.0, conv.euroToDollar(0), 0.01);
        assertEquals(-10.0, conv.euroToDollar(-9), 0.01);
    }

    void testDollarToEuro(){

    }

    void testStringToInteger (){

    }

   void testIntegerToString (){

    }

    void terstSwitchCase(){

    }

}