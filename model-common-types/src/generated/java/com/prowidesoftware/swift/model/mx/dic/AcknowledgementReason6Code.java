
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcknowledgementReason6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AcknowledgementReason6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="SMPG"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="NSTP"/>
 *     <enumeration value="LATE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AcknowledgementReason6Code")
@XmlEnum
public enum AcknowledgementReason6Code {


    /**
     * Received after the account servicer's deadline. Processed on best effort basis.
     * 
     */
    ADEA,

    /**
     * Instruction is accepted but does not comply with the market practice rule published for the concerned market or process.
     * 
     */
    SMPG,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Instruction was not straight through processing and had to be processed manually.
     * 
     */
    NSTP,

    /**
     * Instruction was received after market deadline.
     * 
     */
    LATE;

    public String value() {
        return name();
    }

    public static AcknowledgementReason6Code fromValue(String v) {
        return valueOf(v);
    }

}
