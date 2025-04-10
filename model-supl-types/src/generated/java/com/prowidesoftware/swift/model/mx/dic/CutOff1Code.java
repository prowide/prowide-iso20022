
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CutOff1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CutOff1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AERL"/>
 *     <enumeration value="EARL"/>
 *     <enumeration value="LATE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
