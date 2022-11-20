
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrequencyRateFixing1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FrequencyRateFixing1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="OVNG"/&gt;
 *     &lt;enumeration value="PRDC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
