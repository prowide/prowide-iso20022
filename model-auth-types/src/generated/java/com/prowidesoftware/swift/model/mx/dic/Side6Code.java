
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Side6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Side6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUYI"/&gt;
 *     &lt;enumeration value="SELL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Side6Code")
@XmlEnum
public enum Side6Code {


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

    public static Side6Code fromValue(String v) {
        return valueOf(v);
    }

}
