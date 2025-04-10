
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeType12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ChargeType12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BEND"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="FEND"/>
 *     <enumeration value="POST"/>
 *     <enumeration value="REGF"/>
 *     <enumeration value="SHIP"/>
 *     <enumeration value="SPCN"/>
 *     <enumeration value="TRAN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ChargeType12Code")
@XmlEnum
public enum ChargeType12Code {


    /**
     * Sales charge paid by the investor when redeeming an investment such as an investment fund.
     * 
     */
    BEND,

    /**
     * Charge that has been reduced from the standard initial charge levied by a fund, eg, during a launch period or as negotiated by a funds supermarket / discount broker.
     * 
     */
    DISC,

    /**
     * Sales charge paid immediately by the investor when subscribing to an investment such as an investment fund.
     * 
     */
    FEND,

    /**
     * Charge paid for the postage.
     * 
     */
    POST,

    /**
     * Fee charged by a regulatory authority, eg, Securities and Exchange fees.
     * 
     */
    REGF,

    /**
     * Charge for shipping, including the insurance of securities.
     * 
     */
    SHIP,

    /**
     * Charges, drawdown, or other reduction from or in addition to the deal price.
     * 
     */
    SPCN,

    /**
     * In investment funds, a fee charged for the transfer of ownership of an investment fund.
     * 
     */
    TRAN;

    public String value() {
        return name();
    }

    public static ChargeType12Code fromValue(String v) {
        return valueOf(v);
    }

}
