
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessFlowType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BusinessFlowType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SLDP"/>
 *     <enumeration value="SLRP"/>
 *     <enumeration value="DLPR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BusinessFlowType1Code")
@XmlEnum
public enum BusinessFlowType1Code {


    /**
     * Single leg process initiated by the delivering party.
     * 
     */
    SLDP,

    /**
     * Single leg process initiated by the receiving party.
     * 
     */
    SLRP,

    /**
     * Double leg process.
     * 
     */
    DLPR;

    public String value() {
        return name();
    }

    public static BusinessFlowType1Code fromValue(String v) {
        return valueOf(v);
    }

}
