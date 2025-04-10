
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnLineReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OnLineReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RNDM"/>
 *     <enumeration value="ICCF"/>
 *     <enumeration value="MERF"/>
 *     <enumeration value="TRMF"/>
 *     <enumeration value="ISSF"/>
 *     <enumeration value="FRLT"/>
 *     <enumeration value="EXFL"/>
 *     <enumeration value="TAMT"/>
 *     <enumeration value="CBIN"/>
 *     <enumeration value="UBIN"/>
 *     <enumeration value="CPAN"/>
 *     <enumeration value="FLOW"/>
 *     <enumeration value="CRCY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
