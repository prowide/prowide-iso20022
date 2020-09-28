
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeType7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MANF"/&gt;
 *     &lt;enumeration value="BEND"/&gt;
 *     &lt;enumeration value="ADVI"/&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *     &lt;enumeration value="PUBL"/&gt;
 *     &lt;enumeration value="ACCT"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="EQUL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargeType7Code")
@XmlEnum
public enum ChargeType7Code {


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
     * Another type of charge.
     * 
     */
    OTHR,

    /**
     * The part of an investor's subscription amount that is held by the fund in order to pay incentive or performance fees at the end of the fiscal year.
     * 
     */
    EQUL;

    public String value() {
        return name();
    }

    public static ChargeType7Code fromValue(String v) {
        return valueOf(v);
    }

}
