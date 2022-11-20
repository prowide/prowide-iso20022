
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PairedReconciled3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PairedReconciled3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLRC"/&gt;
 *     &lt;enumeration value="LNRC"/&gt;
 *     &lt;enumeration value="PARD"/&gt;
 *     &lt;enumeration value="RECO"/&gt;
 *     &lt;enumeration value="UNPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
