
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationCategory1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReconciliationCategory1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RVSL"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="FNCL"/&gt;
 *     &lt;enumeration value="CGBK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReconciliationCategory1Code")
@XmlEnum
public enum ReconciliationCategory1Code {


    /**
     * Reconciliation category is reversal.
     * 
     */
    RVSL,

    /**
     * Reconciliation category is other private
     * 
     */
    OTHP,

    /**
     * Reconciliation category is other national.
     * 
     */
    OTHN,

    /**
     * Reconciliation category is financial.
     * 
     */
    FNCL,

    /**
     * Reconciliation category is a chargeback.
     * 
     */
    CGBK;

    public String value() {
        return name();
    }

    public static ReconciliationCategory1Code fromValue(String v) {
        return valueOf(v);
    }

}
