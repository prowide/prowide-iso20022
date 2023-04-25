
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemoryUnit1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MemoryUnit1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BYTE"/>
 *     <enumeration value="EXAB"/>
 *     <enumeration value="GIGA"/>
 *     <enumeration value="KILO"/>
 *     <enumeration value="MEGA"/>
 *     <enumeration value="PETA"/>
 *     <enumeration value="TERA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MemoryUnit1Code")
@XmlEnum
public enum MemoryUnit1Code {


    /**
     * Byte.
     * 
     */
    BYTE,

    /**
     * Exa byte.
     * 
     */
    EXAB,

    /**
     * Giga byte.
     * 
     */
    GIGA,

    /**
     * Kilo byte.
     * 
     */
    KILO,

    /**
     * Mega byte.
     * 
     */
    MEGA,

    /**
     * Peta byte.
     * 
     */
    PETA,

    /**
     * Tera byte.
     * 
     */
    TERA;

    public String value() {
        return name();
    }

    public static MemoryUnit1Code fromValue(String v) {
        return valueOf(v);
    }

}
