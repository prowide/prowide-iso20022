
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDepositType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardDepositType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ENVL"/>
 *     <enumeration value="CHEC"/>
 *     <enumeration value="CASH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardDepositType2Code")
@XmlEnum
public enum CardDepositType2Code {


    /**
     * Envelope
     * 
     */
    ENVL,

    /**
     * Cheque
     * 
     */
    CHEC,

    /**
     * Cash
     * 
     */
    CASH;

    public String value() {
        return name();
    }

    public static CardDepositType2Code fromValue(String v) {
        return valueOf(v);
    }

}
