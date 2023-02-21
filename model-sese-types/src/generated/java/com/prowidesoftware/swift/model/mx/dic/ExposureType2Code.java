
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExposureType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExposureType2Code"&gt;
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
 *     &lt;enumeration value="SHSL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExposureType2Code")
@XmlEnum
public enum ExposureType2Code {


    /**
     * Cross currency interest rate swap.
     * 
     */
    CCIR,

    /**
     * Trading of exchanged traded commodities.
     * 
     */
    COMM,

    /**
     * Trading of credit default swap.
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
     * Forward foreign exchange trades.
     * 
     */
    FORW,

    /**
     * Foreign exchange trades in general.
     * 
     */
    FORX,

    /**
     * Related to futures trading activity.
     * 
     */
    FUTR,

    /**
     * In support of settlement via an RTGS or other clearing system.
     * 
     */
    LIQU,

    /**
     * Related to options trading activity.
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
     * Any securities traded out beyond 3 days which include treasury notes, Japanese Government Bonds (JGBs) and Gilts.
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
    TBAS,

    /**
     * Short sale exposure.
     * 
     */
    SHSL;

    public String value() {
        return name();
    }

    public static ExposureType2Code fromValue(String v) {
        return valueOf(v);
    }

}
