
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExposureType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExposureType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CCIR"/&gt;
 *     &lt;enumeration value="COMM"/&gt;
 *     &lt;enumeration value="CRDS"/&gt;
 *     &lt;enumeration value="CRPR"/&gt;
 *     &lt;enumeration value="CRSP"/&gt;
 *     &lt;enumeration value="CRTL"/&gt;
 *     &lt;enumeration value="EQPT"/&gt;
 *     &lt;enumeration value="EQUS"/&gt;
 *     &lt;enumeration value="EXPT"/&gt;
 *     &lt;enumeration value="EXTD"/&gt;
 *     &lt;enumeration value="FIXI"/&gt;
 *     &lt;enumeration value="FORW"/&gt;
 *     &lt;enumeration value="FORX"/&gt;
 *     &lt;enumeration value="FUTR"/&gt;
 *     &lt;enumeration value="LIQU"/&gt;
 *     &lt;enumeration value="OPTN"/&gt;
 *     &lt;enumeration value="OTCD"/&gt;
 *     &lt;enumeration value="PAYM"/&gt;
 *     &lt;enumeration value="REPO"/&gt;
 *     &lt;enumeration value="SBSC"/&gt;
 *     &lt;enumeration value="SCIE"/&gt;
 *     &lt;enumeration value="SCIR"/&gt;
 *     &lt;enumeration value="SCRP"/&gt;
 *     &lt;enumeration value="SLEB"/&gt;
 *     &lt;enumeration value="SLOA"/&gt;
 *     &lt;enumeration value="SWPT"/&gt;
 *     &lt;enumeration value="TRCP"/&gt;
 *     &lt;enumeration value="BFWD"/&gt;
 *     &lt;enumeration value="RVPO"/&gt;
 *     &lt;enumeration value="TBAS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExposureType3Code")
@XmlEnum
public enum ExposureType3Code {


    /**
     * Cross currency agreement between two parties (known as counterparties) where one stream of future interest payments is exchanged for another based on a specified principal amount.
     * 
     */
    CCIR,

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
     * Combination of various types of trades.
     * 
     */
    CRPR,

    /**
     * Cash lending/borrowing; letter of credit; signing of master agreement.
     * 
     */
    CRSP,

    /**
     * Opening of a credit line before trading.
     * 
     */
    CRTL,

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
     * Trading of exotic option, for example, a non standard option.
     * 
     */
    EXPT,

    /**
     * Trading of exchanged traded derivatives in general.
     * 
     */
    EXTD,

    /**
     * Trading of fixed income instruments.
     * 
     */
    FIXI,

    /**
     * Forward FX trades.
     * 
     */
    FORW,

    /**
     * FX trades in general.
     * 
     */
    FORX,

    /**
     * Agreement to buy or sell a specific amount of a commodity or financial instrument at a particular price on a stipulated future date.
     * 
     */
    FUTR,

    /**
     * In support of settlement via an RTGS or other clearing system.
     * 
     */
    LIQU,

    /**
     * A contract that grants the holder the right, but not the obligation, to buy or sell currency at a specified exchange rate during a specified period of time.
     * 
     */
    OPTN,

    /**
     * OTC derivatives trading.
     * 
     */
    OTCD,

    /**
     * In support of any type of cash settlement.
     * 
     */
    PAYM,

    /**
     * Relates to repurchase agreement trading.
     * 
     */
    REPO,

    /**
     * Securities buy sell back.
     * 
     */
    SBSC,

    /**
     * Exotic single currency interest rate swap.
     * 
     */
    SCIE,

    /**
     * Single currency interest rate swap.
     * 
     */
    SCIR,

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
     * Exposure is linked to a secured loan.
     * 
     */
    SLOA,

    /**
     * Option on interest rate swap.
     * 
     */
    SWPT,

    /**
     * Combination of treasury related exposure types.
     * 
     */
    TRCP,

    /**
     * Any securities traded out beyond 3 days which include treasury notes, Japanese Governement Bonds (JGBs) and Gilts.
     * 
     */
    BFWD,

    /**
     * In support of a reverse repurchase agreement transaction.
     * 
     */
    RVPO,

    /**
     * To be announced (TBA) related collateral.
     * 
     */
    TBAS;

    public String value() {
        return name();
    }

    public static ExposureType3Code fromValue(String v) {
        return valueOf(v);
    }

}
