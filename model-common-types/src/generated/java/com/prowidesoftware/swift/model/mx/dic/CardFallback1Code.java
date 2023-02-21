
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardFallback1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardFallback1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FFLB"/&gt;
 *     &lt;enumeration value="SFLB"/&gt;
 *     &lt;enumeration value="NFLB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardFallback1Code")
@XmlEnum
public enum CardFallback1Code {


    /**
     * Card fall-back occurred during the transaction in progress. The previous transaction on the terminal failed.
     * 
     */
    FFLB,

    /**
     * Card fall-back occurred during the transaction in progress. The previous transaction on the terminal was successful.
     * 
     */
    SFLB,

    /**
     * No card fall-back during the transaction in progress.
     * 
     */
    NFLB;

    public String value() {
        return name();
    }

    public static CardFallback1Code fromValue(String v) {
        return valueOf(v);
    }

}
