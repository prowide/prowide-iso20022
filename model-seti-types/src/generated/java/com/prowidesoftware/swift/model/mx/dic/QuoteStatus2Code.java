
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="QuoteStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SYMB"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="UNSY"/>
 *     <enumeration value="ALLE"/>
 *     <enumeration value="NQUO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "QuoteStatus2Code")
@XmlEnum
public enum QuoteStatus2Code {


    /**
     * Indicates that all quotes are cancelled for a financial instrument's symbol.
     * 
     */
    SYMB,

    /**
     * Indicates that all quotes are cancelled for a specific security.
     * 
     */
    SECU,

    /**
     * Indicates that all quotes are cancelled for an underlying financial instrument.
     * 
     */
    UNSY,

    /**
     * Indicates that all quotes are cancelled.
     * 
     */
    ALLE,

    /**
     * Indicates that no quote can be computed or communicated.
     * 
     */
    NQUO;

    public String value() {
        return name();
    }

    public static QuoteStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
