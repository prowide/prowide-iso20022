
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerService3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RetailerService3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FSPP"/&gt;
 *     &lt;enumeration value="FSRP"/&gt;
 *     &lt;enumeration value="FSIP"/&gt;
 *     &lt;enumeration value="FSBP"/&gt;
 *     &lt;enumeration value="FSLP"/&gt;
 *     &lt;enumeration value="FSVP"/&gt;
 *     &lt;enumeration value="FSEP"/&gt;
 *     &lt;enumeration value="FSAP"/&gt;
 *     &lt;enumeration value="FSCP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RetailerService3Code")
@XmlEnum
public enum RetailerService3Code {


    /**
     * The POI System sends a response to a payment request (Purchase/refund/PWCB/MOTO Payment/...).
     * 
     */
    FSPP,

    /**
     * The POI System sends a response to a reversal request.
     * 
     */
    FSRP,

    /**
     * The POI System sends a response to a Balance Inquiry request.
     * 
     */
    FSIP,

    /**
     * The POI System sends a response to a batch processing request.
     * 
     */
    FSBP,

    /**
     * The POI System sends a response to a loyalty processing request.
     * 
     */
    FSLP,

    /**
     * The POI System sends a response to a stored value card or account request.
     * 
     */
    FSVP,

    /**
     * The POI System sends a response after enabling or not some service.
     * 
     */
    FSEP,

    /**
     * The POI System sends a response to a card data acquisition request.
     * 
     */
    FSAP,

    /**
     * The POI System sends a response to a reconciliation request.
     * 
     */
    FSCP;

    public String value() {
        return name();
    }

    public static RetailerService3Code fromValue(String v) {
        return valueOf(v);
    }

}
