
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportingWaiverType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReportingWaiverType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OILQ"/>
 *     <enumeration value="NLIQ"/>
 *     <enumeration value="PRIC"/>
 *     <enumeration value="ILQD"/>
 *     <enumeration value="RFPT"/>
 *     <enumeration value="SIZE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReportingWaiverType1Code")
@XmlEnum
public enum ReportingWaiverType1Code {


    /**
     * Pre-trade waiver was for a negotiated transaction in illiquid financial instruments. Applicable to equity instruments.
     * 
     */
    OILQ,

    /**
     * Pre-trade waiver was for a negotiated transaction in liquid financial instruments. Applicable to equity instruments.
     * 
     */
    NLIQ,

    /**
     * Pre-trade waiver was for a negotiated transaction subject to conditions other than the current market price of that financial instruments. Applicable to equity instruments.
     * 
     */
    PRIC,

    /**
     * Pre-trade waiver was for an illiquid instrument transaction. Applicable to non-equity instruments.
     * 
     */
    ILQD,

    /**
     * Pre-trade waiver was for a reference price transaction. Applicable to equity instruments.
     * 
     */
    RFPT,

    /**
     * Pre-trade waiver was for an above specific size transaction. Applicable to non-equity instruments.
     * 
     */
    SIZE;

    public String value() {
        return name();
    }

    public static ReportingWaiverType1Code fromValue(String v) {
        return valueOf(v);
    }

}
