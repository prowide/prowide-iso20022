
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NegotiatedTrade1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NegotiatedTrade1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NEGO"/&gt;
 *     &lt;enumeration value="NNGO"/&gt;
 *     &lt;enumeration value="UNKW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NegotiatedTrade1Code")
@XmlEnum
public enum NegotiatedTrade1Code {


    /**
     * Trade is negotiated.
     * 
     */
    NEGO,

    /**
     * Trade is not negotiated.
     * 
     */
    NNGO,

    /**
     * Whether the trade is negotiated or not is unknown.
     * 
     */
    UNKW;

    public String value() {
        return name();
    }

    public static NegotiatedTrade1Code fromValue(String v) {
        return valueOf(v);
    }

}
