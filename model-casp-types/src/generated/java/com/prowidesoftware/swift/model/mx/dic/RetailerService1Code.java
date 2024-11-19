
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerService1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RetailerService1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DCAQ"/>
 *     <enumeration value="ADAQ"/>
 *     <enumeration value="ADAP"/>
 *     <enumeration value="RPAP"/>
 *     <enumeration value="RPAQ"/>
 *     <enumeration value="RPTQ"/>
 *     <enumeration value="RPTP"/>
 *     <enumeration value="SMDQ"/>
 *     <enumeration value="SMDP"/>
 *     <enumeration value="SMIQ"/>
 *     <enumeration value="SMIP"/>
 *     <enumeration value="SMOQ"/>
 *     <enumeration value="SMOP"/>
 *     <enumeration value="DDYQ"/>
 *     <enumeration value="DDYP"/>
 *     <enumeration value="DCIQ"/>
 *     <enumeration value="DCIP"/>
 *     <enumeration value="DINO"/>
 *     <enumeration value="DINQ"/>
 *     <enumeration value="DINP"/>
 *     <enumeration value="DSOQ"/>
 *     <enumeration value="DSOP"/>
 *     <enumeration value="DCPQ"/>
 *     <enumeration value="DCPP"/>
 *     <enumeration value="DPRQ"/>
 *     <enumeration value="DPRP"/>
 *     <enumeration value="DSIQ"/>
 *     <enumeration value="DSIP"/>
 *     <enumeration value="DCAP"/>
 *     <enumeration value="DCOQ"/>
 *     <enumeration value="DCOP"/>
 *     <enumeration value="FSIQ"/>
 *     <enumeration value="FSIP"/>
 *     <enumeration value="FSBQ"/>
 *     <enumeration value="FSBP"/>
 *     <enumeration value="FSAQ"/>
 *     <enumeration value="FSAP"/>
 *     <enumeration value="FSEQ"/>
 *     <enumeration value="FSEP"/>
 *     <enumeration value="FSLQ"/>
 *     <enumeration value="FSLP"/>
 *     <enumeration value="FSPQ"/>
 *     <enumeration value="FSPP"/>
 *     <enumeration value="FSCQ"/>
 *     <enumeration value="FSCP"/>
 *     <enumeration value="FSRQ"/>
 *     <enumeration value="FSRP"/>
 *     <enumeration value="FSVQ"/>
 *     <enumeration value="FSVP"/>
 *     <enumeration value="SSAB"/>
 *     <enumeration value="SSEN"/>
 *     <enumeration value="SSRR"/>
 *     <enumeration value="SSSQ"/>
 *     <enumeration value="SSSP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RetailerService1Code")
@XmlEnum
public enum RetailerService1Code {


    /**
     * A service to send commands to a card.
     * 
     */
    DCAQ,

    /**
     * An administrative request, to select and start customised administrative services provided by the POI, using a "menu" for an interactive or software interface, initiated by the Sale system.
     * 
     */
    ADAQ,

    /**
     * The POI System responds to an administrative request.
     * 
     */
    ADAP,

    /**
     * The POI System responds to a totals figures request.
     * 
     */
    RPAP,

    /**
     * The Sale System requests to the POI System a report on the totals figures of the POI system.
     * 
     */
    RPAQ,

    /**
     * The Sale System requests to the POI System a report on a list of transactions.
     * 
     */
    RPTQ,

    /**
     * The POI System responds to a transaction report request.
     * 
     */
    RPTP,

    /**
     * The Sale System requests a session diagnosis to the POI System.
     * 
     */
    SMDQ,

    /**
     * The POI System responds to a diagnosis request.
     * 
     */
    SMDP,

    /**
     * The Sale System requests a login to the POI System.
     * 
     */
    SMIQ,

    /**
     * The POI System responds to a login request.
     * 
     */
    SMIP,

    /**
     * The Sale System requests a logout to the POI System.
     * 
     */
    SMOQ,

    /**
     * The POI System responds to a logout request.
     * 
     */
    SMOP,

    /**
     * One System requests the other to display a message for cashier or customer.
     * 
     */
    DDYQ,

    /**
     * One system responds to the other system for a display request.
     * 
     */
    DDYP,

    /**
     * Service to send parameters to use when card reader initializes a new communication with the card.
     * 
     */
    DCIQ,

