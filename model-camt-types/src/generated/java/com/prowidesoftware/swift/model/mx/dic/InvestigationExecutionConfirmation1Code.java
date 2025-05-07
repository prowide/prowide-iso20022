
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestigationExecutionConfirmation1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestigationExecutionConfirmation1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CNCL"/&gt;
 *     &lt;enumeration value="MODI"/&gt;
 *     &lt;enumeration value="ACDA"/&gt;
 *     &lt;enumeration value="IPAY"/&gt;
 *     &lt;enumeration value="ICOV"/&gt;
 *     &lt;enumeration value="MCOV"/&gt;
 *     &lt;enumeration value="IPYI"/&gt;
 *     &lt;enumeration value="INFO"/&gt;
 *     &lt;enumeration value="CONF"/&gt;
 *     &lt;enumeration value="CWFW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
