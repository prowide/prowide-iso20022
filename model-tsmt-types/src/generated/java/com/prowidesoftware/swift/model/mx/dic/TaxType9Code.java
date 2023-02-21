
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxType9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxType9Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PROV"/&gt;
 *     &lt;enumeration value="NATI"/&gt;
 *     &lt;enumeration value="STAT"/&gt;
 *     &lt;enumeration value="WITH"/&gt;
 *     &lt;enumeration value="STAM"/&gt;
 *     &lt;enumeration value="COAX"/&gt;
 *     &lt;enumeration value="VATA"/&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxType9Code")
@XmlEnum
public enum TaxType9Code {


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
    CUST;

    public String value() {
        return name();
    }

    public static TaxType9Code fromValue(String v) {
        return valueOf(v);
    }

}
