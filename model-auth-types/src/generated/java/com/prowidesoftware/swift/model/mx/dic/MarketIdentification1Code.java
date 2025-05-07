
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketIdentification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketIdentification1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SGMT"/&gt;
 *     &lt;enumeration value="OPRT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarketIdentification1Code")
@XmlEnum
public enum MarketIdentification1Code {


    /**
     * Market segment code.
     * 
     */
    SGMT,

    /**
     * Market operating code.
     * 
     */
    OPRT;

    public String value() {
        return name();
    }

    public static MarketIdentification1Code fromValue(String v) {
        return valueOf(v);
    }

}
