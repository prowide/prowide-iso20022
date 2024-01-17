
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ISAType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ISAType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MINE"/>
 *     <enumeration value="MAXI"/>
 *     <enumeration value="MINC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ISAType1Code")
@XmlEnum
public enum ISAType1Code {


    /**
     * Type of ISA that offers a stocks and shares component only (no cash).
     * 
     */
    MINE,

    /**
     * Type of ISA that must offer a stocks and shares component and, optionally, a cash component.
     * 
     */
    MAXI,

    /**
     * Type of ISA that offers a cash component only (no stock).
     * 
     */
    MINC;

    public String value() {
        return name();
    }

    public static ISAType1Code fromValue(String v) {
        return valueOf(v);
    }

}
