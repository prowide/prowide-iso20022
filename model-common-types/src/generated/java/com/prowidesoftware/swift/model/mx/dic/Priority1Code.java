
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Priority1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Priority1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HIGH"/&gt;
 *     &lt;enumeration value="NORM"/&gt;
 *     &lt;enumeration value="LOWW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Priority1Code")
@XmlEnum
public enum Priority1Code {


    /**
     * Priority level is high.
     * 
     */
    HIGH,

    /**
     * Priority level is normal.
     * 
     */
    NORM,

    /**
     * Priority level is low.
     * 
     */
    LOWW;

    public String value() {
        return name();
    }

    public static Priority1Code fromValue(String v) {
        return valueOf(v);
    }

}
