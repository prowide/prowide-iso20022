
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount19Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfAmount19Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CONN"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="LNDS"/>
 *     <enumeration value="MISC"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="USGE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfAmount19Code")
@XmlEnum
public enum TypeOfAmount19Code {


    /**
     * Telephone connection-related charge
     * 
     */
    CONN,

    /**
     * Insurance charges 
     * 
     */
    INSU,

    /**
     * Charges related to a long distance call. 
     * 
     */
    LNDS,

    /**
     * Miscellaneous charges not elsewhere defined
     * 
     */
    MISC,

    /**
     * Other type of amount defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of amount defined at private level.
     * 
     */
    OTHP,

    /**
     * Telephone usage-related charge
     * 
     */
    USGE;

    public String value() {
        return name();
    }

    public static TypeOfAmount19Code fromValue(String v) {
        return valueOf(v);
    }

}
