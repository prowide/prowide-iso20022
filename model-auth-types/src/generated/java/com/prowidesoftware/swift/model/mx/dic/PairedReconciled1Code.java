
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PairedReconciled1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PairedReconciled1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PARD"/&gt;
 *     &lt;enumeration value="RECO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PairedReconciled1Code")
@XmlEnum
public enum PairedReconciled1Code {


    /**
     * Paired.
     * 
     */
    PARD,

    /**
     * Reconciled.
     * 
     */
    RECO;

    public String value() {
        return name();
    }

    public static PairedReconciled1Code fromValue(String v) {
        return valueOf(v);
    }

}
