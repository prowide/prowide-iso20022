
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction44Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageFunction44Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADVC"/>
 *     <enumeration value="NOTI"/>
 *     <enumeration value="INST"/>
 *     <enumeration value="REQU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageFunction44Code")
@XmlEnum
public enum MessageFunction44Code {


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
     * Informs of an action to be taken.
     * 
     */
    INST,

    /**
     * Message function is a request.
     * 
     */
    REQU;

    public String value() {
        return name();
    }

    public static MessageFunction44Code fromValue(String v) {
        return valueOf(v);
    }

}
