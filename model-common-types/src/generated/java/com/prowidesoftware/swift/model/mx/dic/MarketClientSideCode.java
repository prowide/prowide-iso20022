
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketClientSideCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketClientSideCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MAKT"/&gt;
 *     &lt;enumeration value="CLNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarketClientSideCode")
@XmlEnum
public enum MarketClientSideCode {


    /**
     * Instruction is for a market side transaction.
     * 
     */
    MAKT,

    /**
     * Instruction is for a client side transaction.
     * 
     */
    CLNT;

    public String value() {
        return name();
    }

    public static MarketClientSideCode fromValue(String v) {
        return valueOf(v);
    }

}