    /**
     * The POI system responds to the Sale System for a card reader initialisation.
     * 
     */
    DCIP,

    /**
     * One system sends a notification to the POI System to update a input request.
     * 
     */
    DINO,

    /**
     * One system requests to the other System to get data input. 
     * 
     */
    DINQ,

    /**
     * One system responds to the other System for a input request.
     * 
     */
    DINP,

    /**
     * One system requests to the Other System to play a sound.
     * 
     */
    DSOQ,

    /**
     * One system responds to the other System for a play sound request.
     * 
     */
    DSOP,

    /**
     * The Sale system requests to the POI System to power off the card reader.
     * 
     */
    DCPQ,

    /**
     * The POI system responds to the Sale System for a card reader power off.
     * 
     */
    DCPP,

    /**
     * One system requests to the other System to print data.
     * 
     */
    DPRQ,

    /**
     * One system responds to the other System for a print request.
     * 
     */
    DPRP,

    /**
     * One system requests to the Other System to securely get data input (e.g. for PIN).
     * 
     */
    DSIQ,

    /**
     * One system responds to the other System for secure data input.
     * 
     */
    DSIP,

    /**
     * The POI system responds to the Sale System for a card reader Application Protocol Data Unit sending.
     * 
     */
    DCAP,

    /**
     * The Sale system requests to the POI System to transmit a message (for instance to a mobile server).
     * 
     */
    DCOQ,

    /**
     * The POI system responds to the Sale System after a message transmission.
     * 
     */
    DCOP,

    /**
     * The Sale System requests to the POI System to perform balance inquiry on the main account.
     * 
     */
    FSIQ,

    /**
     * The POI System sends a response to a Balance Inquiry request.
     * 
     */
    FSIP,

    /**
     * The Batch message pair is used to request or get the result of transactions (payment, loyalty and reversal) performed without connection to the Sale system (Payment delivery).
     * 
     */
    FSBQ,

    /**
     * The POI System sends a response to a batch processing request.
     * 
     */
    FSBP,

    /**
     * The Sale System requests to the POI System to handle a card data acquisition on the card reader.
     * 
     */
    FSAQ,

    /**
     * The POI System sends a response to a card data acquisition request.
     * 
     */
    FSAP,

    /**
     * The Sale System requests to the POI System to enable a service on its side.
     * 
     */
    FSEQ,

    /**
     * The POI System sends a response after enabling or not some service.
     * 
     */
    FSEP,

    /**
     * The Sale System requests to the POI System a loyalty service like loading or redeem.
     * 
     */
    FSLQ,

    /**
     * The POI System sends a response to a loyalty processing request.
     * 
     */
    FSLP,

    /**
     * The Sale System requests to the POI System to perform a payment(Purchase/Refund/PWCB/MOTO Payment/...).
     * 
     */
    FSPQ,

    /**
     * The POI System sends a response to a payment request (Purchase/refund/PWCB/MOTO Payment/...).
     * 
     */
    FSPP,

    /**
     * The Sale System request to the POI System different kinds of transaction reconciliation. 
     * 
     */
    FSCQ,

    /**
     * The POI System sends a response to a reconciliation request.
     * 
     */
    FSCP,

    /**
     * The Sale System requests to the POI System to perform a reversal partial or complete to cancel a former payment service.
     * 
     */
    FSRQ,

    /**
     * The POI System sends a response to a reversal request.
     * 
     */
    FSRP,

    /**
     * The Sale System requests to the POI System to manage a stored value card or account (eg. Load, Payment, Reimbursement).
     * 
     */
    FSVQ,

    /**
     * The POI System sends a response to a stored value card or account request.
     * 
     */
    FSVP,

    /**
     * Abort a former request or message by the sale system.
     * 
     */
    SSAB,

    /**
     * Send an Event notification to the other party.
     * 
     */
    SSEN,

    /**
     * Send a rejection for a previous message.
     * 
     */
    SSRR,

    /**
     * The Sale System requests to the POI System the status of a previous transaction.
     * 
     */
    SSSQ,

    /**
     * The POI System responds to a message status request.
     * 
     */
    SSSP;

    public String value() {
        return name();
    }

    public static RetailerService1Code fromValue(String v) {
        return valueOf(v);
    }

}
