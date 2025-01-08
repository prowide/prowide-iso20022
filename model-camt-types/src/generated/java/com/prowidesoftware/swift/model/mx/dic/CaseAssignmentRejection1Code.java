
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseAssignmentRejection1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CaseAssignmentRejection1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NFND"/>
 *     <enumeration value="NAUT"/>
 *     <enumeration value="UKNW"/>
 *     <enumeration value="RJCT"/>
 *     <enumeration value="CNCL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CaseAssignmentRejection1Code")
@XmlEnum
public enum CaseAssignmentRejection1Code {


    /**
     * Underlying instruction can not be found.
     * 
     */
    NFND,

    /**
     * Case Assignee is not allowed to investigate on this instruction (eg. Case Assignee is not the next party in the payment chain).
     * 
     */
    NAUT,

    /**
     * Case has never been assigned before.
     * 
     */
    UKNW,

    /**
     * Used when the payment instruction has been rejected.
     * 
     */
    RJCT,

    /**
     * Used when the payment instruction has been cancelled.
     * 
     */
    CNCL;

    public String value() {
        return name();
    }

    public static CaseAssignmentRejection1Code fromValue(String v) {
        return valueOf(v);
    }

}
