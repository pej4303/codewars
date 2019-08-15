package com.codewars.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.codewars.java.YesOrNo;

public class YesOrNoTest {
    @Test
    public void testBoolToWord() {
        assertEquals(YesOrNo.boolToWord(true),"Yes");
        assertEquals(YesOrNo.boolToWord(false),"No");
    }
}
