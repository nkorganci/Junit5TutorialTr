package org.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01HesapMakinasiTest {

    @Test
    @DisplayName("iki Sayiyi toplar")
    void topla() {

        assertEquals(6, C01HesapMakinasi.topla(2,4));
        assertEquals(10, C01HesapMakinasi.topla(2,8));
    }

    @Test
    @DisplayName("Iki sayiyi carpar")
    void carp() {

        assertAll(()-> assertEquals(3, C01HesapMakinasi.carp(1,3)),
                ()-> assertEquals(4, C01HesapMakinasi.carp(2,2)));
    }
}