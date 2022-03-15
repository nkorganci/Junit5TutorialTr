package junit5Tutorials;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class J03TestingExceptions {
    /*
    assertThrow() metodu belirtilen islemin(executable) belirtilen turde bir Exception olusturup olusturmadigini test eder.
    Dolayisi ile 2 parametre alir.
    1. parametre Exception turu
    2. parametre ise calistirilacak olan islem

   Eger islem belirtilen bir turde hata verirse test basarili olur.
   Exception turunde parent-child iliskisi var ise yine test basarili sayilir.
     */

    @Test
    void testException(){
        String str = null;
        // str.length(); // should return NullPointerException

        assertThrows(NullPointerException.class,()->str.length());
    }

    @Test
    void textException2(){
        //String textNum="123";
        //Integer num= Integer.parseInt(textNum);

        assertThrows(NumberFormatException.class,()->Integer.parseInt("12a"));
    }
    @Test
    void textException3(){
        assertThrows(IllegalArgumentException.class,()->yasYazdir(-2));
    }

    void yasYazdir(int yas){
        if(yas<0){
            throw new IllegalArgumentException();
        }else {
            System.out.println(yas);
        }
    }


    @Test
    void testException4(){
        assertThrows(ArithmeticException.class,()->bol(2,0));
    }

    int bol(int a, int b){
        return a/b;
    }

}
