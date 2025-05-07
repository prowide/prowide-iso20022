
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationMessageType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReconciliationMessageType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BATR"/&gt;
 *     &lt;enumeration value="CAMI"/&gt;
 *     &lt;enumeration value="CAMR"/&gt;
 *     &lt;enumeration value="CGBI"/&gt;
 *     &lt;enumeration value="CGBR"/&gt;
 *     &lt;enumeration value="EROR"/&gt;
 *     &lt;enumeration value="FECI"/&gt;
 *     &lt;enumeration value="FECR"/&gt;
 *     &lt;enumeration value="FIAI"/&gt;
 *     &lt;enumeration value="FIAR"/&gt;
 *     &lt;enumeration value="FINR"/&gt;
 *     &lt;enumeration value="FINI"/&gt;
 *     &lt;enumeration value="FRDI"/&gt;
 *     &lt;enumeration value="FRDR"/&gt;
 *     &lt;enumeration value="FRRI"/&gt;
 *     &lt;enumeration value="FRRR"/&gt;
 *     &lt;enumeration value="INQI"/&gt;
 *     &lt;enumeration value="INQR"/&gt;
 *     &lt;enumeration value="KYEI"/&gt;
 *     &lt;enumeration value="KYER"/&gt;
 *     &lt;enumeration value="NWMI"/&gt;
 *     &lt;enumeration value="NWMR"/&gt;
 *     &lt;enumeration value="RECI"/&gt;
 *     &lt;enumeration value="RECR"/&gt;
 *     &lt;enumeration value="RTFI"/&gt;
 *     &lt;enumeration value="RTFR"/&gt;
 *     &lt;enumeration value="RTRR"/&gt;
 *     &lt;enumeration value="RTRI"/&gt;
 *     &lt;enumeration value="REVI"/&gt;
 *     &lt;enumeration value="REVR"/&gt;
 *     &lt;enumeration value="SERI"/&gt;
 *     &lt;enumeration value="SERR"/&gt;
 *     &lt;enumeration value="VERI"/&gt;
 *     &lt;enumeration value="VERR"/&gt;
 *     &lt;enumeration value="AMDT"/&gt;
 *     &lt;enumeration value="ATHI"/&gt;
 *     &lt;enumeration value="ATHR"/&gt;
 *     &lt;enumeration value="BAMI"/&gt;
 *     &lt;enumeration value="BAMR"/&gt;
 *     &lt;enumeration value="BATI"/&gt;
 *     &lt;enumeration value="ADDI"/&gt;
 *     &lt;enumeration value="ADDR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
