
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkageType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LinkageType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LINK"/>
 *     <enumeration value="UNLK"/>
 *     <enumeration value="SOFT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LinkageType1Code")
@XmlEnum
public enum LinkageType1Code {


    /**
     * Request is to link the referenced transactions.
     * 
     */
    LINK,

    /**
     * Request is to unlink the referenced transactions.
     * 
     */
    UNLK,

    /**
     * Request is to soft link the referenced transactions.
     * 
     */
    SOFT;

    public String value() {
        return name();
    }

    public static LinkageType1Code fromValue(String v) {
        return valueOf(v);
    }

}
