
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionNumber1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptionNumber1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNSO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OptionNumber1Code")
@XmlEnum
public enum OptionNumber1Code {


    /**
     * The corporate action instruction is unsolicited, that is, the instruction has not been preceded by a corporate action notification.
     * 
     */
    UNSO;

    public String value() {
        return name();
    }

    public static OptionNumber1Code fromValue(String v) {
        return valueOf(v);
    }

}
