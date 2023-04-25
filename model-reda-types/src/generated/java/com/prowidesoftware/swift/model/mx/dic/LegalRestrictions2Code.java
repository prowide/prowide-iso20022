
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalRestrictions2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LegalRestrictions2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="JURO"/>
 *     <enumeration value="PPLA"/>
 *     <enumeration value="ACRI"/>
 *     <enumeration value="MARG"/>
 *     <enumeration value="PRIV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LegalRestrictions2Code")
@XmlEnum
public enum LegalRestrictions2Code {


    /**
     * Investors outside this jurisdiction can purchase this security, for example, a Reg S security can only be held by an investor outside the US.
     * 
     */
    JURO,

    /**
     * Only investors qualified by the issuer in this jurisdiction may purchase this security.
     * 
     */
    PPLA,

    /**
     * Only investors qualified by the regulator in this jurisdiction may purchase this security.
     * 
     */
    ACRI,

    /**
     * Issuer defines whether the security may be purchased with borrowed money (US and Japan).
     * 
     */
    MARG,

    /**
     * Privileges, for example, voting rights, of holding the security may be restricted by the issuer.
     * 
     */
    PRIV;

    public String value() {
        return name();
    }

    public static LegalRestrictions2Code fromValue(String v) {
        return valueOf(v);
    }

}
