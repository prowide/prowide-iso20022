
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialAdvice1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FinancialAdvice1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RECE"/>
 *     <enumeration value="NREC"/>
 *     <enumeration value="UKWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
