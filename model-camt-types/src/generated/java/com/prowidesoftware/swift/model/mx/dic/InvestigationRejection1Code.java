
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestigationRejection1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestigationRejection1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NFND"/&gt;
 *     &lt;enumeration value="NAUT"/&gt;
 *     &lt;enumeration value="UKNW"/&gt;
 *     &lt;enumeration value="PCOR"/&gt;
 *     &lt;enumeration value="WMSG"/&gt;
 *     &lt;enumeration value="RNCR"/&gt;
 *     &lt;enumeration value="MROI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvestigationRejection1Code")
@XmlEnum
public enum InvestigationRejection1Code {


    /**
     * Underlying instruction can not be found.
     * 
     */
    NFND,

    /**
     * Case assignee is not allowed to investigate on this instruction or a party has been by-passed in the payment chain or no bilateral agreement has been established for this type of query.
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
    PCOR,

    /**
     * Wrong message has been used in the investigation workflow.
     * 
     */
    WMSG,

    /**
     * Used to reject a non-cash related query that is not covered in the workflow.
     * 
     */
    RNCR,

    /**
     * Resolution of Investigation has not been received on reopened case.
     * 
     */
    MROI;

    public String value() {
        return name();
    }

    public static InvestigationRejection1Code fromValue(String v) {
        return valueOf(v);
    }

}
