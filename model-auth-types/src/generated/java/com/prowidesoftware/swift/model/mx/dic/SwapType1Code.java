
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwapType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SwapType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OSSC"/&gt;
 *     &lt;enumeration value="XFSC"/&gt;
 *     &lt;enumeration value="XFMC"/&gt;
 *     &lt;enumeration value="XXSC"/&gt;
 *     &lt;enumeration value="XXMC"/&gt;
 *     &lt;enumeration value="IFMC"/&gt;
 *     &lt;enumeration value="FFSC"/&gt;
 *     &lt;enumeration value="FFMC"/&gt;
 *     &lt;enumeration value="IFSC"/&gt;
 *     &lt;enumeration value="OSMC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
