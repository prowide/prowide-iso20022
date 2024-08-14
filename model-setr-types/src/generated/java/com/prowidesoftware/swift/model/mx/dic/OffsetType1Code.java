
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OffsetType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OffsetType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRIC"/>
 *     <enumeration value="BAPO"/>
 *     <enumeration value="TICK"/>
 *     <enumeration value="PTLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OffsetType1Code")
@XmlEnum
public enum OffsetType1Code {


    /**
     * Indicates that range of peg order or discretion offset value is a price.
     * 
     */
    PRIC,

    /**
     * The range of peg order or discretion offset value is measured in basis points.
     * 
     */
    BAPO,

    /**
     * The range of peg order or discretion offset value is a tick.
     * 
     */
    TICK,

    /**
     * The range of peg order or discretion offset is a price level.
     * 
     */
    PTLE;

    public String value() {
        return name();
    }

    public static OffsetType1Code fromValue(String v) {
        return valueOf(v);
    }

}
