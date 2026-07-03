
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Response8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRCS"/&gt;
 *     &lt;enumeration value="UNPR"/&gt;
 *     &lt;enumeration value="UNRV"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="TECH"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Response8Code")
@XmlEnum
public enum Response8Code {


    /**
     * Advice message is processed.
     * 
     */
    PRCS,

    /**
     * Advice message could not be processed.
     * 
     */
    UNPR,

    /**
     * Service is under review.
     * 
     */
    UNRV,

    /**
     * Service was rejected.
     * 
     */
    REJT,

    /**
     * Service cannot be provided for technical reason (eg timeout contacting the Issuer, security problem).
     * 
     */
    TECH,

    /**
     * Other type of processing result defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of processing result defined at private level.
     * 
     */
    OTHP;

    public String value() {
        return name();
    }

    public static Response8Code fromValue(String v) {
        return valueOf(v);
    }

}
