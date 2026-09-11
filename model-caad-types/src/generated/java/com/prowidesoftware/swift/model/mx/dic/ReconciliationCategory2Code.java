
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationCategory2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReconciliationCategory2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RVSL"/>
 *     <enumeration value="FNCL"/>
 *     <enumeration value="CGBK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReconciliationCategory2Code")
@XmlEnum
public enum ReconciliationCategory2Code {


    /**
     * Reconciliation category is reversal.
     * 
     */
    RVSL,

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

    public static ReconciliationCategory2Code fromValue(String v) {
        return valueOf(v);
    }

}
