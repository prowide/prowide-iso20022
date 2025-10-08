
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusSubType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusSubType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *     &lt;enumeration value="SMDY"/&gt;
 *     &lt;enumeration value="SDPG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatusSubType1Code")
@XmlEnum
public enum StatusSubType1Code {


    /**
     * No flag has been set for the sub status of the trade notification.
     * 
     */
    NONE,

    /**
     * Pending flag has been set to true for the sub status of the trade notification.
     * 
     */
    PEND,

    /**
     * Same day flag has been set to true for the sub status of the trade notification.
     * 
     */
    SMDY,

    /**
     * Both the same day and pending flags have been set to true for the sub status of the trade notification.
     * 
     */
    SDPG;

    public String value() {
        return name();
    }

    public static StatusSubType1Code fromValue(String v) {
        return valueOf(v);
    }

}
