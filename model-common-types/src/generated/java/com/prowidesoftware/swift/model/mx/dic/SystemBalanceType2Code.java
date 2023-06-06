
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemBalanceType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SystemBalanceType2Code">
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
 *     <enumeration value="FSET"/>
 *     <enumeration value="BLOC"/>
 *     <enumeration value="OTHB"/>
 *     <enumeration value="CUST"/>
 *     <enumeration value="FORC"/>
 *     <enumeration value="COLC"/>
 *     <enumeration value="FUND"/>
 *     <enumeration value="PIPO"/>
 *     <enumeration value="XCHG"/>
 *     <enumeration value="CCPS"/>
 *     <enumeration value="TOHB"/>
 *     <enumeration value="COHB"/>
 *     <enumeration value="DOHB"/>
 *     <enumeration value="TPBL"/>
 *     <enumeration value="CPBL"/>
 *     <enumeration value="DPBL"/>
 *     <enumeration value="FUTB"/>
 *     <enumeration value="REJB"/>
 *     <enumeration value="FCOL"/>
 *     <enumeration value="FCOU"/>
 *     <enumeration value="SCOL"/>
 *     <enumeration value="SCOU"/>
 *     <enumeration value="CUSA"/>
 *     <enumeration value="XCHC"/>
 *     <enumeration value="XCHN"/>
 *     <enumeration value="DSET"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="NSET"/>
 *     <enumeration value="OTCC"/>
 *     <enumeration value="OTCG"/>
 *     <enumeration value="OTCN"/>
 *     <enumeration value="SAPD"/>
 *     <enumeration value="SAPC"/>
 *     <enumeration value="REPD"/>
 *     <enumeration value="REPC"/>
 *     <enumeration value="BSCD"/>
 *     <enumeration value="BSCC"/>
 *     <enumeration value="SAPP"/>
 *     <enumeration value="IRLT"/>
 *     <enumeration value="IRDR"/>
 *     <enumeration value="DWRD"/>
 *     <enumeration value="ADWR"/>
 *     <enumeration value="AIDR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SystemBalanceType2Code")
@XmlEnum
public enum SystemBalanceType2Code {


    /**
     * Book balance of the account at the beginning of the account servicer's business day. It always equals the closing book balance from the previous business day. 
     * Note: the available balance at the beginning of the account servicer's business day may be different from the closing book balance from the previous business day.
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
     * Balance of securities pending delivery, such as the orders to sell securities have been executed but settlement of the open transactions has not been confirmed.
     * 
     */
    PDNG,

    /**
     * Balance of a specific limit value, such as a bilateral balance is calculated in relation to a given bilateral limit.
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
     * Balance representing the potential loan a Central Bank would make in cash if the collateral is pledged, such as securities available and eligible as collateral with the central bank.
     * 
     */
    EAST,

    /**
     * Balance representing the sum of entries as a result of payments processing. Entries relating to fees, interest, or other movements not a result of payments sent or received by the account owner are not included.
     * 
     */
    PYMT,

    /**
     * Balance representing the regulatory reserve that a financial institution must have with the account servicing institution, such as the minimum credit balance a financial institution is to keep with its Central Bank for mandatory reserve purposes. In some countries, a blocked balance is known as a 'reserve' balance.
     * 
     */
    BLCK,

    /**
     * Balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day balance if everything is booked on the account and no other entry is posted.
     * 
     */
    XPCD,

    /**
     * Balance representing the intra day overdraft granted by the central bank to financial institutions participating in a RTGS system. This balance may vary over time and shall be offset at the end of the day.
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
     * Average balance to be held in the settlement account at the end of each day in order to fulfil the reserve due.
     * The approximation will be always made rounding up.
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
    NOTE,

    /**
     * Balance representing the forecast of total of all cash legs for trades that are ready to settle via a central securities depository. Amounts shown are still subject to processing of the securities settlement.
     * 
     */
    FSET,

    /**
     * Balance representing the projected total of all cash legs for trades settling via a central securities depository that have been matched but blocked in order to not settle. These blocked trades are included in the calculation for settlement (for example to avoid overdrafts).
     * Usage rule: Blocking can be done by account owner or its counterparties. Usually this is done to chain transactions or to prioritise other trades. Blocked trades have an indicator that prevents the transactions from settling. Once matched, they can settle whenever the freeze is lifted. In this case they will move to FSET. Lifting the freeze can happen anytime during the day and the transaction will be settling in the next settlement cycle which can be the same day if the (international) central securities depository's operates several settlements cycles per day.
     * 
     */
    BLOC,

    /**
     * Balance representing the projected total of all cash legs for trades settling via a central securities depository that have been matched but blocked in order to not settle. These blocked transactions are not included in the calculation for settlement.
     * 
     */
    OTHB,

    /**
     * Balance representing the projected total of all asset servicing transactions such as dividends, income corporate actions equivalents, tax returns, etc.
     * 
     */
    CUST,

    /**
     * Balance representing the total of all balance types representing transactions to settle, blocked items and custody transactions.
     * 
     */
    FORC,

    /**
     * Balance representing the projected total amount of all payment obligations to the participant (bank), based on their role as main paying agent.
     * 
     */
    COLC,

