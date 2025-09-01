
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfAmount2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CSHB"/&gt;
 *     &lt;enumeration value="GRTY"/&gt;
 *     &lt;enumeration value="FEES"/&gt;
 *     &lt;enumeration value="RBTS"/&gt;
 *     &lt;enumeration value="VATX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfAmount2Code")
@XmlEnum
public enum TypeOfAmount2Code {


    /**
     * Cash-back amount.
     * 
     */
    CSHB,

    /**
     * Gratuity amount.
     * 
     */
    GRTY,

    /**
     * Fees.
     * 
     */
    FEES,

    /**
     * Global rebate of the transaction. This amount is counted as a negative amount.
     * 
     */
    RBTS,

    /**
     * Value added tax amount.
     * 
     */
    VATX;

    public String value() {
        return name();
    }

    public static TypeOfAmount2Code fromValue(String v) {
        return valueOf(v);
    }

}
