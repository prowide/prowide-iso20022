
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTime1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentTime1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="EMTD"/&gt;
 *     &lt;enumeration value="EPRD"/&gt;
 *     &lt;enumeration value="PRMD"/&gt;
 *     &lt;enumeration value="IREC"/&gt;
 *     &lt;enumeration value="PRMR"/&gt;
 *     &lt;enumeration value="EPRR"/&gt;
 *     &lt;enumeration value="EMTR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * Code for payment at end of period after end of month of delivery
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
