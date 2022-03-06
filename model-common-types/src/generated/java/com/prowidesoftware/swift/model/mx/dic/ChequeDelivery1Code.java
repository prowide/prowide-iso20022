
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChequeDelivery1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChequeDelivery1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MLDB"/&gt;
 *     &lt;enumeration value="MLCD"/&gt;
 *     &lt;enumeration value="MLFA"/&gt;
 *     &lt;enumeration value="CRDB"/&gt;
 *     &lt;enumeration value="CRCD"/&gt;
 *     &lt;enumeration value="CRFA"/&gt;
 *     &lt;enumeration value="PUDB"/&gt;
 *     &lt;enumeration value="PUCD"/&gt;
 *     &lt;enumeration value="PUFA"/&gt;
 *     &lt;enumeration value="RGDB"/&gt;
 *     &lt;enumeration value="RGCD"/&gt;
 *     &lt;enumeration value="RGFA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChequeDelivery1Code")
@XmlEnum
public enum ChequeDelivery1Code {


    /**
     * Cheque is to be sent through mail services to debtor.
     * 
     */
    MLDB,

    /**
     * Cheque is to be sent through mail services to creditor.
     * 
     */
    MLCD,

    /**
     * Cheque is to be sent through mail services to creditor agent.
     * 
     */
    MLFA,

    /**
     * Cheque is to be sent through courier services to debtor.
     * 
     */
    CRDB,

    /**
     * Cheque is to be sent through courier services to creditor.
     * 
     */
    CRCD,

    /**
     * Cheque is to be sent through courier services to creditor agent.
     * 
     */
    CRFA,

    /**
     * Cheque will be picked up by the debtor.
     * 
     */
    PUDB,

    /**
     * Cheque will be picked up by the creditor
     * 
     */
    PUCD,

    /**
     * Cheque will be picked up by the creditor agent.
     * 
     */
    PUFA,

    /**
     * Cheque is to be sent through registered mail services to debtor
     * 
     */
    RGDB,

    /**
     * Cheque is to be sent through registered mail services to creditor.
     * 
     */
    RGCD,

    /**
     * Cheque is to be sent through registered mail services to creditor agent.
     * 
     */
    RGFA;

    public String value() {
        return name();
    }

    public static ChequeDelivery1Code fromValue(String v) {
        return valueOf(v);
    }

}
