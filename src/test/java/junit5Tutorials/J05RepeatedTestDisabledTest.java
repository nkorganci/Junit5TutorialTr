package junit5Tutorials;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class J05RepeatedTestDisabledTest {

    String str = "";

    @BeforeEach
    void beforeE(TestInfo info){
        str="hi";
        System.out.println(info.getDisplayName()+ " Before Each has started");
    }
    @AfterEach
    void afterE(TestInfo info){
        str="";
        System.out.println(info.getDisplayName() + " after each has started");
    }

    @RepeatedTest(3)
    @Test
    void cal(){
        assertEquals("HI",str.toUpperCase());
        System.out.println("repeated test worked");
    }

    @Disabled("Disabled, will not work")
    @Test
    void disabledT(){
        assertEquals("sdf",str.toUpperCase());
    }


}
