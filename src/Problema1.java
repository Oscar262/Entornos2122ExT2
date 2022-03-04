import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problema1 {

    public static String cadena_1_20() {
        String cadena = "1";
        for (int i = 2; i <= 20; i++) {
            cadena += i;
        }
        return cadena;
    }

    public static String cadena_1_20_con_Fizz_Buzz() {
        String cadena = "1";
        for (int i = 2; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                cadena += "FizzBuzz";
            } else if (i % 3 == 0) {
                cadena += "Fizz";
            } else if (i % 5 == 0) {
                cadena += "Buzz";
            } else {
                cadena += i;
            }
        }
        return cadena;
    }
}