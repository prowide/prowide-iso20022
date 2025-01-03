
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwapType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SwapType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OSSC"/>
 *     <enumeration value="XFSC"/>
 *     <enumeration value="XFMC"/>
 *     <enumeration value="XXSC"/>
 *     <enumeration value="XXMC"/>
 *     <enumeration value="IFMC"/>
 *     <enumeration value="FFSC"/>
 *     <enumeration value="FFMC"/>
 *     <enumeration value="IFSC"/>
 *     <enumeration value="OSMC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SwapType1Code")
@XmlEnum
public enum SwapType1Code {


    /**
     * Overnight Index Single Currency Swap.
     * 
     */
    OSSC,

    /**
     * Fixed to Float Single Currency Swap.
     * 
     */
    XFSC,

    /**
     * Fixed to Float Multi Currency Swap.
     * 
     */
    XFMC,

    /**
     * Fixed to Fixed Single Currency Swap.
     * 
     */
    XXSC,

    /**
     * Fixed to Fixed Multi Currency Swap.
     * 
     */
    XXMC,

    /**
     * Inflation Multi Currency Swap.
     * 
     */
    IFMC,

    /**
     * Float to Float Single Currency Swap.
     * 
     */
    FFSC,

    /**
     * Float to Float Multi Currency Swap.
     * 
     */
    FFMC,

    /**
     * Inflation Single Currency Swap.
     * 
     */
    IFSC,

    /**
     * Overnight Index Multi Currency Swap.
     * 
     */
    OSMC;

    public String value() {
        return name();
    }

    public static SwapType1Code fromValue(String v) {
        return valueOf(v);
    }

}
