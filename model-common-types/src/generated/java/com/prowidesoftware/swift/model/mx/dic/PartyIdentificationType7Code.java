
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentificationType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartyIdentificationType7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ATIN"/>
 *     <enumeration value="IDCD"/>
 *     <enumeration value="NRIN"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PASS"/>
 *     <enumeration value="POCD"/>
 *     <enumeration value="SOCS"/>
 *     <enumeration value="SRSA"/>
 *     <enumeration value="GUNL"/>
 *     <enumeration value="GTIN"/>
 *     <enumeration value="ITIN"/>
 *     <enumeration value="CPFA"/>
 *     <enumeration value="AREG"/>
 *     <enumeration value="DRLC"/>
 *     <enumeration value="EMID"/>
 *     <enumeration value="NINV"/>
 *     <enumeration value="INCL"/>
 *     <enumeration value="GIIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PartyIdentificationType7Code")
@XmlEnum
public enum PartyIdentificationType7Code {


    /**
     * Temporary tax processing number (used in the domestic adoption of a child).
     * 
     */
    ATIN,

    /**
     * Number assigned by a national authority to an identity card.
     * 
     */
    IDCD,

    /**
     * National registration identification number. In Singapore this is known as the NRIC.
     * 
     */
    NRIN,

    /**
     * Another type of identification type.
     * 
     */
    OTHR,

    /**
     * Number assigned by a passport authority to a passport.
     * 
     */
    PASS,

    /**
     * Post office card number as assigned by a national post office.
     * 
     */
    POCD,

    /**
     * Number assigned by a social security agency.
     * 
     */
    SOCS,

    /**
     * Supplementary retirement scheme account number.
     * 
     */
    SRSA,

    /**
     * Gun license number as assigned by a gun licensing authority.
     * 
     */
    GUNL,

    /**
     * Generic tax identification number.
     * 
     */
    GTIN,

    /**
     * Tax processing number.
     * 
     */
    ITIN,

    /**
     * Account issued by the Central Provident Fund Board (Singapore).
     * 
     */
    CPFA,

    /**
     * Number assigned by a government agency to identify foreign nationals.
     * 
     */
    AREG,

    /**
     * Number assigned by a license authority to a driver's license.
     * 
     */
    DRLC,

    /**
     * Number assigned to an employer by a registration authority.
     * 
     */
    EMID,

    /**
     * Number that identifies the type of investor registered at a securities and exchange commission.
     * 
     */
    NINV,

    /**
     * Number, typically assigned by a government to describe ownership, administrative and authoritative relations.
     * 
     */
    INCL,

    /**
     * Global intermediary tax identification number.
     * 
     */
    GIIN;

    public String value() {
        return name();
    }

    public static PartyIdentificationType7Code fromValue(String v) {
        return valueOf(v);
    }

}
