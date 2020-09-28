
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnmatchedStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnmatchedStatusReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CMIS"/&gt;
 *     &lt;enumeration value="DDAT"/&gt;
 *     &lt;enumeration value="DELN"/&gt;
 *     &lt;enumeration value="DEPT"/&gt;
 *     &lt;enumeration value="DMON"/&gt;
 *     &lt;enumeration value="DDEA"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="CADE"/&gt;
 *     &lt;enumeration value="SETR"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="VASU"/&gt;
 *     &lt;enumeration value="DTRA"/&gt;
 *     &lt;enumeration value="RSPR"/&gt;
 *     &lt;enumeration value="REPO"/&gt;
 *     &lt;enumeration value="CLAT"/&gt;
 *     &lt;enumeration value="RERT"/&gt;
 *     &lt;enumeration value="REPA"/&gt;
 *     &lt;enumeration value="REPP"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *     &lt;enumeration value="IIND"/&gt;
 *     &lt;enumeration value="FRAP"/&gt;
 *     &lt;enumeration value="PLCE"/&gt;
 *     &lt;enumeration value="PODU"/&gt;
 *     &lt;enumeration value="FORF"/&gt;
 *     &lt;enumeration value="REGD"/&gt;
 *     &lt;enumeration value="RTGS"/&gt;
 *     &lt;enumeration value="ICAG"/&gt;
 *     &lt;enumeration value="CPCA"/&gt;
 *     &lt;enumeration value="CHAR"/&gt;
 *     &lt;enumeration value="IEXE"/&gt;
 *     &lt;enumeration value="NCRR"/&gt;
 *     &lt;enumeration value="NMAS"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="DTRD"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="TERM"/&gt;
 *     &lt;enumeration value="ICUS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * Safekeeping account used as a matching criteria on the market concerned  does not match.
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
