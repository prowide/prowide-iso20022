
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualityIndication1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="QualityIndication1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LOWE"/>
 *     <enumeration value="MEDI"/>
 *     <enumeration value="HIGH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
