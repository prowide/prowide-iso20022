
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventWorkflowStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EventWorkflowStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WSAP"/>
 *     <enumeration value="WSPA"/>
 *     <enumeration value="WSCA"/>
 *     <enumeration value="WSPN"/>
 *     <enumeration value="WSCT"/>
 *     <enumeration value="WSIN"/>
 *     <enumeration value="WSPD"/>
 *     <enumeration value="WSNS"/>
 *     <enumeration value="WSPS"/>
 *     <enumeration value="WSPC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventWorkflowStatus1Code")
@XmlEnum
public enum EventWorkflowStatus1Code {


    /**
     * All of the required data has been populated. Any conflicting data has been resolved. Either all information was in agreement (STP) or if manual validation was necessary authorised review and changes/updates were performed.
     * 
     */
    WSAP,

    /**
     * Validation review was performed and event has been modified. Event is pending authorised approval.
     * 
     */
    WSPA,

    /**
     * Announcement has been confirmed but not all of the required data is available. Event was validated or specific STP criteria was met, however data is still pending confirmation of the event.
     * 
     */
    WSCA,

    /**
     * Validation review has been performed and event has been modified. Announcement has been confirmed but not all of the required data is available. Even record is pending authorised approval.
     * 
     */
    WSPN,

    /**
     * Two or more sources disagree on one or more data elements.
     * 
     */
    WSCT,

    /**
     * Required data is not available. Announcement record cannot be verified.
     * 
     */
    WSIN,

    /**
     * Validation has determined the announcement record to be invalid. Pending authorisation.
     * 
     */
    WSPD,

    /**
     * Announcement record is not supported by validation service.
     * 
     */
    WSNS,

    /**
     * Validation has determined that the record is not supported. Pending authorisations.
     * 
     */
    WSPS,

    /**
     * Validation has determined event is being cancelled by the issuer/offeror. Pending authorisation.
     * 
     */
    WSPC;

    public String value() {
        return name();
    }

    public static EventWorkflowStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
