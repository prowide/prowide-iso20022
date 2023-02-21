
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalRestrictions1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LegalRestrictions1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="USLE"/&gt;
 *     &lt;enumeration value="NORE"/&gt;
 *     &lt;enumeration value="REST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LegalRestrictions1Code")
@XmlEnum
public enum LegalRestrictions1Code {


    /**
     * Ownership or transfer of an unregistered security issued, pursuant to US legal restrictions 144A.
     * 
     */
    USLE,

    /**
     * Ownership or transfer of a security that is not subject to restrictions.
     * 
     */
    NORE,

    /**
     * Ownership or transfer of a security that is subject to restrictions, and not pursuant to 144A.
     * 
     */
    REST;

    public String value() {
        return name();
    }

    public static LegalRestrictions1Code fromValue(String v) {
        return valueOf(v);
    }

}
