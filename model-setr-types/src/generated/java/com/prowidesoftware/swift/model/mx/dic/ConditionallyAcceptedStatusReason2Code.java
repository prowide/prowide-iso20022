
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionallyAcceptedStatusReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ConditionallyAcceptedStatusReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DOCC"/>
 *     <enumeration value="AWRM"/>
 *     <enumeration value="AWSM"/>
 *     <enumeration value="DUPL"/>
 *     <enumeration value="CRED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ConditionallyAcceptedStatusReason2Code")
@XmlEnum
public enum ConditionallyAcceptedStatusReason2Code {


    /**
     * Order is pending until documents are completed and received, eg, legal documents from the successor, legal proceeds because of bankruptcy, missing signature.
     * 
     */
    DOCC,

    /**
     * Order is accepted for further processing but the execution of the order is pending until there are enough funds in the account to complete the redemption.
     * 
     */
    AWRM,

    /**
     * Order is accepted for further processing but the execution of the order is pending until there is enough cash in the account to pay the subscription.
     * 
     */
    AWSM,

    /**
     * Order is accepted for further processing pending the result of the investigation for possible duplicates.
     * 
     */
    DUPL,

    /**
     * Order is accepted for further processing pending the extension of the trading limit.
     * 
     */
    CRED;

    public String value() {
        return name();
    }

    public static ConditionallyAcceptedStatusReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
