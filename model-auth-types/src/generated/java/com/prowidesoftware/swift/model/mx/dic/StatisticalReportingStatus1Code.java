
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatisticalReportingStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StatisticalReportingStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACPT"/>
 *     <enumeration value="ACTC"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="PDNG"/>
 *     <enumeration value="RCVD"/>
 *     <enumeration value="RJCT"/>
 *     <enumeration value="RMDR"/>
 *     <enumeration value="INCF"/>
 *     <enumeration value="CRPT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StatisticalReportingStatus1Code")
@XmlEnum
public enum StatisticalReportingStatus1Code {


    /**
     * Transaction or report has been accepted.
     * 
     */
    ACPT,

    /**
     * Transaction or report has passed syntactical and semantical validation.
     * 
     */
    ACTC,

    /**
     * Report has been partially accepted. A number of transactions have been accepted, whereas another number of transactions have not yet been accepted.
     * 
     */
    PART,

    /**
     * Processing of transaction or report is pending.
     * 
     */
    PDNG,

    /**
     * Report has been received.
     * 
     */
    RCVD,

    /**
     * Transaction or report has been rejected.
     * 
     */
    RJCT,

    /**
     * Reminder of a non received report.
     * 
     */
    RMDR,

    /**
     * File containing the report has an incorrect filename.
     * 
     */
    INCF,

    /**
     * File containing the report is corrupted.
     * 
     */
    CRPT;

    public String value() {
        return name();
    }

    public static StatisticalReportingStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
