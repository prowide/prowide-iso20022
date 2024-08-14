
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction23Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageFunction23Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADVC"/&gt;
 *     &lt;enumeration value="REQU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageFunction23Code")
@XmlEnum
public enum MessageFunction23Code {


    /**
     * Advice indicates where the sender informs the receiver of an activity that has been taken that requires a response. 
     * 
     */
    ADVC,

    /**
     * Message function is a request.
     * 
     */
    REQU;

    public String value() {
        return name();
    }

    public static MessageFunction23Code fromValue(String v) {
        return valueOf(v);
    }

}