    /**
     * Balance representing the net amount to be funded resulting from all transactions which have an impact on the funding requirement.
     * 
     */
    FUND,

    /**
     * Balance representing the fictive forecast of automated direct debits or payment based on standing arrangements between a central securities depository and the user.
     * 
     * Usage: Pay-Ins and Pay-Outs can be different based on individual payment instructions or available funds.
     * 
     */
    PIPO,

    /**
     * Balance representing the forecast of the total of all cash legs of transactions traded in exchanges.
     * 
     */
    XCHG,

    /**
     * Balance representing the forecast of the total of all cash legs of transactions traded in exchanges that operate a central counterparty functionality.
     * 
     */
    CCPS,

    /**
     * Balance representing the total of the payments that were put on hold because the limits have been exceeded.
     * 
     */
    TOHB,

    /**
     * Balance representing the total incoming payments that were put on hold because the credit limit has been exceeded.
     * 
     */
    COHB,

    /**
     * Balance representing the total outgoing payments that were put on hold because the debit limit has been exceeded.
     * 
     */
    DOHB,

    /**
     * Balance representing the total of the payments that have been processed and are waiting for settlement during the day.
     * 
     */
    TPBL,

    /**
     * Balance representing the total incoming payments that have been processed and are waiting for settlement.
     * 
     */
    CPBL,

    /**
     * Balance representing the total outgoing payments that have been processed and are waiting for settlement.
     * 
     */
    DPBL,

    /**
     * Balance representing the total of the payments with a processing date in the future.
     * 
     */
    FUTB,

    /**
     * Balance representing the total of the payments that have been rejected.
     * 
     */
    REJB,

    /**
     * Balance representing the forecast of the cash-equivalent resulting from evaluation of existing holdings at central securities depositary that are qualified to serve as collateral.
     * 
     */
    FCOL,

    /**
     * Balance representing the cash equivalent resulting from evaluation of existing holdings at CSD that are qualified to serve as collateral and have been used as collateral.
     * 
     */
    FCOU,

    /**
     * Balance representing the forecast of the cash-equivalent resulting from evaluation of the net incoming balance of securities qualified to serve as collateral for which settlement instructions are held at.
     * 
     */
    SCOL,

    /**
     * Balance representing the cash-equivalent resulting from evaluation of incoming securities, qualified to serve as collateral and actually used as collateral, which have been settled during the settlement process.
     * 
     */
    SCOU,

    /**
     * Balance representing the actual total of all asset servicing transactions such as dividends, income corporate actions equivalents, tax returns, redemptions, etc.
     * 
     */
    CUSA,

    /**
     * Balance representing the forecast of the total of all cash legs of transactions in exchanges, going through CCP functions.
     * 
     */
    XCHC,

    /**
     * Balance representing the forecast of the total of all cash legs of transactions traded in exchanges not going through central counter party (CCP) functions.
     * 
     */
    XCHN,

    /**
     * Balance representing the cash equivalent of all settled securities transactions.
     * 
     */
    DSET,

    /**
     * Balance representing the cash equivalent of transactions with a lack of holdings.
     * 
     */
    LACK,

    /**
     * Balance representing the cash equivalent of all non-settled securities transactions.
     * 
     */
    NSET,

    /**
     * Balance representing the Forecast of the total of all cash-legs of transactions 'over the counter' (OTC), going through central counter party (CCP) functions.
     * 
     */
    OTCC,

    /**
     * Balance representing the forecast of the total of all cash legs of transactions traded 'over the counter' (OTC).
     * 
     */
    OTCG,

    /**
     * Balance representing the forecast of the total of all cash legs of transactions traded 'over the counter' (OTC) not going through central counter party (CCP) functions.
     * 
     */
    OTCN,

    /**
     * Balance represents the settlement account processor direct debit amount.
     * 
     */
    SAPD,

    /**
     * Balance represents the settlement account processor direct credit amount.
     * 
     */
    SAPC,

    /**
     * Balance represents the total of the central moneymarkets unit processor repo debits.
     * 
     */
    REPD,

    /**
     * Balance represents the total of the central moneymarkets unit processor repo credits.
     * 
     */
    REPC,

    /**
     * Balance represents the total of the bulk settlement and central moneymarkets unit processor debit.
     * 
     */
    BSCD,

    /**
     * Balance represents the total of the bulk settlement and central moneymarkets unit processor credit.
     * 
     */
    BSCC,

    /**
     * Balance represents the settlement account processor queue amount.
     * 
     */
    SAPP,

    /**
     * Balance represents the intraday repo limit.
     * 
     */
    IRLT,

    /**
     * Balance represents the intraday repo drawings.
     * 
     */
    IRDR,

    /**
     * Balance represents the discount window repo drawings.
     * 
     */
    DWRD,

    /**
     * Balance represents the available discounted market value for discount window repo.
     * 
     */
    ADWR,

    /**
     * Balance represents the available discounted market value for intraday repo.
     * 
     */
    AIDR;

    public String value() {
        return name();
    }

    public static SystemBalanceType2Code fromValue(String v) {
        return valueOf(v);
    }

}
