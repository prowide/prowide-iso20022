
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCAssetType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DTCAssetType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="S005"/>
 *     <enumeration value="S010"/>
 *     <enumeration value="S011"/>
 *     <enumeration value="S012"/>
 *     <enumeration value="S020"/>
 *     <enumeration value="S022"/>
 *     <enumeration value="S023"/>
 *     <enumeration value="S024"/>
 *     <enumeration value="S030"/>
 *     <enumeration value="S040"/>
 *     <enumeration value="S041"/>
 *     <enumeration value="S042"/>
 *     <enumeration value="S102"/>
 *     <enumeration value="S110"/>
 *     <enumeration value="S111"/>
 *     <enumeration value="S112"/>
 *     <enumeration value="S117"/>
 *     <enumeration value="S120"/>
 *     <enumeration value="S125"/>
 *     <enumeration value="S126"/>
 *     <enumeration value="S130"/>
 *     <enumeration value="S310"/>
 *     <enumeration value="S311"/>
 *     <enumeration value="S312"/>
 *     <enumeration value="S313"/>
 *     <enumeration value="S314"/>
 *     <enumeration value="S315"/>
 *     <enumeration value="S320"/>
 *     <enumeration value="S330"/>
 *     <enumeration value="S340"/>
 *     <enumeration value="S450"/>
 *     <enumeration value="S451"/>
 *     <enumeration value="S452"/>
 *     <enumeration value="S500"/>
 *     <enumeration value="S502"/>
 *     <enumeration value="S504"/>
 *     <enumeration value="S505"/>
 *     <enumeration value="S506"/>
 *     <enumeration value="S507"/>
 *     <enumeration value="S510"/>
 *     <enumeration value="S511"/>
 *     <enumeration value="S520"/>
 *     <enumeration value="S525"/>
 *     <enumeration value="S526"/>
 *     <enumeration value="S530"/>
 *     <enumeration value="S531"/>
 *     <enumeration value="S532"/>
 *     <enumeration value="S533"/>
 *     <enumeration value="S540"/>
 *     <enumeration value="S541"/>
 *     <enumeration value="S542"/>
 *     <enumeration value="S550"/>
 *     <enumeration value="S551"/>
 *     <enumeration value="S560"/>
 *     <enumeration value="S571"/>
 *     <enumeration value="S572"/>
 *     <enumeration value="S573"/>
 *     <enumeration value="S574"/>
 *     <enumeration value="S575"/>
 *     <enumeration value="S576"/>
 *     <enumeration value="S577"/>
 *     <enumeration value="S578"/>
 *     <enumeration value="S579"/>
 *     <enumeration value="S601"/>
 *     <enumeration value="S602"/>
 *     <enumeration value="S603"/>
 *     <enumeration value="S610"/>
 *     <enumeration value="S611"/>
 *     <enumeration value="S612"/>
 *     <enumeration value="S613"/>
 *     <enumeration value="S620"/>
 *     <enumeration value="S650"/>
 *     <enumeration value="S651"/>
 *     <enumeration value="S652"/>
 *     <enumeration value="S700"/>
 *     <enumeration value="S704"/>
 *     <enumeration value="S705"/>
 *     <enumeration value="S706"/>
 *     <enumeration value="S708"/>
 *     <enumeration value="S710"/>
 *     <enumeration value="S720"/>
 *     <enumeration value="S730"/>
 *     <enumeration value="S760"/>
 *     <enumeration value="S761"/>
 *     <enumeration value="S762"/>
 *     <enumeration value="S780"/>
 *     <enumeration value="S781"/>
 *     <enumeration value="S790"/>
 *     <enumeration value="S791"/>
 *     <enumeration value="S795"/>
 *     <enumeration value="S121"/>
 *     <enumeration value="S346"/>
 *     <enumeration value="S546"/>
 *     <enumeration value="S545"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DTCAssetType1Code")
@XmlEnum
public enum DTCAssetType1Code {


    /**
     * Equity.
     * 
     */
    @XmlEnumValue("S005")
    S_005("S005"),

    /**
     * Common Stock.
     * 
     */
    @XmlEnumValue("S010")
    S_010("S010"),

