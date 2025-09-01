
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction18Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageFunction18Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BTRQ"/&gt;
 *     &lt;enumeration value="BTNF"/&gt;
 *     &lt;enumeration value="CLNF"/&gt;
 *     &lt;enumeration value="CLRQ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
