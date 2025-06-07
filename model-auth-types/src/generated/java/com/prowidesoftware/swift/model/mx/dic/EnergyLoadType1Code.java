
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyLoadType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnergyLoadType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BSLD"/&gt;
 *     &lt;enumeration value="GASD"/&gt;
 *     &lt;enumeration value="HABH"/&gt;
 *     &lt;enumeration value="OFFP"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="PKLD"/&gt;
 *     &lt;enumeration value="SHPD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnergyLoadType1Code")
@XmlEnum
public enum EnergyLoadType1Code {


    /**
     * Base load.
     * 
     */
    BSLD,

    /**
     * Gas day.
     * 
     */
    GASD,

    /**
     * Hour and block hours.
     * 
     */
    HABH,

    /**
     * Off-Peak.
     * 
     * 
     */
    OFFP,

    /**
     * Other.
     * 
     */
    OTHR,

    /**
     * Peak load.
     * 
     */
    PKLD,

    /**
     * Shaped.
     * 
     */
    SHPD;

    public String value() {
        return name();
    }

    public static EnergyLoadType1Code fromValue(String v) {
        return valueOf(v);
    }

}
