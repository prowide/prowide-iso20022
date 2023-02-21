
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResidualCash1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResidualCash1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NRCT"/&gt;
 *     &lt;enumeration value="RCTR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResidualCash1Code")
@XmlEnum
public enum ResidualCash1Code {


    /**
     * Residual Cash not to be transferred.
     * 
     */
    NRCT,

    /**
     * Residual cash to be transferred.
     * 
     */
    RCTR;

    public String value() {
        return name();
    }

    public static ResidualCash1Code fromValue(String v) {
        return valueOf(v);
    }

}
