
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTime4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentTime4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IREC"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="EPSD"/>
 *     <enumeration value="EPRR"/>
 *     <enumeration value="EPPO"/>
 *     <enumeration value="EPIN"/>
 *     <enumeration value="PRMR"/>
 *     <enumeration value="PRMD"/>
 *     <enumeration value="EPRD"/>
 *     <enumeration value="EPBE"/>
 *     <enumeration value="EMTR"/>
 *     <enumeration value="EMTD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentTime4Code")
@XmlEnum
public enum PaymentTime4Code {


    /**
     * Code for payment on receipt of invoice.
     * 
     */
    IREC,

    /**
     * Code for payment on delivery.
     * 
     */
    CASH,

    /**
     * Payment at end of period after shipment date.
     * 
     */
    EPSD,

    /**
     * Code for payment at end of period after receipt of invoice.
     * 
     */
    EPRR,

    /**
     * Payment at end of period after purchase order date.
     * 
     */
    EPPO,

    /**
     * Payment at end of period after invoice date.
     * 
     */
    EPIN,

    /**
     * Code for payment at end of period after end of month of receipt of invoice.
     * 
     */
    PRMR,

    /**
     * Code for payment at end of period after end of month of delivery.
     * 
     */
    PRMD,

    /**
     * Code for payment at end of period after delivery.
     * 
     */
    EPRD,

    /**
     * Payment at end of period after baseline establishment date.
     * 
     */
    EPBE,

    /**
     * Code for payment at end of month of receipt of invoice.
     * 
     */
    EMTR,

    /**
     * Code for payment at end of month of delivery.
     * 
     */
    EMTD;

    public String value() {
        return name();
    }

    public static PaymentTime4Code fromValue(String v) {
        return valueOf(v);
    }

}
