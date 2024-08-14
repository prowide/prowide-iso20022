
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction23Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageFunction23Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADVC"/>
 *     <enumeration value="REQU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
