
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonFinancialRequestType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NonFinancialRequestType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACQR"/&gt;
 *     &lt;enumeration value="PARQ"/&gt;
 *     &lt;enumeration value="RISK"/&gt;
 *     &lt;enumeration value="TOKN"/&gt;
 *     &lt;enumeration value="ADDR"/&gt;
 *     &lt;enumeration value="INSM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NonFinancialRequestType2Code")
@XmlEnum
public enum NonFinancialRequestType2Code {


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
    TOKN,

    /**
     * Indicates a request which implies to receive additional information.
     * 
     */
    ADDR,

    /**
     * Request to receive acquirer instalment plans.
     * 
     */
    INSM;

    public String value() {
        return name();
    }

    public static NonFinancialRequestType2Code fromValue(String v) {
        return valueOf(v);
    }

}
