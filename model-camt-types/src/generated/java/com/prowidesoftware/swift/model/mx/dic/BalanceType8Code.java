
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceType8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BalanceType8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OPBD"/&gt;
 *     &lt;enumeration value="ITBD"/&gt;
 *     &lt;enumeration value="CLBD"/&gt;
 *     &lt;enumeration value="XPCD"/&gt;
 *     &lt;enumeration value="OPAV"/&gt;
 *     &lt;enumeration value="ITAV"/&gt;
 *     &lt;enumeration value="CLAV"/&gt;
 *     &lt;enumeration value="FWAV"/&gt;
 *     &lt;enumeration value="PRCD"/&gt;
 *     &lt;enumeration value="IOPA"/&gt;
 *     &lt;enumeration value="IITA"/&gt;
 *     &lt;enumeration value="ICLA"/&gt;
 *     &lt;enumeration value="IFWA"/&gt;
 *     &lt;enumeration value="ICLB"/&gt;
 *     &lt;enumeration value="IITB"/&gt;
 *     &lt;enumeration value="IOPB"/&gt;
 *     &lt;enumeration value="IXPC"/&gt;
 *     &lt;enumeration value="DOPA"/&gt;
 *     &lt;enumeration value="DITA"/&gt;
 *     &lt;enumeration value="DCLA"/&gt;
 *     &lt;enumeration value="DFWA"/&gt;
 *     &lt;enumeration value="DCLB"/&gt;
 *     &lt;enumeration value="DITB"/&gt;
 *     &lt;enumeration value="DOPB"/&gt;
 *     &lt;enumeration value="DXPC"/&gt;
 *     &lt;enumeration value="COPA"/&gt;
 *     &lt;enumeration value="CITA"/&gt;
 *     &lt;enumeration value="CCLA"/&gt;
 *     &lt;enumeration value="CFWA"/&gt;
 *     &lt;enumeration value="CCLB"/&gt;
 *     &lt;enumeration value="CITB"/&gt;
 *     &lt;enumeration value="COPB"/&gt;
 *     &lt;enumeration value="CXPC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BalanceType8Code")
@XmlEnum
public enum BalanceType8Code {


    /**
     * Book balance of the account at the beginning of the account reporting period.  It always equals the closing book balance from the previous report.
     * 
     */
    OPBD,

    /**
     * Balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.
     * 
     */
    ITBD,

    /**
     * Balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period.
     * 
     */
    CLBD,

    /**
     * Balance, composed of booked entries and pending items known at the time of calculation , which projects the end of day balance if everything is booked on the account and no other entry is posted.
     * 
     */
    XPCD,

    /**
     * Opening balance of amount of money that is at the disposal of the account owner on the date specified.
     * 
     */
    OPAV,

    /**
     * Available balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.
     * 
     */
    ITAV,

    /**
     * Closing balance of amount of money that is at the disposal of the account owner on the date specified.
     * 
     */
    CLAV,

    /**
     * Forward available balance of money that is at the disposal of the account owner on the date specified.
     * 
     */
    FWAV,

    /**
     * Balance of the account at the previously closed account reporting period. The opening booked balance for the new period has to be equal to this balance. 
     * 
     * Usage: the previously booked closing balance should equal (inclusive date) the booked closing balance of the date it references and equal the actual booked opening balance of the current date.
     * 
     */
    PRCD,

    /**
     * Investment opening balance of amount of money that is at the disposal of the account owner on the date specified.
     * 
     */
    IOPA,

    /**
     * Investment available balance for calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.
     * 
     */
    IITA,

    /**
     * Investment closing balance of an amount of money that is at the disposal of the account owner on the date specified.
     * 
     */
    ICLA,

    /**
     * Investment forward available balance of money that is at the disposal of the account owner on the date specified.
     * 
     */
    IFWA,

    /**
     * Investment (mutual funds) balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period.
     * 
     */
    ICLB,

    /**
     * Investment balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.
     * 
     */
    IITB,

    /**
     * Investment book balance of the account at the beginning of the account reporting period.  It always equals the closing book balance from the previous report.
     * 
     */
    IOPB,

    /**
     * Investment balance, composed of booked entries and pending items known at the time of calculation , which projects the end of day balance if everything is booked on the account and no other entry is posted.
     * 
     */
    IXPC,

    /**
     * Disbursement opening balance of amount of money that is at the disposal of the account owner on the date specified.
     * 
     */
    DOPA,

    /**
     * Disbursement available balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.
     * 
     */
    DITA,

    /**
     * Disbursement closing balance of amount of money that is at the disposal of the account owner on the date specified.
     * 
     */
    DCLA,

    /**
     * Disbursement forward available balance of money that is at the disposal of the account owner on the date specified.
     * 
     */
    DFWA,

    /**
     * Disbursement balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period.
     * 
     */
    DCLB,

    /**
     * Disbursement balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.
     * 
     */
    DITB,

    /**
     * Disbursement book balance of the account at the beginning of the account reporting period.  It always equals the closing book balance from the previous report.
     * 
     */
    DOPB,

    /**
     * Disbursement balance, composed of booked entries and pending items known at the time of calculation , which projects the end of day balance if everything is booked on the account and no other entry is posted.
     * 
     */
    DXPC,

    /**
     * Collection opening balance of amount of money that is at the disposal of the account owner on the date specified.
     * 
     */
    COPA,

    /**
     * Collection available balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.
     * 
     */
    CITA,

    /**
     * Collection closing balance of amount of money that is at the disposal of the account owner on the date specified.
     * 
     */
    CCLA,

    /**
     * Collection forward available balance of money that is at the disposal of the account owner on the date specified.
     * 
     */
    CFWA,

    /**
     * Collection balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period.
     * 
     */
    CCLB,

    /**
     * Collection balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.
     * 
     */
    CITB,

    /**
     * Collection book balance of the account at the beginning of the account reporting period.  It always equals the closing book balance from the previous report.
     * 
     */
    COPB,

    /**
     * Collection balance, composed of booked entries and pending items known at the time of calculation , which projects the end of day balance if everything is booked on the account and no other entry is posted.
     * 
     */
    CXPC;

    public String value() {
        return name();
    }

    public static BalanceType8Code fromValue(String v) {
        return valueOf(v);
    }

}
