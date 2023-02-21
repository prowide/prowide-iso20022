
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageFunction2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REQU"/&gt;
 *     &lt;enumeration value="RESP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageFunction2Code")
@XmlEnum
public enum MessageFunction2Code {


    /**
     * Message function is a request.
     * 
     */
    REQU,

    /**
     * Message function is a response.
     * 
     */
    RESP;

    public String value() {
        return name();
    }

    public static MessageFunction2Code fromValue(String v) {
        return valueOf(v);
    }

}
