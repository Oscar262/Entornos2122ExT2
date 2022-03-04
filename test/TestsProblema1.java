import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestsProblema1 {

    @Test
    public void cadena_1_20_Test(){
        String cadena=Problema1.cadena_1_20();
        Assertions.assertEquals("1234567891011121314151617181920", cadena);
    }

    @Test
    public void cadena_1_20_con_Fizz_Buzz(){
        String cadena=Problema1.cadena_1_20_con_Fizz_Buzz();
        Assertions.assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19Buzz", cadena);
    }

}
