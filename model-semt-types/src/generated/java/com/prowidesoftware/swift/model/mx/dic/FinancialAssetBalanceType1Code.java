
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialAssetBalanceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FinancialAssetBalanceType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACRU"/&gt;
 *     &lt;enumeration value="OINT"/&gt;
 *     &lt;enumeration value="SCAS"/&gt;
 *     &lt;enumeration value="FXTR"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="TIPS"/&gt;
 *     &lt;enumeration value="EQUI"/&gt;
 *     &lt;enumeration value="CSTK"/&gt;
 *     &lt;enumeration value="PREF"/&gt;
 *     &lt;enumeration value="MFUN"/&gt;
 *     &lt;enumeration value="XFUN"/&gt;
 *     &lt;enumeration value="RGHT"/&gt;
 *     &lt;enumeration value="WARR"/&gt;
 *     &lt;enumeration value="BOND"/&gt;
 *     &lt;enumeration value="CONV"/&gt;
 *     &lt;enumeration value="CBND"/&gt;
 *     &lt;enumeration value="GBND"/&gt;
 *     &lt;enumeration value="OPTN"/&gt;
 *     &lt;enumeration value="FUTR"/&gt;
 *     &lt;enumeration value="SWAP"/&gt;
 *     &lt;enumeration value="CUEX"/&gt;
 *     &lt;enumeration value="FOIV"/&gt;
 *     &lt;enumeration value="GOLD"/&gt;
 *     &lt;enumeration value="PROP"/&gt;
 *     &lt;enumeration value="BAAP"/&gt;
 *     &lt;enumeration value="SYBL"/&gt;
 *     &lt;enumeration value="CBOO"/&gt;
 *     &lt;enumeration value="CEOD"/&gt;
 *     &lt;enumeration value="CDEO"/&gt;
 *     &lt;enumeration value="CLOB"/&gt;
 *     &lt;enumeration value="CMOO"/&gt;
 *     &lt;enumeration value="COPR"/&gt;
 *     &lt;enumeration value="CPPE"/&gt;
 *     &lt;enumeration value="DISC"/&gt;
 *     &lt;enumeration value="FEAD"/&gt;
 *     &lt;enumeration value="FEHA"/&gt;
 *     &lt;enumeration value="FEHL"/&gt;
 *     &lt;enumeration value="FNMA"/&gt;
 *     &lt;enumeration value="FLNO"/&gt;
 *     &lt;enumeration value="GNMA"/&gt;
 *     &lt;enumeration value="TAAB"/&gt;
 *     &lt;enumeration value="IETM"/&gt;
 *     &lt;enumeration value="MPRP"/&gt;
 *     &lt;enumeration value="MBON"/&gt;
 *     &lt;enumeration value="SLMA"/&gt;
 *     &lt;enumeration value="STIF"/&gt;
 *     &lt;enumeration value="TSTP"/&gt;
 *     &lt;enumeration value="TIDE"/&gt;
 *     &lt;enumeration value="UNBW"/&gt;
 *     &lt;enumeration value="UNBO"/&gt;
 *     &lt;enumeration value="VRDN"/&gt;
 *     &lt;enumeration value="ZOOO"/&gt;
 *     &lt;enumeration value="FWBO"/&gt;
 *     &lt;enumeration value="FRAG"/&gt;
 *     &lt;enumeration value="REPO"/&gt;
 *     &lt;enumeration value="XREP"/&gt;
 *     &lt;enumeration value="TREP"/&gt;
 *     &lt;enumeration value="RXRP"/&gt;
 *     &lt;enumeration value="FXFD"/&gt;
 *     &lt;enumeration value="FXSP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * Balance attributed to syndicated bank loans
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
     * Balance attributed to collateralised mortgage obligations
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
     * Balance attributed to treasuries and agencies debentures
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
