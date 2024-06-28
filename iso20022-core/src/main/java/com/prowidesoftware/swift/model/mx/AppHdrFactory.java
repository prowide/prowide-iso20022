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

import com.prowidesoftware.ProwideException;
import com.prowidesoftware.swift.model.MxId;
import com.prowidesoftware.swift.model.mx.dic.*;

/**
 * Factory methods to create different variant of application headers.
 *
 * @since 9.0.1
 */
public class AppHdrFactory {

    /**
     * Convenient method to create a new ISO header version 1, initialized from simple parameters.
     *
     * <p>All parameters are optional but in order for the header to be valid the sender, receiver and reference must
     * be set. Creation date will be set to current time.
     *
     * @param sender    optional sender BIC for the Fr element or null to leave not set
     * @param receiver  optional receiver BIC for the To element or null to leave not set
     * @param reference optional reference for the BizMsgIdr (business message identifier) or null to leave not set
     * @param id        optional MX identification for the MsgDefIdr (message definition identifier) element or null to leave not set
     * @return new header initialized from parameters.
     */
    public static BusinessAppHdrV01 createBusinessAppHdrV01(
            final String sender, final String receiver, final String reference, final MxId id) {
        BusinessAppHdrV01 h = new BusinessAppHdrV01();

        if (sender != null) {
            h.setFr(new Party9Choice());
            h.getFr().setFIId(new BranchAndFinancialInstitutionIdentification5());
            h.getFr().getFIId().setFinInstnId(new FinancialInstitutionIdentification8());
            h.getFr().getFIId().getFinInstnId().setBICFI(sender);
        }

        if (receiver != null) {
            h.setTo(new Party9Choice());
            h.getTo().setFIId(new BranchAndFinancialInstitutionIdentification5());
            h.getTo().getFIId().setFinInstnId(new FinancialInstitutionIdentification8());
            h.getTo().getFIId().getFinInstnId().setBICFI(receiver);
        }

        if (reference != null) {
            h.setBizMsgIdr(reference);
        }

        if (id != null) {
            h.setMsgDefIdr(id.id());
        }

        h.setCreDt(XMLGregorianCalendarUtils.now());

        return h;
    }

    /**
     * Convenient method to create a new ISO header version 2, initialized from simple parameters.
     *
     * <p>All parameters are optional but in order for the header to be valid the sender, receiver and reference must
     * be set. Creation date will be set to current time.
     *
     * @param sender    optional sender BIC for the Fr element or null to leave not set
     * @param receiver  optional receiver BIC for the To element or null to leave not set
     * @param reference optional reference for the BizMsgIdr (business message identifier) or null to leave not set
     * @param id        optional MX identification for the MsgDefIdr (message definition identifier) element or null to leave not set
     * @return new header initialized from parameters.
     */
    public static BusinessAppHdrV02 createBusinessAppHdrV02(
            final String sender, final String receiver, final String reference, final MxId id) {
        BusinessAppHdrV02 h = new BusinessAppHdrV02();

        if (sender != null) {
            h.setFr(new Party44Choice());
            h.getFr().setFIId(new BranchAndFinancialInstitutionIdentification6());
            h.getFr().getFIId().setFinInstnId(new FinancialInstitutionIdentification18());
            h.getFr().getFIId().getFinInstnId().setBICFI(sender);
        }

        if (receiver != null) {
            h.setTo(new Party44Choice());
            h.getTo().setFIId(new BranchAndFinancialInstitutionIdentification6());
            h.getTo().getFIId().setFinInstnId(new FinancialInstitutionIdentification18());
            h.getTo().getFIId().getFinInstnId().setBICFI(receiver);
        }

        if (reference != null) {
            h.setBizMsgIdr(reference);
        }

        if (id != null) {
            h.setMsgDefIdr(id.id());
            if (id.getBusinessService().isPresent()) {
                h.setBizSvc(id.getBusinessService().get());
            }
        }

        h.setCreDt(XMLGregorianCalendarUtils.now());

        return h;
    }

