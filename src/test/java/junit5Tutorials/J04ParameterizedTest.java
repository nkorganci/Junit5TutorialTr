package junit5Tutorials;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class J04ParameterizedTest {

    /*
    length() methodunun asagidaki kullar icin 0' dan buyuk deger dondurup dondurmedigini kontrol et.
    a, ab, abb,....
    NOT SUGGESTED
     */

    // 1 Bad practice, not recommended
    @Test
    void manualTesting1(){
        assertEquals(2,"sdf".length());
        assertEquals(2,"sdf".length());
    }

    // 2 Good practice
    @ParameterizedTest
    @ValueSource(strings = {"adf","adfd",""})
    void automaticTesting(String str){
        assertTrue(str.length()>0,"Must be bigger than 0");
    }

    @ParameterizedTest(name = "Expected:{0},Given:{1}")
    @CsvSource(value = {"AD,ad","CD,cd"})
    void toUpperCaseT(String expected,String str){
        assertEquals(expected,str.toUpperCase());
    }

    //@CvsFileSource application
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv",numLinesToSkip = 1)
    void cvsFile(String given,String expectedRes){
        assertEquals(expectedRes,given.toUpperCase());
    }



}
