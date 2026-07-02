
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntendedOrActual2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntendedOrActual2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ANTE"/&gt;
 *     &lt;enumeration value="POST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntendedOrActual2Code")
@XmlEnum
public enum IntendedOrActual2Code {


    /**
     * Ex ante (intended).
     * 
     */
    ANTE,

    /**
     * Ex post (actual).
     * 
     */
    POST;

    public String value() {
        return name();
    }

    public static IntendedOrActual2Code fromValue(String v) {
        return valueOf(v);
    }

}
