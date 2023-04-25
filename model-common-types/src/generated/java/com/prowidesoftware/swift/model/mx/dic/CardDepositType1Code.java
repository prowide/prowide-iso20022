
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDepositType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardDepositType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHP"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="ENVL"/>
 *     <enumeration value="CHEC"/>
 *     <enumeration value="CASH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardDepositType1Code")
@XmlEnum
public enum CardDepositType1Code {


    /**
     * Other Private
     * 
     */
    OTHP,

    /**
     * Other National
     * 
     */
    OTHN,

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

    public static CardDepositType1Code fromValue(String v) {
        return valueOf(v);
    }

}
