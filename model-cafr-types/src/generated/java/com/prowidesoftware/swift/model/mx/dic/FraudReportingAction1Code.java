
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FraudReportingAction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FraudReportingAction1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DUPL"/&gt;
 *     &lt;enumeration value="CLSE"/&gt;
 *     &lt;enumeration value="NEWF"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="REOP"/&gt;
 *     &lt;enumeration value="UPDT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
