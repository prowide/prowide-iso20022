
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvernightIndexSwapType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OvernightIndexSwapType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PAID"/>
 *     <enumeration value="RECE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OvernightIndexSwapType1Code")
@XmlEnum
public enum OvernightIndexSwapType1Code {


    /**
     * Fixed interest rate is paid by the reporting agent.
     * 
     */
    PAID,

    /**
     * Fixed interest rate is received by the reporting agent.
     * 
     */
    RECE;

    public String value() {
        return name();
    }

    public static OvernightIndexSwapType1Code fromValue(String v) {
        return valueOf(v);
    }

}
