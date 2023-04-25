
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChequeDelivery1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ChequeDelivery1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MLDB"/>
 *     <enumeration value="MLCD"/>
 *     <enumeration value="MLFA"/>
 *     <enumeration value="CRDB"/>
 *     <enumeration value="CRCD"/>
 *     <enumeration value="CRFA"/>
 *     <enumeration value="PUDB"/>
 *     <enumeration value="PUCD"/>
 *     <enumeration value="PUFA"/>
 *     <enumeration value="RGDB"/>
 *     <enumeration value="RGCD"/>
 *     <enumeration value="RGFA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
     * Cheque will be picked up by the creditor.
     * 
     */
    PUCD,

    /**
     * Cheque will be picked up by the creditor agent.
     * 
     */
    PUFA,

    /**
     * Cheque is to be sent through registered mail services to debtor.
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
