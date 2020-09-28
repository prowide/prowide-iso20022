
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoneyLaunderingCheck1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MoneyLaunderingCheck1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PASS"/&gt;
 *     &lt;enumeration value="NOTC"/&gt;
 *     &lt;enumeration value="EXEM"/&gt;
 *     &lt;enumeration value="CLMO"/&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *     &lt;enumeration value="POEP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MoneyLaunderingCheck1Code")
@XmlEnum
public enum MoneyLaunderingCheck1Code {


    /**
     * Money laundering identification procedures have been carried out by the intermediary.
     * 
     */
    PASS,

    /**
     * Money laundering identification procedures have not been carried out.
     * 
     */
    NOTC,

    /**
     * Money laundering identification procedures have not been carried out because the transaction is below the prescribed limit.
     * 
     */
    EXEM,

    /**
     * Money laundering identification procedures have not been carried out because of the transaction type, eg, switch, or because the transaction is being funded from an existing investor account held by the intermediary.
     * 
     */
    CLMO,

    /**
     * Money laundering identification procedures have not been carried out because the investor is an authorised credit or financial institution.
     * 
     */
    AUTH,

    /**
     * Limited money laundering identification procedures have been carried out because it is a one time only transaction and the payment is being made by postal, telephone or electronic transfers from an existing account with an authorised credit or financial institution.
     * 
     */
    POEP;

    public String value() {
        return name();
    }

    public static MoneyLaunderingCheck1Code fromValue(String v) {
        return valueOf(v);
    }

}
