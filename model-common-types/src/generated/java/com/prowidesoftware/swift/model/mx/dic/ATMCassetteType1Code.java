
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCassetteType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMCassetteType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DPST"/>
 *     <enumeration value="DISP"/>
 *     <enumeration value="RCYC"/>
 *     <enumeration value="RJCT"/>
 *     <enumeration value="RPLT"/>
 *     <enumeration value="RTRC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
