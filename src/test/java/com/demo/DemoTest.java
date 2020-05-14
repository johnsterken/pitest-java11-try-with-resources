package com.demo;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class DemoTest {
    private Demo demo;

    @Before
    public void setUp() throws Exception {
        demo = new Demo();
    }

    @Test
    public void shouldReturnFirstStringFromList() {
        String actual = demo.tryWithRecources(Collections.singletonList("hi"));

        assertEquals("hi", actual);
    }

    @Test
    public void shouldReturnDefaultStringWhenListIsEmpty() {
        String actual = demo.tryWithRecources(Collections.emptyList());

        assertEquals("bye", actual);
    }
}