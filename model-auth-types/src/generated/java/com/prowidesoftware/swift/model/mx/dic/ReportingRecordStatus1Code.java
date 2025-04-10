
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportingRecordStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReportingRecordStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACPT"/>
 *     <enumeration value="ACPD"/>
 *     <enumeration value="PDNG"/>
 *     <enumeration value="RCVD"/>
 *     <enumeration value="RJCT"/>
 *     <enumeration value="RJPD"/>
 *     <enumeration value="WARN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReportingRecordStatus1Code")
@XmlEnum
public enum ReportingRecordStatus1Code {


    /**
     * Record has been accepted.
     * 
     */
    ACPT,

    /**
     * Record has been accepted, following a pending status.
     * 
     */
    ACPD,

    /**
     * Processing of the record is pending (some validation rules have been executed but some have not and the final status is not known yet).
     * 
     */
    PDNG,

    /**
     * Recrod has been received but not processed yet.
     * 
     */
    RCVD,

    /**
     * Record has been rejected.
     * 
     */
    RJCT,

    /**
     * Record has been rejected, following a pending status.
     * 
     */
    RJPD,

    /**
     * Record has been accepted with warnings.
     * 
     */
    WARN;

    public String value() {
        return name();
    }

    public static ReportingRecordStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
