/*
 * Copyright 2006-2021 Prowide
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
 * Simple interface used by the XML event writer when serializing the XML element content
 * @since 9.1.7
 */
public interface EscapeHandler {

    /**
     * @param arr the characters to escape
     * @param isAttribute true if it is an attribute value
     */
    String escape(char[] arr, boolean isAttribute);

}
