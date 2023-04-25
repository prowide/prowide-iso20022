
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TR34Command1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TR34Command1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BIND"/>
 *     <enumeration value="HILR"/>
 *     <enumeration value="HILU"/>
 *     <enumeration value="RBND"/>
 *     <enumeration value="UBND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TR34Command1Code")
@XmlEnum
public enum TR34Command1Code {


    /**
     * TR34 bind operation.
     * 
     */
    BIND,

    /**
     * TR34 Higher Level rebind operation.
     * 
     */
    HILR,

    /**
     * TR34 Higher Level unbind operation.
     * 
     */
    HILU,

    /**
     * TR34 rebind operation.
     * 
     */
    RBND,

    /**
     * TR34 unbind operation.
     * 
     */
    UBND;

    public String value() {
        return name();
    }

    public static TR34Command1Code fromValue(String v) {
        return valueOf(v);
    }

}
