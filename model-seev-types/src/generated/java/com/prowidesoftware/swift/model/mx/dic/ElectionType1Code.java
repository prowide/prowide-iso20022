
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ElectionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NEWM"/>
 *     <enumeration value="CHAN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ElectionType1Code")
@XmlEnum
public enum ElectionType1Code {


    /**
     * New election advice.
     * 
     */
    NEWM,

    /**
     * Election advice which is the result of an option change.
     * 
     */
    CHAN;

    public String value() {
        return name();
    }

    public static ElectionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