    /**
     * Convertible Common Stock.
     * 
     */
    @XmlEnumValue("S011")
    S_011("S011"),

    /**
     * Common Stock REIT.
     * 
     */
    @XmlEnumValue("S012")
    S_012("S012"),

    /**
     * Preferred Stock.
     * 
     */
    @XmlEnumValue("S020")
    S_020("S020"),

    /**
     * Preferred Stock REIT.
     * 
     */
    @XmlEnumValue("S022")
    S_022("S022"),

    /**
     * Convertible Preferred Stock.
     * 
     */
    @XmlEnumValue("S023")
    S_023("S023"),

    /**
     * Tender Rate Preferred Stock.
     * 
     */
    @XmlEnumValue("S024")
    S_024("S024"),

    /**
     * Limited Partnership.
     * 
     */
    @XmlEnumValue("S030")
    S_030("S030"),

    /**
     * CMO Denomination in "Units" or "Undivided Interest".
     * 
     */
    @XmlEnumValue("S040")
    S_040("S040"),

    /**
     * ABS Denomination in "Units" or "Undivided Interest".
     * 
     */
    @XmlEnumValue("S041")
    S_041("S041"),

    /**
     * Issue Denomination in "Units" or "Undivided Interest".
     * 
     */
    @XmlEnumValue("S042")
    S_042("S042"),

    /**
     * Auction Rate Preferred Stock (ARPS).
     * 
     */
    @XmlEnumValue("S102")
    S_102("S102"),

    /**
     * American Depositary Receipt (ADR).
     * 
     */
    @XmlEnumValue("S110")
    S_110("S110"),

    /**
     * Depositary Share.
     * 
     */
    @XmlEnumValue("S111")
    S_111("S111"),

    /**
     * Municipal Option Call Right.
     * 
     */
    @XmlEnumValue("S112")
    S_112("S112"),

    /**
     * Exchange Traded Funds.
     * 
     */
    @XmlEnumValue("S117")
    S_117("S117"),

    /**
     * MMI Preferred Stock (in CP-like mode).
     * 
     */
    @XmlEnumValue("S120")
    S_120("S120"),

    /**
     * Sealed Envelope.
     * 
     */
    @XmlEnumValue("S125")
    S_125("S125"),

    /**
     * Custody User CUSIP.
     * 
     */
    @XmlEnumValue("S126")
    S_126("S126"),

    /**
     * Real-Estate Investment Trust (REIT).
     * 
     */
    @XmlEnumValue("S130")
    S_130("S130"),

    /**
     * Municipal Bond.
     * 
     */
    @XmlEnumValue("S310")
    S_310("S310"),

    /**
     * Municipal Note.
     * 
     */
    @XmlEnumValue("S311")
    S_311("S311"),

    /**
     * Municipal Auction Rate Note (ARN).
     * 
     */
    @XmlEnumValue("S312")
    S_312("S312"),

    /**
     * Municipal Variable Mode Obligation (VMO).
     * 
     */
    @XmlEnumValue("S313")
    S_313("S313"),

    /**
     * Municipal Variable Rate Demand Obligation (VRDO).
     * 
     */
    @XmlEnumValue("S314")
    S_314("S314"),

    /**
     * Municipal Insured Custodial Receipt.
     * 
     */
    @XmlEnumValue("S315")
    S_315("S315"),

    /**
     * MMI Municipal VRDO/CP.
     * 
     */
    @XmlEnumValue("S320")
    S_320("S320"),

    /**
     * MMI Municipal Commercial Paper.
     * 
     */
    @XmlEnumValue("S330")
    S_330("S330"),

    /**
     * Bearer, Callable Zero Coupon Bond.
     * 
     */
    @XmlEnumValue("S340")
    S_340("S340"),

    /**
     * GNMA REMIC securities.
     * 
     */
    @XmlEnumValue("S450")
    S_450("S450"),

    /**
     * GNMA Pass-through securities.
     * 
     */
    @XmlEnumValue("S451")
    S_451("S451"),

    /**
     * GNMA Serial note securities.
     * 
     */
    @XmlEnumValue("S452")
    S_452("S452"),

