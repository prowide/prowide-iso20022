
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeBearerType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ChargeBearerType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DEBT"/>
 *     <enumeration value="CRED"/>
 *     <enumeration value="SHAR"/>
 *     <enumeration value="SLEV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ChargeBearerType1Code")
@XmlEnum
public enum ChargeBearerType1Code {


    /**
     * All transaction charges are to be borne by the debtor.
     * 
     */
    DEBT,

    /**
     * All transaction charges are to be borne by the creditor.
     * 
     */
    CRED,

    /**
     * In a credit transfer context, means that transaction charges on the sender side are to be borne by the debtor, transaction charges on the receiver side are to be borne by the creditor. In a direct debit context, means that transaction charges on the sender side are to be borne by the creditor, transaction charges on the receiver side are to be borne by the debtor.
     * 
     */
    SHAR,

    /**
     * Charges are to be applied following the rules agreed in the service level and/or scheme.
     * 
     */
    SLEV;

    public String value() {
        return name();
    }

    public static ChargeBearerType1Code fromValue(String v) {
        return valueOf(v);
    }

}
