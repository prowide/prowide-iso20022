
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeCertificateType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeCertificateType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ANLY"/&gt;
 *     &lt;enumeration value="QUAL"/&gt;
 *     &lt;enumeration value="QUAN"/&gt;
 *     &lt;enumeration value="WEIG"/&gt;
 *     &lt;enumeration value="ORIG"/&gt;
 *     &lt;enumeration value="HEAL"/&gt;
 *     &lt;enumeration value="PHYT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
