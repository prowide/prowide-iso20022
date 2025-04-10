
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMDevice2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMDevice2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ALRM"/>
 *     <enumeration value="BRCD"/>
 *     <enumeration value="CAMR"/>
 *     <enumeration value="CRDD"/>
 *     <enumeration value="CRDR"/>
 *     <enumeration value="CSHD"/>
 *     <enumeration value="CSHI"/>
 *     <enumeration value="CSHR"/>
 *     <enumeration value="CHCK"/>
 *     <enumeration value="CDIS"/>
 *     <enumeration value="DPST"/>
 *     <enumeration value="DPRN"/>
 *     <enumeration value="DOOR"/>
 *     <enumeration value="INPM"/>
 *     <enumeration value="JRNL"/>
 *     <enumeration value="JPRN"/>
 *     <enumeration value="SNSR"/>
 *     <enumeration value="PSBK"/>
 *     <enumeration value="PINR"/>
 *     <enumeration value="RPRN"/>
 *     <enumeration value="SCAN"/>
 *     <enumeration value="RWDR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMDevice2Code")
@XmlEnum
public enum ATMDevice2Code {


    /**
     * Alarm sensors, such as tamper, seismic or heat sensors.
     * 
     */
    ALRM,

    /**
     * Device scanning barcodes using any scanning technology.
     * 
     */
    BRCD,

    /**
     * Camera, recorder, video mixer.
     * 
     */
    CAMR,

    /**
     * Device dispensing card to a consumer.
     * 
     */
    CRDD,

    /**
     * Device to read and optionally write card with various entry modes.
     * 
     */
    CRDR,

    /**
     * Device dispensing cash in an automated environment, or with an operator present.
     * 
     */
    CSHD,

    /**
     * Device accepting in-out of items as coupons, documents, bills and coins.
     * 
     */
    CSHI,

    /**
     * Compound device with cash in module, cash dispenser, and cash exchange.
     * 
     */
    CSHR,

    /**
     * Check reader and check image scanner.
     * 
     */
    CHCK,

    /**
     * Customer display and keyboard.
     * 
     */
    CDIS,

    /**
     * Device for the deposit of media in envelopes or deposit of bags containing bulk media.
     * 
     */
    DPST,

    /**
     * Printer for full-size forms documents and supporting the printing of text and graphic.
     * 
     */
    DPRN,

    /**
     * Door sensors, such as cabinet, safe or vandal shield doors.
     * 
     */
    DOOR,

    /**
     * Self service device processing items.
     * 
     */
    INPM,

    /**
     * Event log.
     * 
     */
    JRNL,

    /**
     * Continuous form device used to record a hardcopy audit trail of transactions, and for certain report printing requirements.
     * 
     */
    JPRN,

    /**
     * Other sensors and indicators unit.
     * 
     */
    SNSR,

    /**
     * Passbook device supporting automatic positioning of the book.
     * 
     */
    PSBK,

    /**
     * Hardware security module allowing the PIN (Personal Identification Number) entry, secure storing of cryptographic keys, and other cryptographic functions.
     * 
     */
    PINR,

    /**
     * Receipt printer used to print cut sheet documents.
     * 
     */
    RPRN,

    /**
     * Device incorporating both the capabilities to scan inserted documents and optionally to print on them.
     * 
     */
    SCAN,

    /**
     * Receipt of the withdrawal transactions.
     * 
     */
    RWDR;

    public String value() {
        return name();
    }

    public static ATMDevice2Code fromValue(String v) {
        return valueOf(v);
    }

}
