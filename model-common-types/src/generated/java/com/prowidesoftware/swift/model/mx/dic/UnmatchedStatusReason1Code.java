
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnmatchedStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnmatchedStatusReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CMIS"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="DELN"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="CADE"/>
 *     <enumeration value="SETR"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="VASU"/>
 *     <enumeration value="DTRA"/>
 *     <enumeration value="RSPR"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="CLAT"/>
 *     <enumeration value="RERT"/>
 *     <enumeration value="REPA"/>
 *     <enumeration value="REPP"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="IIND"/>
 *     <enumeration value="FRAP"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="PODU"/>
 *     <enumeration value="FORF"/>
 *     <enumeration value="REGD"/>
 *     <enumeration value="RTGS"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="CPCA"/>
 *     <enumeration value="CHAR"/>
 *     <enumeration value="IEXE"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="NMAS"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="ICUS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnmatchedStatusReason1Code")
@XmlEnum
public enum UnmatchedStatusReason1Code {


    /**
     * Matching instruction from the counterparty could not be found.
     * 
     */
    CMIS,

    /**
     * Counterparty disagrees with the settlement date/time.
     * 
     */
    DDAT,

    /**
     * Counterparty expects a delivery not a receipt, or counterparty expects a receipt not a delivery.
     * 
     */
    DELN,

    /**
     * Counterparty disagrees with the place of settlement.
     * 
     */
    DEPT,

    /**
     * Counterparty disagrees with the settlement amount.
     * 
     */
    DMON,

    /**
     * Counterparty disagrees with the deal price.
     * 
     */
    DDEA,

    /**
     * Counterparty disagrees with the quantity of the financial instrument.
     * 
     */
    DQUA,

    /**
     * Repurchase call delay does not match.
     * 
     */
    CADE,

    /**
     * Settlement transaction type does not match.
     * 
     */
    SETR,

    /**
     * Counterparty disagrees with the security/issue, eg, ISIN or a financial instrument attribute differs.
     * 
     */
    DSEC,

    /**
     * Variable rate support does not match.
     * 
     */
    VASU,

    /**
     * Counterparty does not recognise the transaction.
     * 
     */
    DTRA,

    /**
     * Repurchase spread rate does not match.
     * 
     */
    RSPR,

    /**
     * Repurchase rate does not match.
     * 
     */
    REPO,

    /**
     * Counterparty's instruction was too late.
     * 
     */
    CLAT,

    /**
     * Repurchase rate type does not match.
     * 
     */
    RERT,

    /**
     * Repurchase amount does not match.
     * 
     */
    REPA,

    /**
     * Repurchase premium amount does not match.
     * 
     */
    REPP,

    /**
     * Counterparty's instructions is for physical settlement, and yours is not, or vice versa.
     * 
     */
    PHYS,

    /**
     * Counterparty disagrees with the common reference.
     * 
     */
    IIND,

    /**
     * Counterparty's instructions is for free settlement, and yours is for settlement against payment, or vice versa.
     * 
     */
    FRAP,

    /**
     * Place of trade does not match.
     * 
     */
    PLCE,

    /**
     * Instruction is a possible duplicate.
     * 
     */
    PODU,

    /**
     * Repurchase forfeit amount does not match.
     * 
     */
    FORF,

    /**
     * Discrepancies exist in the registration details linked to the transaction.
     * 
     */
    REGD,

    /**
     * Counterparty indicates a settlement via RTGS system and you indicate non-RTGS settlement, or vice versa.
     * 
     */
    RTGS,

    /**
     * Counterparty indicated an incorrect delivery or receiving agent.
     * 
     */
    ICAG,

    /**
     * Counterparty has cancelled the transaction/instruction.
     * 
     */
    CPCA,

    /**
     * Counterparty disagrees on the amount of charges.
     * 
     */
    CHAR,

    /**
     * Instruction indicates an incorrect buyer (receiver) or seller (deliverer).
     * 
     */
    IEXE,

    /**
     * Counterparty disagrees with the currency of the settlement amount.
     * 
     */
    NCRR,

    /**
     * Matching process has not yet started.
     * 
     */
    NMAS,

    /**
     * Safekeeping account used as a matching criteria on the market concerned does not match.
     * 
     */
    SAFE,

    /**
     * Counterparty disagrees with the trade date.
     * 
     */
    DTRD,

    /**
     * Instruction received too late for matching.
     * 
     */
    LATE,

    /**
     * Closing date/time does not match.
     * 
     */
    TERM,

    /**
     * Incorrect delivering or receiving custodian.
     * 
     */
    ICUS;

    public String value() {
        return name();
    }

    public static UnmatchedStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
