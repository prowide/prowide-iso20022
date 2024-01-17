
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DeliveryType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APMT"/>
 *     <enumeration value="FREE"/>
 *     <enumeration value="TRIP"/>
 *     <enumeration value="HOIC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DeliveryType2Code")
@XmlEnum
public enum DeliveryType2Code {


    /**
     * Indicates that the delivery is against payment.
     * 
     */
    APMT,

    /**
     * Indicates the delivery is free of payment.
     * 
     */
    FREE,

    /**
     * Indicates that a custodian bank or international clearing organization acts as an intermediary between the two parties to the repo.
     * 
     */
    TRIP,

    /**
     * Indicates that the collateral pledged by the (cash) borrower is not actually delivered to the cash lender. Rather, it is placed in an internal account ("held in custody") by the borrower, for the lender, throughout the duration of the trade.
     * 
     */
    HOIC;

    public String value() {
        return name();
    }

    public static DeliveryType2Code fromValue(String v) {
        return valueOf(v);
    }

}
