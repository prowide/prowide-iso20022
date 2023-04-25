
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction27Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageFunction27Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NOTI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageFunction27Code")
@XmlEnum
public enum MessageFunction27Code {


    /**
     * Information about the transaction.
     * 
     */
    NOTI;

    public String value() {
        return name();
    }

    public static MessageFunction27Code fromValue(String v) {
        return valueOf(v);
    }

}
