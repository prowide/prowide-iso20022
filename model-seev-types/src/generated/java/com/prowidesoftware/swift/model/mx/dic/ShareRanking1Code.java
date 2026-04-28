
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareRanking1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShareRanking1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DIVI"/&gt;
 *     &lt;enumeration value="PARI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShareRanking1Code")
@XmlEnum
public enum ShareRanking1Code {


    /**
     * Payable on the date specified.
     * 
     */
    DIVI,

    /**
     * Pari Passu. With equal rights as other shares of the company.
     * 
     */
    PARI;

    public String value() {
        return name();
    }

    public static ShareRanking1Code fromValue(String v) {
        return valueOf(v);
    }

}
