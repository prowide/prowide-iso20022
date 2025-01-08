
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BalanceType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPNG"/>
 *     <enumeration value="INTM"/>
 *     <enumeration value="CLSG"/>
 *     <enumeration value="BOOK"/>
 *     <enumeration value="CRRT"/>
 *     <enumeration value="PDNG"/>
 *     <enumeration value="LRLD"/>
 *     <enumeration value="AVLB"/>
 *     <enumeration value="LTSF"/>
 *     <enumeration value="CRDT"/>
 *     <enumeration value="EAST"/>
 *     <enumeration value="PYMT"/>
 *     <enumeration value="BLCK"/>
 *     <enumeration value="XPCD"/>
 *     <enumeration value="DLOD"/>
 *     <enumeration value="XCRD"/>
 *     <enumeration value="XDBT"/>
 *     <enumeration value="ADJT"/>
 *     <enumeration value="PRAV"/>
 *     <enumeration value="DBIT"/>
 *     <enumeration value="THRE"/>
 *     <enumeration value="NOTE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BalanceType5Code")
@XmlEnum
public enum BalanceType5Code {


    /**
     * Book balance of the account at the beginning of the account servicer's business day. It always equals the closing book balance from the previous business day. Note: the available balance at the beginning of the account servicer's business day may be different from the closing book balance from the previous business day.
     * 
     */
    OPNG,

    /**
     * Balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.
     * 
     */
    INTM,

    /**
     * Balance of the account at the end of the account servicer's business day. It is the sum of the opening balance at the beginning of the day and all entries booked to the account during the account servicer's business day.
     * 
     */
    CLSG,

    /**
     * Balance that is registered in the books of the account servicer.
     * 
     */
    BOOK,

    /**
     * Balance of the account at a precise moment in time.
     * 
     */
    CRRT,

    /**
     * Balance of securities pending delivery, eg, orders to sell securities have been executed but settlement of the open transactions has not been confirmed.
     * 
     */
    PDNG,

    /**
     * Balance of a specific limit value, eg, a bilateral balance is calculated in relation to a given bilateral limit.
     * 
     */
    LRLD,

    /**
     * Balance of money or securities that is at the disposal of the account owner on the date specified.
     * 
     */
    AVLB,

    /**
     * Balance composed of the sum of all liquidity transfers made to or from an account.
     * 
     */
    LTSF,

    /**
     * Balance representing the sum of all credit entries booked to an account.
     * 
     */
    CRDT,

    /**
     * Balance representing the potential loan a Central Bank would make in cash if the collateral is pledged, eg, securities available and eligible as collateral with the Central Bank.
     * 
     */
    EAST,

    /**
     * Balance representing the sum of entries as a result of payments processing. Entries relating to fees, interest, or other movements not a result of payments sent or received by the account owner are not included.
     * 
     */
    PYMT,

    /**
     * Balance representing the regulatory reserve that a financial institution must have with the account servicing institution, eg, the minimum credit balance a financial institution is to keep with its Central Bank for mandatory reserve purposes. In some countries, a blocked balance is known as a 'reserve' balance.
     * 
     */
    BLCK,

    /**
     * Balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day balance if everything is booked on the account and no other entry is posted.
     * 
     */
    XPCD,

    /**
     * Balance representing the intra day overdraft granted by the Central Bank to financial institutions participating in a RTGS system. This balance may vary over time and shall be offset at the end of the day.
     * 
     */
    DLOD,

    /**
     * Balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day credit balance if everything books to the account and no other credit entry is posted.
     * 
     */
    XCRD,

    /**
     * Balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day debit balance if everything books to the account and no other debit entry is posted.
     * 
     */
    XDBT,

    /**
     * Balance to be held in the settlement account in order to comply with the average reserve due, in the event that the bank's balance is equal to the reserve due during the remaining days of the maintenance period.
     * 
     */
    ADJT,

    /**
     * Average of the daily balances on the account used to fulfil the reserve requirements calculated from the beginning of the maintenance period.
     * 
     */
    PRAV,

    /**
     * Balance representing the sum of all debit entries booked to an account.
     * 
     */
    DBIT,

    /**
     * Balance representing the amount that will be destined for investment. Difference between available balance and threshold for investment limit.
     * 
     */
    THRE,

    /**
     * Balance representing the amount that a financial institution has set aside for a specific reason and which is therefore not available.
     * 
     */
    NOTE;

    public String value() {
        return name();
    }

    public static BalanceType5Code fromValue(String v) {
        return valueOf(v);
    }

}
