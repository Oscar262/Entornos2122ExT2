import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestsProblema2 {

    @Test
    public void cadena_8_15Test() {
        String cadena = Problema2.cadena_8_15("8", "15");
        Assertions.assertEquals("89101112131415", cadena);
    }

    @Test
    public void cadena_8_15_con_Fizz_Buzz() {
        String cadena = Problema2.cadena_8_15_con_Fizz_Buzz("8", "15");
        Assertions.assertEquals("8FizzBuzz11Fizz1314FizzBuzz", cadena);
    }

}
