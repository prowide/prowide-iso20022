
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardTransactionRiskReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardTransactionRiskReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APDP"/>
 *     <enumeration value="APDL"/>
 *     <enumeration value="ATHA"/>
 *     <enumeration value="CRDC"/>
 *     <enumeration value="ECMA"/>
 *     <enumeration value="EXCD"/>
 *     <enumeration value="FGNA"/>
 *     <enumeration value="GEOA"/>
 *     <enumeration value="MCCH"/>
 *     <enumeration value="KEYA"/>
 *     <enumeration value="MCCA"/>
 *     <enumeration value="AMNT"/>
 *     <enumeration value="CRDF"/>
 *     <enumeration value="MRCF"/>
 *     <enumeration value="TXCA"/>
 *     <enumeration value="TXNB"/>
 *     <enumeration value="TXTM"/>
 *     <enumeration value="TMIN"/>
 *     <enumeration value="TXTP"/>
 *     <enumeration value="UATA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
