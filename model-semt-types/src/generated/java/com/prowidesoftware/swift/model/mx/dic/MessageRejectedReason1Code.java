
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageRejectedReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageRejectedReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REFE"/&gt;
 *     &lt;enumeration value="NALO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageRejectedReason1Code")
@XmlEnum
public enum MessageRejectedReason1Code {


    /**
     * Request contains an invalid or unrecognised business reference.
     * 
     */
    REFE,

    /**
     * Instructing party is not allowed to ask for a status for that specific order.
     * 
     */
    NALO;

    public String value() {
        return name();
    }

    public static MessageRejectedReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
