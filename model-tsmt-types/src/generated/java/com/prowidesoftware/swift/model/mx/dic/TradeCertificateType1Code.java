
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeCertificateType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeCertificateType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ANLY"/>
 *     <enumeration value="QUAL"/>
 *     <enumeration value="QUAN"/>
 *     <enumeration value="WEIG"/>
 *     <enumeration value="ORIG"/>
 *     <enumeration value="HEAL"/>
 *     <enumeration value="PHYT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradeCertificateType1Code")
@XmlEnum
public enum TradeCertificateType1Code {


    /**
     * Certificate of analysis.
     * 
     */
    ANLY,

    /**
     * Certificate of quality.
     * 
     */
    QUAL,

    /**
     * Certificate of quantity.
     * 
     */
    QUAN,

    /**
     * Certificate of weight.
     * 
     */
    WEIG,

    /**
     * Certificate of origin.
     * 
     */
    ORIG,

    /**
     * Certificate of health.
     * 
     */
    HEAL,

    /**
     * Phytosanitary certificate.
     * 
     */
    PHYT;

    public String value() {
        return name();
    }

    public static TradeCertificateType1Code fromValue(String v) {
        return valueOf(v);
    }

}
