public class Problema3 {

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
            cadena = multiplos(cadena, i);
        }
        return cadena;
    }

    private static String multiplos(String cadena, int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            cadena += "FizzBuzz";
        } else if (i % 3 == 0) {
            cadena += "Fizz";
        } else if (i % 5 == 0) {
            cadena += "Buzz";
        }else if (i %7 ==0){
            cadena+= "Foo";
        }else if (i %11 ==0){
            cadena+= "Boo";
        }
        else {
            cadena += i;
        }
        return cadena;
    }

    public static String cadena_8_15() {
        String cadena = "1";
        for (int i = 2; i <= 20; i++) {
            cadena += i;
        }
        return cadena;
    }

    public static String cadena_1_20_con_Foo_Boo() {
        String cadena = "1";
        for (int i = 2; i <= 20; i++) {
            cadena = multiplos(cadena, i);
        }
        return cadena;
    }
}