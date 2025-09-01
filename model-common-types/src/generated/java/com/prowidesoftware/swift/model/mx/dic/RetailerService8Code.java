
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerService8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RetailerService8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DDYQ"/&gt;
 *     &lt;enumeration value="DINQ"/&gt;
 *     &lt;enumeration value="DPRQ"/&gt;
 *     &lt;enumeration value="DSOQ"/&gt;
 *     &lt;enumeration value="DSIQ"/&gt;
 *     &lt;enumeration value="DCIQ"/&gt;
 *     &lt;enumeration value="DCAQ"/&gt;
 *     &lt;enumeration value="DCPQ"/&gt;
 *     &lt;enumeration value="DCOQ"/&gt;
 *     &lt;enumeration value="DINO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RetailerService8Code")
@XmlEnum
public enum RetailerService8Code {


    /**
     * One System requests the other to display a message for cashier or customer.
     * 
     */
    DDYQ,

    /**
     * One system requests to the other System to get data input. 
     * 
     */
    DINQ,

    /**
     * One system requests to the other System to print data.
     * 
     */
    DPRQ,

    /**
     * One system requests to the Other System to play a sound.
     * 
     */
    DSOQ,

    /**
     * One system requests to the Other System to securely get data input (e.g. for PIN).
     * 
     */
    DSIQ,

    /**
     * Service to send parameters to use when card reader initializes a new communication with the card.
     * 
     */
    DCIQ,

    /**
     * A service to send commands to a card.
     * 
     */
    DCAQ,

    /**
     * The Sale system requests to the POI System to power off the card reader.
     * 
     */
    DCPQ,

    /**
     * The Sale system requests to the POI System to transmit a message (for instance to a mobile server).
     * 
     */
    DCOQ,

    /**
     * One system sends a notification to the POI System to update a input request.
     * 
     */
    DINO;

    public String value() {
        return name();
    }

    public static RetailerService8Code fromValue(String v) {
        return valueOf(v);
    }

}
