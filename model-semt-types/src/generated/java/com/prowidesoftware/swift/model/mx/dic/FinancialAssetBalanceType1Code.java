
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialAssetBalanceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FinancialAssetBalanceType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACRU"/>
 *     <enumeration value="OINT"/>
 *     <enumeration value="SCAS"/>
 *     <enumeration value="FXTR"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="TIPS"/>
 *     <enumeration value="EQUI"/>
 *     <enumeration value="CSTK"/>
 *     <enumeration value="PREF"/>
 *     <enumeration value="MFUN"/>
 *     <enumeration value="XFUN"/>
 *     <enumeration value="RGHT"/>
 *     <enumeration value="WARR"/>
 *     <enumeration value="BOND"/>
 *     <enumeration value="CONV"/>
 *     <enumeration value="CBND"/>
 *     <enumeration value="GBND"/>
 *     <enumeration value="OPTN"/>
 *     <enumeration value="FUTR"/>
 *     <enumeration value="SWAP"/>
 *     <enumeration value="CUEX"/>
 *     <enumeration value="FOIV"/>
 *     <enumeration value="GOLD"/>
 *     <enumeration value="PROP"/>
 *     <enumeration value="BAAP"/>
 *     <enumeration value="SYBL"/>
 *     <enumeration value="CBOO"/>
 *     <enumeration value="CEOD"/>
 *     <enumeration value="CDEO"/>
 *     <enumeration value="CLOB"/>
 *     <enumeration value="CMOO"/>
 *     <enumeration value="COPR"/>
 *     <enumeration value="CPPE"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="FEAD"/>
 *     <enumeration value="FEHA"/>
 *     <enumeration value="FEHL"/>
 *     <enumeration value="FNMA"/>
 *     <enumeration value="FLNO"/>
 *     <enumeration value="GNMA"/>
 *     <enumeration value="TAAB"/>
 *     <enumeration value="IETM"/>
 *     <enumeration value="MPRP"/>
 *     <enumeration value="MBON"/>
 *     <enumeration value="SLMA"/>
 *     <enumeration value="STIF"/>
 *     <enumeration value="TSTP"/>
 *     <enumeration value="TIDE"/>
 *     <enumeration value="UNBW"/>
 *     <enumeration value="UNBO"/>
 *     <enumeration value="VRDN"/>
 *     <enumeration value="ZOOO"/>
 *     <enumeration value="FWBO"/>
 *     <enumeration value="FRAG"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="XREP"/>
 *     <enumeration value="TREP"/>
 *     <enumeration value="RXRP"/>
 *     <enumeration value="FXFD"/>
 *     <enumeration value="FXSP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FinancialAssetBalanceType1Code")
@XmlEnum
public enum FinancialAssetBalanceType1Code {


    /**
     * Balance attributed to accrued income.
     * 
     */
    ACRU,

    /**
     * Balance attributed to other financial instruments.
     * 
     */
    OINT,

    /**
     * Balance attributed to settled cash.
     * 
     */
    SCAS,

    /**
     * Balance attributed to foreign exchange profit or loss.
     * 
     */
    FXTR,

    /**
     * Balance attributed to cash.
     * 
     */
    CASH,

    /**
     * Balance attributed to treasury inflated protected securities.
     * 
     */
    TIPS,

    /**
     * Balance attributed to equities.
     * 
     */
    EQUI,

    /**
     * Balance attributed to common stock.
     * 
     */
    CSTK,

    /**
     * Balance attributed to preferred stock.
     * 
     */
    PREF,

    /**
     * Balance attributed to mutual funds.
     * 
     */
    MFUN,

    /**
     * Balance attributed to exchange traded funds.
     * 
     */
    XFUN,

    /**
     * Balance attributed to rights.
     * 
     */
    RGHT,

    /**
     * Balance attributed to warrants.
     * 
     */
    WARR,

    /**
     * Balance attributed to bonds.
     * 
     */
    BOND,

    /**
     * Balance attributed to convertible bonds.
     * 
     */
    CONV,

    /**
     * Balance attributed to corporate bonds.
     * 
     */
    CBND,

