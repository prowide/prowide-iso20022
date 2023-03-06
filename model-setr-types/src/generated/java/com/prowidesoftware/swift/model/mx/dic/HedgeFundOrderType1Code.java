
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HedgeFundOrderType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HedgeFundOrderType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NUNI"/&gt;
 *     &lt;enumeration value="SPCM"/&gt;
 *     &lt;enumeration value="BEDB"/&gt;
 *     &lt;enumeration value="SPOR"/&gt;
 *     &lt;enumeration value="UNIT"/&gt;
 *     &lt;enumeration value="TOPU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HedgeFundOrderType1Code")
@XmlEnum
public enum HedgeFundOrderType1Code {


    /**
     * Investment fund order is for a limited partnership instrument.
     * 
     */
    NUNI,

    /**
     * Investment fund order contains a side pocket component.
     * 
     */
    SPCM,

    /**
     * Investment fund order is part of a bed and breakfast transaction.
     * 
     */
    BEDB,

    /**
     * Investment fund order is a side pocket order.
     * 
     */
    SPOR,

    /**
     * Investment fund order is for a unitized instrument.
     * 
     */
    UNIT,

    /**
     * Investment fund order specifies a top up.
     * 
     */
    TOPU;

    public String value() {
        return name();
    }

    public static HedgeFundOrderType1Code fromValue(String v) {
        return valueOf(v);
    }

}
