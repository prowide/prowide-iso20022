
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganisationLegalStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OrganisationLegalStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CIOC"/>
 *     <enumeration value="CHAR"/>
 *     <enumeration value="CICC"/>
 *     <enumeration value="GENP"/>
 *     <enumeration value="IAPS"/>
 *     <enumeration value="LLPP"/>
 *     <enumeration value="PCLG"/>
 *     <enumeration value="LIMP"/>
 *     <enumeration value="PCLS"/>
 *     <enumeration value="PCLC"/>
 *     <enumeration value="SOLE"/>
 *     <enumeration value="UNLC"/>
 *     <enumeration value="UNLT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OrganisationLegalStatus1Code")
@XmlEnum
public enum OrganisationLegalStatus1Code {


    /**
     * Charitable incorporated organisation (CIO)
     * 
     */
    CIOC,

    /**
     * Charity
     * 
     */
    CHAR,

    /**
     * Community Interest Company (CIC)
     * 
     */
    CICC,

    /**
     * General partnership
     * 
     */
    GENP,

    /**
     * For example a co-operative, which does include Ltd. or charity.
     * 
     */
    IAPS,

    /**
     * Limited liability partnership (LLP)
     * 
     */
    LLPP,

    /**
     * Private company limited by guarantee (Ltd.)
     * 
     */
    PCLG,

    /**
     * Limited partnership (LP)
     * 
     */
    LIMP,

    /**
     * Private company limited by shares (Ltd.)
     * 
     */
    PCLS,

    /**
     * Public limited company (Plc.)
     * 
     */
    PCLC,

    /**
     * Sole proprietorship/Sole trader
     * 
     */
    SOLE,

    /**
     * Unlimited company
     * 
     */
    UNLC,

    /**
     * Unlimited trust
     * 
     */
    UNLT;

    public String value() {
        return name();
    }

    public static OrganisationLegalStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
