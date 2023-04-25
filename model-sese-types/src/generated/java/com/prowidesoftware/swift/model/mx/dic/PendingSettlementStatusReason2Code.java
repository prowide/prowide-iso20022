
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingSettlementStatusReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingSettlementStatusReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AWSH"/>
 *     <enumeration value="BLOC"/>
 *     <enumeration value="CAIS"/>
 *     <enumeration value="CLAC"/>
 *     <enumeration value="DOCC"/>
 *     <enumeration value="DOCY"/>
 *     <enumeration value="IAAD"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LINK"/>
 *     <enumeration value="PHCK"/>
 *     <enumeration value="PHSE"/>
 *     <enumeration value="SBLO"/>
 *     <enumeration value="MINF"/>
 *     <enumeration value="ACOP"/>
 *     <enumeration value="IINV"/>
 *     <enumeration value="CINV"/>
 *     <enumeration value="AINV"/>
 *     <enumeration value="WTRF"/>
 *     <enumeration value="USUA"/>
 *     <enumeration value="ASTA"/>
 *     <enumeration value="AFST"/>
 *     <enumeration value="STST"/>
 *     <enumeration value="LPRO"/>
 *     <enumeration value="ADRQ"/>
 *     <enumeration value="ADS1"/>
 *     <enumeration value="ADS2"/>
 *     <enumeration value="DRJC"/>
 *     <enumeration value="CYIN"/>
 *     <enumeration value="CYDV"/>
 *     <enumeration value="OVER"/>
 *     <enumeration value="WCPA"/>
 *     <enumeration value="SDUT"/>
 *     <enumeration value="TAPR"/>
 *     <enumeration value="XCNF"/>
 *     <enumeration value="ESCA"/>
 *     <enumeration value="NRCP"/>
 *     <enumeration value="FVER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingSettlementStatusReason2Code")
@XmlEnum
public enum PendingSettlementStatusReason2Code {


    /**
     * Securities have not yet been received from the counterparty.
     * 
     */
    AWSH("AWSH"),

    /**
     * Your account is blocked, no instruction can settle over the account.
     * 
     */
    BLOC("BLOC"),

    /**
     * Awaiting securities from corporate action issue or other procedures, for example, conversion, dematerialisation, exchange, registration, stamping, splitting, etc.
     * 
     */
    CAIS("CAIS"),

    /**
     * Insufficient deliverable securities in the counterparty's account, or counterparty does not hold the securities.
     * 
     */
    CLAC("CLAC"),

    /**
     * Awaiting documents or endorsements from the counterparty.
     * 
     */
    DOCC("DOCC"),

    /**
     * Awaiting documents or endorsements from you.
     * 
     */
    DOCY("DOCY"),

    /**
     * Pending reason is being investigated.
     * 
     */
    IAAD("IAAD"),

    /**
     * Insufficient deliverable securities in your account.
     * 
     */
    LACK("LACK"),

    /**
     * Your instruction is pending settlement because the instruction linked to it is pending.
     * 
     */
    LINK("LINK"),

    /**
     * Physical shares have been received and are being checked for authenticity.
     * 
     */
    PHCK("PHCK"),

    /**
     * Settlement is physical and securities are being delivered.
     * 
     */
    PHSE("PHSE"),

    /**
     * Settlement is pending. The securities are blocked due to, for example, a corporate action event, re-alignment.
     * 
     */
    SBLO("SBLO"),

    /**
     * Information, for example, telephone number, contact person, is missing.
     * 
     */
    MINF("MINF"),

    /**
     * Account must already be opened in order to process the transfer.
     * 
     */
    ACOP("ACOP"),

    /**
     * Intermediary is investigating the reason why the transfer is pending.
     * 
     */
    IINV("IINV"),

    /**
     * Client has been informed of a problem and is investigating.
     * 
     */
    CINV("CINV"),

    /**
     * Transfer agent is investigating.
     * 
     */
    AINV("AINV"),

    /**
     * Transfer is being processed by the transfer agent, awaiting status from transfer agent.
     * 
     */
    WTRF("WTRF"),

    /**
     * Usual transfer agent's processing timeframe.
     * 
     */
    USUA("USUA"),

    /**
     * At your request, the Intermediary is checking the status of your instruction with the transfer agent.
     * 
     */
    ASTA("ASTA"),

    /**
     * Application form has been sent to the transfer agent.
     * 
     */
    AFST("AFST"),

    /**
     * Stock transfer form has been sent to the counterparty to sign and forward to the transfer agent.
     * 
     */
    STST("STST"),

    /**
     * Longer processing timeframe for this type of transfer, due to documentation requirements.
     * 
     */
    LPRO("LPRO"),

    /**
     * Additional documents have been requested by the transfer agent.
     * 
     */
    ADRQ("ADRQ"),

    /**
     * Additional documents have been sent.
     * 
     */
    @XmlEnumValue("ADS1")
    ADS_1("ADS1"),

    /**
     * Upon request of the transfer agent, the intermediary has sent additional documents. The transfer agent has confirmed that all the necessary information is now in place.
     * 
     */
    @XmlEnumValue("ADS2")
    ADS_2("ADS2"),

    /**
     * Documents are rejected by the transfer agent.
     * 
     */
    DRJC("DRJC"),

    /**
     * Counterparty has not sent an instruction to receive. Check with counterparty.
     * 
     */
    CYIN("CYIN"),

    /**
     * Counterparty has not sent an instruction to deliver or delivered the shares. Check with counterparty.
     * 
     */
    CYDV("CYDV"),

    /**
     * Normal processing period for the instruction has lapsed. The transfer agent has been or will be contacted.
     * 
     */
    OVER("OVER"),

    /**
     * Wrong counterparty account details.
     * 
     */
    WCPA("WCPA"),

    /**
     * Instruction is pending as stamp duty information is missing.
     * 
     */
    SDUT("SDUT"),

    /**
     * Transfer is being processed by transfer agent.
     * 
     */
    TAPR("TAPR"),

    /**
     * Confirmation is expected from transfer agent.
     * 
     */
    XCNF("XCNF"),

    /**
     * Special follow-up is taking place.
     * 
     */
    ESCA("ESCA"),

    /**
     * Transfer agent claims non-receipt of physical shares.
     * 
     */
    NRCP("NRCP"),

    /**
     * Confirmed but finality is to be verified.
     * 
     */
    FVER("FVER");
    private final String value;

    PendingSettlementStatusReason2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PendingSettlementStatusReason2Code fromValue(String v) {
        for (PendingSettlementStatusReason2Code c: PendingSettlementStatusReason2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
