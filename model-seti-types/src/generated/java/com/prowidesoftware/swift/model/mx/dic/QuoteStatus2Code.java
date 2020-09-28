
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuoteStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SYMB"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="UNSY"/&gt;
 *     &lt;enumeration value="ALLE"/&gt;
 *     &lt;enumeration value="NQUO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
