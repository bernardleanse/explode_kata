package com.app;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {

    @Test
    public void sampleTestOne() {
        assertEquals("333122", Solution.explode("312"));
    }

    @Test
    public void sampleTestTwo() {
        assertEquals("12222666666999999999", Solution.explode("102269"));
    }

    @Test
    public void sampleTestThree() {
        assertEquals("", Solution.explode("0"));
    }

    @Test
    public void sampleTestFour() {
        assertEquals("", Solution.explode("000"));
    }
}

// {"102269","12222666666999999999"}
// {"0", ""},
// {"000", ""},
// {"123", "122333"}};