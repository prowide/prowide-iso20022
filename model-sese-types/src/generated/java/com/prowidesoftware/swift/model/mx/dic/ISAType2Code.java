
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ISAType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ISAType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MINE"/&gt;
 *     &lt;enumeration value="MAXI"/&gt;
 *     &lt;enumeration value="MINC"/&gt;
 *     &lt;enumeration value="ANYI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ISAType2Code")
@XmlEnum
public enum ISAType2Code {


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
    MINC,

    /**
     * Any ISA.
     * 
     */
    ANYI;

    public String value() {
        return name();
    }

    public static ISAType2Code fromValue(String v) {
        return valueOf(v);
    }

}
