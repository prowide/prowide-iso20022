
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesExitReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuritiesExitReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REST"/&gt;
 *     &lt;enumeration value="NTRN"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecuritiesExitReason1Code")
@XmlEnum
public enum SecuritiesExitReason1Code {


    /**
     * Shares are restricted.
     * 
     */
    REST,

    /**
     * Shares are non transferable.
     * 
     */
    NTRN,

    /**
     * Other reason.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static SecuritiesExitReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
