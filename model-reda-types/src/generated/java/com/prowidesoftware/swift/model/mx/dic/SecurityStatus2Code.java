
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTV"/&gt;
 *     &lt;enumeration value="INAC"/&gt;
 *     &lt;enumeration value="SUSP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecurityStatus2Code")
@XmlEnum
public enum SecurityStatus2Code {


    /**
     * The status is active.
     * 
     */
    ACTV,

    /**
     * The status is inactive.
     * 
     */
    INAC,

    /**
     * The status is suspended.
     * 
     */
    SUSP;

    public String value() {
        return name();
    }

    public static SecurityStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
