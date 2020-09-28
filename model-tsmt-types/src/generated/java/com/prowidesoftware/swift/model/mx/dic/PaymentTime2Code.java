
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTime2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentTime2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="EMTD"/&gt;
 *     &lt;enumeration value="EPRD"/&gt;
 *     &lt;enumeration value="PRMD"/&gt;
 *     &lt;enumeration value="IREC"/&gt;
 *     &lt;enumeration value="PRMR"/&gt;
 *     &lt;enumeration value="EPRR"/&gt;
 *     &lt;enumeration value="EMTR"/&gt;
 *     &lt;enumeration value="EPAM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
