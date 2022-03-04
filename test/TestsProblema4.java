import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestsProblema4 {

    @Test
    public void cadena_1_20_Test() {
        String cadena = Problema4.cadena_1_20();
        Assertions.assertEquals("1234567891011121314151617181920", cadena);
    }

    @Test
    public void cadena_1_20_con_Foo_Boo_Test() {
        String cadena = Problema4.cadena_1_20_con_Foo_Boo();
        Assertions.assertEquals("12Fizz4BuzzFizzFoo8FizzBuzzBooFizz13FooFizzBuzz1617Fizz19Buzz", cadena);
    }

    @Test
    public void cadena_6_20_con_Fizz_Buzz_Foo_Boo_Test() {
        String cadena = Problema4.cadena_6_20_con_Fizz_Buzz_Foo_Boo("6", "20");
        Assertions.assertEquals("FizzFoo8FizzBuzzBooFizz13FooFizzBuzz1617Fizz19Buzz", cadena);
    }

}
