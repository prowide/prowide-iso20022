
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProrationBelowMinimumQuantity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProrationBelowMinimumQuantity1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FULL"/>
 *     <enumeration value="MIEX"/>
 *     <enumeration value="MILT"/>
 *     <enumeration value="REJT"/>
 *     <enumeration value="UKWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProrationBelowMinimumQuantity1Code")
@XmlEnum
public enum ProrationBelowMinimumQuantity1Code {


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
     * Instructions will be accepted but rounded up or down to the specified minimum multiple quantity to instruct according to the value of the disposition of fraction indicator.
     * 
     */
    MILT,

    /**
     * Instructions will be rejected.
     * 
     */
    REJT,

    /**
     * Processing of instructions prorated below the minimum quantity to instruct is unknown.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static ProrationBelowMinimumQuantity1Code fromValue(String v) {
        return valueOf(v);
    }

}
