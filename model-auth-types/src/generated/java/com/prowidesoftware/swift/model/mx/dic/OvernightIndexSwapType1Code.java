
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvernightIndexSwapType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OvernightIndexSwapType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PAID"/&gt;
 *     &lt;enumeration value="RECE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
