
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction16Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageFunction16Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADVC"/>
 *     <enumeration value="NOTI"/>
 *     <enumeration value="CAAD"/>
 *     <enumeration value="CANO"/>
 *     <enumeration value="REQU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageFunction16Code")
@XmlEnum
public enum MessageFunction16Code {


    /**
     * Advice indicates where the sender informs the receiver of an activity that has been taken that requires a response. 
     * 
     */
    ADVC,

    /**
     * Information about the transaction.
     * 
     */
    NOTI,

    /**
     * Advice about the capture of an activity already performed (response expected).
     * 
     */
    CAAD,

    /**
     * Notification about the capture of an activity already performed (no response expected).
     * 
     */
    CANO,

    /**
     * Message function is a request.
     * 
     */
    REQU;

    public String value() {
        return name();
    }

    public static MessageFunction16Code fromValue(String v) {
        return valueOf(v);
    }

}
