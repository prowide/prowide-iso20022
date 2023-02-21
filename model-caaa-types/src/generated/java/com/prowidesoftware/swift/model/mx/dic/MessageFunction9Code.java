
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageFunction9Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RJCQ"/&gt;
 *     &lt;enumeration value="RJCP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
