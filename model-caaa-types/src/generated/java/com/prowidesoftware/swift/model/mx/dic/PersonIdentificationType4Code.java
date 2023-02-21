
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonIdentificationType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonIdentificationType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PASS"/&gt;
 *     &lt;enumeration value="DRLC"/&gt;
 *     &lt;enumeration value="EEID"/&gt;
 *     &lt;enumeration value="DRVR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PersonIdentificationType4Code")
@XmlEnum
public enum PersonIdentificationType4Code {


    /**
     * Number assigned by a passport authority to a passport.
     * 
     */
    PASS,

    /**
     * Number assigned by a license authority to a driver's license.
     * 
     */
    DRLC,

    /**
     * Employee number assigned by the company.
     * 
     */
    EEID,

    /**
     * Driver number, assigned by the fleet manager.
     * 
     */
    DRVR;

    public String value() {
        return name();
    }

    public static PersonIdentificationType4Code fromValue(String v) {
        return valueOf(v);
    }

}
