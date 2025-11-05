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
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;

/**
 * Default implementation of MX messages metadata extraction.
 *
 * @since 9.1.6
 */
public class DefaultMxMetadataStrategy implements MessageMetadataStrategy {
    private static final transient Logger log = Logger.getLogger(DefaultMxMetadataStrategy.class.getName());

    @Override
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

    @Override
    public Optional<Money> amount(AbstractMessage message) {
        Money money = null;
        if (message.isMX()) {
            AbstractMX mx = (AbstractMX) message;
            MxNode document = MxNode.parse(mx.document());
            if (isPacs004(mx)) {
                money = getPacs004Amount(document);
            } else if (isPacs(mx)) {
                // catch-all attempt for other pacs messages
                money = getPacsAmount(document);
            } else if (isCamt(mx)) {
                if (mx.getFunctionality() == 29) {
                    money = getCamt29Amount(document);
                } else if (mx.getFunctionality() == 52) {
                    money = getCamt52Amount(document);
                } else if (mx.getFunctionality() == 53) {
                    money = getCamt53Amount(document);
                } else if (mx.getFunctionality() == 54) {
                    money = getCamt54Amount(document);
                } else if (mx.getFunctionality() == 56) {
                    money = getCamt56Amount(document);
                } else if (mx.getFunctionality() == 57) {
                    money = getCamt57Amount(document);
                }
            }
        }
        return Optional.ofNullable(money);
    }

    private Money getCamt29Amount(MxNode document) {
        MxNode amount = document.findFirst("./RsltnOfInvstgtn/CxlDtls/OrgnlPmtInfAndSts/TxInfAndSts/OrgnlInstdAmt");
        if (amount != null && amount.getValue() != null) {
            return new Money(amount.getAttribute("Ccy"), new BigDecimal(amount.getValue()));
        }
        return null;
    }

    private Money getCamt52Amount(MxNode document) {
        MxNode amount = document.findFirst("./BkToCstmrAcctRpt/Rpt/Bal/Amt");
        if (amount != null && amount.getValue() != null) {
            return new Money(amount.getAttribute("Ccy"), new BigDecimal(amount.getValue()));
        }
        return null;
    }

    private Money getCamt53Amount(MxNode document) {
        MxNode amount = document.findFirst("./BkToCstmrStmt/Stmt/Bal/Amt");
        if (amount != null && amount.getValue() != null) {
            return new Money(amount.getAttribute("Ccy"), new BigDecimal(amount.getValue()));
        }
        return null;
    }

    private Money getCamt54Amount(MxNode document) {
        MxNode amount = document.findFirst("./BkToCstmrDbtCdtNtfctn/Ntfctn/Ntry/Amt");
        if (amount == null) {
            amount = document.findFirst("./BkToCstmrDbtCdtNtfctn/Ntfctn/Ntry/NtryDtls/Amt");
        }
        if (amount == null) {
            amount = document.findFirst("./BkToCstmrDbtCdtNtfctn/Ntfctn/Ntry/NtryDtls/TxDtls/Amt");
        }
        if (amount != null && amount.getValue() != null) {
            return new Money(amount.getAttribute("Ccy"), new BigDecimal(amount.getValue()));
        }
        return null;
    }

    private Money getCamt56Amount(MxNode document) {
        MxNode amount = document.findFirst("./FIToFIPmtCxlReq/Undrlyg/TxInf/OrgnlIntrBkSttlmAmt");
        if (amount != null && amount.getValue() != null) {
            return new Money(amount.getAttribute("Ccy"), new BigDecimal(amount.getValue()));
        }
        return null;
    }

    private Money getCamt57Amount(MxNode document) {
        MxNode amount = document.findFirst("./NtfctnToRcv/Ntfctn/TtlAmt");
        if (amount != null && amount.getValue() != null) {
            return new Money(amount.getAttribute("Ccy"), new BigDecimal(amount.getValue()));
        }
        if (amount == null) {
            amount = document.findFirst("./NtfctnToRcv/Ntfctn/Itm/Amt");
            if (amount != null && amount.getValue() != null) {
                return new Money(amount.getAttribute("Ccy"), new BigDecimal(amount.getValue()));
            }
        }
        return null;
    }

    private Money getPacs004Amount(MxNode document) {
        MxNode amount = document.findFirst("./PmtRtr/GrpHdr/TtlRtrdIntrBkSttlmAmt");
        if (amount == null) {
            amount = document.findFirst("./PmtRtr/TxInf/RtrdIntrBkSttlmAmt");
        }
        if (amount != null && amount.getValue() != null) {
            return new Money(amount.getAttribute("Ccy"), new BigDecimal(amount.getValue()));
        }
        return null;
    }

    /**
     * This method can be used to extract the amount from both pacs.008 and pacs.009 messages.
     */
    /*
        pacs 008
            ./FIToFICstmrCdtTrf/GrpHdr/TtlIntrBkSttlmAmt
            ./FIToFICstmrCdtTrf/CdtTrfTxInf/IntrBkSttlmAmt
        new versions pacs 009
            ./FICdtTrf/GrpHdr/TtlIntrBkSttlmAmt
            ./FICdtTrf/CdtTrfTxInf/IntrBkSttlmAmt
        older versions of pacs 009
            ./FinInstnCdtTrf/GrpHdr/TtlIntrBkSttlmAmt
            ./FinInstnCdtTrf/CdtTrfTxInf/IntrBkSttlmAmt
    */
    private Money getPacsAmount(MxNode document) {
        // group header attempt first
        MxNode grpHdrNode = document.findFirstByName("GrpHdr");
        if (grpHdrNode != null) {
            MxNode amount = grpHdrNode.findFirst("./TtlIntrBkSttlmAmt");
            if (amount != null && amount.getValue() != null) {
                return new Money(amount.getAttribute("Ccy"), new BigDecimal(amount.getValue()));
            }
        }
        // credit transfer attempt
        MxNode cdtTrfNode = document.findFirstByName("CdtTrfTxInf");
        if (cdtTrfNode != null) {
            MxNode amount = cdtTrfNode.findFirst("./IntrBkSttlmAmt");
            if (amount != null && amount.getValue() != null) {
                return new Money(amount.getAttribute("Ccy"), new BigDecimal(amount.getValue()));
            }
        }
        return null;
    }

