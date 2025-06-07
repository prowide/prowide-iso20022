
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnyMIC1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnyMIC1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ANYM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AnyMIC1Code")
@XmlEnum
public enum AnyMIC1Code {


    /**
     * Any MIC code.
     * 
     */
    ANYM;

    public String value() {
        return name();
    }

    public static AnyMIC1Code fromValue(String v) {
        return valueOf(v);
    }

}
