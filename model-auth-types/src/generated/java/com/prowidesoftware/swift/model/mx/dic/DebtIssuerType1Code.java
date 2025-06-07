
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebtIssuerType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DebtIssuerType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CORP"/&gt;
 *     &lt;enumeration value="MUNI"/&gt;
 *     &lt;enumeration value="SPVS"/&gt;
 *     &lt;enumeration value="SUPR"/&gt;
 *     &lt;enumeration value="SVGN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DebtIssuerType1Code")
@XmlEnum
public enum DebtIssuerType1Code {


    /**
     * Identifies categories of instruments issued by corporates.
     * 
     */
    CORP,

    /**
     * Identifies categories of securities issued by states and local governments.
     * 
     */
    MUNI,

    /**
     * Firms or governments may issue bonds for special projects or through special purpose vehicles. These bonds are tied to a specific project, such as an infrastructure build. The bond proceeds are then used to finance that project, and the coupon payments and principal are paid out through the project’s revenue.
     * 
     */
    SPVS,

    /**
     * Supranational entities refer to global entities that are not based in a specific nation. More specifically, a supranational entity has members that exist in multiple countries. Examples of supranational entities that issue bonds are the World Bank or the European Investment Bank. Like government bonds, these bonds are typically quite highly rated.
     * 
     * A supranational entity may issue bonds to fund its operations, and pay out coupon payments through operational revenue.
     * 
     */
    SUPR,

    /**
     * Asset type is sovereign.
     * 
     */
    SVGN;

    public String value() {
        return name();
    }

    public static DebtIssuerType1Code fromValue(String v) {
        return valueOf(v);
    }

}
