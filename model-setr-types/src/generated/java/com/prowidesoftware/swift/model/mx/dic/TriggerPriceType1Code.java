
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggerPriceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TriggerPriceType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BEOF"/&gt;
 *     &lt;enumeration value="LATR"/&gt;
 *     &lt;enumeration value="BEBI"/&gt;
 *     &lt;enumeration value="BBLT"/&gt;
 *     &lt;enumeration value="BOLT"/&gt;
 *     &lt;enumeration value="BEMI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TriggerPriceType1Code")
@XmlEnum
public enum TriggerPriceType1Code {


    /**
     * Trigger is compared to best offer.
     * 
     */
    BEOF,

    /**
     * Trigger is compared to last trade.
     * 
     */
    LATR,

    /**
     * Trigger is compared to best bid.
     * 
     */
    BEBI,

    /**
     * Trigger is compared to best bid or last trade.
     * 
     */
    BBLT,

    /**
     * Trigger is compared to best offer or last trade.
     * 
     */
    BOLT,

    /**
     * Trigger is compared to best mid.
     * 
     */
    BEMI;

    public String value() {
        return name();
    }

    public static TriggerPriceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
