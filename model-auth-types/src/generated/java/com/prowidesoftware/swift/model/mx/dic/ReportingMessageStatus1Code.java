
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportingMessageStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReportingMessageStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACPT"/>
 *     <enumeration value="ACTC"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="RCVD"/>
 *     <enumeration value="RJCT"/>
 *     <enumeration value="RMDR"/>
 *     <enumeration value="WARN"/>
 *     <enumeration value="INCF"/>
 *     <enumeration value="CRPT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReportingMessageStatus1Code")
@XmlEnum
public enum ReportingMessageStatus1Code {


    /**
     * Whole message has been accepted.
     * 
     */
    ACPT,

    /**
     * Message has passed syntactical validation but further validations have not been completed yet.
     * 
     */
    ACTC,

    /**
     * Message has been partially accepted. A number of transactions have been accepted, whereas another number of transactions have not yet been accepted.
     * 
     */
    PART,

    /**
     * Message has been received but not processed yet.
     * 
     */
    RCVD,

    /**
     * Message has been rejected.
     * 
     */
    RJCT,

    /**
     * Reminder of a non received message.
     * 
     */
    RMDR,

    /**
     * Message has been accepted with warnings.
     * 
     */
    WARN,

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

    public static ReportingMessageStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