    /**
     * Convenient method to create a new ISO header version 3, initialized from simple parameters.
     *
     * <p>All parameters are optional but in order for the header to be valid the sender, receiver and reference must
     * be set. Creation date will be set to current time.
     *
     * @param sender    optional sender BIC for the Fr element or null to leave not set
     * @param receiver  optional receiver BIC for the To element or null to leave not set
     * @param reference optional reference for the BizMsgIdr (business message identifier) or null to leave not set
     * @param id        optional MX identification for the MsgDefIdr (message definition identifier) element or null to leave not set
     * @return new header initialized from parameters.
     * @since 9.3.4
     */
    public static BusinessAppHdrV03 createBusinessAppHdrV03(
            final String sender, final String receiver, final String reference, final MxId id) {
        BusinessAppHdrV03 h = new BusinessAppHdrV03();

        if (sender != null) {
            h.setFr(new Party44Choice());
            h.getFr().setFIId(new BranchAndFinancialInstitutionIdentification6());
            h.getFr().getFIId().setFinInstnId(new FinancialInstitutionIdentification18());
            h.getFr().getFIId().getFinInstnId().setBICFI(sender);
        }

        if (receiver != null) {
            h.setTo(new Party44Choice());
            h.getTo().setFIId(new BranchAndFinancialInstitutionIdentification6());
            h.getTo().getFIId().setFinInstnId(new FinancialInstitutionIdentification18());
            h.getTo().getFIId().getFinInstnId().setBICFI(receiver);
        }

        if (reference != null) {
            h.setBizMsgIdr(reference);
        }

        if (id != null) {
            h.setMsgDefIdr(id.id());
            if (id.getBusinessService().isPresent()) {
                h.setBizSvc(id.getBusinessService().get());
            }
        }

        h.setCreDt(XMLGregorianCalendarUtils.now());

        return h;
    }

    /**
     * Convenient method to create a new legacy SWIFT header, initialized from simple parameters.
     *
     * <p>All parameters are optional but in order for the header to be valid the sender, receiver and reference must
     * be set. Creation date will be set to current time.
     *
     * @param sender    optional sender BIC for the Fr element or null to leave not set
     * @param receiver  optional receiver BIC for the To element or null to leave not set
     * @param reference optional reference for the BizMsgIdr (business message identifier) or null to leave not set
     * @param id        optional MX identification for the MsgDefIdr (message definition identifier) element or null to leave not set
     * @return new header initialized from parameters.
     */
    public static LegacyAppHdr createLegacyAppHdr(
            final String sender, final String receiver, final String reference, final MxId id) {
        LegacyAppHdr h = new LegacyAppHdr();

        if (sender != null) {
            h.setFrom(new EntityIdentification());
            h.getFrom().setType("BIC");
            h.getFrom().setId(sender);
        }

        if (receiver != null) {
            h.setTo(new EntityIdentification());
            h.getTo().setType("BIC");
            h.getTo().setId(receiver);
        }

        if (reference != null) {
            h.setMsgRef(reference);
        }

        if (id != null) {
            h.setMsgName(id.id());
        }

        h.setCrDate(XMLGregorianCalendarUtils.now());

        return h;
    }

    /**
     * Convenient method to create a new header, initialized from simple parameters.
     *
     * @param sender    optional sender BIC for the Fr element or null to leave not set
     * @param receiver  optional receiver BIC for the To element or null to leave not set
     * @param reference optional reference for the BizMsgIdr (business message identifier) or null to leave not set
     * @param id        optional MX identification for the MsgDefIdr (message definition identifier) element or null to leave not set
     * @return new header initialized from parameters
     * @since 9.1.6
     */
    public static AppHdr createAppHdr(
            AppHdrType type, final String sender, final String receiver, final String reference, final MxId id) {
        switch (type) {
            case LEGACY:
                return createLegacyAppHdr(sender, receiver, reference, id);
            case BAH_V1:
                return createBusinessAppHdrV01(sender, receiver, reference, id);
            case BAH_V2:
                return createBusinessAppHdrV02(sender, receiver, reference, id);
            case BAH_V3:
                return createBusinessAppHdrV03(sender, receiver, reference, id);
            default:
                throw new ProwideException("Don't know how to create header " + type);
        }
    }
}
