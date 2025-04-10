
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportingMessageStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReportingMessageStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACPT"/>
 *     <enumeration value="RJCT"/>
 *     <enumeration value="INCF"/>
 *     <enumeration value="CRPT"/>
 *     <enumeration value="NAUT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
