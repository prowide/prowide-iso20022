
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BenchmarkCurveName7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BenchmarkCurveName7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BBSW"/>
 *     <enumeration value="BUBO"/>
 *     <enumeration value="BCOL"/>
 *     <enumeration value="CDOR"/>
 *     <enumeration value="CIBO"/>
 *     <enumeration value="CORA"/>
 *     <enumeration value="CZNA"/>
 *     <enumeration value="EONA"/>
 *     <enumeration value="EONS"/>
 *     <enumeration value="ESTR"/>
 *     <enumeration value="EURI"/>
 *     <enumeration value="EUUS"/>
 *     <enumeration value="EUCH"/>
 *     <enumeration value="EFFR"/>
 *     <enumeration value="FUSW"/>
 *     <enumeration value="GCFR"/>
 *     <enumeration value="HKIO"/>
 *     <enumeration value="ISDA"/>
 *     <enumeration value="ETIO"/>
 *     <enumeration value="JIBA"/>
 *     <enumeration value="LIBI"/>
 *     <enumeration value="LIBO"/>
 *     <enumeration value="MOSP"/>
 *     <enumeration value="MAAA"/>
 *     <enumeration value="BJUO"/>
 *     <enumeration value="NIBO"/>
 *     <enumeration value="OBFR"/>
 *     <enumeration value="PFAN"/>
 *     <enumeration value="PRBO"/>
 *     <enumeration value="RCTR"/>
 *     <enumeration value="SOFR"/>
 *     <enumeration value="SONA"/>
 *     <enumeration value="STBO"/>
 *     <enumeration value="SWAP"/>
 *     <enumeration value="TLBO"/>
 *     <enumeration value="TIBO"/>
 *     <enumeration value="TOAR"/>
 *     <enumeration value="TREA"/>
 *     <enumeration value="WIBO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BenchmarkCurveName7Code")
@XmlEnum
public enum BenchmarkCurveName7Code {


    /**
     * Australian Financial Markets Association (AFMA) Bank-Bill Reference Rate (BBSW).
     * 
     */
    BBSW,

    /**
     * Budapest Interbank Offered Rate.
     * 
     */
    BUBO,

    /**
     * Bank of Canada Overnight Lending Rate (CABROVER).
     * 
     */
    BCOL,

    /**
     * Canadian Dollar Offered Rate.
     * 
     */
    CDOR,

    /**
     * Copenhagen Interbank Offered Rate.
     * 
     */
    CIBO,

    /**
     * Canadian Overnight Repo Rate Average (CAONREPO). 
     * 
     */
    CORA,

    /**
     * Czech National Bank Reference Interest Rate
     * 
     */
    CZNA,

    /**
     * Euro OverNight Index Average rate.
     * 
     */
    EONA,

    /**
     * Euro OverNight Index Average swap rate.
     * 
     */
    EONS,

    /**
     * Euro Short Term Rate
     * 
     */
    ESTR,

    /**
     * Euro Interbank Offer Rate is the rate at which Euro inter-bank term deposits within the Euro zone are offered by one prime bank to another prime bank.
     * 
     */
    EURI,

    /**
     * Rate for the eurodollars, time deposits denominated in U.S. dollars at banks outside the United States, and thus are not under the jurisdiction of the Federal Reserve.
     * 
     */
    EUUS,

    /**
     * Swiss Franc LIBOR rate.
     * 
     */
    EUCH,

    /**
     * Effective Federal Funds Rate (FEDL01).
     * 
     */
    EFFR,

    /**
     * Portion of a synthetic curve that is composed of Eurodollar or Treasury or similar Futures and Swap rates. The term usually begins at 3 months to 2 years for the futures strip component with the Swaps filling in the points to 10 years and beyond.
     * 
     */
    FUSW,

    /**
     * GCF Repo Index, the Depository Trust & Clearing Corporation (DTCC) general collateral finance repurchase agreements index.
     * 
     */
    GCFR,

    /**
     * Hong Kong Interbank Offered Rate (HIHD01M).
     * 
     */
    HKIO,

    /**
     * Worldwide common reference rate value for fixed interest rate swap rates, as defined by the International Swaps and Derivatives Association (ISDA).
     * 
     */
    ISDA,

    /**
     * Euroyen Tokyo Interbank Offered Rate (EUYN03M).
     * 
     */
    ETIO,

    /**
     * Johannesburg Interbank Agreed Rate.
     * 
     */
    JIBA,

    /**
     * Rate at which major international banks are willing to take deposits from one another, is normally 1/8 percent below LIBOR.
     * 
     * London InterBank Bid Rate, the rate bid by banks on Eurocurrency deposits; the international rate that banks lend to other banks.
     * 
     */
    LIBI,

    /**
     * London Interbank Offered Rate, the interest rate that major international banks in London charge each other for borrowing.
     * 
     */
    LIBO,

    /**
     * Moscow Prime Offered Rate.
     * 
     */
    MOSP,

    /**
     * Benchmark curve used for municipals based on the best credit rating for municipal market debt.
     * 
     */
    MAAA,

    /**
     * Bank of Japan Uncollateralized Overnight Call Rate (MUTSCALM).
     * 
     */
    BJUO,

    /**
     * Norwegian Interbank Offered Rate.
     * 
     */
    NIBO,

    /**
     * Overnight Bank Funding Rate (OBFR01).
     * 
     */
    OBFR,

    /**
     * Pfandbriefe security is a collateralised bullet bond backed by either mortgage loans or loans to the public sector. Pfandbriefe differ from traditional asset-backed securities in significant ways. The most important difference is that Pfandbriefe carry no pre-payment risk since they remain on the balance sheet of the issuing institution. Therefore, their spreads over sovereign bonds are attributable to liquidity and credit quality alone. New indices have been created and existing indices have been modified in response to the growing importance of the Pfandbriefe market. The Deutsche Borse has three synthetic indices called REX, JEX, and PEX. The Pfandbriefe curve is used as a reference for credit as well as mortgage market.
     * 
     */
    PFAN,

    /**
     * Czech Fixing of Interest Rates on Interbank Deposits.
     * 
     */
    PRBO,

    /**
     * RBA Cash Rate Target  (RBATCTR).
     * 
     */
    RCTR,

    /**
     * Secured Overnight Financing Rate.
     * 
     */
    SOFR,

    /**
     * Sterling Over Night Index Average.
     * 
     */
    SONA,

    /**
     * Stockholm Interbank Offered Rate.
     * 
     */
    STBO,

    /**
     * In curve construction, Swap is the long portion of the curve constituting about 3 years to 30 years term.
     * 
     * The exchange of one security, currency or interest rate for another to change the maturity (bonds), or quality of issues (stocks or bonds), or because investment objectives have changed.
     * 
     */
    SWAP,

    /**
     * Tel Aviv Interbank Offered Rate.
     * 
     */
    TLBO,

    /**
     * Tokyo Interbank Offered Rate.
     * 
     */
    TIBO,

    /**
     * Tokyo overnight weighted average rate.
     * 
     */
    TOAR,

    /**
     * Treasury benchmark that comes in three types: the yield curve, the par curve, and the spot curve. All curves also have a constituent time series.
     * 
     */
    TREA,

    /**
     * Warsaw Interbank Offered Rate.
     * 
     */
    WIBO;

    public String value() {
        return name();
    }

    public static BenchmarkCurveName7Code fromValue(String v) {
        return valueOf(v);
    }

}
