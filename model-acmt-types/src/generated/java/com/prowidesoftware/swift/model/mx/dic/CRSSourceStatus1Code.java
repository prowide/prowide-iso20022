
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CRSSourceStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CRSSourceStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CALC"/&gt;
 *     &lt;enumeration value="DECL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CRSSourceStatus1Code")
@XmlEnum
public enum CRSSourceStatus1Code {


    /**
     * Source of the Common Reporting Standard (CRS) status is calculated.
     * 
     */
    CALC,

    /**
     * Source of the Common Reporting Standard (CRS) status is as declared by the investor.
     * 
     */
    DECL;

    public String value() {
        return name();
    }

    public static CRSSourceStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
