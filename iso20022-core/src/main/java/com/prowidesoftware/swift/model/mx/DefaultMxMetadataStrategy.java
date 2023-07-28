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

import com.prowidesoftware.swift.model.AbstractMessage;
import com.prowidesoftware.swift.model.MessageMetadataStrategy;
import com.prowidesoftware.swift.model.Money;
import com.prowidesoftware.swift.model.MxNode;
import java.util.Calendar;
import java.util.Optional;
import org.apache.commons.lang3.StringUtils;

/**
 * Default implementation of MT messages metadata extraction.
 *
 * <p>This implementation just sets the main reference. A comprehensive implementation must be provided per message
 * types to extract content as needed. For example in a pacs.008 the main amount should be extracted from the
 * //GrpHdr/TtlIntrBkSttlmAmt in a multiple payment, or from //CdtTrfTxInf[*]/IntrBkSttlmAmt in a single payment.
 *
 * @since 9.1.6
 */
public class DefaultMxMetadataStrategy implements MessageMetadataStrategy {

    public Optional<String> reference(AbstractMessage message) {
        if (message.isMX()) {
            AbstractMX mx = (AbstractMX) message;
            if (mx.getAppHdr() != null) {
                String reference = mx.getAppHdr().reference();
                if (StringUtils.isNotBlank(reference)) {
                    return Optional.of(reference);
                }
            }
            // we use plain XML parsing to extract the reference from the group header, that is available in many MX
            MxNode document = MxNode.parse(mx.document());
            final MxNode groupHeader = document != null ? document.findFirstByName("GrpHdr") : null;
            if (groupHeader != null) {
                MxNode reference = groupHeader.findFirst("./MsgId");
                if (reference != null && StringUtils.isNotBlank(reference.getValue())) {
                    return Optional.of(reference.getValue());
                }
            }
        }
        return Optional.empty();
    }

    public Optional<Money> amount(AbstractMessage message) {
        return Optional.empty();
    }

    public Optional<Calendar> valueDate(AbstractMessage message) {
        return Optional.empty();
    }

    public Optional<Calendar> tradeDate(AbstractMessage message) {
        return Optional.empty();
    }
}
