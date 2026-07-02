
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoteChannel1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VoteChannel1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VOPI"/&gt;
 *     &lt;enumeration value="VOCI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VoteChannel1Code")
@XmlEnum
public enum VoteChannel1Code {


    /**
     * Vote is as per described in the processing text for next intermediary information field.
     * 
     */
    VOPI,

    /**
     * Vote is via the chain of intermediaries.
     * 
     */
    VOCI;

    public String value() {
        return name();
    }

    public static VoteChannel1Code fromValue(String v) {
        return valueOf(v);
    }

}
