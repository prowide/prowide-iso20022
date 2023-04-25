
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReorganisationTransactionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReorganisationTransactionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COVP"/>
 *     <enumeration value="COVA"/>
 *     <enumeration value="COVR"/>
 *     <enumeration value="PROP"/>
 *     <enumeration value="PROT"/>
 *     <enumeration value="VOIT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
