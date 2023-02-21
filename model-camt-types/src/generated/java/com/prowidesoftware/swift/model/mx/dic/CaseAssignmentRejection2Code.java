
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseAssignmentRejection2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CaseAssignmentRejection2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NFND"/&gt;
 *     &lt;enumeration value="NAUT"/&gt;
 *     &lt;enumeration value="UKNW"/&gt;
 *     &lt;enumeration value="PCOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CaseAssignmentRejection2Code")
@XmlEnum
public enum CaseAssignmentRejection2Code {


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
     * Used when the payment instruction has previously been cancelled or rejected.
     * 
     */
    PCOR;

    public String value() {
        return name();
    }

    public static CaseAssignmentRejection2Code fromValue(String v) {
        return valueOf(v);
    }

}
