
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReorganisationTransactionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReorganisationTransactionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COVP"/&gt;
 *     &lt;enumeration value="COVA"/&gt;
 *     &lt;enumeration value="COVR"/&gt;
 *     &lt;enumeration value="PROP"/&gt;
 *     &lt;enumeration value="PROT"/&gt;
 *     &lt;enumeration value="VOIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReorganisationTransactionType1Code")
@XmlEnum
public enum ReorganisationTransactionType1Code {


    /**
     * Reorganisation is a cover on behalf of another participant transaction type.
     * 
     */
    COVP,

    /**
     * Reorganisation is a cover protect directly to agent transaction type.
     * 
     */
    COVA,

    /**
     * Reorganisation is a cover protect transaction type.
     * 
     */
    COVR,

    /**
     * Reorganisation is a protect on behalf of another participant transaction type.
     * 
     */
    PROP,

    /**
     * Reorganisation is a protect transaction type.
     * 
     */
    PROT,

    /**
     * Reorganisation is a voluntary offer instruction transaction type.
     * 
     */
    VOIT;

    public String value() {
        return name();
    }

    public static ReorganisationTransactionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
