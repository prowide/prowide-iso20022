
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDepositType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardDepositType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="ENVL"/&gt;
 *     &lt;enumeration value="CHEC"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
