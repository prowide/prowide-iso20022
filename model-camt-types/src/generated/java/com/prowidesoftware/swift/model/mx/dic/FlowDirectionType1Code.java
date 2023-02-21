
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowDirectionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlowDirectionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INCG"/&gt;
 *     &lt;enumeration value="OUTG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
