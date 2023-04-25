
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrangementType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ArrangementType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SPRN"/>
 *     <enumeration value="RDLF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ArrangementType3Code")
@XmlEnum
public enum ArrangementType3Code {


    /**
     * Suspension of redemptions means that instructions to redeem units cannot be accepted until further notice or under specific arrangements.
     * 
     */
    SPRN,

    /**
     * Liquidity fee is a fee taken against redemption proceeds and retained by the fund. Such fees are intended be a disincentive for shareholders to redeem shares of a fund in distress, and also to help bolster the liquidity levels in a fund by infusing the fund with the cash withheld from redemption proceeds. 
     * 
     */
    RDLF;

    public String value() {
        return name();
    }

    public static ArrangementType3Code fromValue(String v) {
        return valueOf(v);
    }

}
