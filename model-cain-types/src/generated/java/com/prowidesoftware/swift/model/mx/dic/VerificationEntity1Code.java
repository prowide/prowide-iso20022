
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerificationEntity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VerificationEntity1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MERC"/&gt;
 *     &lt;enumeration value="ACQR"/&gt;
 *     &lt;enumeration value="AGNT"/&gt;
 *     &lt;enumeration value="ISSR"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VerificationEntity1Code")
@XmlEnum
public enum VerificationEntity1Code {


    /**
     * Acceptor (for example signature verification by the attendant).
     * 
     */
    MERC,

    /**
     * Acquirer of the transaction.
     * 
     */
    ACQR,

    /**
     * Entity providing card payment processing services acting as an intermediary between (or on behalf of) an acquirer and an issuer.
     * 
     */
    AGNT,

    /**
     * Card issuer.
     * 
     */
    ISSR,

    /**
     * Other type of authentication entity defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of authentication entity defined at private level.
     * 
     */
    OTHP;

    public String value() {
        return name();
    }

    public static VerificationEntity1Code fromValue(String v) {
        return valueOf(v);
    }

}
