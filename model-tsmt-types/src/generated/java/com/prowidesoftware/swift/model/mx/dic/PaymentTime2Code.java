
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTime2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentTime2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="EMTD"/>
 *     <enumeration value="EPRD"/>
 *     <enumeration value="PRMD"/>
 *     <enumeration value="IREC"/>
 *     <enumeration value="PRMR"/>
 *     <enumeration value="EPRR"/>
 *     <enumeration value="EMTR"/>
 *     <enumeration value="EPAM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentTime2Code")
@XmlEnum
public enum PaymentTime2Code {


    /**
     * Code for payment on delivery.
     * 
     */
    CASH,

    /**
     * Code for payment at end of month of delivery.
     * 
     */
    EMTD,

    /**
     * Code for payment at end of period after delivery.
     * 
     */
    EPRD,

    /**
     * Code for payment at end of period after end of month of delivery.
     * 
     */
    PRMD,

    /**
     * Code for payment on receipt of invoice.
     * 
     */
    IREC,

    /**
     * Code for payment at end of period after end of month of receipt of invoice.
     * 
     */
    PRMR,

    /**
     * Code for payment at end of period after receipt of invoice.
     * 
     */
    EPRR,

    /**
     * Code for payment at end of month of receipt of invoice.
     * 
     */
    EMTR,

    /**
     * Code for payment at end of period after match or mismatch acceptance.
     * 
     */
    EPAM;

    public String value() {
        return name();
    }

    public static PaymentTime2Code fromValue(String v) {
        return valueOf(v);
    }

}
