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

/**
 * Only escapes &amp;, &lt;, &gt; and quotes (in attribute).
 * Similar to com.sun.xml.bind.marshaller.MinimumEscapeHandler
 *
 * @since 9.1.7
 */
public class MinimumEscapeHandler implements EscapeHandler {

    @Override
    public String escape(char[] arr, boolean isAttribute) {
        final StringBuilder sb = new StringBuilder(arr.length);
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case '&':
                    sb.append("&amp;");
                    break;
                case '<':
                    sb.append("&lt;");
                    break;
                case '>':
                    sb.append("&gt;");
                    break;
                case '\"':
                    if (isAttribute) {
                        sb.append("&quot;");
                    } else {
                        sb.append('\"');
                    }
                    sb.append('\"');
                    break;
                default:
                    sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}
