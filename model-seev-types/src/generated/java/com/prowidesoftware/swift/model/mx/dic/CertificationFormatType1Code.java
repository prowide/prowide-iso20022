
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificationFormatType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CertificationFormatType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ELEC"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CertificationFormatType1Code")
@XmlEnum
public enum CertificationFormatType1Code {


    /**
     * Certification must be provided in electronic format.
     * 
     */
    ELEC,

    /**
     * Certification must be provided in physical format.
     * 
     */
    PHYS;

    public String value() {
        return name();
    }

    public static CertificationFormatType1Code fromValue(String v) {
        return valueOf(v);
    }

}
