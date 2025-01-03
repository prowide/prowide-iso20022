
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction46Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageFunction46Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AUTQ"/>
 *     <enumeration value="AUTP"/>
 *     <enumeration value="CCAV"/>
 *     <enumeration value="CCAK"/>
 *     <enumeration value="CCAQ"/>
 *     <enumeration value="CCAP"/>
 *     <enumeration value="CMPV"/>
 *     <enumeration value="CMPK"/>
 *     <enumeration value="DCAV"/>
 *     <enumeration value="DCRR"/>
 *     <enumeration value="DCCQ"/>
 *     <enumeration value="DCCP"/>
 *     <enumeration value="DGNP"/>
 *     <enumeration value="DGNQ"/>
 *     <enumeration value="FAUQ"/>
 *     <enumeration value="FAUP"/>
 *     <enumeration value="FCMV"/>
 *     <enumeration value="FCMK"/>
 *     <enumeration value="FRVA"/>
 *     <enumeration value="FRVR"/>
 *     <enumeration value="RCLQ"/>
 *     <enumeration value="RCLP"/>
 *     <enumeration value="RVRA"/>
 *     <enumeration value="RVRR"/>
 *     <enumeration value="CDDQ"/>
 *     <enumeration value="CDDK"/>
 *     <enumeration value="CDDR"/>
 *     <enumeration value="CDDP"/>
 *     <enumeration value="TRNR"/>
 *     <enumeration value="TRNA"/>
 *     <enumeration value="NFRQ"/>
 *     <enumeration value="NFRP"/>
 *     <enumeration value="TRPQ"/>
 *     <enumeration value="TRPP"/>
 *     <enumeration value="DCRQ"/>
 *     <enumeration value="DCRP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageFunction46Code")
@XmlEnum
public enum MessageFunction46Code {


    /**
     * The initiator requests an authorisation without financial impact to complete the transaction.
     * 
     */
    AUTQ,

    /**
     * Response for authorisation without financial capture.
     * 
     */
    AUTP,

    /**
     * Advice for cancellation.
     * 
     */
    CCAV,

    /**
     * Advice response for cancellation.
     * 
     */
    CCAK,

    /**
     * Request for cancellation.
     * 
     */
    CCAQ,

    /**
     * Response for cancellation.
     * 
     */
    CCAP,

    /**
     * Advice for completion without financial capture.
     * 
     */
    CMPV,

    /**
     * Advice response for completion without financial capture.
     * 
     */
    CMPK,

    /**
     * Advice for dynamic currency conversion.
     * 
     */
    DCAV,

    /**
     * Advice response for the currency conversion from the service provider to the acceptor.
     * 
     */
    DCRR,

    /**
     * Request for dynamic currency conversion.
     * 
     */
    DCCQ,

    /**
     * Response from a dynamic currency conversion.
     * 
     */
    DCCP,

    /**
     * Request for diagnostic.
     * 
     */
    DGNP,

    /**
     * Response for diagnostic.
     * 
     */
    DGNQ,

    /**
     * Request for authorisation with financial capture.
     * 
     */
    FAUQ,

    /**
     * Response for authorisation with financial capture.
     * 
     */
    FAUP,

    /**
     * Advice for completion with financial capture.
     * 
     */
    FCMV,

    /**
     * Advice response for completion with financial capture.
     * 
     */
    FCMK,

    /**
     * Advice for reversal with financial capture.
     * 
     */
    FRVA,

    /**
     * Advice response for reversal with financial capture.
     * 
     */
    FRVR,

    /**
     * Request for reconciliation.
     * 
     */
    RCLQ,

    /**
     * Response for reconciliation.
     * 
     */
    RCLP,

    /**
     * Advice for reversal without financial capture.
     * 
     */
    RVRA,

    /**
     * Advice response for reversal without financial capture.
     * 
     */
    RVRR,

    /**
     * Advice for a Card Direct Debit.
     * 
     */
    CDDQ,

    /**
     * Response to a Card Direct Debit Advice.
     * 
     */
    CDDK,

    /**
     * Request to initiate a Card Direct Debit.
     * 
     */
    CDDR,

    /**
     * Response to a Card Direct Debit Request.
     * 
     */
    CDDP,

    /**
     * Response to a transaction advice.
     * 
     */
    TRNR,

    /**
     * Advise of the transaction's processing.
     * 
     */
    TRNA,

    /**
     * Initiator of the message requests additional information to the receiver.
     * 
     */
    NFRQ,

    /**
     * Provision of additional information to the issuer of a NonFinancialRequest.
     * 
     */
    NFRP,

    /**
     * Request to receive of a report of transaction from the issuer to the receiver.
     * 
     */
    TRPQ,

    /**
     * Response to provide a sanitized report of transactions.
     * 
     */
    TRPP,

    /**
     * Request to receive catalogue of Currency Conversion rates.
     * 
     */
    DCRQ,

    /**
     * Response with catalogue of Currency Conversion rates.
     * 
     */
    DCRP;

    public String value() {
        return name();
    }

    public static MessageFunction46Code fromValue(String v) {
        return valueOf(v);
    }

}
