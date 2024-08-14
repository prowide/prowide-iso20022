
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction29Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageFunction29Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADVC"/>
 *     <enumeration value="NOTI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageFunction29Code")
@XmlEnum
public enum MessageFunction29Code {


    /**
     * Advice indicates where the sender informs the receiver of an activity that has been taken that requires a response. 
     * 
     */
    ADVC,

    /**
     * Information about the transaction.
     * 
     */
    NOTI;

    public String value() {
        return name();
    }

    public static MessageFunction29Code fromValue(String v) {
        return valueOf(v);
    }

}
