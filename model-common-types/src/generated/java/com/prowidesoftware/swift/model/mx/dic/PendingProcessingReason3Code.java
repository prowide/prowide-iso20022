
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingProcessingReason3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingProcessingReason3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="BLOC"/>
 *     <enumeration value="MUNO"/>
 *     <enumeration value="NEXT"/>
 *     <enumeration value="MINO"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="DENO"/>
 *     <enumeration value="CERT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingProcessingReason3Code")
@XmlEnum
public enum PendingProcessingReason3Code {


    /**
     * Instruction was received after the account servicer's deadline. Processed on best effort basis.
     * 
     */
    ADEA,

    /**
     * Your account is blocked, no instruction can settle over the account.
     * 
     */
    BLOC,

    /**
     * Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument.
     * 
     */
    MUNO,

    /**
     * Next process is launched. No processing pending problems to be reported.
     * 
     */
    NEXT,

    /**
     * Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument.
     * 
     */
    MINO,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Quantity instructed does not match the denomination available/deliverable. Physical securities need to be obtained in deliverable denominated quantities.
     * 
     */
    DENO,

    /**
     * Certificate number error.
     * 
     */
    CERT;

    public String value() {
        return name();
    }

    public static PendingProcessingReason3Code fromValue(String v) {
        return valueOf(v);
    }

}
