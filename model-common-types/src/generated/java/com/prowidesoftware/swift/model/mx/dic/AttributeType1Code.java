
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttributeType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CNAT"/&gt;
 *     &lt;enumeration value="LATT"/&gt;
 *     &lt;enumeration value="OATT"/&gt;
 *     &lt;enumeration value="OUAT"/&gt;
 *     &lt;enumeration value="CATT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
