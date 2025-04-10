
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseLevel1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ResponseLevel1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NACK"/>
 *     <enumeration value="ACNE"/>
 *     <enumeration value="ACEA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ResponseLevel1Code")
@XmlEnum
public enum ResponseLevel1Code {


    /**
     * No acknowledgement is requested.
     * 
     */
    NACK,

    /**
     * Acknowledgement of only negative or erroneous messages is requested.
     * 
     */
    ACNE,

    /**
     * Acknowledgement of each message is requested.
     * 
     */
    ACEA;

    public String value() {
        return name();
    }

    public static ResponseLevel1Code fromValue(String v) {
        return valueOf(v);
    }

}
