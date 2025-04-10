
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrequencyRateFixing1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FrequencyRateFixing1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NONE"/>
 *     <enumeration value="OVNG"/>
 *     <enumeration value="PRDC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FrequencyRateFixing1Code")
@XmlEnum
public enum FrequencyRateFixing1Code {


    /**
     * No update of  the rate for the duration of the trade.
     * 
     */
    NONE,

    /**
     * Daily fixing according to the tenor of the index.
     * 
     */
    OVNG,

    /**
     * Periodic fixing of the rate in line with   (according to) the Tenor of the rate.
     * 
     */
    PRDC;

    public String value() {
        return name();
    }

    public static FrequencyRateFixing1Code fromValue(String v) {
        return valueOf(v);
    }

}
