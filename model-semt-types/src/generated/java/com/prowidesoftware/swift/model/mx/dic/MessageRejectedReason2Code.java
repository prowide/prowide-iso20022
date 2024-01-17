
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageRejectedReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageRejectedReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NALO"/>
 *     <enumeration value="REFE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