    /**
     * Corporate Bond (CB) or Global Corp Bond (GCB).
     * 
     */
    @XmlEnumValue("S500")
    S_500("S500"),

    /**
     * MMI Bankers' Acceptance Note (BA).
     * 
     */
    @XmlEnumValue("S502")
    S_502("S502"),

    /**
     * MMI Institutional Certificates of Deposit.
     * 
     */
    @XmlEnumValue("S504")
    S_504("S504"),

    /**
     * Certificated Money Market Instrument.
     * 
     */
    @XmlEnumValue("S505")
    S_505("S505"),

    /**
     * Certificated Money Market - Periodic Payer.
     * 
     */
    @XmlEnumValue("S506")
    S_506("S506"),

    /**
     * Certificates of Deposit.
     * 
     */
    @XmlEnumValue("S507")
    S_507("S507"),

    /**
     * CPI Interest at Maturity (IAM) Commercial Paper.
     * 
     */
    @XmlEnumValue("S510")
    S_510("S510"),

    /**
     * Periodic Payment Commercial Paper.
     * 
     */
    @XmlEnumValue("S511")
    S_511("S511"),

    /**
     * CPI Discount Commercial Paper (CP).
     * 
     */
    @XmlEnumValue("S520")
    S_520("S520"),

    /**
     * MMI Corporate Commercial Paper.
     * 
     */
    @XmlEnumValue("S525")
    S_525("S525"),

    /**
     * MMI Corporate VRDO/CP.
     * 
     */
    @XmlEnumValue("S526")
    S_526("S526"),

    /**
     * MTN Medium Term Note.
     * 
     */
    @XmlEnumValue("S530")
    S_530("S530"),

    /**
     * MMI Deposit Note.
     * 
     */
    @XmlEnumValue("S531")
    S_531("S531"),

    /**
     * MMI Medium-Term Bank Note.
     * 
     */
    @XmlEnumValue("S532")
    S_532("S532"),

    /**
     * MMI Medium Term Note.
     * 
     */
    @XmlEnumValue("S533")
    S_533("S533"),

    /**
     * Collateralized Mortgage Obligation or Global CMO.
     * 
     */
    @XmlEnumValue("S540")
    S_540("S540"),

    /**
     * Asset-Backed security (ABS) or global ABS (GABS).
     * 
     */
    @XmlEnumValue("S541")
    S_541("S541"),

    /**
     * Non-CMO/ABS Amortizing Issue.
     * 
     */
    @XmlEnumValue("S542")
    S_542("S542"),

    /**
     * MMI Short-Term Bank Note.
     * 
     */
    @XmlEnumValue("S550")
    S_550("S550"),

    /**
     * Z CPN Denomination in Initial Principal Amt.
     * 
     */
    @XmlEnumValue("S551")
    S_551("S551"),

    /**
     * MMI Discount Note.
     * 
     */
    @XmlEnumValue("S560")
    S_560("S560"),

    /**
     * Corporate Auction Rate Note.
     * 
     */
    @XmlEnumValue("S571")
    S_571("S571"),

    /**
     * Convertible Corporate Debt.
     * 
     */
    @XmlEnumValue("S572")
    S_572("S572"),

    /**
     * Corporate Variable Mode Obligation (CVMO).
     * 
     */
    @XmlEnumValue("S573")
    S_573("S573"),

    /**
     * Corporate Short-Term Note.
     * 
     */
    @XmlEnumValue("S574")
    S_574("S574"),

    /**
     * Corporate Debenture.
     * 
     */
    @XmlEnumValue("S575")
    S_575("S575"),

    /**
     * Corporate VRDO / Municipal VRDO (MMD).
     * 
     */
    @XmlEnumValue("S576")
    S_576("S576"),

    /**
     * Corporate Insured Custodial Receipt.
     * 
     */
    @XmlEnumValue("S577")
    S_577("S577"),

    /**
     * Tender Rate Note.
     * 
     */
    @XmlEnumValue("S578")
    S_578("S578"),

    /**
     * Zero Coupon Bond.
     * 
     */
    @XmlEnumValue("S579")
    S_579("S579"),

