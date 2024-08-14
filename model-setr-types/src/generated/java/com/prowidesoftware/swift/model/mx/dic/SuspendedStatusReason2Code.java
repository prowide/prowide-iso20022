
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuspendedStatusReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SuspendedStatusReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRIC"/>
 *     <enumeration value="FLOW"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SuspendedStatusReason2Code")
@XmlEnum
public enum SuspendedStatusReason2Code {


    /**
     * There is a suspension of pricing. The order will stay on the books until the next pricing.
     * 
     */
    PRIC,

    /**
     * There is a fund overflow.
     * 
     */
    FLOW,

    /**
     * Another reason for the status suspended.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static SuspendedStatusReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
