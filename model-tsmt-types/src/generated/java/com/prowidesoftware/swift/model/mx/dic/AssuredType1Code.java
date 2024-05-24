
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssuredType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssuredType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BUYE"/>
 *     <enumeration value="SELL"/>
 *     <enumeration value="BUBA"/>
 *     <enumeration value="SEBA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssuredType1Code")
@XmlEnum
public enum AssuredType1Code {


    /**
     * The buyer should be the assured.
     * 
     */
    BUYE,

    /**
     * The seller should be the assured.
     * 
     */
    SELL,

    /**
     * The buyer's bank should be the assured.
     * 
     */
    BUBA,

    /**
     * The seller's bank should be the assured.
     * 
     */
    SEBA;

    public String value() {
        return name();
    }

    public static AssuredType1Code fromValue(String v) {
        return valueOf(v);
    }

}
