
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeBearerType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ChargeBearerType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DEBT"/>
 *     <enumeration value="CRED"/>
 *     <enumeration value="SHAR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ChargeBearerType4Code")
@XmlEnum
public enum ChargeBearerType4Code {


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
    SHAR;

    public String value() {
        return name();
    }

    public static ChargeBearerType4Code fromValue(String v) {
        return valueOf(v);
    }

}
