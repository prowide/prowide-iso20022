
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegSwapType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LegSwapType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PFPR"/>
 *     <enumeration value="MODU"/>
 *     <enumeration value="RISK"/>
 *     <enumeration value="PRCD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LegSwapType1Code")
@XmlEnum
public enum LegSwapType1Code {


    /**
     * Type of leg involved in a swap whose purpose is to exchange principal.
     * 
     */
    PFPR,

    /**
     * Type of leg involved in a swap whose purpose is to exchange price volatility.
     * 
     */
    MODU,

    /**
     * Type of leg involved in a swap whose purpose is to increase the credit quality and reduce the default risk. Also known as quality swap.
     * 
     */
    RISK,

    /**
     * Type of leg involved in a swap structured in the sale of a financial instrument and the simultaneous purchase of another instrument with the proceeds from the sale.
     * 
     */
    PRCD;

    public String value() {
        return name();
    }

    public static LegSwapType1Code fromValue(String v) {
        return valueOf(v);
    }

}
