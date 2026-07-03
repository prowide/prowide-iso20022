
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskLevel1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RiskLevel1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HIGH"/&gt;
 *     &lt;enumeration value="LOWW"/&gt;
 *     &lt;enumeration value="MEDM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RiskLevel1Code")
@XmlEnum
public enum RiskLevel1Code {


    /**
     * High.
     * 
     */
    HIGH,

    /**
     * Low.
     * 
     */
    LOWW,

    /**
     * Medium.
     * 
     */
    MEDM;

    public String value() {
        return name();
    }

    public static RiskLevel1Code fromValue(String v) {
        return valueOf(v);
    }

}
