
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoldingRejectionReason41Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="HoldingRejectionReason41Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INPR"/>
 *     <enumeration value="INID"/>
 *     <enumeration value="AGIN"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="CERT"/>
 *     <enumeration value="BPAR"/>
 *     <enumeration value="BREF"/>
 *     <enumeration value="DADR"/>
 *     <enumeration value="DCUS"/>
 *     <enumeration value="IACT"/>
 *     <enumeration value="INVA"/>
 *     <enumeration value="INDT"/>
 *     <enumeration value="OPTI"/>
 *     <enumeration value="OPTY"/>
 *     <enumeration value="INMO"/>
 *     <enumeration value="INVM"/>
 *     <enumeration value="INUS"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="ENDP"/>
 *     <enumeration value="STAR"/>
 *     <enumeration value="SECO"/>
 *     <enumeration value="NOHO"/>
 *     <enumeration value="NINS"/>
 *     <enumeration value="NOAP"/>
 *     <enumeration value="NAUT"/>
 *     <enumeration value="AGID"/>
 *     <enumeration value="DISP"/>
 *     <enumeration value="CORR"/>
 *     <enumeration value="INPS"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="PRIC"/>
 *     <enumeration value="IVAG"/>
 *     <enumeration value="QUNP"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="EQTY"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="RCUS"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="TQNP"/>
 *     <enumeration value="SETR"/>
 *     <enumeration value="UKWN"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="NARR"/>
 *     <enumeration value="NRGN"/>
 *     <enumeration value="INVB"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="COMC"/>
 *     <enumeration value="CONL"/>
 *     <enumeration value="INHO"/>
 *     <enumeration value="ICOL"/>
 *     <enumeration value="INVE"/>
 *     <enumeration value="INVN"/>
 *     <enumeration value="INVL"/>
 *     <enumeration value="VALR"/>
 *     <enumeration value="INUK"/>
 *     <enumeration value="LATT"/>
 *     <enumeration value="MINO"/>
 *     <enumeration value="BOIS"/>
 *     <enumeration value="MCER"/>
 *     <enumeration value="IPOA"/>
 *     <enumeration value="MUNO"/>
 *     <enumeration value="INNA"/>
 *     <enumeration value="NINV"/>
 *     <enumeration value="ELIG"/>
 *     <enumeration value="PERI"/>
 *     <enumeration value="REFE"/>
 *     <enumeration value="SAID"/>
 *     <enumeration value="OWNT"/>
 *     <enumeration value="NTAV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HoldingRejectionReason41Code")
@XmlEnum
public enum HoldingRejectionReason41Code {


    /**
     * Price does not comply with the financial instrument's characteristics.
     * 
     */
    INPR,

    /**
     * Instruction contains an invalid message identification, identification is unknown.
     * 
     */
    INID,

    /**
     * Invalid agent identification supplied.
     * 
     */
    AGIN,

    /**
     * Intermediary is not recognised or is invalid.
     * 
     */
    INTE,

    /**
     * Instruction is rejected since the provided certification is incorrect or incomplete.
     * 
     */
    CERT,

    /**
     * Unrecognised or invalid business partner number.
     * 
     */
    BPAR,

    /**
     * Unrecognised or invalid bank reference number.
     * 
     */
    BREF,

    /**
     * Address details are incorrect or cannot be recognised.
     * 
     */
    DADR,

    /**
     * Unrecognised or invalid delivering custodian.
     * 
     */
    DCUS,

    /**
     * Incorrect activity type specified, for example, pre-release conversion.
     * 
     */
    IACT,

    /**
     * For tax reclaim, the reclaim is invalid for the tax authorities.
     * 
     */
    INVA,

    /**
     * Message details specified in the instruction/request are inconsistent with those that were specified in the relating original message.
     * 
     */
    INDT,

    /**
     * Invalid combination of corporate action option code and corporate action option number.
     * 
     */
    OPTI,

    /**
     * Invalid option type.
     * 
     */
    OPTY,

    /**
     * Details specified in the movement general information block are inconsistent with those that were specified in the relating original message.
     * 
     */
    INMO,

    /**
     * Invalid or unrecognized modification request.
     * 
     */
    INVM,

    /**
     * Underlying security identification does not correspond with the corporate action reference supplied.
     * 
     */
    INUS,

    /**
     * Unrecognised or invalid financial instrument identification.
     * 
     */
    DSEC,

    /**
     * Period ending date or code is missing.
     * 
     */
    ENDP,

    /**
     * Period starting date or code is missing.
     * 
     */
    STAR,

    /**
     * Second option is mandatory.
     * 
     */
    SECO,

    /**
     * No holding for the specified underlying security.
     * 
     */
    NOHO,

