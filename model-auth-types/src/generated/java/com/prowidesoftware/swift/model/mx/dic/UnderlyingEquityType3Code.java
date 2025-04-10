
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingEquityType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnderlyingEquityType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BSKT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
