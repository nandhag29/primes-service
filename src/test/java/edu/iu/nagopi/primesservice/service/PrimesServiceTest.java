package edu.iu.nagopi.primesservice.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimesServiceTest {

    PrimesService primesService = new PrimesService();
    @Test
    void _45isPrime() {
        int n = 45;
        boolean expected = false;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected,actual);
    }

    @Test
    void _599isPrime() {
        int n = 599;
        boolean expected = true;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected,actual);
    }

    @Test
    void _454isPrime() {
        int n = 454;
        boolean expected = false;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected,actual);
    }
}