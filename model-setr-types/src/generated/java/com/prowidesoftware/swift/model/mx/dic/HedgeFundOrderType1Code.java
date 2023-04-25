
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HedgeFundOrderType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="HedgeFundOrderType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NUNI"/>
 *     <enumeration value="SPCM"/>
 *     <enumeration value="BEDB"/>
 *     <enumeration value="SPOR"/>
 *     <enumeration value="UNIT"/>
 *     <enumeration value="TOPU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
