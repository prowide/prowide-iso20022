
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxType13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxType13Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COAX"/&gt;
 *     &lt;enumeration value="EUTR"/&gt;
 *     &lt;enumeration value="LOCL"/&gt;
 *     &lt;enumeration value="NATI"/&gt;
 *     &lt;enumeration value="LEVY"/&gt;
 *     &lt;enumeration value="PROV"/&gt;
 *     &lt;enumeration value="STAM"/&gt;
 *     &lt;enumeration value="STAT"/&gt;
 *     &lt;enumeration value="STEX"/&gt;
 *     &lt;enumeration value="CTAX"/&gt;
 *     &lt;enumeration value="TRAX"/&gt;
 *     &lt;enumeration value="TRAN"/&gt;
 *     &lt;enumeration value="VATA"/&gt;
 *     &lt;enumeration value="WITH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxType13Code")
@XmlEnum
public enum TaxType13Code {


    /**
     * Tax that is levied on goods and services purchased by customers, and is added to the retail price.
     * 
     */
    COAX,

    /**
     * Tax withheld at source in the framework of the European Directive on taxation of savings in the form of interest payments.
     * 
     */
    EUTR,

    /**
     * Tax that is charged by a local settlement system or local jurisdiction.
     * 
     */
    LOCL,

    /**
     * Tax is a national tax.
     * 
     */
    NATI,

    /**
     * Tax levied on a payment.
     * 
     */
    LEVY,

    /**
     * Tax is a provincial tax.
     * 
     */
    PROV,

    /**
     * Tax is on certain documents and transactions.
     * 
     */
    STAM,

    /**
     * Tax is a state tax.
     * 
     */
    STAT,

    /**
     * Tax collected by a stock exchange.
     * 
     */
    STEX,

    /**
     * Direct reduction of an individual's tax liability.
     * 
     */
    CTAX,

    /**
     * Tax levied on a transaction.
     * 
     */
    TRAX,

    /**
     * Tax levied on a transfer.
     * 
     */
    TRAN,

    /**
     * Tax is a value added tax.
     * 
     */
    VATA,

    /**
     * Tax is on income deducted at source, which the paying agent is legally obliged to deduct from its payments of interest on deposits and other proceeds of a financial instrument.
     * 
     */
    WITH;

    public String value() {
        return name();
    }

    public static TaxType13Code fromValue(String v) {
        return valueOf(v);
    }

}
