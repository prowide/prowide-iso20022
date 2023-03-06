
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfDiscretionPrice1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfDiscretionPrice1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DISP"/&gt;
 *     &lt;enumeration value="MRKT"/&gt;
 *     &lt;enumeration value="PRIM"/&gt;
 *     &lt;enumeration value="LPRI"/&gt;
 *     &lt;enumeration value="MIDP"/&gt;
 *     &lt;enumeration value="VWAP"/&gt;
 *     &lt;enumeration value="AVPG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
