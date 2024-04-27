
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionallyAcceptedStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditionallyAcceptedStatusReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AWMO"/&gt;
 *     &lt;enumeration value="AWSH"/&gt;
 *     &lt;enumeration value="DOCC"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConditionallyAcceptedStatusReason1Code")
@XmlEnum
public enum ConditionallyAcceptedStatusReason1Code {


    /**
     * Order is accepted for further processing but the execution of the order is pending until there is enough cash in the account to pay the subscription.
     * 
     */
    AWMO,

    /**
     * Order is accepted for further processing but the execution of the order is pending until there are enough funds in the account to complete it.
     * 
     */
    AWSH,

    /**
     * Order is pending until documents are completed and received, eg, legal documents from the successor, legal proceeds because of bankruptcy, missing signature.
     * 
     */
    DOCC,

    /**
     * Another reason for the conditionally accepted status.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static ConditionallyAcceptedStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