    /**
     * Balance attributed to government bonds.
     * 
     */
    GBND,

    /**
     * Balance attributed to options.
     * 
     */
    OPTN,

    /**
     * Balance attributed to futures.
     * 
     */
    FUTR,

    /**
     * Balance attributed to swaps.
     * 
     */
    SWAP,

    /**
     * Balance attributed to currency exchange contracts.
     * 
     */
    CUEX,

    /**
     * Balance attributed to foreign investments.
     * 
     */
    FOIV,

    /**
     * Balance attributed to gold.
     * 
     */
    GOLD,

    /**
     * Balance attributed to property.
     * 
     */
    PROP,

    /**
     * Balance attributed to bankers acceptances.
     * 
     */
    BAAP,

    /**
     * Balance attributed to syndicated bank loans.
     * 
     */
    SYBL,

    /**
     * Balance attributed to collateralised bond obligations.
     * 
     */
    CBOO,

    /**
     * Balance attributed to certificates of deposits.
     * 
     */
    CEOD,

    /**
     * Balance attributed to collateralised debt obligations.
     * 
     */
    CDEO,

    /**
     * Balance attributed to collateralised loan obligations.
     * 
     */
    CLOB,

    /**
     * Balance attributed to collateralised mortgage obligations.
     * 
     */
    CMOO,

    /**
     * Balance attributed to commercial paper.
     * 
     */
    COPR,

    /**
     * Balance attributed to corporate private placements.
     * 
     */
    CPPE,

    /**
     * Balance attributed to discount notes.
     * 
     */
    DISC,

    /**
     * Balance attributed to federal agency discount notes.
     * 
     */
    FEAD,

    /**
     * Balance attributed to federal housing authorities.
     * 
     */
    FEHA,

    /**
     * Balance attributed to federal home loans.
     * 
     */
    FEHL,

    /**
     * Balance attributed to federal national mortgage associations.
     * 
     */
    FNMA,

    /**
     * Balance attributed to floating rate notes.
     * 
     */
    FLNO,

    /**
     * Balance attributed to the government national mortgage association.
     * 
     */
    GNMA,

    /**
     * Balance attributed to treasuries and agencies debentures.
     * 
     */
    TAAB,

    /**
     * Balance attributed to IOETTE mortgages.
     * 
     */
    IETM,

    /**
     * Balance attributed to mortgage private placements.
     * 
     */
    MPRP,

    /**
     * Balance attributed to municipal bonds.
     * 
     */
    MBON,

    /**
     * Balance attributed to student loan marketing associations.
     * 
     */
    SLMA,

    /**
     * Balance attributed to short term investment funds.
     * 
     */
    STIF,

    /**
     * Balance attributed to treasury strips.
     * 
     */
    TSTP,

    /**
     * Balance attributed to time deposits.
     * 
     */
    TIDE,

    /**
     * Balance attributed to unitized bonds and warrants.
     * 
     */
    UNBW,

    /**
     * Balance attributed to unitized bonds.
     * 
     */
    UNBO,

    /**
     * Balance attributed to variable rate discount notes.
     * 
     */
    VRDN,

    /**
     * Balance attributed to cats, lions and tigers.
     * 
     */
    ZOOO,

    /**
     * Balance attributed to forwards - bonds.
     * 
     */
    FWBO,

    /**
     * Balance attributed to forward rate agreements.
     * 
     */
    FRAG,

    /**
     * Balance attributed to repurchase agreements.
     * 
     */
    REPO,

    /**
     * Balance attributed to reverse repurchase agreements.
     * 
     */
    XREP,

    /**
     * Balance attributed to triparty repurchase agreements.
     * 
     */
    TREP,

    /**
     * Balance attributed to triparty reverse repurchase agreements.
     * 
     */
    RXRP,

    /**
     * Balance attributed to foreign exchange forwards.
     * 
     */
    FXFD,

    /**
     * Balance attributed to foreign exchange spots.
     * 
     */
    FXSP;

    public String value() {
        return name();
    }

    public static FinancialAssetBalanceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
