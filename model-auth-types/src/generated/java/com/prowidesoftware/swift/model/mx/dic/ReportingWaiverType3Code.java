
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportingWaiverType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReportingWaiverType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BENC"/>
 *     <enumeration value="ACTX"/>
 *     <enumeration value="ILQD"/>
 *     <enumeration value="SIZE"/>
 *     <enumeration value="CANC"/>
 *     <enumeration value="AMND"/>
 *     <enumeration value="SDIV"/>
 *     <enumeration value="RPRI"/>
 *     <enumeration value="DUPL"/>
 *     <enumeration value="LRGS"/>
 *     <enumeration value="TNCP"/>
 *     <enumeration value="TPAC"/>
 *     <enumeration value="XFPH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReportingWaiverType3Code")
@XmlEnum
public enum ReportingWaiverType3Code {


    /**
     * Benchmark transaction.
     * 
     */
    BENC,

    /**
     * Agency cross transaction.
     * 
     */
    ACTX,

    /**
     * Pre-trade waiver was for an illiquid instrument transaction. Applicable to non-equity instruments.
     * 
     */
    ILQD,

    /**
     * Pre-trade waiver was for an above specific size transaction. Applicable to non-equity instruments.
     * 
     */
    SIZE,

    /**
     * Cancellations.
     * 
     * 
     */
    CANC,

    /**
     * Amendments.
     * 
     */
    AMND,

    /**
     * Special dividend transactions.
     * 
     * 
     */
    SDIV,

    /**
     * Transactions which have received price improvement. Applicable to equity instruments.
     * 
     */
    RPRI,

    /**
     * Duplicative trade reports.
     * 
     */
    DUPL,

    /**
     * Large-in-scale transactions. Applicable for all instruments.
     * 
     */
    LRGS,

    /**
     * Transactions not contributing to the price discovery process.
     * 
     */
    TNCP,

    /**
     * Package transaction.
     * 
     */
    TPAC,

    /**
     * Transaction where the contract on a commodity is exchanged for the actual physical good.
     * 
     */
    XFPH;

    public String value() {
        return name();
    }

    public static ReportingWaiverType3Code fromValue(String v) {
        return valueOf(v);
    }

}
