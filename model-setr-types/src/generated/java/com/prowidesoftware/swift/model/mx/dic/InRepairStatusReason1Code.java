
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InRepairStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InRepairStatusReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COMA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InRepairStatusReason1Code")
@XmlEnum
public enum InRepairStatusReason1Code {


    /**
     * Order has been accepted and centralised before the cut off, but with different sales agreement than the one provided in the order.
     * 
     */
    COMA;

    public String value() {
        return name();
    }

    public static InRepairStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
