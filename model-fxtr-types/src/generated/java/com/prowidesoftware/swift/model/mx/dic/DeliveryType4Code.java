
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TRIP"/&gt;
 *     &lt;enumeration value="PVSP"/&gt;
 *     &lt;enumeration value="HOIC"/&gt;
 *     &lt;enumeration value="FREE"/&gt;
 *     &lt;enumeration value="AGPM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeliveryType4Code")
@XmlEnum
public enum DeliveryType4Code {


    /**
     * Indicates that a custodian bank or international clearing organization acts as an intermediary between the two parties to the repo.
     * 
     */
    TRIP,

    /**
     * Indicates that the delivery is a Payment versus Payment.
     * 
     */
    PVSP,

    /**
     * Indicates that the collateral pledged by the (cash) borrower is not actually delivered to the cash lender. Rather, it is placed in an internal account ("held in custody") by the borrower, for the lender, throughout the duration of the trade.
     * 
     */
    HOIC,

    /**
     * Indicates the delivery is free of payment.
     * 
     */
    FREE,

    /**
     * Indicates that the delivery is against payment.
     * 
     */
    AGPM;

    public String value() {
        return name();
    }

    public static DeliveryType4Code fromValue(String v) {
        return valueOf(v);
    }

}
