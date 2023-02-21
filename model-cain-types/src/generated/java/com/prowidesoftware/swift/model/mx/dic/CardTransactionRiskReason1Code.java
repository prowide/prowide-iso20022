
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardTransactionRiskReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardTransactionRiskReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APDP"/&gt;
 *     &lt;enumeration value="APDL"/&gt;
 *     &lt;enumeration value="ATHA"/&gt;
 *     &lt;enumeration value="CRDC"/&gt;
 *     &lt;enumeration value="ECMA"/&gt;
 *     &lt;enumeration value="EXCD"/&gt;
 *     &lt;enumeration value="FGNA"/&gt;
 *     &lt;enumeration value="GEOA"/&gt;
 *     &lt;enumeration value="MCCH"/&gt;
 *     &lt;enumeration value="KEYA"/&gt;
 *     &lt;enumeration value="MCCA"/&gt;
 *     &lt;enumeration value="AMNT"/&gt;
 *     &lt;enumeration value="CRDF"/&gt;
 *     &lt;enumeration value="MRCF"/&gt;
 *     &lt;enumeration value="TXCA"/&gt;
 *     &lt;enumeration value="TXNB"/&gt;
 *     &lt;enumeration value="TXTM"/&gt;
 *     &lt;enumeration value="TMIN"/&gt;
 *     &lt;enumeration value="TXTP"/&gt;
 *     &lt;enumeration value="UATA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardTransactionRiskReason1Code")
@XmlEnum
public enum CardTransactionRiskReason1Code {


    /**
     * Suspicious approve or decline pattern.
     * 
     */
    APDP,

    /**
     * Suspicious sequence of approve and decline messages.
     * 
     */
    APDL,

    /**
     * Suspicious authorization activity.
     * 
     */
    ATHA,

    /**
     * Compromised card.
     * 
     */
    CRDC,

    /**
     * Suspicious electronic commerce activity.
     * 
     */
    ECMA,

    /**
     * Expiry date mismatch.
     * 
     */
    EXCD,

    /**
     * Suspicious foreign activity.
     * 
     */
    FGNA,

    /**
     * Suspicious geographic activity.
     * 
     */
    GEOA,

    /**
     * High Risk MCC (Merchant Category Code).
     * 
     */
    MCCH,

    /**
     * Suspicious manual card data entry mode.
     * 
     */
    KEYA,

    /**
     * Suspicious MCC (Merchant Category Code) activity.
     * 
     */
    MCCA,

    /**
     * Suspicious amount.
     * 
     */
    AMNT,

    /**
     * Suspicious fraudulent cardholder.
     * 
     */
    CRDF,

    /**
     * Suspicious fraudulent merchant.
     * 
     */
    MRCF,

    /**
     * Suspicious transaction cumulated amount at merchant.
     * 
     */
    TXCA,

    /**
     * Suspicious transaction number at merchant.
     * 
     */
    TXNB,

    /**
     * Suspicious transaction time.
     * 
     */
    TXTM,

    /**
     * Suspicious transaction time interval.
     * 
     */
    TMIN,

    /**
     * Suspicious transaction type.
     * 
     */
    TXTP,

    /**
     * Suspicious unattended terminal activity.
     * 
     */
    UATA;

    public String value() {
        return name();
    }

    public static CardTransactionRiskReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
