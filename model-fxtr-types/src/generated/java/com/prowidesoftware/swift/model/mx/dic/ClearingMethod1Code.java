
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClearingMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GRNE"/&gt;
 *     &lt;enumeration value="NEMA"/&gt;
 *     &lt;enumeration value="NENE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClearingMethod1Code")
@XmlEnum
public enum ClearingMethod1Code {


    /**
     * Each trade is settled by a single entry to the account of the beneficiary.
     * 
     */
    GRNE,

    /**
     * In a foreign exchange transaction, the third party as a central clearing counterparty will settle the transaction for both sides respectively.
     * 
     */
    NEMA,

    /**
     * Settlement done by netting amounts (for trades in the same currency and for the same value date).
     * 
     */
    NENE;

    public String value() {
        return name();
    }

    public static ClearingMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
