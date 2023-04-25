
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestigationExecutionConfirmation3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestigationExecutionConfirmation3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CNCL"/>
 *     <enumeration value="MODI"/>
 *     <enumeration value="IPAY"/>
 *     <enumeration value="ICOV"/>
 *     <enumeration value="MCOV"/>
 *     <enumeration value="INFO"/>
 *     <enumeration value="CONF"/>
 *     <enumeration value="CWFW"/>
 *     <enumeration value="MWFW"/>
 *     <enumeration value="UWFW"/>
 *     <enumeration value="PECR"/>
 *     <enumeration value="PDCR"/>
 *     <enumeration value="RJCR"/>
 *     <enumeration value="SMTC"/>
 *     <enumeration value="SMTI"/>
 *     <enumeration value="CHRG"/>
 *     <enumeration value="PURP"/>
 *     <enumeration value="IDUP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestigationExecutionConfirmation3Code")
@XmlEnum
public enum InvestigationExecutionConfirmation3Code {


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
    UWFW,

    /**
     * Used when a requested cancellation has been partially executed.
     * 
     */
    PECR,

    /**
     * Used when a requested cancellation is pending.
     * 
     */
    PDCR,

    /**
     * Used when a requested cancellation has been rejected.
     * 
     */
    RJCR,

    /**
     * Used when the entry in the statement is correct.
     * 
     */
    SMTC,

    /**
     * Used when the entry in the statement is incorrect and further information is provided with the resolution.
     * 
     */
    SMTI,

    /**
     * Further charges details are provided to resolve the case.
     * 
     */
    CHRG,

    /**
     * Further purpose details are provided to resolve the case.
     * 
     */
    PURP,

    /**
     * Used when the requested check for a possible duplicate instruction is confirmed.
     * 
     */
    IDUP;

    public String value() {
        return name();
    }

    public static InvestigationExecutionConfirmation3Code fromValue(String v) {
        return valueOf(v);
    }

}
