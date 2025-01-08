
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfDiscretionPrice1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfDiscretionPrice1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DISP"/>
 *     <enumeration value="MRKT"/>
 *     <enumeration value="PRIM"/>
 *     <enumeration value="LPRI"/>
 *     <enumeration value="MIDP"/>
 *     <enumeration value="VWAP"/>
 *     <enumeration value="AVPG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfDiscretionPrice1Code")
@XmlEnum
public enum TypeOfDiscretionPrice1Code {


    /**
     * Indicates that the offset value is related to displayed price.
     * 
     */
    DISP,

    /**
     * Indicates that the offset value is related to market price.
     * 
     */
    MRKT,

    /**
     * Indicates that the offset value is related to primary price.
     * 
     */
    PRIM,

    /**
     * Indicates that the offset value is related to local primary price.
     * 
     */
    LPRI,

    /**
     * Indicates that the offset value is related to midpoint price.
     * 
     */
    MIDP,

    /**
     * Indicates that the offset value is related to VWAP price.
     * 
     */
    VWAP,

    /**
     * Indicates that the offset value is related to average price guarantee.
     * 
     */
    AVPG;

    public String value() {
        return name();
    }

    public static TypeOfDiscretionPrice1Code fromValue(String v) {
        return valueOf(v);
    }

}
