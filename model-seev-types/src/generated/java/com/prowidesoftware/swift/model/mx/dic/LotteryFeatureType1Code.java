
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LotteryFeatureType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LotteryFeatureType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="XTRA"/>
 *     <enumeration value="OPTL"/>
 *     <enumeration value="SINK"/>
 *     <enumeration value="SPCL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LotteryFeatureType1Code")
@XmlEnum
public enum LotteryFeatureType1Code {


    /**
     * Extraordinary redemption. Extraordinary redemption allows the issuer to call its bonds before maturity if certain specified events occur, such as the project for which the bond was issued to finance has been damaged or destroyed. This feature must be specified in the bond’s offering statement.
     * 
     */
    XTRA,

    /**
     * Issuer has the right to redeem all or part of the bonds before their maturity dates.
     * 
     */
    OPTL,

    /**
     * Bond sinking fund. Bond sinking fund is a financial mechanism used by bond issuers to set aside money for the purpose of repaying bondholders at maturity or through periodic redemptions.
     * 
     */
    SINK,

    /**
     * Special redemption bond. Bond that can be redeemed before maturity due to an unusual event, such as a catastrophe that impacts the source of the bond’s revenue. This feature must be specified in the bond’s offering statement. Special redemption can be done pursuant to the provisions of the indenture.
     * 
     */
    SPCL;

    public String value() {
        return name();
    }

    public static LotteryFeatureType1Code fromValue(String v) {
        return valueOf(v);
    }

}
