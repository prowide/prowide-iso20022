
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount25Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfAmount25Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CONN"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="LNDS"/>
 *     <enumeration value="MISC"/>
 *     <enumeration value="USGE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfAmount25Code")
@XmlEnum
public enum TypeOfAmount25Code {


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
     * Telephone usage-related charge
     * 
     */
    USGE;

    public String value() {
        return name();
    }

    public static TypeOfAmount25Code fromValue(String v) {
        return valueOf(v);
    }

}
