
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportingMessageStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportingMessageStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACPT"/&gt;
 *     &lt;enumeration value="RJCT"/&gt;
 *     &lt;enumeration value="INCF"/&gt;
 *     &lt;enumeration value="CRPT"/&gt;
 *     &lt;enumeration value="NAUT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReportingMessageStatus2Code")
@XmlEnum
public enum ReportingMessageStatus2Code {


    /**
     * Whole message has been accepted.
     * 
     */
    ACPT,

    /**
     * Message has been rejected.
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
     * Message was rejected due to authorisation/permission issues.
     * 
     */
    NAUT;

    public String value() {
        return name();
    }

    public static ReportingMessageStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