    /**
     * Government security.
     * 
     */
    @XmlEnumValue("S601")
    S_601("S601"),

    /**
     * Government Trust Certificate.
     * 
     */
    @XmlEnumValue("S602")
    S_602("S602"),

    /**
     * Junk and Treasury Growth Receipt (JGR).
     * 
     */
    @XmlEnumValue("S603")
    S_603("S603"),

    /**
     * U.S. Treasury security.
     * 
     */
    @XmlEnumValue("S610")
    S_610("S610"),

    /**
     * US Treasury Bill.
     * 
     */
    @XmlEnumValue("S611")
    S_611("S611"),

    /**
     * US Treasury Note.
     * 
     */
    @XmlEnumValue("S612")
    S_612("S612"),

    /**
     * US Treasury Bond.
     * 
     */
    @XmlEnumValue("S613")
    S_613("S613"),

    /**
     * U.S. government agency security.
     * 
     */
    @XmlEnumValue("S620")
    S_620("S620"),

    /**
     * Government Nat'l Mortgage Association (GNMA).
     * 
     */
    @XmlEnumValue("S650")
    S_650("S650"),

    /**
     * REMIC (Real Estate Mortgage Investment Conduit).
     * 
     */
    @XmlEnumValue("S651")
    S_651("S651"),

    /**
     * GNMA Serial Note.
     * 
     */
    @XmlEnumValue("S652")
    S_652("S652"),

    /**
     * Package.
     * 
     */
    @XmlEnumValue("S700")
    S_700("S700"),

    /**
     * Corporate Debt Derivative.
     * 
     */
    @XmlEnumValue("S704")
    S_704("S704"),

    /**
     * Equity Derivative.
     * 
     */
    @XmlEnumValue("S705")
    S_705("S705"),

    /**
     * Municipal Derivative.
     * 
     */
    @XmlEnumValue("S706")
    S_706("S706"),

    /**
     * Municipal Amortized Issue.
     * 
     */
    @XmlEnumValue("S708")
    S_708("S708"),

    /**
     * Option Derivative.
     * 
     */
    @XmlEnumValue("S710")
    S_710("S710"),

    /**
     * Warrant.
     * 
     */
    @XmlEnumValue("S720")
    S_720("S720"),

    /**
     * Right.
     * 
     */
    @XmlEnumValue("S730")
    S_730("S730"),

    /**
     * Mutual Fund.
     * 
     */
    @XmlEnumValue("S760")
    S_760("S760"),

    /**
     * Closed End Fund.
     * 
     */
    @XmlEnumValue("S761")
    S_761("S761"),

    /**
     * (IMMI) Institutional MMI Mutual Fund Shares.
     * 
     */
    @XmlEnumValue("S762")
    S_762("S762"),

    /**
     * Equity Unit.
     * 
     */
    @XmlEnumValue("S780")
    S_780("S780"),

    /**
     * Debt Unit.
     * 
     */
    @XmlEnumValue("S781")
    S_781("S781"),

    /**
     * Unit Investment Trust (UIT) - Nuveen Only.
     * 
     */
    @XmlEnumValue("S790")
    S_790("S790"),

    /**
     * Global Unit Trust.
     * 
     */
    @XmlEnumValue("S791")
    S_791("S791"),

    /**
     * Unit Investment Trust (UIT).
     * 
     */
    @XmlEnumValue("S795")
    S_795("S795"),

    /**
     * Equity, subject to 144a, designated investors.
     * 
     */
    @XmlEnumValue("S121")
    S_121("S121"),

    /**
     * Municipal debt, classified as other, subject to tax exempt.
     * 
     */
    @XmlEnumValue("S346")
    S_346("S346"),

    /**
     * Corporate debt, classified as other, subject to tax exempt.
     * 
     */
    @XmlEnumValue("S546")
    S_546("S546"),

    /**
     * Corporate debt, subject to 144a, designated investors.
     * 
     */
    @XmlEnumValue("S545")
    S_545("S545");
    private final String value;

    DTCAssetType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DTCAssetType1Code fromValue(String v) {
        for (DTCAssetType1Code c: DTCAssetType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
