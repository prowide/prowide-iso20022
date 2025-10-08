
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialAdvice1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FinancialAdvice1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RECE"/&gt;
 *     &lt;enumeration value="NREC"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FinancialAdvice1Code")
@XmlEnum
public enum FinancialAdvice1Code {


    /**
     * Advice has been received from an independent financial advisor.
     * 
     */
    RECE,

    /**
     * Advice has not been received from an independent financial advisor.
     * 
     */
    NREC,

    /**
     * It is not known whether or not advice has been received from an independent financial advisor.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static FinancialAdvice1Code fromValue(String v) {
        return valueOf(v);
    }

}
