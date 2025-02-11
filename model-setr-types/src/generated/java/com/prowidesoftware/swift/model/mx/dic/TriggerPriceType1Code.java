
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggerPriceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TriggerPriceType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BEOF"/>
 *     <enumeration value="LATR"/>
 *     <enumeration value="BEBI"/>
 *     <enumeration value="BBLT"/>
 *     <enumeration value="BOLT"/>
 *     <enumeration value="BEMI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
