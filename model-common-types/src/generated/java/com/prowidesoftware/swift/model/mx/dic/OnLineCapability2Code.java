
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnLineCapability2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OnLineCapability2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OFLN"/&gt;
 *     &lt;enumeration value="ONLN"/&gt;
 *     &lt;enumeration value="BOTH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OnLineCapability2Code")
@XmlEnum
public enum OnLineCapability2Code {


    /**
     * Off-line only capable.
     * 
     */
    OFLN,

    /**
     * On-line only capable.
     * 
     */
    ONLN,

    /**
     * Both online and offline
     * 
     */
    BOTH;

    public String value() {
        return name();
    }

    public static OnLineCapability2Code fromValue(String v) {
        return valueOf(v);
    }

}
