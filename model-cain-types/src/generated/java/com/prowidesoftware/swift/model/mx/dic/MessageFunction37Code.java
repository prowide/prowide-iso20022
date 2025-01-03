
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction37Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageFunction37Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADVC"/>
 *     <enumeration value="NOTI"/>
 *     <enumeration value="REQU"/>
 *     <enumeration value="STNO"/>
 *     <enumeration value="STRQ"/>
 *     <enumeration value="STAD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageFunction37Code")
@XmlEnum
public enum MessageFunction37Code {


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
     * Notification about the status of a transaction.
     * 
     */
    STNO,

    /**
     * Message function is a status request.
     * 
     */
    STRQ,

    /**
     * Advice about the status of a transaction.
     * 
     */
    STAD;

    public String value() {
        return name();
    }

    public static MessageFunction37Code fromValue(String v) {
        return valueOf(v);
    }

}
