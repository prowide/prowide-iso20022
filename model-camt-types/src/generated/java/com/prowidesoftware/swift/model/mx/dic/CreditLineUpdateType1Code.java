
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditLineUpdateType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditLineUpdateType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DECR"/&gt;
 *     &lt;enumeration value="INCR"/&gt;
 *     &lt;enumeration value="RPLC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CreditLineUpdateType1Code")
@XmlEnum
public enum CreditLineUpdateType1Code {


    /**
     * Decrease to the credit line amount.
     * 
     */
    DECR,

    /**
     * Increase to the credit line amount.
     * 
     */
    INCR,

    /**
     * Credit line amount is replaced with new value.
     * 
     */
    RPLC;

    public String value() {
        return name();
    }

    public static CreditLineUpdateType1Code fromValue(String v) {
        return valueOf(v);
    }

}
