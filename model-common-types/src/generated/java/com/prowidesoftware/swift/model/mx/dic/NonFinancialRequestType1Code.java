
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonFinancialRequestType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NonFinancialRequestType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACQR"/&gt;
 *     &lt;enumeration value="PARQ"/&gt;
 *     &lt;enumeration value="RISK"/&gt;
 *     &lt;enumeration value="TOKN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NonFinancialRequestType1Code")
@XmlEnum
public enum NonFinancialRequestType1Code {


    /**
     * According to several parameters of a transaction, an Intermediary Agent helps an Acceptor to identify the more relevant Acquirer to process the transaction.
     * 
     */
    ACQR,

    /**
     * The Intermediary Agent or Acquirer provides the PaymentAccountReference to use to process the transaction.
     * 
     */
    PARQ,

    /**
     * The Intermediary Agent or Acquirer helps the Acceptor to assess the risk management of the transaction.
     * 
     */
    RISK,

    /**
     * The Intermediary Agent or Acquirer provides the token to use to process the transaction.
     * 
     */
    TOKN;

    public String value() {
        return name();
    }

    public static NonFinancialRequestType1Code fromValue(String v) {
        return valueOf(v);
    }

}
