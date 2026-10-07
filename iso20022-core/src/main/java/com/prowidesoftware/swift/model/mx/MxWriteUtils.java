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

import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import com.prowidesoftware.swift.model.mx.adapters.TypeAdaptersConfiguration;
import com.prowidesoftware.swift.model.mx.adapters.ZuluDateTimeAdapter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Reusable code for marshalling methods
 *
 * @since 9.2.6
 */
class MxWriteUtils {

    static Marshaller createMarshaller(final JAXBContext context, final MxWriteParams params) throws JAXBException {
        final Marshaller marshaller = context.createMarshaller();

        if (params.adapters != null) {
            for (XmlAdapter adapter : params.adapters.asList()) {
                marshaller.setAdapter(adapter);
            }
        }

        return marshaller;
    }

    /**
     * Builds a copy of the given params with a Zulu datetime adapter swapped in, leaving
     * the caller's {@link MxWriteParams} and its {@link TypeAdaptersConfiguration} untouched.
     * This avoids mutating shared configuration state during marshalling.
     *
     * @since 9.6.4
     */
    static MxWriteParams withZuluDateTimeAdapter(final MxWriteParams params) {
        MxWriteParams copy = new MxWriteParams(params);
        copy.adapters = new TypeAdaptersConfiguration(params.adapters);
        copy.adapters.dateTimeAdapter = new IsoDateTimeAdapter(new ZuluDateTimeAdapter());
        return copy;
    }
}
