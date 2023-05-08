
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxLiability1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxLiability1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRIN"/>
 *     <enumeration value="AGEN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxLiability1Code")
@XmlEnum
public enum TaxLiability1Code {


    /**
     * Settlement party is acting as a principal for tax liability.
     * 
     */
    PRIN,

    /**
     * Settlement party is acting as an agent for tax liability.
     * 
     */
    AGEN;

    public String value() {
        return name();
    }

    public static TaxLiability1Code fromValue(String v) {
        return valueOf(v);
    }

}
