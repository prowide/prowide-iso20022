
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalRestrictions1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LegalRestrictions1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="USLE"/>
 *     <enumeration value="NORE"/>
 *     <enumeration value="REST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
