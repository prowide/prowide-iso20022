
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CalculationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AFTX"/>
 *     <enumeration value="ANNU"/>
 *     <enumeration value="ISSU"/>
 *     <enumeration value="AVMA"/>
 *     <enumeration value="BOOK"/>
 *     <enumeration value="YTNC"/>
 *     <enumeration value="CHCL"/>
 *     <enumeration value="CLOS"/>
 *     <enumeration value="CMPD"/>
 *     <enumeration value="CUYI"/>
 *     <enumeration value="TRGR"/>
 *     <enumeration value="GVEQ"/>
 *     <enumeration value="FLAS"/>
 *     <enumeration value="NVFL"/>
 *     <enumeration value="LSCL"/>
 *     <enumeration value="LSMT"/>
 *     <enumeration value="LSQR"/>
 *     <enumeration value="LSYR"/>
 *     <enumeration value="LGAL"/>
 *     <enumeration value="MARK"/>
 *     <enumeration value="YTMA"/>
 *     <enumeration value="NXRF"/>
 *     <enumeration value="PNAV"/>
 *     <enumeration value="NXPT"/>
 *     <enumeration value="PRCL"/>
 *     <enumeration value="PRYL"/>
 *     <enumeration value="SEMI"/>
 *     <enumeration value="SHLF"/>
 *     <enumeration value="SPLL"/>
 *     <enumeration value="TXQV"/>
 *     <enumeration value="TTDT"/>
 *     <enumeration value="TRYL"/>
 *     <enumeration value="WRST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CalculationType1Code")
@XmlEnum
public enum CalculationType1Code {


    /**
     * The yield on the bond net of any tax consequences from holding the bond. The discount on municipal securities can be subject to both capital gains taxes and ordinary income taxes. Calculated from dollar price.
     * 
     */
    AFTX,

    /**
     * The annual interest or dividend income an investment earns, expressed as a percentage of the investment's total value.
     * 
     */
    ANNU,

    /**
     * The yield of the bond offered on the issue date.
     * 
     */
    ISSU,

    /**
     * The yield achieved by substituting a bond's average maturity for the issue's final maturity date.
     * 
     */
    AVMA,

    /**
     * The yield of a security calculated by using its book value instead of the current market price. This term is typically used in the US domestic market.
     * 
     */
    BOOK,

    /**
     * Yield of a bond to the next possible call date.
     * 
     */
    YTNC,

    /**
     * The change in the yield since the previous day's closing yield.
     * 
     */
    CHCL,

    /**
     * The yield of a bond based on the closing price.
     * 
     */
    CLOS,

    /**
     * The yield of certain Japanese bonds based on its price. Certain Japanese bonds have irregular first or last coupons, and the yield is calculated compound for these irregular periods.
     * 
     */
    CMPD,

    /**
     * The ratio of the interest payment amount to the clean price.
     * 
     */
    CUYI,

    /**
     * Yield calculated using the price including accrued interest, where coupon dates are moved from holidays and weekends to the next trading day.
     * 
     */
    TRGR,

    /**
     * Ask yield based on semi-annual coupons compounding in all periods and actual/actual calendar.
     * 
     */
    GVEQ,

    /**
     * Based on price, the return an investor would require on a normal bond that would make the real return equal to that of the inflation-indexed bond, assuming a constant inflation rate.
     * 
     */
    FLAS,

    /**
     * Inverse Floater Bond Yield - Inverse floater semi-annual bond equivalent rate.
     * 
     */
    NVFL,

    /**
     * Most Recent Closing Yield - The last available yield stored in history, computed using price.
     * 
     */
    LSCL,

    /**
     * Closing Yield Most Recent Month - The yield of a bond based on the closing price as of the most recent month's end.
     * 
     */
    LSMT,

    /**
     * Closing Yield Most Recent Quarter - The yield of a bond based on the closing price as of the most recent quarter's end.
     * 
     */
    LSQR,

    /**
     * Closing Yield Most Recent Year - The yield of a bond based on the closing price as of the most recent year's end.
     * 
     */
    LSYR,

    /**
     * The yield assuming only mandatory sinks are taken. This results in a lower paydown of debt; the yield is then calculated to the final payment date.
     * 
     */
    LGAL,

    /**
     * An adjustment in the valuation of a securities portfolio to reflect the current market values of the respective securities in the portfolio.
     * 
     */
    MARK,

    /**
     * Internal rate of return an investor would achieve if he or she purchased that bond at its current dirty price, and held it to maturity, assuming all coupon and principal payments are received as scheduled.
     * 
     */
    YTMA,

    /**
     * Yield To Next Refund (Sinking Fund Bonds) - Yield assuming all bonds are redeemed at the next refund date at the redemption price.
     * 
     */
    NXRF,

    /**
     * The average yield of the respective securities in the portfolio.
     * 
     */
    PNAV,

    /**
     * The yield to the date at which the bond holder can next put the bond to the issuer.
     * 
     */
    NXPT,

    /**
     * The yield of a bond based on the closing price 1 day ago.
     * 
     */
    PRCL,

    /**
     * The CD equivalent yield when the remaining time to maturity is less than two years.
     * 
     */
    PRYL,

    /**
     * The yield of a bond whose coupon payments are reinvested semi-annually.
     * 
     */
    SEMI,

    /**
     * The yield assuming that all sinks (mandatory and voluntary) are taken at par. This results in a faster paydown of debt; the yield is then calculated to the shortest average life date.
     * 
     */
    SHLF,

    /**
     * The yield of a bond assuming no reinvestment of coupon payments. (Act/360 day count).
     * 
     */
    SPLL,

    /**
     * The after tax yield grossed up by the maximum federal tax rate of 39.6%. For comparison to taxable yields.
     * 
     */
    TXQV,

    /**
     * The yield on a Municipal bond to its mandatory tender date.
     * 
     */
    TTDT,

    /**
     * The yield calculated with coupon dates moved from a weekend or holiday to the next valid settlement date.
     * 
     */
    TRYL,

    /**
     * The lowest yield to all possible redemption date scenarios.
     * 
     */
    WRST;

    public String value() {
        return name();
    }

    public static CalculationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
