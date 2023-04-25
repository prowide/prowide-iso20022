
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Action1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Action1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SBTW"/>
 *     <enumeration value="RSTW"/>
 *     <enumeration value="RSBS"/>
 *     <enumeration value="ARDM"/>
 *     <enumeration value="ARCS"/>
 *     <enumeration value="ARES"/>
 *     <enumeration value="WAIT"/>
 *     <enumeration value="UPDT"/>
 *     <enumeration value="SBDS"/>
 *     <enumeration value="ARBA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Action1Code")
@XmlEnum
public enum Action1Code {


    /**
     * Request to submit a twin baseline.
     * 
     */
    SBTW,

    /**
     * Request to resubmit a twin baseline.
     * 
     */
    RSTW,

    /**
     * Request to resubmit a baseline.
     * 
     */
    RSBS,

    /**
     * Request to accept or reject mismatched data set(s).
     * 
     */
    ARDM,

    /**
     * Request to accept or reject a request for a change of status of the baseline.
     * 
     */
    ARCS,

    /**
     * Request to accept or reject a request for an extension of the period of validity of the status of the baseline.
     * 
     */
    ARES,

    /**
     * Request to wait until the baseline is established.
     * 
     */
    WAIT,

    /**
     * Request to update and resend.
     * 
     */
    UPDT,

    /**
     * Request to submit data set(s).
     * 
     */
    SBDS,

    /**
     * Request to accept or reject a request for a baseline amendment.
     * 
     */
    ARBA;

    public String value() {
        return name();
    }

    public static Action1Code fromValue(String v) {
        return valueOf(v);
    }

}
