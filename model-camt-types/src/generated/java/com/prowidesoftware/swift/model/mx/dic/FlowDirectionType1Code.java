
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowDirectionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FlowDirectionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INCG"/>
 *     <enumeration value="OUTG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FlowDirectionType1Code")
@XmlEnum
public enum FlowDirectionType1Code {


    /**
     * Amount of money received.
     * 
     */
    INCG,

    /**
     * Amount of money paid out.
     * 
     */
    OUTG;

    public String value() {
        return name();
    }

    public static FlowDirectionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
