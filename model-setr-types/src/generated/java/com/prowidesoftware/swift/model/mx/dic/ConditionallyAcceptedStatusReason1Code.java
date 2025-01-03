
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionallyAcceptedStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ConditionallyAcceptedStatusReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AWMO"/>
 *     <enumeration value="AWSH"/>
 *     <enumeration value="DOCC"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
