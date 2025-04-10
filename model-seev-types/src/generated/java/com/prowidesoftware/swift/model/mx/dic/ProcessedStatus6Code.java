
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessedStatus6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessedStatus6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RECE"/&gt;
 *     &lt;enumeration value="DEAC"/&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProcessedStatus6Code")
@XmlEnum
public enum ProcessedStatus6Code {


    /**
     * The instruction/request has been received.
     * 
     */
    RECE,

    /**
     * Awaiting the deactivation date.
     * 
     */
    DEAC,

    /**
     * The request has been completed.
     * 
     */
    COMP;

    public String value() {
        return name();
    }

    public static ProcessedStatus6Code fromValue(String v) {
        return valueOf(v);
    }

}
