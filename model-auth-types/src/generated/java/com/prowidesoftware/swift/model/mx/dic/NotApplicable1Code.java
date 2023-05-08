
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotApplicable1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NotApplicable1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <minLength value="0"/>
 *     <maxLength value="4"/>
 *     <enumeration value="NOAP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NotApplicable1Code")
@XmlEnum
public enum NotApplicable1Code {


    /**
     * Not applicable (N/A).
     * 
     */
    NOAP;

    public String value() {
        return name();
    }

    public static NotApplicable1Code fromValue(String v) {
        return valueOf(v);
    }

}
