
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeType15Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ChargeType15Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BEND"/>
 *     <enumeration value="FEND"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="UCIC"/>
 *     <enumeration value="CHAR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ChargeType15Code")
@XmlEnum
public enum ChargeType15Code {


    /**
     * Sales charge paid by the investor when redeeming an investment such as an investment fund.
     * 
     */
    BEND,

    /**
     * Sales charge paid immediately by the investor when subscribing to an investment such as an investment fund.
     * 
     */
    FEND,

    /**
     * Charge that has been reduced from the standard initial charge levied by a fund, eg, during a launch period or as negotiated by a funds supermarket / discount broker.
     * 
     */
    DISC,

    /**
     * Charges paid by the investor to the Fund Company for subscription and redemption orders.
     * 
     */
    UCIC,

    /**
     * Fee paid for the provision of financial services.
     * 
     */
    CHAR;

    public String value() {
        return name();
    }

    public static ChargeType15Code fromValue(String v) {
        return valueOf(v);
    }

}
