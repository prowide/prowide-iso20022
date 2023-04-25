
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LifeCycleSupport1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LifeCycleSupport1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AUTH"/>
 *     <enumeration value="FINC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LifeCycleSupport1Code")
@XmlEnum
public enum LifeCycleSupport1Code {


    /**
     * Assigned at authorisation time.
     * 
     */
    AUTH,

    /**
     * Assigned at financial time.
     * 
     */
    FINC;

    public String value() {
        return name();
    }

    public static LifeCycleSupport1Code fromValue(String v) {
        return valueOf(v);
    }

}
