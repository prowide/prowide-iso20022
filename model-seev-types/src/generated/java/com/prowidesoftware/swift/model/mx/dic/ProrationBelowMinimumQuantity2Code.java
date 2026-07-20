
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProrationBelowMinimumQuantity2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProrationBelowMinimumQuantity2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FULL"/>
 *     <enumeration value="MIEX"/>
 *     <enumeration value="REJT"/>
 *     <enumeration value="MILD"/>
 *     <enumeration value="MILU"/>
 *     <enumeration value="UKWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProrationBelowMinimumQuantity2Code")
@XmlEnum
public enum ProrationBelowMinimumQuantity2Code {


    /**
     * Instructions will be accepted in full (with their original quantity of securities instructed).
     * 
     */
    FULL,

    /**
     * Instructions will be accepted but prorated to the minimum quantity to instruct.
     * 
     */
    MIEX,

    /**
     * Instructions will be rejected.
     * 
     */
    REJT,

    /**
     * Instructions will be accepted but rounded down to the specified minimum multiple quantity to instruct.
     * 
     */
    MILD,

    /**
     * Instructions will be accepted but rounded up to the specified minimum multiple quantity to instruct.
     * 
     */
    MILU,

    /**
     * Processing of instructions prorated below the minimum quantity to instruct is unknown.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static ProrationBelowMinimumQuantity2Code fromValue(String v) {
        return valueOf(v);
    }

}
