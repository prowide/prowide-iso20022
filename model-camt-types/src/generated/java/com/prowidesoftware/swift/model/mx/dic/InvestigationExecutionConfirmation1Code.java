
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestigationExecutionConfirmation1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestigationExecutionConfirmation1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CNCL"/>
 *     <enumeration value="MODI"/>
 *     <enumeration value="ACDA"/>
 *     <enumeration value="IPAY"/>
 *     <enumeration value="ICOV"/>
 *     <enumeration value="MCOV"/>
 *     <enumeration value="IPYI"/>
 *     <enumeration value="INFO"/>
 *     <enumeration value="CONF"/>
 *     <enumeration value="CWFW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestigationExecutionConfirmation1Code")
@XmlEnum
public enum InvestigationExecutionConfirmation1Code {


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
     * Used when a creditor accepts the debit authorisation.
     * 
     */
    ACDA,

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
     * Used when a payment instruction (eg. MT103) has been initiated to resolve a case.
     * 
     */
    IPYI,

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
    CWFW;

    public String value() {
        return name();
    }

    public static InvestigationExecutionConfirmation1Code fromValue(String v) {
        return valueOf(v);
    }

}
