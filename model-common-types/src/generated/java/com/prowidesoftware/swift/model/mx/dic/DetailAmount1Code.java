
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailAmount1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DetailAmount1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CSHB"/&gt;
 *     &lt;enumeration value="DONN"/&gt;
 *     &lt;enumeration value="DCCF"/&gt;
 *     &lt;enumeration value="EXTR"/&gt;
 *     &lt;enumeration value="FORX"/&gt;
 *     &lt;enumeration value="GRTY"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="SRCH"/&gt;
 *     &lt;enumeration value="TAXT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DetailAmount1Code")
@XmlEnum
public enum DetailAmount1Code {


    /**
     * Cashback amount
     * 
     */
    CSHB,

    /**
     * Donation amount
     * 
     */
    DONN,

    /**
     * Dynamic Currency Conversion type of amount
     * 
     */
    DCCF,

    /**
     * Extra charges (for example, minibar, etc.)
     * 
     */
    EXTR,

    /**
     * Fee applicable to a foreign exchange (Forex) transaction
     * 
     */
    FORX,

    /**
     * Gratuity amount
     * 
     */
    GRTY,

    /**
     * Other type of amount defined at national level
     * 
     */
    OTHN,

    /**
     * Other type of amount defined at private level
     * 
     */
    OTHP,

    /**
     * Fee charged by the acceptor for the transaction.
     * 
     */
    SRCH,

    /**
     * Tax applicable to the transaction
     * 
     */
    TAXT;

    public String value() {
        return name();
    }

    public static DetailAmount1Code fromValue(String v) {
        return valueOf(v);
    }

}
