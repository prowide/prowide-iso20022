
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LockStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LockStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LOCK"/>
 *     <enumeration value="ULCK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LockStatus1Code")
@XmlEnum
public enum LockStatus1Code {


    /**
     * Party has been locked for operations.
     * 
     */
    LOCK,

    /**
     * Party is ready for operations.
     * 
     */
    ULCK;

    public String value() {
        return name();
    }

    public static LockStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
