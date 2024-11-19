
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageFunction2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REQU"/>
 *     <enumeration value="RESP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
