
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageFunction9Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RJCQ"/>
 *     <enumeration value="RJCP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageFunction9Code")
@XmlEnum
public enum MessageFunction9Code {


    /**
     * Reject of a request or an advice message by an acquirer or an agent.
     * 
     */
    RJCQ,

    /**
     * Reject of a response or an advice response message by a card acceptor or an agent.
     * 
     */
    RJCP;

    public String value() {
        return name();
    }

    public static MessageFunction9Code fromValue(String v) {
        return valueOf(v);
    }

}
