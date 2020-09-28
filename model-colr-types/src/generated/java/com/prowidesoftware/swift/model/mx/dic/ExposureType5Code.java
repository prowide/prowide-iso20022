
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExposureType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExposureType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BFWD"/&gt;
 *     &lt;enumeration value="PAYM"/&gt;
 *     &lt;enumeration value="CCPC"/&gt;
 *     &lt;enumeration value="COMM"/&gt;
 *     &lt;enumeration value="CRDS"/&gt;
 *     &lt;enumeration value="CRTL"/&gt;
 *     &lt;enumeration value="CRSP"/&gt;
 *     &lt;enumeration value="CCIR"/&gt;
 *     &lt;enumeration value="CRPR"/&gt;
 *     &lt;enumeration value="EQUI"/&gt;
 *     &lt;enumeration value="EQPT"/&gt;
 *     &lt;enumeration value="EQUS"/&gt;
 *     &lt;enumeration value="EXTD"/&gt;
 *     &lt;enumeration value="EXPT"/&gt;
 *     &lt;enumeration value="FIXI"/&gt;
 *     &lt;enumeration value="FORX"/&gt;
 *     &lt;enumeration value="FORW"/&gt;
 *     &lt;enumeration value="FUTR"/&gt;
 *     &lt;enumeration value="OPTN"/&gt;
 *     &lt;enumeration value="LIQU"/&gt;
 *     &lt;enumeration value="OTCD"/&gt;
 *     &lt;enumeration value="REPO"/&gt;
 *     &lt;enumeration value="RVPO"/&gt;
 *     &lt;enumeration value="SLOA"/&gt;
 *     &lt;enumeration value="SBSC"/&gt;
 *     &lt;enumeration value="SCRP"/&gt;
 *     &lt;enumeration value="SLEB"/&gt;
 *     &lt;enumeration value="SHSL"/&gt;
 *     &lt;enumeration value="SCIR"/&gt;
 *     &lt;enumeration value="SCIE"/&gt;
 *     &lt;enumeration value="SWPT"/&gt;
 *     &lt;enumeration value="TBAS"/&gt;
 *     &lt;enumeration value="TRBD"/&gt;
 *     &lt;enumeration value="TRCP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExposureType5Code")
@XmlEnum
public enum ExposureType5Code {


    /**
     * Any securities traded out beyond 3 days which include treasury notes, Japanese Government Bonds (JGBs) and Gilts.
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
     * Cross currency interest rate swap.
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
     * Foreign exchange trades in general.
     * 
     */
    FORX,

    /**
     * Forward foreign exchange trades.
     * 
     */
    FORW,

    /**
     * Related to futures trading activity.
     * 
     */
    FUTR,

    /**
     * Related to options trading activity.
     * 
     */
    OPTN,

    /**
     * In support of settlement via an RTGS or other clearing system.
     * 
     */
    LIQU,

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
     * Short sale exposure.
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
     * Trading of treasury bonds.
     * 
     */
    TRBD,

    /**
     * Combination of treasury related exposure types.
     * 
     */
    TRCP;

    public String value() {
        return name();
    }

    public static ExposureType5Code fromValue(String v) {
        return valueOf(v);
    }

}
