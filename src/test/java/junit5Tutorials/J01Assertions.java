package junit5Tutorials;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class J01Assertions {

    @Test
    void testToAsserts(){
        int actual = "hello".length();
        int expected = 5;

        // 1.assertEquals()
//        assertEquals(expected,actual,"Beklenen degere esit degil, hata verirse cikar bu mesaj");
//        assertEquals(4,actual,"Hata");
//        assertEquals(2,"hello".length(), "yanlissa hata veriri");

        // 2.assertNotEquals()
        //assertNotEquals(expected,actual,"esitmis :)");

        // 3.assertTrue()
        expected=4;
        assertTrue(expected==actual,"False: Esit olmaliydi");

        expected=5;
        //4. assertFalse()
        assertFalse(expected==actual,"TRUE: Esit olmamaliydi");
    }
}
