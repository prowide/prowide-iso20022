
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstrumentSubStructureType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InstrumentSubStructureType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ABSE"/>
 *     <enumeration value="AIRT"/>
 *     <enumeration value="AUTT"/>
 *     <enumeration value="CBOB"/>
 *     <enumeration value="CDOB"/>
 *     <enumeration value="CLNO"/>
 *     <enumeration value="CLOB"/>
 *     <enumeration value="CMBS"/>
 *     <enumeration value="CSMR"/>
 *     <enumeration value="CRCT"/>
 *     <enumeration value="HELO"/>
 *     <enumeration value="LPNO"/>
 *     <enumeration value="PFAB"/>
 *     <enumeration value="PYRT"/>
 *     <enumeration value="REPK"/>
 *     <enumeration value="RMBS"/>
 *     <enumeration value="SCBO"/>
 *     <enumeration value="STRB"/>
 *     <enumeration value="STUT"/>
 *     <enumeration value="WBSE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InstrumentSubStructureType1Code")
@XmlEnum
public enum InstrumentSubStructureType1Code {


    /**
     * Sub structured type of the financial instrument is an asset backed security.
     * 
     */
    ABSE,

    /**
     * Sub structured type of the financial instrument is an airline trust.
     * 
     */
    AIRT,

    /**
     * Sub structured type of the financial instrument is an auto trust.
     * 
     */
    AUTT,

    /**
     * Sub structured type of the financial instrument is a collateral bond obligation.
     * 
     */
    CBOB,

    /**
     * Sub structured type of the financial instrument is a collateral debt obligation.
     * 
     */
    CDOB,

    /**
     * Sub-structured type of the financial instrument is a credit linked note.
     * 
     */
    CLNO,

    /**
     * Sub structured type of the financial instrument is a collateral loan obligation.
     * 
     */
    CLOB,

    /**
     * Sub structured type of the financial instrument is a commercial mortgage.
     * 
     */
    CMBS,

    /**
     * Sub structured type of the financial instrument is a consumer.
     * 
     */
    CSMR,

    /**
     * Sub structured type of the financial instrument is a credit card trust.
     * 
     */
    CRCT,

    /**
     * Sub structured type of the financial instrument is a home equity loan.
     * 
     */
    HELO,

    /**
     * Sub structured type of the financial instrument is a loan participation notes.
     * 
     */
    LPNO,

    /**
     * Sub structured type of the financial instrument is a covered bond.
     * 
     */
    PFAB,

    /**
     * Sub structured type of the financial instrument is a payment right.
     * 
     */
    PYRT,

    /**
     * Sub structured type of the financial instrument is a repackaging.
     * 
     */
    REPK,

    /**
     * Sub structured type of the financial instrument is a residential mortgage.
     * 
     */
    RMBS,

    /**
     * Sub structured type of the financial instrument is a structured covered bond.
     * 
     */
    SCBO,

    /**
     * Sub structured type of the financial instrument is a straight bond.
     * 
     */
    STRB,

    /**
     * Sub structured type of the financial instrument is a student loan trust.
     * 
     */
    STUT,

    /**
     * Sub structured type of the financial instrument is a whole business security.
     * 
     */
    WBSE;

    public String value() {
        return name();
    }

    public static InstrumentSubStructureType1Code fromValue(String v) {
        return valueOf(v);
    }

}
