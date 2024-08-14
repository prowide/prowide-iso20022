
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExposureType13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExposureType13Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CCIR"/>
 *     <enumeration value="CRPR"/>
 *     <enumeration value="EQUI"/>
 *     <enumeration value="EQPT"/>
 *     <enumeration value="EQUS"/>
 *     <enumeration value="EXTD"/>
 *     <enumeration value="EXPT"/>
 *     <enumeration value="FIXI"/>
 *     <enumeration value="FORX"/>
 *     <enumeration value="FORW"/>
 *     <enumeration value="FUTR"/>
 *     <enumeration value="OPTN"/>
 *     <enumeration value="LIQU"/>
 *     <enumeration value="MGLD"/>
 *     <enumeration value="OTCD"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="RVPO"/>
 *     <enumeration value="SLOA"/>
 *     <enumeration value="SBSC"/>
 *     <enumeration value="SCRP"/>
 *     <enumeration value="SLEB"/>
 *     <enumeration value="SHSL"/>
 *     <enumeration value="SCIR"/>
 *     <enumeration value="SCIE"/>
 *     <enumeration value="ESCL"/>
 *     <enumeration value="SWPT"/>
 *     <enumeration value="TBAS"/>
 *     <enumeration value="ECRT"/>
 *     <enumeration value="ECFR"/>
 *     <enumeration value="EMLO"/>
 *     <enumeration value="EMLI"/>
 *     <enumeration value="EOIM"/>
 *     <enumeration value="EOMI"/>
 *     <enumeration value="TRBD"/>
 *     <enumeration value="BFWD"/>
 *     <enumeration value="PAYM"/>
 *     <enumeration value="CCPC"/>
 *     <enumeration value="COMM"/>
 *     <enumeration value="CRDS"/>
 *     <enumeration value="CRTL"/>
 *     <enumeration value="CRSP"/>
 *     <enumeration value="EOMO"/>
 *     <enumeration value="CBCO"/>
 *     <enumeration value="TRCP"/>
 *     <enumeration value="UDMS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExposureType13Code")
@XmlEnum
public enum ExposureType13Code {


    /**
     * Cross currency agreement between two parties (known as counterparties) where one stream of future interest payments is exchanged for another based on a specified principal amount.
     * 
     */
    CCIR,

    /**
     * Combination of various types of trades.
     * 
     */
    CRPR,

    /**
     * Trading of equity.
     * 
     */
    EQUI,

    /**
     * Trading of equity option (also known as stock options).
     * 
     */
    EQPT,

    /**
     * Equity swap trades where the return of an equity is exchanged for either a fixed or a floating rate of interest.
     * 
     */
    EQUS,

    /**
     * Trading of exchanged traded derivatives in general.
     * 
     */
    EXTD,

    /**
     * Trading of exotic option, for example, a non standard option.
     * 
     */
    EXPT,

    /**
     * Trading of fixed income instruments.
     * 
     */
    FIXI,

    /**
     * FX trades in general.
     * 
     */
    FORX,

    /**
     * Forward FX trades.
     * 
     */
    FORW,

    /**
     * Agreement to buy or sell a specific amount of a commodity or financial instrument at a particular price on a stipulated future date.
     * 
     */
    FUTR,

    /**
     * A contract that grants the holder the right, but not the obligation, to buy or sell currency at a specified exchange rate during a specified period of time.
     * 
     */
    OPTN,

    /**
     * In support of settlement via an RTGS or other clearing system.
     * 
     */
    LIQU,

    /**
     * Margin lending transaction. 
     * 
     */
    MGLD,

    /**
     * OTC derivatives trading.
     * 
     */
    OTCD,

    /**
     * Relates to repurchase agreement trading.
     * 
     */
    REPO,

    /**
     * In support of a reverse repurchase agreement transaction.
     * 
     */
    RVPO,

    /**
     * Exposure is linked to a secured loan.
     * 
     */
    SLOA,

    /**
     * Securities buy sell back.
     * 
     */
    SBSC,

    /**
     * Combination of securities related exposure types.
     * 
     */
    SCRP,

    /**
     * Exposure is linked to a securities lending or borrowing activity.
     * 
     */
    SLEB,

    /**
     * Short sell exposure.
     * 
     */
    SHSL,

    /**
     * Single currency interest rate swap.
     * 
     */
    SCIR,

    /**
     * Exotic single currency interest rate swap.
     * 
     */
    SCIE,

    /**
     * Suggested credit line.
     * 
     */
    ESCL,

    /**
     * Option on interest rate swap.
     * 
     */
    SWPT,

    /**
     * To be announced (TBA) related collateral.
     * 
     */
    TBAS,

    /**
     * Total credit.
     * 
     * 
     */
    ECRT,

    /**
     * Total credit freezing.
     * 
     */
    ECFR,

    /**
     * Total marginal lending.
     * 
     */
    EMLO,

    /**
     * Total marginal lending interest.
     * 
     */
    EMLI,

    /**
     * Total initial margin on outstanding liquidity providing open market operations.
     * 
     */
    EOIM,

    /**
     * Total open market credit operations interest.
     * 
     */
    EOMI,

    /**
     * Trading of treasury bonds.
     * 
     */
    TRBD,

    /**
     * Any securities traded out beyond 3 days which include treasury notes, Japanese Governement Bonds (JGBs) and Gilts.
     * 
     */
    BFWD,

    /**
     * In support of any type of cash settlement.
     * 
     */
    PAYM,

    /**
     * Collateral covering the initial margin requirements for OTC trades cleared through a CCP.
     * 
     */
    CCPC,

    /**
     * Any good exchanged during commerce, which includes goods traded on a commodity exchange.
     * 
     */
    COMM,

    /**
     * Swap designed to transfer the credit exposure of fixed income products between parties.
     * 
     */
    CRDS,

    /**
     * Opening of a credit line before trading.
     * 
     */
    CRTL,

    /**
     * Cash lending/borrowing; letter of credit; signing of master agreement.
     * 
     */
    CRSP,

    /**
     * Total open market credit operations.
     * 
     * 
     * 
     * 
     */
    EOMO,

    /**
     * Exposures related to activity with central banks.
     * 
     */
    CBCO,

    /**
     * Combination of treasury related exposure types.
     * 
     */
    TRCP,

    /**
     * Relates to uncleared derivative margin segregation. This could be for variation or initial margin.
     * 
     */
    UDMS;

    public String value() {
        return name();
    }

    public static ExposureType13Code fromValue(String v) {
        return valueOf(v);
    }

}
