
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Action1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Action1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SBTW"/&gt;
 *     &lt;enumeration value="RSTW"/&gt;
 *     &lt;enumeration value="RSBS"/&gt;
 *     &lt;enumeration value="ARDM"/&gt;
 *     &lt;enumeration value="ARCS"/&gt;
 *     &lt;enumeration value="ARES"/&gt;
 *     &lt;enumeration value="WAIT"/&gt;
 *     &lt;enumeration value="UPDT"/&gt;
 *     &lt;enumeration value="SBDS"/&gt;
 *     &lt;enumeration value="ARBA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
