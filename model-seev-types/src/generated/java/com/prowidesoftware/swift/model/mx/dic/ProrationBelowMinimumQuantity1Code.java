
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProrationBelowMinimumQuantity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProrationBelowMinimumQuantity1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FULL"/&gt;
 *     &lt;enumeration value="MIEX"/&gt;
 *     &lt;enumeration value="MILT"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
