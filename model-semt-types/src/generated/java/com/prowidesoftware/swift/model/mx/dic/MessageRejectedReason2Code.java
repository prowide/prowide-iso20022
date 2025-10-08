
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageRejectedReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageRejectedReason2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NALO"/&gt;
 *     &lt;enumeration value="REFE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageRejectedReason2Code")
@XmlEnum
public enum MessageRejectedReason2Code {


    /**
     * Sending party is not allowed to send this request.
     * 
     */
    NALO,

    /**
     * Request contains an invalid or unrecognised business reference.
     * 
     */
    REFE;

    public String value() {
        return name();
    }

    public static MessageRejectedReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
