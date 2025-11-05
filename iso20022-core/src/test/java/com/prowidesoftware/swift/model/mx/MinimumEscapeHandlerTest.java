/*
 * Copyright 2006-2023 Prowide
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.prowidesoftware.swift.model.mx;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test for MinimumEscapeHandler
 */
public class MinimumEscapeHandlerTest {

    private final MinimumEscapeHandler handler = new MinimumEscapeHandler();

    @Test
    public void testQuoteInNonAttributeContext() {
        // Quotes in non-attribute context should not be escaped and not duplicated
        String result = handler.escape("test \"quoted\" text".toCharArray(), false);
        assertEquals("test \"quoted\" text", result);
    }

    @Test
    public void testQuoteInAttributeContext() {
        // Quotes in attribute context should be escaped as &quot;
        String result = handler.escape("test \"quoted\" text".toCharArray(), true);
        assertEquals("test &quot;quoted&quot; text", result);
    }

    @Test
    public void testAmpersandEscape() {
        String result = handler.escape("test & text".toCharArray(), false);
        assertEquals("test &amp; text", result);
    }

    @Test
    public void testLessThanEscape() {
        String result = handler.escape("test < text".toCharArray(), false);
        assertEquals("test &lt; text", result);
    }

    @Test
    public void testGreaterThanEscape() {
        String result = handler.escape("test > text".toCharArray(), false);
        assertEquals("test &gt; text", result);
    }

    @Test
    public void testMultipleSpecialCharacters() {
        String result = handler.escape("<tag attr=\"value\"> test & more".toCharArray(), false);
        assertEquals("&lt;tag attr=\"value\"&gt; test &amp; more", result);
    }

    @Test
    public void testMultipleSpecialCharactersInAttribute() {
        String result = handler.escape("<tag & \"value\"".toCharArray(), true);
        assertEquals("&lt;tag &amp; &quot;value&quot;", result);
    }

    @Test
    public void testUnicodeCharactersNotEscaped() {
        // MinimumEscapeHandler should NOT escape unicode characters (unlike DefaultEscapeHandler)
        String result = handler.escape("текст öñ".toCharArray(), false);
        assertEquals("текст öñ", result);
    }
}
