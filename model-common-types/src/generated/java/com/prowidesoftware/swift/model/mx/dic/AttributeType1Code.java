
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AttributeType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CNAT"/>
 *     <enumeration value="LATT"/>
 *     <enumeration value="OATT"/>
 *     <enumeration value="OUAT"/>
 *     <enumeration value="CATT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AttributeType1Code")
@XmlEnum
public enum AttributeType1Code {


    /**
     * Common name of the attribute (ASN.1 Object Identifier: id-at-commonName).
     * 
     */
    CNAT,

    /**
     * Locality of the attribute (ASN.1 Object Identifier: id-at-localityName).
     * 
     */
    LATT,

    /**
     * Organization name of the attribute (ASN.1 Object Identifier: id-at-organizationName).
     * 
     */
    OATT,

    /**
     * Organization unit name of the attribute (ASN.1 Object Identifier: id-at-organizationalUnitName).
     * 
     */
    OUAT,

    /**
     * Country name of the attribute (ASN.1 Object Identifier: id-at-countryName).
     * 
     */
    CATT;

    public String value() {
        return name();
    }

    public static AttributeType1Code fromValue(String v) {
        return valueOf(v);
    }

}
