package org.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HesapMakinasiTest {

    @Test
    @DisplayName("iki Sayiyi toplar")
    void topla() {

        assertEquals(6,HesapMakinasi.topla(2,4));
        assertEquals(10,HesapMakinasi.topla(2,8));
    }

    @Test
    @DisplayName("Iki sayiyi carpar")
    void carp() {

        assertAll(()-> assertEquals(3,HesapMakinasi.carp(1,3)),
                ()-> assertEquals(4,HesapMakinasi.carp(2,2)));
    }
}