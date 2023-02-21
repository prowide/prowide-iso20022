
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction20Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageFunction20Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADVC"/&gt;
 *     &lt;enumeration value="NOTI"/&gt;
 *     &lt;enumeration value="REQU"/&gt;
 *     &lt;enumeration value="RVRA"/&gt;
 *     &lt;enumeration value="RVNO"/&gt;
 *     &lt;enumeration value="STAD"/&gt;
 *     &lt;enumeration value="STNO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageFunction20Code")
@XmlEnum
public enum MessageFunction20Code {


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
     * Message function is a request.
     * 
     */
    REQU,

    /**
     * Advice for reversal without financial capture.
     * 
     */
    RVRA,

    /**
     * Notification of reversal for either an authorisation or a financial message (response not expected).
     * 
     */
    RVNO,

    /**
     * Advice about the status of a transaction.
     * 
     */
    STAD,

    /**
     * Notification about the status of a transaction.
     * 
     */
    STNO;

    public String value() {
        return name();
    }

    public static MessageFunction20Code fromValue(String v) {
        return valueOf(v);
    }

}
