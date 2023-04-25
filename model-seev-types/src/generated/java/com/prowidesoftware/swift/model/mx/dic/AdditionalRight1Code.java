
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalRight1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdditionalRight1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WQPS"/>
 *     <enumeration value="RSPS"/>
 *     <enumeration value="AIPS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdditionalRight1Code")
@XmlEnum
public enum AdditionalRight1Code {


    /**
     * Defines a written question proposal.
     * 
     */
    WQPS,

    /**
     * Defines a resolution proposal.
     * 
     */
    RSPS,

    /**
     * Defines a resolution proposal.
     * 
     */
    AIPS;

    public String value() {
        return name();
    }

    public static AdditionalRight1Code fromValue(String v) {
        return valueOf(v);
    }

}
