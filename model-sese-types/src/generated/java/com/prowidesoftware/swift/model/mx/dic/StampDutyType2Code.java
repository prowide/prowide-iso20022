
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StampDutyType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StampDutyType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASTD"/&gt;
 *     &lt;enumeration value="SDRN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StampDutyType2Code")
@XmlEnum
public enum StampDutyType2Code {


    /**
     * Stamps duty is applicable.
     * 
     */
    ASTD,

    /**
     * Stamp duty not applicable.
     * 
     */
    SDRN;

    public String value() {
        return name();
    }

    public static StampDutyType2Code fromValue(String v) {
        return valueOf(v);
    }

}
