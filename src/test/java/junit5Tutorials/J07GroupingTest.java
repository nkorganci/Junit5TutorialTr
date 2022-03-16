package junit5Tutorials;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//1- 0 icermeyen int sayilar icin multiplyExact() metodunu test ediniz
//2- 0 iceren int sayilar icin multiplyExact() metodunu test ediniz
public class J07GroupingTest {

    @ParameterizedTest
    @CsvSource(value = {"12,2,6","12,4,3","12,12,1"})
    void multiplyTest(int result, int a, int b){
        assertEquals(result,Math.multiplyExact(a,b));
       System.out.println("mUltiply");

    }
    @Nested
    class SifirIcerenTest{

        @ParameterizedTest
        @CsvSource(value = {"0,2,0","0,0,2"})
        void sifir(int result,int a, int b){
            assertEquals(result,Math.multiplyExact(a,b));

        }

        @ParameterizedTest
        @CsvSource(value ={"1,0,2","0,0,3","0,2,0"} )
        void bolme(int result, int a, int b){
            if(b==0){
                assertThrows(ArithmeticException.class,()->bol(a,b));
            }else {
                assertEquals(0,bol(a,b));
            }

        }

        int bol (int a, int b){
            return a/b;
        }
    }

}
