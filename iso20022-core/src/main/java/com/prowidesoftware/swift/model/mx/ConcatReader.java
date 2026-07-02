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

import java.io.Reader;

/**
 * A {@link Reader} over a sequence of String segments, each bounded by a start and end offset, so content can be
 * composed (for example wrapping a payload in a synthetic root element) without copying the payload characters
 * into a new String.
 *
 * <p>Not thread safe, single use, as any Reader.
 *
 * @since 10.3.10
 */
final class ConcatReader extends Reader {
    private final String[] sources;
    private final int[] starts;
    private final int[] ends;
    private int segment;
    private int pos;

    /**
     * @param sources the backing strings, one per segment
     * @param starts  start offset (inclusive) in the corresponding source
     * @param ends    end offset (exclusive) in the corresponding source
     */
    ConcatReader(String[] sources, int[] starts, int[] ends) {
        this.sources = sources;
        this.starts = starts;
        this.ends = ends;
        this.pos = starts.length > 0 ? starts[0] : 0;
    }

    @Override
    public int read(char[] cbuf, int off, int len) {
        if (len == 0) {
            return 0;
        }
        while (segment < sources.length && pos >= ends[segment]) {
            segment++;
            if (segment < sources.length) {
                pos = starts[segment];
            }
        }
        if (segment >= sources.length) {
            return -1;
        }
        // a partial read bounded to the current segment is a valid Reader contract outcome
        int count = Math.min(len, ends[segment] - pos);
        sources[segment].getChars(pos, pos + count, cbuf, off);
        pos += count;
        return count;
    }

    @Override
    public void close() {
        // no underlying resources
    }
}
