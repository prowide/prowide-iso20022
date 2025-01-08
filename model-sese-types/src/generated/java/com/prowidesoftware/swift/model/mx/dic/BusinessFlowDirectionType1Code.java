
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessFlowDirectionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BusinessFlowDirectionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADLV"/>
 *     <enumeration value="ARCV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BusinessFlowDirectionType1Code")
@XmlEnum
public enum BusinessFlowDirectionType1Code {


    /**
     * Assets to be delivered.
     * 
     */
    ADLV,

    /**
     * Assets to be received.
     * 
     */
    ARCV;

    public String value() {
        return name();
    }

    public static BusinessFlowDirectionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