    private boolean isPacs004(AbstractMX mx) {
        return StringUtils.equals(mx.getBusinessProcess(), "pacs") && mx.getFunctionality() == 4;
    }

    private boolean isPacs(AbstractMX mx) {
        return StringUtils.equals(mx.getBusinessProcess(), "pacs");
    }

    private boolean isCamt(AbstractMX mx) {
        return StringUtils.equals(mx.getBusinessProcess(), "camt");
    }

    @Override
    public Optional<Calendar> valueDate(AbstractMessage message) {
        Calendar valueDate = null;
        if (message.isMX()) {
            AbstractMX mx = (AbstractMX) message;
            MxNode document = MxNode.parse(mx.document());
            if (document != null) {
                if (isPacs(mx)) {
                    // catch-all attempt for other pacs messages
                    valueDate = getPacsValueDate(document);
                } else if (isCamt(mx)) {
                    if (mx.getFunctionality() == 52) {
                        // catch-all attempt for other pacs messages
                        valueDate = getCamt52ValueDate(document);
                    } else if (mx.getFunctionality() == 53) {
                        // catch-all attempt for other pacs messages
                        valueDate = getCamt53ValueDate(document);
                    } else if (mx.getFunctionality() == 54) {
                        // catch-all attempt for other pacs messages
                        valueDate = getCamt54ValueDate(document);
                    } else if (mx.getFunctionality() == 56) {
                        // catch-all attempt for other pacs messages
                        valueDate = getCamt56ValueDate(document);
                    } else if (mx.getFunctionality() == 57) {
                        // catch-all attempt for other pacs messages
                        valueDate = getCamt57ValueDate(document);
                    } else if (mx.getFunctionality() == 60) {
                        // catch-all attempt for other pacs messages
                        valueDate = getCamt60ValueDate(document);
                    }
                }
            }
        }
        return Optional.ofNullable(valueDate);
    }

    /**
     * This method can be used to extract the value date from both pacs.004, pacs.008 and pacs.009 messages.
     */
    /*
       pacs.004
           ./PmtRtr/GrpHdr/IntrBkSttlmDt
           ./PmtRtr/TxInf/IntrBkSttlmDt
       pacs.008
           ./FIToFICstmrCdtTrf/GrpHdr/IntrBkSttlmDt
           ./FIToFICstmrCdtTrf/CdtTrfTxInf/IntrBkSttlmDt
       new versions pacs 009
           ./FICdtTrf/GrpHdr/SttlmDt
           ./FICdtTrf/CdtTrfTxInf/SttlmDt
       older versions pacs 009
           ./FinInstnCdtTrf/GrpHdr/IntrBkSttlmDt
           ./FinInstnCdtTrf/CdtTrfTxInf/IntrBkSttlmDt
    */
    private Calendar getPacsValueDate(MxNode document) {
        MxNode date = document.findFirstByName("IntrBkSttlmDt");
        if (date != null) {
            return getCalendar(date);
        }
        return null;
    }

    private Calendar getCalendar(MxNode date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parsedDate = sdf.parse(date.getValue());
            Calendar cal = Calendar.getInstance();
            cal.setTime(parsedDate);
            return cal;
        } catch (ParseException e) {
            log.fine("Error parsing MX date: " + e.getMessage());
            return null;
        }
    }

    private Calendar getCamt52ValueDate(MxNode document) {
        MxNode date = document.findFirst("./BkToCstmrAcctRpt/Rpt/Bal/Dt/Dt");
        if (date != null) {
            return getCalendar(date);
        }
        return null;
    }

    private Calendar getCamt53ValueDate(MxNode document) {
        MxNode date = document.findFirst("./BkToCstmrStmt/Stmt/Bal/Dt/Dt");
        if (date != null) {
            return getCalendar(date);
        }
        return null;
    }

    private Calendar getCamt54ValueDate(MxNode document) {
        MxNode date = document.findFirst("./BkToCstmrDbtCdtNtfctn/Ntfctn/Ntry/NtryDtls/TxDtls/RltdDts/IntrBkSttlmDt");
        if (date != null) {
            return getCalendar(date);
        }
        return null;
    }

    private Calendar getCamt56ValueDate(MxNode document) {
        MxNode date = document.findFirst("./FIToFIPmtCxlReq/Undrlyg/TxInf/OrgnlIntrBkSttlmDt");
        if (date != null) {
            return getCalendar(date);
        }
        return null;
    }

    private Calendar getCamt57ValueDate(MxNode document) {
        MxNode date = document.findFirst("./NtfctnToRcv/Ntfctn/XpctdValDt");
        if (date != null) {
            return getCalendar(date);
        }
        return null;
    }

    private Calendar getCamt60ValueDate(MxNode document) {
        MxNode date = document.findFirst("./FIToFIPmtCxlReq/Undrlyg/TxInf/OrgnlIntrBkSttlmDt");
        if (date != null) {
            return getCalendar(date);
        }
        return null;
    }

    @Override
    public Optional<Calendar> tradeDate(AbstractMessage message) {
        return Optional.empty();
    }
}
