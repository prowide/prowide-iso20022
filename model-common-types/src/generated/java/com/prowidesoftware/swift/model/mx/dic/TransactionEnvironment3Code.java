
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionEnvironment3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionEnvironment3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BRCH"/&gt;
 *     &lt;enumeration value="MERC"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionEnvironment3Code")
@XmlEnum
public enum TransactionEnvironment3Code {


    /**
     * Bank environment.
     * 
     */
    BRCH,

    /**
     * Merchant environment.
     * 
     */
    MERC,

    /**
     * Other environments, for instance a mall or an airport.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static TransactionEnvironment3Code fromValue(String v) {
        return valueOf(v);
    }

}
