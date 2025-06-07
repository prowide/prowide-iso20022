
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundCashAccount4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FundCashAccount4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HEDG"/&gt;
 *     &lt;enumeration value="CPFO"/&gt;
 *     &lt;enumeration value="CPFS"/&gt;
 *     &lt;enumeration value="SRSA"/&gt;
 *     &lt;enumeration value="CSDO"/&gt;
 *     &lt;enumeration value="TOFF"/&gt;
 *     &lt;enumeration value="ICSA"/&gt;
 *     &lt;enumeration value="CSDM"/&gt;
 *     &lt;enumeration value="CSDP"/&gt;
 *     &lt;enumeration value="PPEN"/&gt;
 *     &lt;enumeration value="CPEN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FundCashAccount4Code")
@XmlEnum
public enum FundCashAccount4Code {


    /**
     * Hedge fund account.
     * 
     */
    HEDG,

    /**
     * Central Provident Fund (CPF) ordinary account.
     * 
     */
    CPFO,

    /**
     * Central Provident Fund (CPF) special account.
     * 
     */
    CPFS,

    /**
     * Supplementary Retirement Scheme (SRS) account.
     * 
     */
    SRSA,

    /**
     * Account operated by a CSD in cross-CSD settlement context.
     * 
     */
    CSDO,

    /**
     * Account operated by a CSD in a direct holding market context.
     * 
     */
    TOFF,

    /**
     * Account operated by a CSD for settlement of securities legs for instructions involving internal CSDs.
     * 
     */
    ICSA,

    /**
     * Account operated by a CSD for mirroring positions.
     * 
     */
    CSDM,

    /**
     * Account owned by a CSD participant.
     * 
     */
    CSDP,

    /**
     * Private pension account.
     * 
     */
    PPEN,

    /**
     * Workplace or company pension account.
     * 
     */
    CPEN;

    public String value() {
        return name();
    }

    public static FundCashAccount4Code fromValue(String v) {
        return valueOf(v);
    }

}
