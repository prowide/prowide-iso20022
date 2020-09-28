
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemoryUnit1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MemoryUnit1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BYTE"/&gt;
 *     &lt;enumeration value="EXAB"/&gt;
 *     &lt;enumeration value="GIGA"/&gt;
 *     &lt;enumeration value="KILO"/&gt;
 *     &lt;enumeration value="MEGA"/&gt;
 *     &lt;enumeration value="PETA"/&gt;
 *     &lt;enumeration value="TERA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
