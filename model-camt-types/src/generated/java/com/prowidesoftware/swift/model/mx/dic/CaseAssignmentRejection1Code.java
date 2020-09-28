
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseAssignmentRejection1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CaseAssignmentRejection1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NFND"/&gt;
 *     &lt;enumeration value="NAUT"/&gt;
 *     &lt;enumeration value="UKNW"/&gt;
 *     &lt;enumeration value="RJCT"/&gt;
 *     &lt;enumeration value="CNCL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
