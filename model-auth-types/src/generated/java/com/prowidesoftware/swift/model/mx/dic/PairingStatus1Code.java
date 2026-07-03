
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PairingStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PairingStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PARD"/&gt;
 *     &lt;enumeration value="UNPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PairingStatus1Code")
@XmlEnum
public enum PairingStatus1Code {


    /**
     * Transaction has been paired.
     * 
     */
    PARD,

    /**
     * Transaction has not been paired.
     * 
     */
    UNPR;

    public String value() {
        return name();
    }

    public static PairingStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
