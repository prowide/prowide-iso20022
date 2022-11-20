
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstrumentSubStructureType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InstrumentSubStructureType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABSE"/&gt;
 *     &lt;enumeration value="AIRT"/&gt;
 *     &lt;enumeration value="AUTT"/&gt;
 *     &lt;enumeration value="CBOB"/&gt;
 *     &lt;enumeration value="CDOB"/&gt;
 *     &lt;enumeration value="CLNO"/&gt;
 *     &lt;enumeration value="CLOB"/&gt;
 *     &lt;enumeration value="CMBS"/&gt;
 *     &lt;enumeration value="CSMR"/&gt;
 *     &lt;enumeration value="CRCT"/&gt;
 *     &lt;enumeration value="HELO"/&gt;
 *     &lt;enumeration value="LPNO"/&gt;
 *     &lt;enumeration value="PFAB"/&gt;
 *     &lt;enumeration value="PYRT"/&gt;
 *     &lt;enumeration value="REPK"/&gt;
 *     &lt;enumeration value="RMBS"/&gt;
 *     &lt;enumeration value="SCBO"/&gt;
 *     &lt;enumeration value="STRB"/&gt;
 *     &lt;enumeration value="STUT"/&gt;
 *     &lt;enumeration value="WBSE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
