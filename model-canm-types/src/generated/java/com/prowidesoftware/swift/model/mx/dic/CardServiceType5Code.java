
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardServiceType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardServiceType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="KYDL"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="DEKY"/&gt;
 *     &lt;enumeration value="RQKY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardServiceType5Code")
@XmlEnum
public enum CardServiceType5Code {


    /**
     * Convey the key to the receiver.
     * 
     */
    KYDL,

    /**
     * National defined code.
     * 
     */
    OTHN,

    /**
     * Private defined code.
     * 
     */
    OTHP,

    /**
     * Deactivate the specified key.
     * 
     */
    DEKY,

    /**
     * Request new key to be generated and conveyed.
     * 
     */
    RQKY;

    public String value() {
        return name();
    }

    public static CardServiceType5Code fromValue(String v) {
        return valueOf(v);
    }

}
