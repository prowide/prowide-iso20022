
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailAmount1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DetailAmount1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CSHB"/>
 *     <enumeration value="DONN"/>
 *     <enumeration value="DCCF"/>
 *     <enumeration value="EXTR"/>
 *     <enumeration value="FORX"/>
 *     <enumeration value="GRTY"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="SRCH"/>
 *     <enumeration value="TAXT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
