package org.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class C03ArraysEqualTest {

     @ParameterizedTest
     @MethodSource("diziSaylaci")
    void diziKiyasla(Boolean expected, Object[] a, Object[] b) {
         C03ArraysEqual equal = new C03ArraysEqual();
         assertEquals(expected,equal.diziKiyasla(a,b));

    }
    static Stream<Arguments> diziSaylaci(){
        Integer a1[] = {1,2,3};
        Integer a2[] = {1,3,2};

        String s1[] = {"a","b"};
        String s2[] = {"b","a"};

        Double d1[] = {1.2, 3.4};
        Double d2[] = {3.4, 1.2};

        Float f1[] = {1f, 2f, 3.5f};
        Float f2[] = {2f,1.2f, 3.5f};

        return Stream.of(
                Arguments.of(true,a1,a2),
                Arguments.of(true,s1,s2),
                Arguments.of(true,d1,d2),
                Arguments.of(false,f1,f2)
        );
    }

}