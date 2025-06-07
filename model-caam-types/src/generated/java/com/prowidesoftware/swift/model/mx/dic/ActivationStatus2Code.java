
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivationStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivationStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WACT"/&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActivationStatus2Code")
@XmlEnum
public enum ActivationStatus2Code {


    /**
     * The configuration download was successful and is now awaiting a future activation date.
     * 
     */
    WACT,

    /**
     * The configuration update has failed.
     * 
     */
    FAIL;

    public String value() {
        return name();
    }

    public static ActivationStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
