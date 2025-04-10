
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepurchaseType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RepurchaseType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CADJ"/>
 *     <enumeration value="TOPU"/>
 *     <enumeration value="WTHD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RepurchaseType6Code")
@XmlEnum
public enum RepurchaseType6Code {


    /**
     * Relates to a Swap/Substitution.
     * 
     */
    CADJ,

    /**
     * Relates to a repo rollover of a position extending the closing or maturity date.
     * 
     */
    TOPU,

    /**
     * Relates to a repo rollover of a position extending the closing or maturity date.
     * 
     */
    WTHD;

    public String value() {
        return name();
    }

    public static RepurchaseType6Code fromValue(String v) {
        return valueOf(v);
    }

}
