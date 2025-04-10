
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Operator1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Operator1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SMAL"/>
 *     <enumeration value="SMEQ"/>
 *     <enumeration value="GREA"/>
 *     <enumeration value="GREQ"/>
 *     <enumeration value="EQAL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Operator1Code")
@XmlEnum
public enum Operator1Code {


    /**
     * Smaller than.
     * 
     */
    SMAL,

    /**
     * Smaller or equal to.
     * 
     */
    SMEQ,

    /**
     * Greater than.
     * 
     */
    GREA,

    /**
     * Greater or equal to.
     * 
     */
    GREQ,

    /**
     * Equal to.
     * 
     */
    EQAL;

    public String value() {
        return name();
    }

    public static Operator1Code fromValue(String v) {
        return valueOf(v);
    }

}
