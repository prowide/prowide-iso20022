
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardServiceType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardServiceType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="FINL"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardServiceType4Code")
@XmlEnum
public enum CardServiceType4Code {


    /**
     * Partial reconciliation of the day.
     * 
     */
    PART,

    /**
     * Final reconciliation.
     * 
     */
    FINL,

    /**
     * National defined code.
     * 
     */
    OTHN,

    /**
     * Private defined code.
     * 
     */
    OTHP;

    public String value() {
        return name();
    }

    public static CardServiceType4Code fromValue(String v) {
        return valueOf(v);
    }

}
