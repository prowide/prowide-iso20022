
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConductClassification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConductClassification1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NSTA"/&gt;
 *     &lt;enumeration value="RCLT"/&gt;
 *     &lt;enumeration value="STAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConductClassification1Code")
@XmlEnum
public enum ConductClassification1Code {


    /**
     * Non standard or unusual.
     * 
     */
    NSTA,

    /**
     * Reluctant.
     * 
     */
    RCLT,

    /**
     * Standard.
     * 
     */
    STAN;

    public String value() {
        return name();
    }

    public static ConductClassification1Code fromValue(String v) {
        return valueOf(v);
    }

}
