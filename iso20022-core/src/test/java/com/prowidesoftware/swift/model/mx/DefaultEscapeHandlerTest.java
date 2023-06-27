package com.prowidesoftware.swift.model.mx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultEscapeHandlerTest {

    @Test
    public void test() {
        DefaultEscapeHandler handler = new DefaultEscapeHandler();
        assertEquals("FOO", handler.escape("FOO".toCharArray(), false));
        assertEquals("FOO", handler.escape("FOO".toCharArray(), true));

        assertEquals("&amp;", handler.escape("&".toCharArray(), false));
        assertEquals("&amp;", handler.escape("&".toCharArray(), true));

        assertEquals("&lt;", handler.escape("<".toCharArray(), false));
        assertEquals("&lt;", handler.escape("<".toCharArray(), true));

        assertEquals("&gt;", handler.escape(">".toCharArray(), false));
        assertEquals("&gt;", handler.escape(">".toCharArray(), true));

        assertEquals("\"", handler.escape("\"".toCharArray(), false));
        assertEquals("&quot;", handler.escape("\"".toCharArray(), true));

        char[] arr = {'\u0080', '\u00a5', '\u00e9', '\u00f6'};
        assertEquals("&#128;&#165;&#233;&#246;", handler.escape(arr, false));
        assertEquals("&#128;&#165;&#233;&#246;", handler.escape(arr, true));
    }

}