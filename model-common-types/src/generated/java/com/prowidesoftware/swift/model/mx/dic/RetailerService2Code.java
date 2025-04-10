
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerService2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RetailerService2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FSPQ"/>
 *     <enumeration value="FSRQ"/>
 *     <enumeration value="FSIQ"/>
 *     <enumeration value="FSBQ"/>
 *     <enumeration value="FSLQ"/>
 *     <enumeration value="FSVQ"/>
 *     <enumeration value="FSEQ"/>
 *     <enumeration value="FSAQ"/>
 *     <enumeration value="FSCQ"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RetailerService2Code")
@XmlEnum
public enum RetailerService2Code {


    /**
     * The Sale System requests to the POI System to perform a payment(Purchase/Refund/PWCB/MOTO Payment/...).
     * 
     */
    FSPQ,

    /**
     * The Sale System requests to the POI System to perform a reversal partial or complete to cancel a former payment service.
     * 
     */
    FSRQ,

    /**
     * The Sale System requests to the POI System to perform balance inquiry on the main account.
     * 
     */
    FSIQ,

    /**
     * The Batch message pair is used to request or get the result of transactions (payment, loyalty and reversal) performed without connection to the Sale system (Payment delivery).
     * 
     */
    FSBQ,

    /**
     * The Sale System requests to the POI System a loyalty service like loading or redeem.
     * 
     */
    FSLQ,

    /**
     * The Sale System requests to the POI System to manage a stored value card or account (eg. Load, Payment, Reimbursement).
     * 
     */
    FSVQ,

    /**
     * The Sale System requests to the POI System to enable a service on its side.
     * 
     */
    FSEQ,

    /**
     * The Sale System requests to the POI System to handle a card data acquisition on the card reader.
     * 
     */
    FSAQ,

    /**
     * The Sale System request to the POI System different kinds of transaction reconciliation. 
     * 
     */
    FSCQ;

    public String value() {
        return name();
    }

    public static RetailerService2Code fromValue(String v) {
        return valueOf(v);
    }

}
