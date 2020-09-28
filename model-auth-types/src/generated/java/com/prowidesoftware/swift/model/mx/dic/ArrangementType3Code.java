
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrangementType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ArrangementType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SPRN"/&gt;
 *     &lt;enumeration value="RDLF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
