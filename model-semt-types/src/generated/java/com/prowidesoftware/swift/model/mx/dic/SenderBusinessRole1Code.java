
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SenderBusinessRole1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SenderBusinessRole1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AOWN"/&gt;
 *     &lt;enumeration value="ASER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SenderBusinessRole1Code")
@XmlEnum
public enum SenderBusinessRole1Code {


    /**
     * Sender is the owner of the safekeeping account. The sender is disclosing the breakdown of the underlying owners of sender’s holdings with the receiver.
     * 
     */
    AOWN,

    /**
     * Sender is the account servicer of an account owned by the receiver.
     * 
     */
    ASER;

    public String value() {
        return name();
    }

    public static SenderBusinessRole1Code fromValue(String v) {
        return valueOf(v);
    }

}
