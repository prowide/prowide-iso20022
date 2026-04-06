
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkageType1Code__1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LinkageType1Code__1">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LINK"/>
 *     <enumeration value="UNLK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LinkageType1Code__1")
@XmlEnum
public enum LinkageType1Code1 {


    /**
     * Request is to link the referenced transactions.
     * 
     */
    LINK,

    /**
     * Request is to unlink the referenced transactions.
     * 
     */
    UNLK;

    public String value() {
        return name();
    }

    public static LinkageType1Code1 fromValue(String v) {
        return valueOf(v);
    }

}
