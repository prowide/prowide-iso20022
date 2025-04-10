
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PairingStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PairingStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PARD"/>
 *     <enumeration value="UNPR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
