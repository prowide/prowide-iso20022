
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualityIndication1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QualityIndication1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LOWE"/&gt;
 *     &lt;enumeration value="MEDI"/&gt;
 *     &lt;enumeration value="HIGH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QualityIndication1Code")
@XmlEnum
public enum QualityIndication1Code {


    /**
     * Low quality.
     * 
     */
    LOWE,

    /**
     * Medium quality.
     * 
     */
    MEDI,

    /**
     * High quality.
     * 
     */
    HIGH;

    public String value() {
        return name();
    }

    public static QualityIndication1Code fromValue(String v) {
        return valueOf(v);
    }

}
