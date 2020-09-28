
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportingWaiverType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportingWaiverType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BENC"/&gt;
 *     &lt;enumeration value="ACTX"/&gt;
 *     &lt;enumeration value="ILQD"/&gt;
 *     &lt;enumeration value="SIZE"/&gt;
 *     &lt;enumeration value="CANC"/&gt;
 *     &lt;enumeration value="AMND"/&gt;
 *     &lt;enumeration value="SDIV"/&gt;
 *     &lt;enumeration value="RPRI"/&gt;
 *     &lt;enumeration value="DUPL"/&gt;
 *     &lt;enumeration value="LRGS"/&gt;
 *     &lt;enumeration value="TNCP"/&gt;
 *     &lt;enumeration value="TPAC"/&gt;
 *     &lt;enumeration value="XFPH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * Amendments
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
     * Duplicative trade reports
     * 
     */
    DUPL,

    /**
     * Large-in-scale transactions.  Applicable for all instruments.
     * 
     */
    LRGS,

    /**
     * Transactions not contributing to the price discovery process.
     * 
     */
    TNCP,

    /**
     * Package transaction
     * 
     */
    TPAC,

    /**
     * Transaction where the contract  on a commodity is exchanged for the actual physical good.
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
