package org.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class C02StringDegistiriciTest {

    C02StringDegistirici stringDegistirici;

    @BeforeEach
    void setUp() {
        stringDegistirici = new C02StringDegistirici();
        System.out.println("Instance of class is created...");
    }

    @AfterEach
    void tearDown() {
        stringDegistirici=null;
        System.out.println("Test date deleted...");
    }

    @ParameterizedTest
    @CsvSource(value = {"BC, ABC","ACD,AAACD", "DA,DAA","'',AA"})
    void deleteA(String expected, String actual) {

    }
}