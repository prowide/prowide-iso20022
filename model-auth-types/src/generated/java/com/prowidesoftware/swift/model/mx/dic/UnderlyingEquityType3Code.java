
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingEquityType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnderlyingEquityType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BSKT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnderlyingEquityType3Code")
@XmlEnum
public enum UnderlyingEquityType3Code {


    /**
     * Underlying is a basket.
     * 
     */
    BSKT;

    public String value() {
        return name();
    }

    public static UnderlyingEquityType3Code fromValue(String v) {
        return valueOf(v);
    }

}
