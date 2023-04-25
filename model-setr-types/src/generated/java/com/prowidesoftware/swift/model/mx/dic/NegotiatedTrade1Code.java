
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NegotiatedTrade1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NegotiatedTrade1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NEGO"/>
 *     <enumeration value="NNGO"/>
 *     <enumeration value="UNKW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
