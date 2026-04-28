
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDataWriting1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardDataWriting1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ICPY"/&gt;
 *     &lt;enumeration value="MGST"/&gt;
 *     &lt;enumeration value="ICCY"/&gt;
 *     &lt;enumeration value="MSIP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="UNSP"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardDataWriting1Code")
@XmlEnum
public enum CardDataWriting1Code {


    /**
     * ICC contactless proximity
     * 
     */
    ICPY,

    /**
     * Magnetic stripe.
     * 
     */
    MGST,

    /**
     * ICC contact capability
     * 
     */
    ICCY,

    /**
     * Magstripe image contactless proximity
     * 
     */
    MSIP,

    /**
     * Other national capability type assigned at national level.
     * 
     */
    OTHN,

    /**
     * Unspecified capability.
     * 
     */
    UNSP,

    /**
     * Other card reading capability assigned on a private basis.
     * 
     */
    OTHP;

    public String value() {
        return name();
    }

    public static CardDataWriting1Code fromValue(String v) {
        return valueOf(v);
    }

}
