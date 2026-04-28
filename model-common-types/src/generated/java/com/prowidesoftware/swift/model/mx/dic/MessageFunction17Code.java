
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction17Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageFunction17Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOTI"/&gt;
 *     &lt;enumeration value="REQU"/&gt;
 *     &lt;enumeration value="ADVC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageFunction17Code")
@XmlEnum
public enum MessageFunction17Code {


    /**
     * Information about the transaction.
     * 
     */
    NOTI,

    /**
     * Message function is a request.
     * 
     */
    REQU,

    /**
     * Advice indicates where the sender informs the receiver of an activity that has been taken that requires a response. 
     * 
     */
    ADVC;

    public String value() {
        return name();
    }

    public static MessageFunction17Code fromValue(String v) {
        return valueOf(v);
    }

}
