
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction45Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageFunction45Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADVC"/&gt;
 *     &lt;enumeration value="INST"/&gt;
 *     &lt;enumeration value="NOTI"/&gt;
 *     &lt;enumeration value="REQU"/&gt;
 *     &lt;enumeration value="STAD"/&gt;
 *     &lt;enumeration value="STNO"/&gt;
 *     &lt;enumeration value="STRQ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageFunction45Code")
@XmlEnum
public enum MessageFunction45Code {


    /**
     * Advice indicates where the sender informs the receiver of an activity that has been taken that requires a response. 
     * 
     */
    ADVC,

    /**
     * Informs of an action to be taken.
     * 
     */
    INST,

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
     * Advice about the status of a transaction.
     * 
     */
    STAD,

    /**
     * Notification about the status of a transaction.
     * 
     */
    STNO,

    /**
     * Message function is a status request.
     * 
     */
    STRQ;

    public String value() {
        return name();
    }

    public static MessageFunction45Code fromValue(String v) {
        return valueOf(v);
    }

}
