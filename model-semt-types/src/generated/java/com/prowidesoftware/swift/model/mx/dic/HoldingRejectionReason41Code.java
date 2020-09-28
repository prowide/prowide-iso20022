
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoldingRejectionReason41Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HoldingRejectionReason41Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INPR"/&gt;
 *     &lt;enumeration value="INID"/&gt;
 *     &lt;enumeration value="AGIN"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *     &lt;enumeration value="CERT"/&gt;
 *     &lt;enumeration value="BPAR"/&gt;
 *     &lt;enumeration value="BREF"/&gt;
 *     &lt;enumeration value="DADR"/&gt;
 *     &lt;enumeration value="DCUS"/&gt;
 *     &lt;enumeration value="IACT"/&gt;
 *     &lt;enumeration value="INVA"/&gt;
 *     &lt;enumeration value="INDT"/&gt;
 *     &lt;enumeration value="OPTI"/&gt;
 *     &lt;enumeration value="OPTY"/&gt;
 *     &lt;enumeration value="INMO"/&gt;
 *     &lt;enumeration value="INVM"/&gt;
 *     &lt;enumeration value="INUS"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="ENDP"/&gt;
 *     &lt;enumeration value="STAR"/&gt;
 *     &lt;enumeration value="SECO"/&gt;
 *     &lt;enumeration value="NOHO"/&gt;
 *     &lt;enumeration value="NINS"/&gt;
 *     &lt;enumeration value="NOAP"/&gt;
 *     &lt;enumeration value="NAUT"/&gt;
 *     &lt;enumeration value="AGID"/&gt;
 *     &lt;enumeration value="DISP"/&gt;
 *     &lt;enumeration value="CORR"/&gt;
 *     &lt;enumeration value="INPS"/&gt;
 *     &lt;enumeration value="PLCE"/&gt;
 *     &lt;enumeration value="PRIC"/&gt;
 *     &lt;enumeration value="IVAG"/&gt;
 *     &lt;enumeration value="QUNP"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="EQTY"/&gt;
 *     &lt;enumeration value="DEPT"/&gt;
 *     &lt;enumeration value="RCUS"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="DMON"/&gt;
 *     &lt;enumeration value="NCRR"/&gt;
 *     &lt;enumeration value="TQNP"/&gt;
 *     &lt;enumeration value="SETR"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *     &lt;enumeration value="DDEA"/&gt;
 *     &lt;enumeration value="TERM"/&gt;
 *     &lt;enumeration value="ULNK"/&gt;
 *     &lt;enumeration value="NARR"/&gt;
 *     &lt;enumeration value="NRGN"/&gt;
 *     &lt;enumeration value="INVB"/&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="COMC"/&gt;
 *     &lt;enumeration value="CONL"/&gt;
 *     &lt;enumeration value="INHO"/&gt;
 *     &lt;enumeration value="ICOL"/&gt;
 *     &lt;enumeration value="INVE"/&gt;
 *     &lt;enumeration value="INVN"/&gt;
 *     &lt;enumeration value="INVL"/&gt;
 *     &lt;enumeration value="VALR"/&gt;
 *     &lt;enumeration value="INUK"/&gt;
 *     &lt;enumeration value="LATT"/&gt;
 *     &lt;enumeration value="MINO"/&gt;
 *     &lt;enumeration value="BOIS"/&gt;
 *     &lt;enumeration value="MCER"/&gt;
 *     &lt;enumeration value="IPOA"/&gt;
 *     &lt;enumeration value="MUNO"/&gt;
 *     &lt;enumeration value="INNA"/&gt;
 *     &lt;enumeration value="NINV"/&gt;
 *     &lt;enumeration value="ELIG"/&gt;
 *     &lt;enumeration value="PERI"/&gt;
 *     &lt;enumeration value="REFE"/&gt;
 *     &lt;enumeration value="SAID"/&gt;
 *     &lt;enumeration value="OWNT"/&gt;
 *     &lt;enumeration value="NTAV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * Instruction aims at using  an invalid balance.
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
