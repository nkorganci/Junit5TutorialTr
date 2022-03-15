package junit5Tutorials;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class J02BeforeAfterEachAll {

    /*
    @BeforeEach, her test metodu calismadan once calisir, test verilerinin ayarlanmasi icin kullanilir
    @AfterEach, her test metodu calistiktan sonra calisir, test verilernin temizlenmesi icin kullanilir.
     */

    @BeforeAll
    static void databaseConnected(){
        System.out.println("Database connected , Ready");
    }
    @AfterAll
            static void databaseClosed(){
        System.out.println("Database closed, closed");
    }

    String str = "";

    @BeforeEach
    void beforeT(TestInfo info){
        str = "Before Testing";
        System.out.println(info.getDisplayName() + " 1 BEFORE has started");
    }

    @AfterEach
    void afterT(TestInfo info){
        str="";
        System.out.println(info.getDisplayName() + " 2 AFTER has started");
    }

    @Test
    @DisplayName("Lenght method for testing")
    void length(TestInfo info){
        int expected = 14;
        assertEquals(expected,str.length());
        System.out.println(info.getDisplayName() + " 3 Length testing has started");
    }

}
