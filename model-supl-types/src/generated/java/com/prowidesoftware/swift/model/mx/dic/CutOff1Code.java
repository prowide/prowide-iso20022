
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CutOff1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CutOff1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AERL"/&gt;
 *     &lt;enumeration value="EARL"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CutOff1Code")
@XmlEnum
public enum CutOff1Code {


    /**
     * Cut-off may change to early.
     * 
     */
    AERL,

    /**
     * Cut-off occurs before the DTCC (The Depository Trust and Clearing Corporation) standard settlement cut-off. Early cut-off usually 1: 30 Eastern Standard Time.
     * 
     */
    EARL,

    /**
     * Cut-off is after settlement at DTCC (The Depository Trust and Clearing Corporation).
     * 
     */
    LATE;

    public String value() {
        return name();
    }

    public static CutOff1Code fromValue(String v) {
        return valueOf(v);
    }

}
