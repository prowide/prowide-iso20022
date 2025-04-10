
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FraudReportingAction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FraudReportingAction1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DUPL"/>
 *     <enumeration value="CLSE"/>
 *     <enumeration value="NEWF"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="REOP"/>
 *     <enumeration value="UPDT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FraudReportingAction1Code")
@XmlEnum
public enum FraudReportingAction1Code {


    /**
     * Fraud information already reported.
     * 
     */
    DUPL,

    /**
     * Closing a previously reported fraud.
     * 
     */
    CLSE,

    /**
     * New fraud information not reported yet.
     * 
     */
    NEWF,

    /**
     * Other process about a fraud already reported defined at national level.
     * 
     */
    OTHN,

    /**
     * Other process about a fraud already reported defined at private level.
     * 
     */
    OTHP,

    /**
     * Reopen a previously closed reported fraud case
     * 
     */
    REOP,

    /**
     * Update information about a fraud already reported.
     * 
     */
    UPDT;

    public String value() {
        return name();
    }

    public static FraudReportingAction1Code fromValue(String v) {
        return valueOf(v);
    }

}
