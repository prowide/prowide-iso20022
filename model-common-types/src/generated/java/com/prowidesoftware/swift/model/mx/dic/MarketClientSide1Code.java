
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketClientSide1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketClientSide1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLNT"/&gt;
 *     &lt;enumeration value="MAKT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarketClientSide1Code")
@XmlEnum
public enum MarketClientSide1Code {


    /**
     * Instruction is for a client side transaction.
     * 
     */
    CLNT,

    /**
     * Instruction is for a market side transaction.
     * 
     */
    MAKT;

    public String value() {
        return name();
    }

    public static MarketClientSide1Code fromValue(String v) {
        return valueOf(v);
    }

}
