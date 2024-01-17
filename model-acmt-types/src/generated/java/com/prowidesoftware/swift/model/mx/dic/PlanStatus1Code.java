
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PlanStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTV"/>
 *     <enumeration value="CLOS"/>
 *     <enumeration value="SUSP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PlanStatus1Code")
@XmlEnum
public enum PlanStatus1Code {


    /**
     * Plan is active.
     * 
     */
    ACTV,

    /**
     * Plan is closed.
     * 
     */
    CLOS,

    /**
     * Plan is suspended.
     * 
     */
    SUSP;

    public String value() {
        return name();
    }

    public static PlanStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
