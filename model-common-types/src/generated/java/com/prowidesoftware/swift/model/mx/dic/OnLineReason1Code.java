
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnLineReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OnLineReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RNDM"/&gt;
 *     &lt;enumeration value="ICCF"/&gt;
 *     &lt;enumeration value="MERF"/&gt;
 *     &lt;enumeration value="TRMF"/&gt;
 *     &lt;enumeration value="ISSF"/&gt;
 *     &lt;enumeration value="FRLT"/&gt;
 *     &lt;enumeration value="EXFL"/&gt;
 *     &lt;enumeration value="TAMT"/&gt;
 *     &lt;enumeration value="CBIN"/&gt;
 *     &lt;enumeration value="UBIN"/&gt;
 *     &lt;enumeration value="CPAN"/&gt;
 *     &lt;enumeration value="FLOW"/&gt;
 *     &lt;enumeration value="CRCY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OnLineReason1Code")
@XmlEnum
public enum OnLineReason1Code {


    /**
     * Transaction random selection to go online.
     * 
     */
    RNDM,

    /**
     * Payment application in the Integrated Circuit Card forces to go on-line.
     * 
     */
    ICCF,

    /**
     * On line forced by card acceptor.
     * 
     */
    MERF,

    /**
     * Terminal random selection to go online.
     * 
     */
    TRMF,

    /**
     * On line forced by card issuer.
     * 
     */
    ISSF,

    /**
     * Over floor limit.
     * 
     */
    FRLT,

    /**
     * Card appears on terminal exception file.
     * 
     */
    EXFL,

    /**
     * Total amount of purchases per cardholder and per application above floor limit.
     * 
     */
    TAMT,

    /**
     * Bank Identification Number under control.
     * 
     */
    CBIN,

    /**
     * Unknown Bank Identification Number.
     * 
     */
    UBIN,

    /**
     * Primary account number (card number) under control.
     * 
     */
    CPAN,

    /**
     * Flow control.
     * 
     */
    FLOW,

    /**
     * Unknown currency code or foreign currency.
     * 
     */
    CRCY;

    public String value() {
        return name();
    }

    public static OnLineReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
