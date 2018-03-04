package org.dangcat.notes.junit5.basic;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

class TestStandardDemo {

    @BeforeAll
    static void initAll() {
    }

    @AfterAll
    static void tearDownAll() {
    }

    @BeforeEach
    void init() {
    }

    @Test
    void succeedingTest() {
    }

    @Test
    void failingTest() {
        fail("a failing test");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @AfterEach
    void tearDown() {
    }
}