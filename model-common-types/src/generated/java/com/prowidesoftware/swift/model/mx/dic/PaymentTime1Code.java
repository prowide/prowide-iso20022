
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTime1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentTime1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="EMTD"/>
 *     <enumeration value="EPRD"/>
 *     <enumeration value="PRMD"/>
 *     <enumeration value="IREC"/>
 *     <enumeration value="PRMR"/>
 *     <enumeration value="EPRR"/>
 *     <enumeration value="EMTR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentTime1Code")
@XmlEnum
public enum PaymentTime1Code {


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
    EMTR;

    public String value() {
        return name();
    }

    public static PaymentTime1Code fromValue(String v) {
        return valueOf(v);
    }

}
