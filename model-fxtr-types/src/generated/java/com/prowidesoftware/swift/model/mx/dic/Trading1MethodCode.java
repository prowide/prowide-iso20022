
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Trading1MethodCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Trading1MethodCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ELEC"/&gt;
 *     &lt;enumeration value="PHON"/&gt;
 *     &lt;enumeration value="BROK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Trading1MethodCode")
@XmlEnum
public enum Trading1MethodCode {


    /**
     * Trade executed through an electronic trading system.
     * 
     */
    ELEC,

    /**
     * Trade executed over the phone.
     * 
     */
    PHON,

    /**
     * Trade executed through a broker.
     * 
     */
    BROK;

    public String value() {
        return name();
    }

    public static Trading1MethodCode fromValue(String v) {
        return valueOf(v);
    }

}
