
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMDevice1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMDevice1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CDIS"/>
 *     <enumeration value="DPRN"/>
 *     <enumeration value="JRNL"/>
 *     <enumeration value="JPRN"/>
 *     <enumeration value="RPRN"/>
 *     <enumeration value="RWDR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMDevice1Code")
@XmlEnum
public enum ATMDevice1Code {


    /**
     * Customer display and keyboard.
     * 
     */
    CDIS,

    /**
     * Printer for full-size forms documents and supporting the printing of text and graphic.
     * 
     */
    DPRN,

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
     * Receipt printer used to print cut sheet documents.
     * 
     */
    RPRN,

    /**
     * Receipt of the withdrawal transactions.
     * 
     */
    RWDR;

    public String value() {
        return name();
    }

    public static ATMDevice1Code fromValue(String v) {
        return valueOf(v);
    }

}
