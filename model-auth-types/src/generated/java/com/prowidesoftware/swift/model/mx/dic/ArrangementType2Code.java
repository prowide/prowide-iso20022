
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrangementType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ArrangementType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RDLF"/&gt;
 *     &lt;enumeration value="NOAC"/&gt;
 *     &lt;enumeration value="GATE"/&gt;
 *     &lt;enumeration value="SPRN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ArrangementType2Code")
@XmlEnum
public enum ArrangementType2Code {


    /**
     * Liquidity fee is a fee taken against redemption proceeds and retained by the fund. Such fees are intended be a disincentive for shareholders to redeem shares of a fund in distress, and also to help bolster the liquidity levels in a fund by infusing the fund with the cash withheld from redemption proceeds. 
     * 
     */
    RDLF,

    /**
     * Specifies that no immediate action is taken as a measure.
     * 
     */
    NOAC,

    /**
     * Redemption gate is a temporary suspension of a shareholder’s right to redeem shares of the fund.
     * 
     */
    GATE,

    /**
     * Suspension of redemptions means that instructions to redeem units cannot be accepted until further notice or under specific arrangements.
     * 
     */
    SPRN;

    public String value() {
        return name();
    }

    public static ArrangementType2Code fromValue(String v) {
        return valueOf(v);
    }

}
