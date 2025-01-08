
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerService3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RetailerService3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FSPP"/>
 *     <enumeration value="FSRP"/>
 *     <enumeration value="FSIP"/>
 *     <enumeration value="FSBP"/>
 *     <enumeration value="FSLP"/>
 *     <enumeration value="FSVP"/>
 *     <enumeration value="FSEP"/>
 *     <enumeration value="FSAP"/>
 *     <enumeration value="FSCP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
