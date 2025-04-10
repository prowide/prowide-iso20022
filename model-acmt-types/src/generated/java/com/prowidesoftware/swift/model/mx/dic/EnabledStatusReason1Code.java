
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnabledStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EnabledStatusReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MODI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EnabledStatusReason1Code")
@XmlEnum
public enum EnabledStatusReason1Code {


    /**
     * Modification to the account data is in process.
     * 
     */
    MODI;

    public String value() {
        return name();
    }

    public static EnabledStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
