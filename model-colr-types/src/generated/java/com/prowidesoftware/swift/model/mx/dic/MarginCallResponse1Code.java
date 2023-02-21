
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarginCallResponse1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarginCallResponse1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NVDA"/&gt;
 *     &lt;enumeration value="RANT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarginCallResponse1Code")
@XmlEnum
public enum MarginCallResponse1Code {


    /**
     * Indicates that the margin call request was sent on a non valuation day.
     * 
     */
    NVDA,

    /**
     * Indicates that the margin call request was sent after the notification time.
     * 
     */
    RANT;

    public String value() {
        return name();
    }

    public static MarginCallResponse1Code fromValue(String v) {
        return valueOf(v);
    }

}
