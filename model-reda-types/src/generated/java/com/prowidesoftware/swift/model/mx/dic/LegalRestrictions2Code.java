
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalRestrictions2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LegalRestrictions2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="JURO"/&gt;
 *     &lt;enumeration value="PPLA"/&gt;
 *     &lt;enumeration value="ACRI"/&gt;
 *     &lt;enumeration value="MARG"/&gt;
 *     &lt;enumeration value="PRIV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
