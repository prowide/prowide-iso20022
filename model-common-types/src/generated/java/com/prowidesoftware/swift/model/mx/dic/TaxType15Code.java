
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxType15Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxType15Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PROV"/>
 *     <enumeration value="NATI"/>
 *     <enumeration value="STAT"/>
 *     <enumeration value="WITH"/>
 *     <enumeration value="STAM"/>
 *     <enumeration value="COAX"/>
 *     <enumeration value="VATA"/>
 *     <enumeration value="CUST"/>
 *     <enumeration value="VATB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxType15Code")
@XmlEnum
public enum TaxType15Code {


    /**
     * Tax is a provincial tax.
     * 
     */
    PROV,

    /**
     * Tax is a national tax.
     * 
     */
    NATI,

    /**
     * Tax is a state tax.
     * 
     */
    STAT,

    /**
     * Tax is on income deducted at source, which the paying agent is legally obliged to deduct from its payments of interest on deposits and other proceeds of a financial instrument.
     * 
     */
    WITH,

    /**
     * Tax is on certain documents and transactions.
     * 
     */
    STAM,

    /**
     * Tax that is levied on goods and services purchased by customers, and is added to the retail price.
     * 
     */
    COAX,

    /**
     * Tax is a value added tax.
     * 
     */
    VATA,

    /**
     * Tax is customs and excise.
     * 
     */
    CUST,

    /**
     * Tax for which a zero rate applies.
     * 
     */
    VATB;

    public String value() {
        return name();
    }

    public static TaxType15Code fromValue(String v) {
        return valueOf(v);
    }

}
