//Mariia Kolodiazhna
//3149166

package griffith;

public class Conversions {

    private static final double RATE = 1.10;

    public double  euroToDollar(double euro){
    return euro*RATE;
    }

    public double dollarToEuro(double dollar){
    return dollar/RATE;
    }

    public int stringToInteger (String val){
    return Integer.parseInt(val);
    }

    public String integerToString (int val){
    return Integer.toString(val);
    }
    // change uppercase to lowercase and vice versa
    public String switchCase(){
        return null;
    }
}