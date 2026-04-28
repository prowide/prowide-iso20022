
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ISAType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ISAType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MINE"/&gt;
 *     &lt;enumeration value="MAXI"/&gt;
 *     &lt;enumeration value="MINC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ISAType1Code")
@XmlEnum
public enum ISAType1Code {


    /**
     * Type of ISA that offers a stocks and shares component only (no cash).
     * 
     */
    MINE,

    /**
     * Type of ISA that must offer a stocks and shares component and, optionally, a cash component.
     * 
     */
    MAXI,

    /**
     * Type of ISA that offers a cash component only (no stock).
     * 
     */
    MINC;

    public String value() {
        return name();
    }

    public static ISAType1Code fromValue(String v) {
        return valueOf(v);
    }

}
