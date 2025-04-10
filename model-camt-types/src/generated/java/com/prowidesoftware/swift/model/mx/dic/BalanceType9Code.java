
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceType9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BalanceType9Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPBD"/>
 *     <enumeration value="ITBD"/>
 *     <enumeration value="CLBD"/>
 *     <enumeration value="OPAV"/>
 *     <enumeration value="ITAV"/>
 *     <enumeration value="CLAV"/>
 *     <enumeration value="FWAV"/>
 *     <enumeration value="PRCD"/>
 *     <enumeration value="IOPA"/>
 *     <enumeration value="IITA"/>
 *     <enumeration value="ICLA"/>
 *     <enumeration value="IFWA"/>
 *     <enumeration value="ICLB"/>
 *     <enumeration value="IITB"/>
 *     <enumeration value="IOPB"/>
 *     <enumeration value="DOPA"/>
 *     <enumeration value="DITA"/>
 *     <enumeration value="DCLA"/>
 *     <enumeration value="DFWA"/>
 *     <enumeration value="DCLB"/>
 *     <enumeration value="DITB"/>
 *     <enumeration value="DOPB"/>
 *     <enumeration value="COPA"/>
 *     <enumeration value="CITA"/>
 *     <enumeration value="CCLA"/>
 *     <enumeration value="CFWA"/>
 *     <enumeration value="CCLB"/>
 *     <enumeration value="CITB"/>
 *     <enumeration value="COPB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BalanceType9Code")
@XmlEnum
public enum BalanceType9Code {


    /**
     * Book balance of the account at the beginning of the account reporting period. It always equals the closing book balance from the previous report.
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
     * Investment book balance of the account at the beginning of the account reporting period. It always equals the closing book balance from the previous report.
     * 
     */
    IOPB,

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
     * Disbursement book balance of the account at the beginning of the account reporting period. It always equals the closing book balance from the previous report.
     * 
     */
    DOPB,

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
     * Collection book balance of the account at the beginning of the account reporting period. It always equals the closing book balance from the previous report.
     * 
     */
    COPB;

    public String value() {
        return name();
    }

    public static BalanceType9Code fromValue(String v) {
        return valueOf(v);
    }

}
