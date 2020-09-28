
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BenchmarkCurveName1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BenchmarkCurveName1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MAAA"/&gt;
 *     &lt;enumeration value="FUSW"/&gt;
 *     &lt;enumeration value="LIBI"/&gt;
 *     &lt;enumeration value="LIBO"/&gt;
 *     &lt;enumeration value="SWAP"/&gt;
 *     &lt;enumeration value="TREA"/&gt;
 *     &lt;enumeration value="EURI"/&gt;
 *     &lt;enumeration value="PFAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BenchmarkCurveName1Code")
@XmlEnum
public enum BenchmarkCurveName1Code {


    /**
     * A benchmark curve used for municipals based on the best credit rating for municipal market debt.
     * 
     */
    MAAA,

    /**
     * The portion of a synthetic curve that is composed of Eurodollar or Treasury or similar Futures and Swap rates.  The term usually begins at 3 months to 2 years for the futures strip component with the Swaps filling in the points to 10 years and beyond.
     * 
     */
    FUSW,

    /**
     * The rate at which major international banks are willing to take deposits from one another, is normally 1/8 percent below LIBOR.
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
     * In curve construction, Swap is the long portion of the curve constituting about 3 years to 30 years term.
     * 
     * The exchange of one security, currency or interest rate for another to change the maturity (bonds), or quality of issues (stocks or bonds), or because investment objectives have changed.
     * 
     */
    SWAP,

    /**
     * Treasury benchmark that comes in three types: the yield curve, the par curve, and the spot curve.  All curves also have a constituent time series.
     * 
     */
    TREA,

    /**
     * Euro Interbank Offer Rate is the rate at which Euro inter-bank term deposits within the Euro zone are offered by one prime bank to another prime bank.
     * 
     */
    EURI,

    /**
     * A Pfandbriefe security is a collateralised bullet bond backed by either mortgage loans or loans to the public sector.  Pfandbriefe differ from traditional asset-backed securities in significant ways.  The most important difference is that Pfandbriefe carry no pre-payment risk since they remain on the balance sheet of the issuing institution.  Therefore, their spreads over sovereign bonds are attributable to liquidity and credit quality alone.  New indices have been created and existing indices have been modified in response to the growing importance of the Pfandbriefe market.  The Deutsche Borse has three synthetic indices called REX, JEX, and PEX.  The Pfandbriefe curve is used as a reference for credit as well as mortgage market.
     * 
     */
    PFAN;

    public String value() {
        return name();
    }

    public static BenchmarkCurveName1Code fromValue(String v) {
        return valueOf(v);
    }

}
