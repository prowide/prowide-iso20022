
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelledStatusReason14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancelledStatusReason14Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NARR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancelledStatusReason14Code")
@XmlEnum
public enum CancelledStatusReason14Code {


    /**
     * See narrative field for reason.
     * 
     */
    NARR;

    public String value() {
        return name();
    }

    public static CancelledStatusReason14Code fromValue(String v) {
        return valueOf(v);
    }

}
