/*
 * Copyright 2006-2026 Prowide
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
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.Reader;
import org.junit.jupiter.api.Test;

public class ConcatReaderTest {

    /** Reader over whole segments (start 0, end length) */
    private static ConcatReader reader(String... segments) {
        int[] starts = new int[segments.length];
        int[] ends = new int[segments.length];
        for (int i = 0; i < segments.length; i++) {
            ends[i] = segments[i].length();
        }
        return new ConcatReader(segments, starts, ends);
    }

    private static String readAll(Reader reader, int bufferSize) throws IOException {
        StringBuilder sb = new StringBuilder();
        char[] buffer = new char[bufferSize];
        int read;
        while ((read = reader.read(buffer, 0, buffer.length)) >= 0) {
            sb.append(buffer, 0, read);
        }
        return sb.toString();
    }

    @Test
    void testSegmentsConcatenated() throws IOException {
        // buffer sizes chosen to force reads aligned and misaligned with the segment boundaries
        for (int bufferSize : new int[] {1, 2, 3, 5, 64}) {
            assertEquals("abcdefg", readAll(reader("abc", "de", "fg"), bufferSize));
        }
    }

    @Test
    void testBoundedSegments() throws IOException {
        // each segment exposes only the [start, end) slice of its backing string
        ConcatReader reader =
                new ConcatReader(new String[] {"xxHELLOyy", "abWORLD"}, new int[] {2, 2}, new int[] {7, 7});
        assertEquals("HELLOWORLD", readAll(reader, 4));
    }

    @Test
    void testEmptySegmentsSkipped() throws IOException {
        assertEquals("abc", readAll(reader("", "ab", "", "c", ""), 2));
    }

    @Test
    void testNoSegments() throws IOException {
        assertEquals(-1, reader().read(new char[8], 0, 8));
    }

    @Test
    void testZeroLengthReadReturnsZero() throws IOException {
        ConcatReader reader = reader("abc");
        assertEquals(0, reader.read(new char[8], 0, 0));
        assertEquals("abc", readAll(reader, 8));
    }

    @Test
    void testEofIsSticky() throws IOException {
        ConcatReader reader = reader("ab");
        assertEquals("ab", readAll(reader, 8));
        assertEquals(-1, reader.read(new char[8], 0, 8));
        assertEquals(-1, reader.read(new char[8], 0, 8));
    }

    @Test
    void testSingleCharRead() throws IOException {
        // inherited Reader.read() delegating to the array variant
        Reader reader = reader("ab", "c");
        assertEquals('a', reader.read());
        assertEquals('b', reader.read());
        assertEquals('c', reader.read());
        assertEquals(-1, reader.read());
    }

    @Test
    void testReadIntoBufferOffset() throws IOException {
        ConcatReader reader = reader("abcde");
        char[] buffer = "........".toCharArray();
        int read = reader.read(buffer, 3, 5);
        assertTrue(read > 0);
        assertEquals("...abcde".substring(0, 3 + read), new String(buffer, 0, 3 + read));
    }

    @Test
    void testPartialReadBoundedToSegment() throws IOException {
        // a read spanning a boundary may return fewer chars than requested but never zero before EOF
        ConcatReader reader = reader("abc", "def");
        char[] buffer = new char[6];
        int first = reader.read(buffer, 0, 6);
        assertTrue(first > 0 && first <= 6);
        StringBuilder sb = new StringBuilder().append(buffer, 0, first);
        int read;
        while ((read = reader.read(buffer, 0, 6)) >= 0) {
            assertTrue(read > 0, "read must not return 0 for a positive len before EOF");
            sb.append(buffer, 0, read);
        }
        assertEquals("abcdef", sb.toString());
    }
}
