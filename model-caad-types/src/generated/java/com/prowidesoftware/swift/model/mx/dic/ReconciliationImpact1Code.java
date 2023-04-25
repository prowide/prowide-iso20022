
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationImpact1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReconciliationImpact1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DEBT"/>
 *     <enumeration value="CRDT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReconciliationImpact1Code")
@XmlEnum
public enum ReconciliationImpact1Code {


    /**
     * Debit category
     * 
     */
    DEBT,

    /**
     * Credit category
     * 
     */
    CRDT;

    public String value() {
        return name();
    }

    public static ReconciliationImpact1Code fromValue(String v) {
        return valueOf(v);
    }

}
