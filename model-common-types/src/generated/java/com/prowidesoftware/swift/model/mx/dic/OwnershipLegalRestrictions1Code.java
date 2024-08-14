
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnershipLegalRestrictions1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OwnershipLegalRestrictions1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="A144"/>
 *     <enumeration value="NRST"/>
 *     <enumeration value="RSTR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OwnershipLegalRestrictions1Code")
@XmlEnum
public enum OwnershipLegalRestrictions1Code {


    /**
     * Ownership or transfer of an unregistered security issued, pursuant to US legal restrictions 144A.
     * 
     */
    @XmlEnumValue("A144")
    A_144("A144"),

    /**
     * Ownership or transfer of a security that is not subject to restrictions.
     * 
     */
    NRST("NRST"),

    /**
     * Ownership or transfer of a security that is subject to restrictions, and not pursuant to 144A.
     * 
     */
    RSTR("RSTR");
    private final String value;

    OwnershipLegalRestrictions1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OwnershipLegalRestrictions1Code fromValue(String v) {
        for (OwnershipLegalRestrictions1Code c: OwnershipLegalRestrictions1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
