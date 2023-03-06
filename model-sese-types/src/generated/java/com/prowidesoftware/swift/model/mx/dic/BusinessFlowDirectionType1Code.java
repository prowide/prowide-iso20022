
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessFlowDirectionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessFlowDirectionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADLV"/&gt;
 *     &lt;enumeration value="ARCV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
