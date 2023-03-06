
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeType9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeType9Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MANF"/&gt;
 *     &lt;enumeration value="BEND"/&gt;
 *     &lt;enumeration value="FEND"/&gt;
 *     &lt;enumeration value="ADVI"/&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *     &lt;enumeration value="PUBL"/&gt;
 *     &lt;enumeration value="ACCT"/&gt;
 *     &lt;enumeration value="EQUL"/&gt;
 *     &lt;enumeration value="PENA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargeType9Code")
@XmlEnum
public enum ChargeType9Code {


    /**
     * Fee paid to an investment manager for services. The fee usually includes fund administration costs and investor relationship management. Typically, the amount paid is a percentage of the assets under management.
     * 
     */
    MANF,

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
     * Fee paid for advisory services rendered.
     * 
     */
    ADVI,

    /**
     * Fee paid to a custodian in respect of custodial services.
     * 
     */
    CUST,

    /**
     * Fee paid in respect of publications made.
     * 
     */
    PUBL,

    /**
     * Fee paid for accounting services rendered.
     * 
     */
    ACCT,

    /**
     * The part of an investor's subscription amount that is held by the fund in order to pay incentive or performance fees at the end of the fiscal year.
     * 
     */
    EQUL,

    /**
     * Fee charged to the investor for early redemption of the fund.
     * 
     */
    PENA;

    public String value() {
        return name();
    }

    public static ChargeType9Code fromValue(String v) {
        return valueOf(v);
    }

}
