
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationFunction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReconciliationFunction1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INQR"/>
 *     <enumeration value="INCU"/>
 *     <enumeration value="CNVY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReconciliationFunction1Code")
@XmlEnum
public enum ReconciliationFunction1Code {


    /**
     * Inquiry for reconciliation totals
     * 
     */
    INQR,

    /**
     * Initiation of a cutover. 
     * 
     */
    INCU,

    /**
     * Convey reconciliation totals
     * 
     */
    CNVY;

    public String value() {
        return name();
    }

    public static ReconciliationFunction1Code fromValue(String v) {
        return valueOf(v);
    }

}
