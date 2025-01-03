
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PairedReconciled3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PairedReconciled3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLRC"/>
 *     <enumeration value="LNRC"/>
 *     <enumeration value="PARD"/>
 *     <enumeration value="RECO"/>
 *     <enumeration value="UNPR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PairedReconciled3Code")
@XmlEnum
public enum PairedReconciled3Code {


    /**
     * Collateral associated with the loan(s) matched.
     * 
     */
    CLRC,

    /**
     * Loan paired and matched.
     * 
     */
    LNRC,

    /**
     * Loan is paired, but not reconciled.
     * 
     */
    PARD,

    /**
     * Both loan and collateral matched.
     * 
     */
    RECO,

    /**
     * Loan is unpaired.
     * 
     */
    UNPR;

    public String value() {
        return name();
    }

    public static PairedReconciled3Code fromValue(String v) {
        return valueOf(v);
    }

}
