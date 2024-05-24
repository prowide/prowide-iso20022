
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTime3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentTime3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EMTD"/>
 *     <enumeration value="EMTR"/>
 *     <enumeration value="EPBE"/>
 *     <enumeration value="EPRD"/>
 *     <enumeration value="PRMD"/>
 *     <enumeration value="PRMR"/>
 *     <enumeration value="EPIN"/>
 *     <enumeration value="EPAM"/>
 *     <enumeration value="EPPO"/>
 *     <enumeration value="EPRR"/>
 *     <enumeration value="EPSD"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="IREC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentTime3Code")
@XmlEnum
public enum PaymentTime3Code {


    /**
     * Code for payment at end of month of delivery.
     * 
     */
    EMTD,

    /**
     * Code for payment at end of month of receipt of invoice.
     * 
     */
    EMTR,

    /**
     * Payment at end of period after baseline establishment date.
     * 
     */
    EPBE,

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
     * Code for payment at end of period after end of month of receipt of invoice.
     * 
     */
    PRMR,

    /**
     * Payment at end of period after invoice date.
     * 
     */
    EPIN,

    /**
     * Code for payment at end of period after match or mismatch acceptance.
     * 
     */
    EPAM,

    /**
     * Payment at end of period after purchase order date.
     * 
     */
    EPPO,

    /**
     * Code for payment at end of period after receipt of invoice.
     * 
     */
    EPRR,

    /**
     * Payment at end of period after shipment date.
     * 
     */
    EPSD,

    /**
     * Code for payment on delivery.
     * 
     */
    CASH,

    /**
     * Code for payment on receipt of invoice.
     * 
     */
    IREC;

    public String value() {
        return name();
    }

    public static PaymentTime3Code fromValue(String v) {
        return valueOf(v);
    }

}
