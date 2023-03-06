
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingProductIdentifier1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnderlyingProductIdentifier1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FORW"/&gt;
 *     &lt;enumeration value="NDFO"/&gt;
 *     &lt;enumeration value="SPOT"/&gt;
 *     &lt;enumeration value="SWAP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnderlyingProductIdentifier1Code")
@XmlEnum
public enum UnderlyingProductIdentifier1Code {


    /**
     * Underlying product type of the transaction is a Foreign Exchange Forward.
     * 
     */
    FORW,

    /**
     * Underlying product type of the transaction is a Foreign Exchange Non Deliverable Forward.
     * 
     */
    NDFO,

    /**
     * Underlying product type of the transaction is Foreign Exchange Spot.
     * 
     */
    SPOT,

    /**
     * Underlying product type of the transaction is a Foreign Exchange SWAP.
     * 
     */
    SWAP;

    public String value() {
        return name();
    }

    public static UnderlyingProductIdentifier1Code fromValue(String v) {
        return valueOf(v);
    }

}
