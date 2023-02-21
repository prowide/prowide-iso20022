
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestigationExecutionConfirmation2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestigationExecutionConfirmation2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CNCL"/&gt;
 *     &lt;enumeration value="MODI"/&gt;
 *     &lt;enumeration value="IPAY"/&gt;
 *     &lt;enumeration value="ICOV"/&gt;
 *     &lt;enumeration value="MCOV"/&gt;
 *     &lt;enumeration value="INFO"/&gt;
 *     &lt;enumeration value="CONF"/&gt;
 *     &lt;enumeration value="CWFW"/&gt;
 *     &lt;enumeration value="MWFW"/&gt;
 *     &lt;enumeration value="UWFW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvestigationExecutionConfirmation2Code")
@XmlEnum
public enum InvestigationExecutionConfirmation2Code {


    /**
     * Used when a requested cancellation is successful.
     * 
     */
    CNCL,

    /**
     * Used when a requested modification is successful.
     * 
     */
    MODI,

    /**
     * Used when the result of an investigation is, or will be, the initiation of a payment instruction.
     * 
     */
    IPAY,

    /**
     * Used when a transfer of funds has been initiated (a cover payment) to resolve a case.
     * 
     */
    ICOV,

    /**
     * Used when a transfer of funds has been modified (a cover payment) to resolve a case.
     * 
     */
    MCOV,

    /**
     * Used when additional information has been sent to the beneficiary of a payment.
     * 
     */
    INFO,

    /**
     * Used when a payment has been checked and was correctly executed without any intervention.
     * 
     */
    CONF,

    /**
     * Used when a payment will be cancelled to solve an investigation case.
     * 
     */
    CWFW,

    /**
     * Used when the payment will be modified to solve an investigation case.
     * 
     */
    MWFW,

    /**
     * Used when sender wants to respond to an assignment with an Unable To Apply workflow.
     * 
     */
    UWFW;

    public String value() {
        return name();
    }

    public static InvestigationExecutionConfirmation2Code fromValue(String v) {
        return valueOf(v);
    }

}
