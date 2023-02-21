
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TR34Status1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TR34Status1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUND"/&gt;
 *     &lt;enumeration value="UBND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TR34Status1Code")
@XmlEnum
public enum TR34Status1Code {


    /**
     * The device is bound.
     * 
     */
    BUND,

    /**
     * The device is unbound.
     * 
     */
    UBND;

    public String value() {
        return name();
    }

    public static TR34Status1Code fromValue(String v) {
        return valueOf(v);
    }

}
