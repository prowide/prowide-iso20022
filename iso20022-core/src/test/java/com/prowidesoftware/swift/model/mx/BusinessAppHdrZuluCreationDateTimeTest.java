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

import static org.assertj.core.api.Assertions.assertThat;

import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import org.junit.jupiter.api.Test;

/**
 * Verifies {@code useZuluCreationDateTime} behavior on BAH V01..V04, including:
 * <ul>
 *   <li>Defaults: V01 emits {@code Z}; V02..V04 emit the original numeric offset.</li>
 *   <li>Enabling the flag on V02..V04 switches {@code CreDt} to {@code Z} form.</li>
 *   <li>Disabling the flag on V01 reverts to the numeric-offset form.</li>
 *   <li>{@code xml()} never mutates the caller's {@link MxWriteParams#adapters}.</li>
 * </ul>
 *
 * The {@code CreDt} value used in tests has a non-UTC offset ({@code +03:00}) so
 * that the Zulu vs. offset cases produce distinguishable output.
 */
public class BusinessAppHdrZuluCreationDateTimeTest {

    private static final OffsetDateTime CRE_DT = OffsetDateTime.of(2024, 3, 27, 12, 0, 0, 0, ZoneOffset.ofHours(3));

    @Test
    public void v01_default_emitsZuluCreDt() {
        BusinessAppHdrV01 h = new BusinessAppHdrV01();
        h.setCreDt(CRE_DT);

        MxWriteParams params = new MxWriteParams();
        String xml = h.xml(params);

        assertThat(h.isUseZuluCreationDateTime()).isTrue();
        assertThat(xml).contains("<CreDt>2024-03-27T09:00:00Z</CreDt>");
        // the flag itself must not leak into the XML — `transient` keeps JAXB from binding it
        assertThat(xml).doesNotContain("useZuluCreationDateTime");
    }

    @Test
    public void v01_flagOff_emitsNumericOffsetCreDt() {
        BusinessAppHdrV01 h = new BusinessAppHdrV01();
        h.setCreDt(CRE_DT);
        h.setUseZuluCreationDateTime(false);

        String xml = h.xml(new MxWriteParams());

        assertThat(xml).contains("<CreDt>2024-03-27T12:00:00+03:00</CreDt>");
    }

    @Test
    public void v02_default_emitsNumericOffsetCreDt() {
        BusinessAppHdrV02 h = new BusinessAppHdrV02();
        h.setCreDt(CRE_DT);

        String xml = h.xml(new MxWriteParams());

        assertThat(h.isUseZuluCreationDateTime()).isFalse();
        assertThat(xml).contains("<CreDt>2024-03-27T12:00:00+03:00</CreDt>");
    }

    @Test
    public void v02_flagOn_emitsZuluCreDt() {
        BusinessAppHdrV02 h = new BusinessAppHdrV02();
        h.setCreDt(CRE_DT);
        h.setUseZuluCreationDateTime(true);

        String xml = h.xml(new MxWriteParams());

        assertThat(xml).contains("<CreDt>2024-03-27T09:00:00Z</CreDt>");
    }

    @Test
    public void v03_default_emitsNumericOffsetCreDt() {
        BusinessAppHdrV03 h = new BusinessAppHdrV03();
        h.setCreDt(CRE_DT);

        String xml = h.xml(new MxWriteParams());

        assertThat(h.isUseZuluCreationDateTime()).isFalse();
        assertThat(xml).contains("<CreDt>2024-03-27T12:00:00+03:00</CreDt>");
    }

    @Test
    public void v03_flagOn_emitsZuluCreDt() {
        BusinessAppHdrV03 h = new BusinessAppHdrV03();
        h.setCreDt(CRE_DT);
        h.setUseZuluCreationDateTime(true);

        String xml = h.xml(new MxWriteParams());

        assertThat(xml).contains("<CreDt>2024-03-27T09:00:00Z</CreDt>");
    }

    @Test
    public void v04_default_emitsNumericOffsetCreDt() {
        BusinessAppHdrV04 h = new BusinessAppHdrV04();
        h.setCreDt(CRE_DT);

        String xml = h.xml(new MxWriteParams());

        assertThat(h.isUseZuluCreationDateTime()).isFalse();
        assertThat(xml).contains("<CreDt>2024-03-27T12:00:00+03:00</CreDt>");
    }

    @Test
    public void v04_flagOn_emitsZuluCreDt() {
        BusinessAppHdrV04 h = new BusinessAppHdrV04();
        h.setCreDt(CRE_DT);
        h.setUseZuluCreationDateTime(true);

        String xml = h.xml(new MxWriteParams());

        assertThat(xml).contains("<CreDt>2024-03-27T09:00:00Z</CreDt>");
    }

    /**
     * Regression guard for PW-3133: marshalling with the Zulu flag on must NOT mutate the
     * caller's {@link MxWriteParams#adapters}. Earlier revisions swapped the adapter in-place
     * on the shared config, which was unsafe under concurrent marshalling.
     */
    @Test
    public void zuluMarshalling_doesNotMutateCallerAdapters() {
        BusinessAppHdrV01 v01 = new BusinessAppHdrV01();
        v01.setCreDt(CRE_DT);
        BusinessAppHdrV02 v02 = new BusinessAppHdrV02();
        v02.setCreDt(CRE_DT);
        v02.setUseZuluCreationDateTime(true);
        BusinessAppHdrV03 v03 = new BusinessAppHdrV03();
        v03.setCreDt(CRE_DT);
        v03.setUseZuluCreationDateTime(true);
        BusinessAppHdrV04 v04 = new BusinessAppHdrV04();
        v04.setCreDt(CRE_DT);
        v04.setUseZuluCreationDateTime(true);

        MxWriteParams params = new MxWriteParams();
        IsoDateTimeAdapter originalAdapter = params.adapters.dateTimeAdapter;

        v01.xml(params);
        v02.xml(params);
        v03.xml(params);
        v04.xml(params);

        assertThat(params.adapters.dateTimeAdapter).isSameAs(originalAdapter);
    }
}
