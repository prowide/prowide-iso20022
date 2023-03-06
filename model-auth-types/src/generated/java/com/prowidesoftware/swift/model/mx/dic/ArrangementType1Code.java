
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrangementType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ArrangementType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GATE"/&gt;
 *     &lt;enumeration value="RDLF"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="SPDL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ArrangementType1Code")
@XmlEnum
public enum ArrangementType1Code {


    /**
     * Redemption gate is a temporary suspension of a shareholder’s right to redeem shares of the fund.
     * 
     */
    GATE,

    /**
     * Liquidity fee is a fee taken against redemption proceeds and retained by the fund. Such fees are intended be a disincentive for shareholders to redeem shares of a fund in distress, and also to help bolster the liquidity levels in a fund by infusing the fund with the cash withheld from redemption proceeds. 
     * 
     */
    RDLF,

    /**
     * Other arrangement type.
     * 
     */
    OTHR,

    /**
     * Suspension of dealing means that instructions to buy, sell or switch units cannot be accepted until further notice.
     * 
     */
    SPDL;

    public String value() {
        return name();
    }

    public static ArrangementType1Code fromValue(String v) {
        return valueOf(v);
    }

}
