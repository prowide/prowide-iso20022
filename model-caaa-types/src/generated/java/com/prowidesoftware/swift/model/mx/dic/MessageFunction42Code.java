
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction42Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageFunction42Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AUTQ"/&gt;
 *     &lt;enumeration value="AUTP"/&gt;
 *     &lt;enumeration value="CCAV"/&gt;
 *     &lt;enumeration value="CCAK"/&gt;
 *     &lt;enumeration value="CCAQ"/&gt;
 *     &lt;enumeration value="CCAP"/&gt;
 *     &lt;enumeration value="CMPV"/&gt;
 *     &lt;enumeration value="CMPK"/&gt;
 *     &lt;enumeration value="DCAV"/&gt;
 *     &lt;enumeration value="DCRR"/&gt;
 *     &lt;enumeration value="DCCQ"/&gt;
 *     &lt;enumeration value="DCCP"/&gt;
 *     &lt;enumeration value="DGNP"/&gt;
 *     &lt;enumeration value="DGNQ"/&gt;
 *     &lt;enumeration value="FAUQ"/&gt;
 *     &lt;enumeration value="FAUP"/&gt;
 *     &lt;enumeration value="FCMV"/&gt;
 *     &lt;enumeration value="FCMK"/&gt;
 *     &lt;enumeration value="FRVA"/&gt;
 *     &lt;enumeration value="FRVR"/&gt;
 *     &lt;enumeration value="RCLQ"/&gt;
 *     &lt;enumeration value="RCLP"/&gt;
 *     &lt;enumeration value="RVRA"/&gt;
 *     &lt;enumeration value="RVRR"/&gt;
 *     &lt;enumeration value="CDDQ"/&gt;
 *     &lt;enumeration value="CDDK"/&gt;
 *     &lt;enumeration value="CDDR"/&gt;
 *     &lt;enumeration value="CDDP"/&gt;
 *     &lt;enumeration value="TRNR"/&gt;
 *     &lt;enumeration value="TRNA"/&gt;
 *     &lt;enumeration value="NFRQ"/&gt;
 *     &lt;enumeration value="NFRP"/&gt;
 *     &lt;enumeration value="TRPQ"/&gt;
 *     &lt;enumeration value="TRPP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageFunction42Code")
@XmlEnum
public enum MessageFunction42Code {


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
    TRPP;

    public String value() {
        return name();
    }

    public static MessageFunction42Code fromValue(String v) {
        return valueOf(v);
    }

}
