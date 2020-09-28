
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionallyAcceptedStatusReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditionallyAcceptedStatusReason2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DOCC"/&gt;
 *     &lt;enumeration value="AWRM"/&gt;
 *     &lt;enumeration value="AWSM"/&gt;
 *     &lt;enumeration value="DUPL"/&gt;
 *     &lt;enumeration value="CRED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
