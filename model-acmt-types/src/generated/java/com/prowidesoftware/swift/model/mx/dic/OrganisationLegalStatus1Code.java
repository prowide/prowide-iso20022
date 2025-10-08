
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganisationLegalStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganisationLegalStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CIOC"/&gt;
 *     &lt;enumeration value="CHAR"/&gt;
 *     &lt;enumeration value="CICC"/&gt;
 *     &lt;enumeration value="GENP"/&gt;
 *     &lt;enumeration value="IAPS"/&gt;
 *     &lt;enumeration value="LLPP"/&gt;
 *     &lt;enumeration value="PCLG"/&gt;
 *     &lt;enumeration value="LIMP"/&gt;
 *     &lt;enumeration value="PCLS"/&gt;
 *     &lt;enumeration value="PCLC"/&gt;
 *     &lt;enumeration value="SOLE"/&gt;
 *     &lt;enumeration value="UNLC"/&gt;
 *     &lt;enumeration value="UNLT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
