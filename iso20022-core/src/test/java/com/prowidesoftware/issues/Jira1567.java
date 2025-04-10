package com.prowidesoftware.issues;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.prowidesoftware.swift.model.mx.LegacyAppHdr;
import com.prowidesoftware.swift.model.mx.MxWriteConfiguration;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import com.prowidesoftware.swift.model.mx.adapters.OffsetDateTimeAdapter;
import com.prowidesoftware.swift.model.mx.sys.MxXsys01500101;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class Jira1567 {

    @Test
    public void test() {
        MxXsys01500101 mx = new MxXsys01500101();

        // create an OffsetDateTime with the current time in UTC
        OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);

        LegacyAppHdr legacy = new LegacyAppHdr();
        legacy.setCrDate(now);

        mx.setAppHdr(legacy);

        // default date time adapter contains the offset
        String xml = mx.message();
        assertTrue(xml.contains("+00:00</head:CrDate>"));

        // custom serialization using a custom date time adapter
        MxWriteConfiguration config = new MxWriteConfiguration();
        config.adapters.dateTimeAdapter = new IsoDateTimeAdapter(new CustomDateTimeAdapter());

        xml = mx.message(config);
        assertTrue(xml.contains("Z</head:CrDate>"));
    }

    public class CustomDateTimeAdapter extends OffsetDateTimeAdapter {
        @Override
        public String marshal(OffsetDateTime offsetDateTime) throws Exception {
            return StringUtils.replace(super.marshal(offsetDateTime), "+00:00", "Z");
        }
    }
}
