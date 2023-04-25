
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardFallback1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardFallback1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FFLB"/>
 *     <enumeration value="SFLB"/>
 *     <enumeration value="NFLB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
