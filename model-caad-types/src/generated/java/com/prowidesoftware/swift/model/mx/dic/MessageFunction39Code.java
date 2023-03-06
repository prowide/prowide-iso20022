
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction39Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageFunction39Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RENO"/&gt;
 *     &lt;enumeration value="ERNO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageFunction39Code")
@XmlEnum
public enum MessageFunction39Code {


    /**
     * Notification of a rejected message.
     * 
     */
    RENO,

    /**
     * Notification of a message containing errors.
     * 
     */
    ERNO;

    public String value() {
        return name();
    }

    public static MessageFunction39Code fromValue(String v) {
        return valueOf(v);
    }

}
