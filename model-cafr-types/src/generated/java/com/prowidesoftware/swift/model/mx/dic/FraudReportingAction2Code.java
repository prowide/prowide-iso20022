
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FraudReportingAction2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FraudReportingAction2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DUPL"/>
 *     <enumeration value="CLSE"/>
 *     <enumeration value="NEWF"/>
 *     <enumeration value="REOP"/>
 *     <enumeration value="UPDT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FraudReportingAction2Code")
@XmlEnum
public enum FraudReportingAction2Code {


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

    public static FraudReportingAction2Code fromValue(String v) {
        return valueOf(v);
    }

}
