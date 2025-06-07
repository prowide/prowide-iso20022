
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderDriverCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderDriverCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUYI"/&gt;
 *     &lt;enumeration value="SELL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderDriverCode")
@XmlEnum
public enum OrderDriverCode {


    /**
     * Order is buy driven.
     * 
     */
    BUYI,

    /**
     * Order is sell driven.
     * 
     */
    SELL;

    public String value() {
        return name();
    }

    public static OrderDriverCode fromValue(String v) {
        return valueOf(v);
    }

}
