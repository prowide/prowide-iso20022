
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CallType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LOTT"/>
 *     <enumeration value="PRTA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CallType1Code")
@XmlEnum
public enum CallType1Code {


    /**
     * Type of execution of the call feature is a lottery.
     * 
     */
    LOTT,

    /**
     * Type of execution of the call feature is pro-rata.
     * 
     */
    PRTA;

    public String value() {
        return name();
    }

    public static CallType1Code fromValue(String v) {
        return valueOf(v);
    }

}
