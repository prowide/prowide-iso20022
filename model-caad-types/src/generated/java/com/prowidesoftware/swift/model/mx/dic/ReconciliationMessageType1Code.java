
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationMessageType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReconciliationMessageType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BATR"/>
 *     <enumeration value="CAMI"/>
 *     <enumeration value="CAMR"/>
 *     <enumeration value="CGBI"/>
 *     <enumeration value="CGBR"/>
 *     <enumeration value="EROR"/>
 *     <enumeration value="FECI"/>
 *     <enumeration value="FECR"/>
 *     <enumeration value="FIAI"/>
 *     <enumeration value="FIAR"/>
 *     <enumeration value="FINR"/>
 *     <enumeration value="FINI"/>
 *     <enumeration value="FRDI"/>
 *     <enumeration value="FRDR"/>
 *     <enumeration value="FRRI"/>
 *     <enumeration value="FRRR"/>
 *     <enumeration value="INQI"/>
 *     <enumeration value="INQR"/>
 *     <enumeration value="KYEI"/>
 *     <enumeration value="KYER"/>
 *     <enumeration value="NWMI"/>
 *     <enumeration value="NWMR"/>
 *     <enumeration value="RECI"/>
 *     <enumeration value="RECR"/>
 *     <enumeration value="RTFI"/>
 *     <enumeration value="RTFR"/>
 *     <enumeration value="RTRR"/>
 *     <enumeration value="RTRI"/>
 *     <enumeration value="REVI"/>
 *     <enumeration value="REVR"/>
 *     <enumeration value="SERI"/>
 *     <enumeration value="SERR"/>
 *     <enumeration value="VERI"/>
 *     <enumeration value="VERR"/>
 *     <enumeration value="AMDT"/>
 *     <enumeration value="ATHI"/>
 *     <enumeration value="ATHR"/>
 *     <enumeration value="BAMI"/>
 *     <enumeration value="BAMR"/>
 *     <enumeration value="BATI"/>
 *     <enumeration value="ADDI"/>
 *     <enumeration value="ADDR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReconciliationMessageType1Code")
@XmlEnum
public enum ReconciliationMessageType1Code {


    /**
     * Batch Transfer Response
     * 
     */
    BATR,

    /**
     * Card Management Initiation
     * 
     */
    CAMI,

    /**
     * Card Management Response
     * 
     */
    CAMR,

    /**
     * Chargeback Initiation
     * 
     */
    CGBI,

    /**
     * Chargeback Response
     * 
     */
    CGBR,

    /**
     * Error
     * 
     */
    EROR,

    /**
     * Fee Collection Initiation
     * 
     */
    FECI,

    /**
     * Fee Collection Response
     * 
     */
    FECR,

    /**
     * File Action Initiation
     * 
     */
    FIAI,

    /**
     * File Action Response
     * 
     */
    FIAR,

    /**
     * Financial Response
     * 
     */
    FINR,

    /**
     * Financial Initiation
     * 
     */
    FINI,

    /**
     * Fraud Disposition Initiation
     * 
     */
    FRDI,

    /**
     * Fraud Disposition Response
     * 
     */
    FRDR,

    /**
     * Fraud Reporting Initiation
     * 
     */
    FRRI,

    /**
     * Fraud Reporting Response
     * 
     */
    FRRR,

    /**
     * Inquiry Initiation
     * 
     */
    INQI,

    /**
     * Inquiry Response
     * 
     */
    INQR,

    /**
     * Key Exchange Initiation
     * 
     */
    KYEI,

    /**
     * Key Exchange Response
     * 
     */
    KYER,

    /**
     * Network Management Initiation.
     * 
     */
    NWMI,

    /**
     * Network Management Response
     * 
     */
    NWMR,

    /**
     * Reconciliation Initiation
     * 
     */
    RECI,

    /**
     * Reconciliation Response
     * 
     */
    RECR,

    /**
     * Retrieval Fulfilment Initiation
     * 
     */
    RTFI,

    /**
     * Retrieval Fulfilment Response
     * 
     */
    RTFR,

    /**
     * Retrieval Request
     * 
     */
    RTRR,

    /**
     * Retrieval Response
     * 
     */
    RTRI,

    /**
     * Reversal Initiation
     * 
     */
    REVI,

    /**
     * Reversal Response
     * 
     */
    REVR,

    /**
     * Settlement Reporting Initiation
     * 
     */
    SERI,

    /**
     * Settlement Reporting Response
     * 
     */
    SERR,

    /**
     * Verification Initiation.
     * 
     */
    VERI,

    /**
     * Verification Response
     * 
     */
    VERR,

    /**
     * Amendment
     * 
     */
    AMDT,

    /**
     * Authorisation Initiation
     * 
     */
    ATHI,

    /**
     * Authorisation Response
     * 
     */
    ATHR,

    /**
     * Batch Management Initiation
     * 
     */
    BAMI,

    /**
     * Batch Management Response
     * 
     */
    BAMR,

    /**
     * Batch Transfer Initiation
     * 
     */
    BATI,

    /**
     * Addendum initiation
     * 
     */
    ADDI,

    /**
     * Addendum response
     * 
     */
    ADDR;

    public String value() {
        return name();
    }

    public static ReconciliationMessageType1Code fromValue(String v) {
        return valueOf(v);
    }

}
