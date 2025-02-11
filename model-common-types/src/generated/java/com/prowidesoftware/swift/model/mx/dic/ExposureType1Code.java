
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExposureType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExposureType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CCIR"/>
 *     <enumeration value="COMM"/>
 *     <enumeration value="CRDS"/>
 *     <enumeration value="CRPR"/>
 *     <enumeration value="CRSP"/>
 *     <enumeration value="CRTL"/>
 *     <enumeration value="EQPT"/>
 *     <enumeration value="EQUS"/>
 *     <enumeration value="EXPT"/>
 *     <enumeration value="EXTD"/>
 *     <enumeration value="FIXI"/>
 *     <enumeration value="FORW"/>
 *     <enumeration value="FORX"/>
 *     <enumeration value="FUTR"/>
 *     <enumeration value="LIQU"/>
 *     <enumeration value="OPTN"/>
 *     <enumeration value="OTCD"/>
 *     <enumeration value="PAYM"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="SBSC"/>
 *     <enumeration value="SCIE"/>
 *     <enumeration value="SCIR"/>
 *     <enumeration value="SCRP"/>
 *     <enumeration value="SLEB"/>
 *     <enumeration value="SLOA"/>
 *     <enumeration value="SWPT"/>
 *     <enumeration value="TRCP"/>
 *     <enumeration value="BFWD"/>
 *     <enumeration value="RVPO"/>
 *     <enumeration value="TBAS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExposureType1Code")
@XmlEnum
public enum ExposureType1Code {


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
    TBAS;

    public String value() {
        return name();
    }

    public static ExposureType1Code fromValue(String v) {
        return valueOf(v);
    }

}
