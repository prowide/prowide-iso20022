
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerMessage1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RetailerMessage1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SSAB"/>
 *     <enumeration value="SAAQ"/>
 *     <enumeration value="SAAP"/>
 *     <enumeration value="SDDR"/>
 *     <enumeration value="SDDP"/>
 *     <enumeration value="SSEN"/>
 *     <enumeration value="SSMQ"/>
 *     <enumeration value="SSMR"/>
 *     <enumeration value="SSRJ"/>
 *     <enumeration value="SARQ"/>
 *     <enumeration value="SARP"/>
 *     <enumeration value="SFRP"/>
 *     <enumeration value="SFRQ"/>
 *     <enumeration value="SFSQ"/>
 *     <enumeration value="SFSP"/>
 *     <enumeration value="SASQ"/>
 *     <enumeration value="SASP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RetailerMessage1Code")
@XmlEnum
public enum RetailerMessage1Code {


    /**
     * Abort the current process or the last request.
     * 
     */
    SSAB,

    /**
     * To select and start customised administrative services provided by the POI, using a "menu" for an interactive or software interface, initiated by the Sale system.
     * 
     */
    SAAQ,

    /**
     * Response to the Admin request.
     * 
     */
    SAAP,

    /**
     * Request one or several functions of the device, from user Interface or payment peripherals on the POI system or on the Sale system. Functions can be Display, Input, Print, play sound, Card reader capabilities or Transmit a message.
     * 
     */
    SDDR,

    /**
     * Response to a Device request.
     * 
     */
    SDDP,

    /**
     * Notify the other party of an event that occurs on its side.
     * 
     */
    SSEN,

    /**
     * Request the status of a previous message for which the Sale system has no response.
     * 
     */
    SSMQ,

    /**
     * Response to a Message Status request.
     * 
     */
    SSMR,

    /**
     * Reject a previous received message, for technical or functional reasons.
     * 
     */
    SSRJ,

    /**
     * To request, by the Sale System, a report on a list of transactions on the POI system, or the status of a transaction.
     * 
     */
    SARQ,

    /**
     * Response to a Report request.
     * 
     */
    SARP,

    /**
     * Response to a Reconciliation Request.
     * 
     */
    SFRP,

    /**
     * Request a reconciliation (different types) between Sale System and POI System.
     * 
     */
    SFRQ,

    /**
     * Request a financial service like payment, reversal, loyalty, Balance Inquiry, etc.
     * 
     */
    SFSQ,

    /**
     * Response to a financial service request.
     * 
     */
    SFSP,

    /**
     * Request the management of a session: login, logout and diagnosis services. Initiated by the Sale system.
     * 
     */
    SASQ,

    /**
     * Response to a session management request to initiate/terminate a session.
     * 
     */
    SASP;

    public String value() {
        return name();
    }

    public static RetailerMessage1Code fromValue(String v) {
        return valueOf(v);
    }

}
