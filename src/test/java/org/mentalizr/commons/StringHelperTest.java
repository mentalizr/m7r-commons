package org.mentalizr.commons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

    @Test
    void linearize1() {
        String string = "This is a test.";
        assertEquals(string, StringHelper.linearize(string));
    }

    @Test
    void linearize2() {
        String string = "This is a\ntest.";
        String expected = "This is a test.";
        assertEquals(expected, StringHelper.linearize(string));
    }

    @Test
    void limit1() {
        String string = "This is a test.";
        assertEquals(string, StringHelper.limit(string, 50));
    }

    @Test
    void limit2() {
        String string = "This is a test.";
        assertEquals(string, StringHelper.limit(string, 15));
    }

    @Test
    void limit3() {
        String string = "This is a test.";
        String expected = "This is a test";
        assertEquals(expected, StringHelper.limit(string, 14));
    }

}