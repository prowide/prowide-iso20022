
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction18Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageFunction18Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BTRQ"/>
 *     <enumeration value="BTNF"/>
 *     <enumeration value="CLNF"/>
 *     <enumeration value="CLRQ"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageFunction18Code")
@XmlEnum
public enum MessageFunction18Code {


    /**
     * Request to initiate the transfer of a batch (response expected).
     * 
     */
    BTRQ,

    /**
     * Notification to initiate the transfer of a batch (no response expected).
     * 
     */
    BTNF,

    /**
     * Notification to initiate the transfer of a collection (no response expected).
     * 
     */
    CLNF,

    /**
     * Request to initiate the transfer of a collection (response expected).
     * 
     */
    CLRQ;

    public String value() {
        return name();
    }

    public static MessageFunction18Code fromValue(String v) {
        return valueOf(v);
    }

}
