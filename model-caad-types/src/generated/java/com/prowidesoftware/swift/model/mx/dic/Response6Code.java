
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Response6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNPR"/&gt;
 *     &lt;enumeration value="PPRC"/&gt;
 *     &lt;enumeration value="PRCS"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="TECH"/&gt;
 *     &lt;enumeration value="UNRV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Response6Code")
@XmlEnum
public enum Response6Code {


    /**
     * Advice message could not be processed.
     * 
     */
    UNPR,

    /**
     * Processing of the service has been partially performed.
     * 
     */
    PPRC,

    /**
     * Advice message is processed.
     * 
     */
    PRCS,

    /**
     * Service was rejected.
     * 
     */
    REJT,

    /**
     * Other type of processing result defined at private level.
     * 
     */
    OTHP,

    /**
     * Other type of processing result defined at national level.
     * 
     */
    OTHN,

    /**
     * Service cannot be provided for technical reason (eg timeout contacting the Issuer, security problem).
     * 
     */
    TECH,

    /**
     * Service is under review.
     * 
     */
    UNRV;

    public String value() {
        return name();
    }

    public static Response6Code fromValue(String v) {
        return valueOf(v);
    }

}
