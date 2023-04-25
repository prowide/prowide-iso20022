
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CopyDuplicate1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CopyDuplicate1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CODU"/>
 *     <enumeration value="COPY"/>
 *     <enumeration value="DUPL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CopyDuplicate1Code")
@XmlEnum
public enum CopyDuplicate1Code {


    /**
     * Message is being sent as a copy to a party other than the account owner, for information purposes and the message is a duplicate of a message previously sent.
     * 
     */
    CODU,

    /**
     * Message is being sent as a copy to a party other than the account owner, for information purposes.
     * 
     */
    COPY,

    /**
     * Message is for information/confirmation purposes. It is a duplicate of a message previously sent.
     * 
     */
    DUPL;

    public String value() {
        return name();
    }

    public static CopyDuplicate1Code fromValue(String v) {
        return valueOf(v);
    }

}
