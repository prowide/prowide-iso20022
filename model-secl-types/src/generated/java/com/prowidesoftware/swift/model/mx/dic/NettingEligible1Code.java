
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NettingEligible1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NettingEligible1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GROS"/&gt;
 *     &lt;enumeration value="NETT"/&gt;
 *     &lt;enumeration value="AGFS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NettingEligible1Code")
@XmlEnum
public enum NettingEligible1Code {


    /**
     * Indicates that the trade is not eligible for settlement netting.
     * 
     */
    GROS,

    /**
     * Indicates that the trade is eligible for settlement netting.
     * 
     */
    NETT,

    /**
     * Grouping of receipts/purchases to create one settlement obligation, and the grouping of deliveries/sales to create one settlement obligation.
     * 
     */
    AGFS;

    public String value() {
        return name();
    }

    public static NettingEligible1Code fromValue(String v) {
        return valueOf(v);
    }

}
