
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CSMR"/&gt;
 *     &lt;enumeration value="CPNY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerType2Code")
@XmlEnum
public enum CustomerType2Code {


    /**
     * Consumer
     * 
     */
    CSMR,

    /**
     * Company
     * 
     */
    CPNY;

    public String value() {
        return name();
    }

    public static CustomerType2Code fromValue(String v) {
        return valueOf(v);
    }

}
