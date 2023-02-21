
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCassetteType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMCassetteType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DPST"/&gt;
 *     &lt;enumeration value="DISP"/&gt;
 *     &lt;enumeration value="RCYC"/&gt;
 *     &lt;enumeration value="RJCT"/&gt;
 *     &lt;enumeration value="RPLT"/&gt;
 *     &lt;enumeration value="RTRC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMCassetteType1Code")
@XmlEnum
public enum ATMCassetteType1Code {


    /**
     * Cassette for deposits.
     * 
     */
    DPST,

    /**
     * Cassette for dispense.
     * 
     */
    DISP,

    /**
     * Cassette for recycling.
     * 
     */
    RCYC,

    /**
     * Cassette for reject.
     * 
     */
    RJCT,

    /**
     * Cassette for replenishment.
     * 
     */
    RPLT,

    /**
     * Cassette for retract.
     * 
     */
    RTRC;

    public String value() {
        return name();
    }

    public static ATMCassetteType1Code fromValue(String v) {
        return valueOf(v);
    }

}
