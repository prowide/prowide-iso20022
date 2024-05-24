
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExposureType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExposureType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BFWD"/>
 *     <enumeration value="PAYM"/>
 *     <enumeration value="CCPC"/>
 *     <enumeration value="COMM"/>
 *     <enumeration value="CRDS"/>
 *     <enumeration value="CRTL"/>
 *     <enumeration value="CRSP"/>
 *     <enumeration value="CCIR"/>
 *     <enumeration value="CRPR"/>
 *     <enumeration value="EQPT"/>
 *     <enumeration value="EXTD"/>
 *     <enumeration value="EQUS"/>
 *     <enumeration value="EXPT"/>
 *     <enumeration value="FIXI"/>
 *     <enumeration value="FORX"/>
 *     <enumeration value="FORW"/>
 *     <enumeration value="FUTR"/>
 *     <enumeration value="OPTN"/>
 *     <enumeration value="LIQU"/>
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
 *     <enumeration value="SWPT"/>
 *     <enumeration value="TBAS"/>
 *     <enumeration value="TRCP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExposureType4Code")
@XmlEnum
public enum ExposureType4Code {


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
     * Trading of equity option (also known as stock options).
     * 
     */
    EQPT,

    /**
     * Trading of exchanged traded derivatives in general.
     * 
     */
    EXTD,

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
     * Combination of treasury related exposure types.
     * 
     */
    TRCP;

    public String value() {
        return name();
    }

    public static ExposureType4Code fromValue(String v) {
        return valueOf(v);
    }

}
