
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCassetteStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMCassetteStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUOK"/&gt;
 *     &lt;enumeration value="CUFL"/&gt;
 *     &lt;enumeration value="CUHG"/&gt;
 *     &lt;enumeration value="CULW"/&gt;
 *     &lt;enumeration value="CUMT"/&gt;
 *     &lt;enumeration value="CUNP"/&gt;
 *     &lt;enumeration value="CUMS"/&gt;
 *     &lt;enumeration value="CUNA"/&gt;
 *     &lt;enumeration value="CUNR"/&gt;
 *     &lt;enumeration value="CUMP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMCassetteStatus1Code")
@XmlEnum
public enum ATMCassetteStatus1Code {


    /**
     * The cash unit is in a good state.
     * 
     */
    CUOK,

    /**
     * The cash unit is full.
     * 
     */
    CUFL,

    /**
     * The cash unit is high, that is it has reached or exceeded the threshold defined for this cassette.
     * 
     */
    CUHG,

    /**
     * The cash unit is low, that is it has reached or is below the threshold defined for this cassette.
     * 
     */
    CULW,

    /**
     * The cash unit is empty.
     * 
     */
    CUMT,

    /**
     * The cash unit is inoperative.
     * 
     */
    CUNP,

    /**
     * The cash unit is missing.
     * 
     */
    CUMS,

    /**
     * The values of this cash unit are not available.
     * 
     */
    CUNA,

    /**
     * There are no reference values available for this cash unit.
     * 
     */
    CUNR,

    /**
     * The device has been inserted when the device was not in an exchange state.
     * 
     */
    CUMP;

    public String value() {
        return name();
    }

    public static ATMCassetteStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
