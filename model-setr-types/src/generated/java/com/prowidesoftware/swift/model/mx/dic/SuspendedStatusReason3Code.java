
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuspendedStatusReason3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SuspendedStatusReason3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRIC"/>
 *     <enumeration value="FLOW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SuspendedStatusReason3Code")
@XmlEnum
public enum SuspendedStatusReason3Code {


    /**
     * There is a suspension of pricing. The order will stay on the books until the next pricing.
     * 
     */
    PRIC,

    /**
     * There is a fund overflow.
     * 
     */
    FLOW;

    public String value() {
        return name();
    }

    public static SuspendedStatusReason3Code fromValue(String v) {
        return valueOf(v);
    }

}
