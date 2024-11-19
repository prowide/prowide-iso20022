
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonFinancialRequestType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NonFinancialRequestType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACQR"/>
 *     <enumeration value="PARQ"/>
 *     <enumeration value="RISK"/>
 *     <enumeration value="TOKN"/>
 *     <enumeration value="ADDR"/>
 *     <enumeration value="INSM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
