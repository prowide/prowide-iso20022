
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelledStatusReason5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancelledStatusReason5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CANI"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancelledStatusReason5Code")
@XmlEnum
public enum CancelledStatusReason5Code {


    /**
     * Transaction is cancelled by yourself.
     * 
     */
    CANI,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static CancelledStatusReason5Code fromValue(String v) {
        return valueOf(v);
    }

}
