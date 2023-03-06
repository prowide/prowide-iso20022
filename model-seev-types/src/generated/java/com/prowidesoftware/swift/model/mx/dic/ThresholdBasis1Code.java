
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThresholdBasis1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThresholdBasis1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALSH"/&gt;
 *     &lt;enumeration value="ALSM"/&gt;
 *     &lt;enumeration value="ALVO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ThresholdBasis1Code")
@XmlEnum
public enum ThresholdBasis1Code {


    /**
     * Basis is the total number of shares issued.
     * 
     */
    ALSH,

    /**
     * Basis is the total number of shares represented at the meeting by attendees. 
     * 
     */
    ALSM,

    /**
     * Basis is the total number of vote cast for a resolution.
     * 
     */
    ALVO;

    public String value() {
        return name();
    }

    public static ThresholdBasis1Code fromValue(String v) {
        return valueOf(v);
    }

}
