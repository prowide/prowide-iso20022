
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerResultDetail1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RetailerResultDetail1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ABRT"/>
 *     <enumeration value="BUSY"/>
 *     <enumeration value="CANC"/>
 *     <enumeration value="DEVO"/>
 *     <enumeration value="WPIN"/>
 *     <enumeration value="NHOS"/>
 *     <enumeration value="UNVS"/>
 *     <enumeration value="UNVD"/>
 *     <enumeration value="REFU"/>
 *     <enumeration value="PAYR"/>
 *     <enumeration value="TNFD"/>
 *     <enumeration value="NALW"/>
 *     <enumeration value="LOUT"/>
 *     <enumeration value="IVCA"/>
 *     <enumeration value="ICAR"/>
 *     <enumeration value="WIPG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RetailerResultDetail1Code")
@XmlEnum
public enum RetailerResultDetail1Code {


    /**
     * The Initiator of the request has sent an Abort message request, which was accepted and processed.
     * 
     */
    ABRT,

    /**
     * The system is busy, try later.
     * 
     */
    BUSY,

    /**
     * The user has aborted the transaction on the PED keyboard, for instance during PIN entering.
     * 
     */
    CANC,

    /**
     * Device out of order.
     * 
     */
    DEVO,

    /**
     * The user has entered the PIN on the PED keyboard and the verification fails.
     * 
     */
    WPIN,

    /**
     * Acquirer or any host is unreachable or has not answered to an online request, so is considered as temporary unavailable. Depending on the Sale context, the request could be repeated (to be compared with "Refusal").
     * 
     */
    NHOS,

    /**
     * The service is not available (not implemented, not configured, protocol version too old...).
     * 
     */
    UNVS,

    /**
     * The hardware is not available (absent, not configured...).
     * 
     */
    UNVD,

    /**
     * The transaction is refused by the host or by the local rules associated to the card or the POI.
     * 
     */
    REFU,

    /**
     * Some sale items are not payable by the card proposed by the Customer.
     * 
     */
    PAYR,

    /**
     * The transaction is not found (e.g. for a reversal or a repeat).
     * 
     */
    TNFD,

    /**
     * A service request is sent during a Service dialogue. A combination of services not possible to provide. During the DeviceInitialisationCardReader message processing, the user has entered a card which has to be protected by the POI, and cannot be processed with this device request from the external, and then the Sale System.
     * 
     */
    NALW,

    /**
     * Not logged in.
     * 
     */
    LOUT,

    /**
     * The card entered by the Customer cannot be processed by the POI because this card is not configured in the system.
     * 
     */
    IVCA,

    /**
     * If the Input Device request a NotifyCardInputFlag and the Customer enters a card in the card reader without answers to the Input command, the POI abort the Input command processing, and answer a dedicated ErrorCondition value in the Input response message.
     * 
     */
    ICAR,

    /**
     * The transaction is still in progress and then the command cannot be processed.
     * 
     */
    WIPG;

    public String value() {
        return name();
    }

    public static RetailerResultDetail1Code fromValue(String v) {
        return valueOf(v);
    }

}
