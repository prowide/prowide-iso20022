
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction20Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageFunction20Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADVC"/>
 *     <enumeration value="NOTI"/>
 *     <enumeration value="REQU"/>
 *     <enumeration value="RVRA"/>
 *     <enumeration value="RVNO"/>
 *     <enumeration value="STAD"/>
 *     <enumeration value="STNO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
