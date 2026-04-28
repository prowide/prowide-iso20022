
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationFunction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReconciliationFunction1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INQR"/&gt;
 *     &lt;enumeration value="INCU"/&gt;
 *     &lt;enumeration value="CNVY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
