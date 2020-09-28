
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Priority5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Priority5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HIGH"/&gt;
 *     &lt;enumeration value="LOWW"/&gt;
 *     &lt;enumeration value="NORM"/&gt;
 *     &lt;enumeration value="URGT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Priority5Code")
@XmlEnum
public enum Priority5Code {


    /**
     * Priority level is high.
     * 
     */
    HIGH,

    /**
     * Priority level is low.
     * 
     */
    LOWW,

    /**
     * Priority level is normal.
     * 
     */
    NORM,

    /**
     * Priority level is urgent (highest priority possible).
     * 
     */
    URGT;

    public String value() {
        return name();
    }

    public static Priority5Code fromValue(String v) {
        return valueOf(v);
    }

}
