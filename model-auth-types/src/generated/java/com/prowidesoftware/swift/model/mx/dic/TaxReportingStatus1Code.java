
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxReportingStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxReportingStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACPT"/>
 *     <enumeration value="RCVD"/>
 *     <enumeration value="RJCT"/>
 *     <enumeration value="INCF"/>
 *     <enumeration value="CRPT"/>
 *     <enumeration value="WARN"/>
 *     <enumeration value="ACTC"/>
 *     <enumeration value="PART"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxReportingStatus1Code")
@XmlEnum
public enum TaxReportingStatus1Code {


    /**
     * Transaction or report has been accepted.
     * 
     */
    ACPT,

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
     * File containing the report has an incorrect filename.
     * 
     */
    INCF,

    /**
     * File containing the report is corrupted.
     * 
     */
    CRPT,

    /**
     * Transaction has been accepted with warnings.
     * 
     */
    WARN,

    /**
     * Transaction or report has passed syntactical and semantical validation.
     * 
     */
    ACTC,

    /**
     * Report has been partially accepted. A number of transactions have been accepted, whereas another number of transactions have not yet been accepted.
     * 
     */
    PART;

    public String value() {
        return name();
    }

    public static TaxReportingStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