    /**
     * Referred instrument does not exist in combination with the mentioned market.
     * 
     */
    NINS,

    /**
     * Instruction type is not applicable for mandatory events.
     * 
     */
    NOAP,

    /**
     * Permission to be processed is not granted.
     * 
     */
    NAUT,

    /**
     * Party is not defined as an agent.
     * 
     */
    AGID,

    /**
     * Disperse security is not eligible in the (ICSD) service provider owner.
     * 
     */
    DISP,

    /**
     * Unable to identify correspondent bank.
     * 
     */
    CORR,

    /**
     * Unrecognised, invalid or missing place of safekeeping.
     * 
     */
    INPS,

    /**
     * Unrecognised or invalid place of trade.
     * 
     */
    PLCE,

    /**
     * Price in the execution exceeds the order price.
     * 
     */
    PRIC,

    /**
     * Receiving agent is not recognised or is invalid.
     * 
     */
    IVAG,

    /**
     * Quantity unit type is not provided.
     * 
     */
    QUNP,

    /**
     * Unrecognised or invalid instructed quantity.
     * 
     */
    DQUA,

    /**
     * Quantity in the execution exceeds the ordered quantity.
     * 
     */
    EQTY,

    /**
     * Unrecognised or invalid depository.
     * 
     */
    DEPT,

    /**
     * Unrecognised or invalid receiving agent.
     * 
     */
    RCUS,

    /**
     * Unrecognised or invalid message sender's safekeeping account.
     * 
     */
    SAFE,

    /**
     * Unrecognised or invalid settlement amount.
     * 
     */
    DMON,

    /**
     * Unrecognised or invalid settlement amount currency.
     * 
     */
    NCRR,

    /**
     * Traded securities quantity not provided.
     * 
     */
    TQNP,

    /**
     * Unrecognised or invalid settlement transaction type.
     * 
     */
    SETR,

    /**
     * Financial instrument's symbol has not been recognized.
     * 
     */
    UKWN,

    /**
     * Unrecognised or invalid deal price.
     * 
     */
    DDEA,

    /**
     * Unrecognised or invalid closing date/time.
     * 
     */
    TERM,

    /**
     * Linked reference is unknown.
     * 
     */
    ULNK,

    /**
     * See narrative field for reason.
     * 
     */
    NARR,

    /**
     * Instruction could not be found.
     * 
     */
    NRGN,

    /**
     * Instruction aims at using an invalid balance.
     * 
     */
    INVB,

    /**
     * Transaction/instruction received after the account servicer's specified deadline.
     * 
     */
    ADEA,

    /**
     * Unrecognised or invalid cash account.
     * 
     */
    CASH,

    /**
     * Unrecognised or invalid commercialisation contract.
     * 
     */
    COMC,

    /**
     * Concentration limit was exceeded.
     * 
     */
    CONL,

    /**
     * Insufficient balance.
     * 
     */
    INHO,

    /**
     * Insufficient collateral proposed.
     * 
     */
    ICOL,

    /**
     * Unrecognised or invalid investor party. May be used by an executing party to reject an instruction for an investor (or portfolio) for which it is not authorised to act.
     * 
     */
    INVE,

    /**
     * Invalid or unrecognized lot number.
     * 
     */
    INVN,

    /**
     * Invalid or unrecognized link.
     * 
     */
    INVL,

    /**
     * Account servicer validation rule rejection.
     * 
     */
    VALR,

    /**
     * Investor name and address is not recognised.
     * 
     */
    INUK,

    /**
     * Instruction/Request arrives too late.
     * 
     */
    LATT,

    /**
     * Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument.
     * 
     */
    MINO,

    /**
     * Rejected due to missing beneficiary owner details.
     * 
     */
    BOIS,

    /**
     * Certification has not been filled in.
     * 
     */
    MCER,

    /**
     * Missing or invalid power of attorney.
     * 
     */
    IPOA,

    /**
     * Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument.
     * 
     */
    MUNO,

    /**
     * Unrecognised or invalid service level agreement pre-agreed narrative information.
     * 
     */
    INNA,

    /**
     * Requested financial instrument is not available.
     * 
     */
    NINV,

    /**
     * Security is not eligible.
     * 
     */
    ELIG,

    /**
     * Period ending date is before period starting date.
     * 
     */
    PERI,

    /**
     * Instruction has a reference identical to another previously received instruction.
     * 
     */
    REFE,

    /**
     * Several messages with the same identification.
     * 
     */
    SAID,

    /**
     * Type of ownership indicated is not correct.
     * 
     */
    OWNT,

    /**
     * Reason is not available or unknown.
     * 
     */
    NTAV;

    public String value() {
        return name();
    }

    public static HoldingRejectionReason41Code fromValue(String v) {
        return valueOf(v);
    }

}
