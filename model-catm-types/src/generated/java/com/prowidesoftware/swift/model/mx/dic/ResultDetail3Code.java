
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultDetail3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultDetail3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CRTU"/&gt;
 *     &lt;enumeration value="SVSU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResultDetail3Code")
@XmlEnum
public enum ResultDetail3Code {


    /**
     * The certificate is unknown.
     * 
     */
    CRTU,

    /**
     * Requested service not supported.
     * 
     */
    SVSU;

    public String value() {
        return name();
    }

    public static ResultDetail3Code fromValue(String v) {
        return valueOf(v);
    }

}
