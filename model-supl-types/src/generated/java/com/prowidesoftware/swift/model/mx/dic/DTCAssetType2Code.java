
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCAssetType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DTCAssetType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="S041"/&gt;
 *     &lt;enumeration value="S110"/&gt;
 *     &lt;enumeration value="S541"/&gt;
 *     &lt;enumeration value="S102"/&gt;
 *     &lt;enumeration value="S505"/&gt;
 *     &lt;enumeration value="S340"/&gt;
 *     &lt;enumeration value="S506"/&gt;
 *     &lt;enumeration value="S507"/&gt;
 *     &lt;enumeration value="S761"/&gt;
 *     &lt;enumeration value="S040"/&gt;
 *     &lt;enumeration value="S540"/&gt;
 *     &lt;enumeration value="S010"/&gt;
 *     &lt;enumeration value="S012"/&gt;
 *     &lt;enumeration value="S011"/&gt;
 *     &lt;enumeration value="S572"/&gt;
 *     &lt;enumeration value="S023"/&gt;
 *     &lt;enumeration value="S545"/&gt;
 *     &lt;enumeration value="S571"/&gt;
 *     &lt;enumeration value="S500"/&gt;
 *     &lt;enumeration value="S575"/&gt;
 *     &lt;enumeration value="S704"/&gt;
 *     &lt;enumeration value="S577"/&gt;
 *     &lt;enumeration value="S546"/&gt;
 *     &lt;enumeration value="S574"/&gt;
 *     &lt;enumeration value="S573"/&gt;
 *     &lt;enumeration value="S576"/&gt;
 *     &lt;enumeration value="S520"/&gt;
 *     &lt;enumeration value="S510"/&gt;
 *     &lt;enumeration value="S126"/&gt;
 *     &lt;enumeration value="S781"/&gt;
 *     &lt;enumeration value="S111"/&gt;
 *     &lt;enumeration value="S005"/&gt;
 *     &lt;enumeration value="S121"/&gt;
 *     &lt;enumeration value="S705"/&gt;
 *     &lt;enumeration value="S117"/&gt;
 *     &lt;enumeration value="S451"/&gt;
 *     &lt;enumeration value="S650"/&gt;
 *     &lt;enumeration value="S601"/&gt;
 *     &lt;enumeration value="S042"/&gt;
 *     &lt;enumeration value="S780"/&gt;
 *     &lt;enumeration value="S791"/&gt;
 *     &lt;enumeration value="S452"/&gt;
 *     &lt;enumeration value="S652"/&gt;
 *     &lt;enumeration value="S450"/&gt;
 *     &lt;enumeration value="S602"/&gt;
 *     &lt;enumeration value="S762"/&gt;
 *     &lt;enumeration value="S603"/&gt;
 *     &lt;enumeration value="S030"/&gt;
 *     &lt;enumeration value="S502"/&gt;
 *     &lt;enumeration value="S525"/&gt;
 *     &lt;enumeration value="S526"/&gt;
 *     &lt;enumeration value="S531"/&gt;
 *     &lt;enumeration value="S560"/&gt;
 *     &lt;enumeration value="S504"/&gt;
 *     &lt;enumeration value="S532"/&gt;
 *     &lt;enumeration value="S533"/&gt;
 *     &lt;enumeration value="S330"/&gt;
 *     &lt;enumeration value="S320"/&gt;
 *     &lt;enumeration value="S120"/&gt;
 *     &lt;enumeration value="S550"/&gt;
 *     &lt;enumeration value="S530"/&gt;
 *     &lt;enumeration value="S708"/&gt;
 *     &lt;enumeration value="S312"/&gt;
 *     &lt;enumeration value="S310"/&gt;
 *     &lt;enumeration value="S706"/&gt;
 *     &lt;enumeration value="S315"/&gt;
 *     &lt;enumeration value="S311"/&gt;
 *     &lt;enumeration value="S346"/&gt;
 *     &lt;enumeration value="S112"/&gt;
 *     &lt;enumeration value="S313"/&gt;
 *     &lt;enumeration value="S314"/&gt;
 *     &lt;enumeration value="S760"/&gt;
 *     &lt;enumeration value="S542"/&gt;
 *     &lt;enumeration value="S127"/&gt;
 *     &lt;enumeration value="S710"/&gt;
 *     &lt;enumeration value="S700"/&gt;
 *     &lt;enumeration value="S511"/&gt;
 *     &lt;enumeration value="S020"/&gt;
 *     &lt;enumeration value="S022"/&gt;
 *     &lt;enumeration value="S130"/&gt;
 *     &lt;enumeration value="S651"/&gt;
 *     &lt;enumeration value="S730"/&gt;
 *     &lt;enumeration value="S125"/&gt;
 *     &lt;enumeration value="S578"/&gt;
 *     &lt;enumeration value="S024"/&gt;
 *     &lt;enumeration value="S795"/&gt;
 *     &lt;enumeration value="S790"/&gt;
 *     &lt;enumeration value="S620"/&gt;
 *     &lt;enumeration value="S611"/&gt;
 *     &lt;enumeration value="S613"/&gt;
 *     &lt;enumeration value="S610"/&gt;
 *     &lt;enumeration value="S612"/&gt;
 *     &lt;enumeration value="S720"/&gt;
 *     &lt;enumeration value="S551"/&gt;
 *     &lt;enumeration value="S579"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DTCAssetType2Code")
@XmlEnum
public enum DTCAssetType2Code {


    /**
     * ABS Denomination in "Units" or "Undivided Interest".
     * 
     */
    @XmlEnumValue("S041")
    S_041("S041"),

    /**
     * American Depositary Receipt (ADR).
     * 
     */
    @XmlEnumValue("S110")
    S_110("S110"),

    /**
     * Asset-Backed security (ABS) or global ABS (GABS).
     * 
     */
    @XmlEnumValue("S541")
    S_541("S541"),

    /**
     * Auction Rate Preferred Stock (ARPS).
     * 
     */
    @XmlEnumValue("S102")
    S_102("S102"),

    /**
     * Certificated Money Market Instrument.
     * 
     */
    @XmlEnumValue("S505")
    S_505("S505"),

    /**
     * Bearer, Callable Zero Coupon Bond.
     * 
     */
    @XmlEnumValue("S340")
    S_340("S340"),

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
     * Closed End Fund.
     * 
     */
    @XmlEnumValue("S761")
    S_761("S761"),

    /**
     * CMO Denomination in "Units" or "Undivided Interest".
     * 
     */
    @XmlEnumValue("S040")
    S_040("S040"),

    /**
     * Collateralized Mortgage Obligation or Global CMO.
     * 
     */
    @XmlEnumValue("S540")
    S_540("S540"),

    /**
     * Common Stock.
     * 
     */
    @XmlEnumValue("S010")
    S_010("S010"),

    /**
     * Common Stock REIT.
     * 
     */
    @XmlEnumValue("S012")
    S_012("S012"),

    /**
     * Convertible Common Stock.
     * 
     */
    @XmlEnumValue("S011")
    S_011("S011"),

    /**
     * Convertible Corporate Debt.
     * 
     */
    @XmlEnumValue("S572")
    S_572("S572"),

    /**
     * Convertible Preferred Stock.
     * 
     */
    @XmlEnumValue("S023")
    S_023("S023"),

    /**
     * Corporate debt, subject to 144a, designated investors.
     * 
     */
    @XmlEnumValue("S545")
    S_545("S545"),

    /**
     * Corporate Auction Rate Note.
     * 
     */
    @XmlEnumValue("S571")
    S_571("S571"),

    /**
     * Corporate Bond (CB) or Global Corp Bond (GCB).
     * 
     */
    @XmlEnumValue("S500")
    S_500("S500"),

    /**
     * Corporate Debenture.
     * 
     */
    @XmlEnumValue("S575")
    S_575("S575"),

    /**
     * Corporate Debt Derivative.
     * 
     */
    @XmlEnumValue("S704")
    S_704("S704"),

    /**
     * Corporate Insured Custodial Receipt.
     * 
     */
    @XmlEnumValue("S577")
    S_577("S577"),

    /**
     * Corporate debt, classified as other, subject to tax exempt.
     * 
     */
    @XmlEnumValue("S546")
    S_546("S546"),

    /**
     * Corporate Short-Term Note.
     * 
     */
    @XmlEnumValue("S574")
    S_574("S574"),

    /**
     * Corporate Variable Mode Obligation (CVMO).
     * 
     */
    @XmlEnumValue("S573")
    S_573("S573"),

    /**
     * Corporate VRDO / Municipal VRDO (MMD).
     * 
     */
    @XmlEnumValue("S576")
    S_576("S576"),

    /**
     * CPI Discount Commercial Paper (CP).
     * 
     */
    @XmlEnumValue("S520")
    S_520("S520"),

    /**
     * CPI Interest at Maturity (IAM) Commercial Paper.
     * 
     */
    @XmlEnumValue("S510")
    S_510("S510"),

    /**
     * Custody User CUSIP.
     * 
     */
    @XmlEnumValue("S126")
    S_126("S126"),

    /**
     * Debt Unit.
     * 
     */
    @XmlEnumValue("S781")
    S_781("S781"),

    /**
     * Depositary Share.
     * 
     */
    @XmlEnumValue("S111")
    S_111("S111"),

    /**
     * Equity.
     * 
     */
    @XmlEnumValue("S005")
    S_005("S005"),

    /**
     * Equity, subject to 144a, designated investors.
     * 
     */
    @XmlEnumValue("S121")
    S_121("S121"),

    /**
     * Equity Derivative.
     * 
     */
    @XmlEnumValue("S705")
    S_705("S705"),

    /**
     * Exchange Traded Funds.
     * 
     */
    @XmlEnumValue("S117")
    S_117("S117"),

    /**
     * GNMA Pass-through securities.
     * 
     */
    @XmlEnumValue("S451")
    S_451("S451"),

    /**
     * Government Nat'l Mortgage Association (GNMA).
     * 
     */
    @XmlEnumValue("S650")
    S_650("S650"),

    /**
     * Government security.
     * 
     */
    @XmlEnumValue("S601")
    S_601("S601"),

    /**
     * Issue Denomination in "Units" or "Undivided Interest".
     * 
     */
    @XmlEnumValue("S042")
    S_042("S042"),

    /**
     * Equity Unit.
     * 
     */
    @XmlEnumValue("S780")
    S_780("S780"),

    /**
     * Global Unit Trust.
     * 
     */
    @XmlEnumValue("S791")
    S_791("S791"),

    /**
     * GNMA Serial note securities.
     * 
     */
    @XmlEnumValue("S452")
    S_452("S452"),

    /**
     * GNMA Serial Note.
     * 
     */
    @XmlEnumValue("S652")
    S_652("S652"),

    /**
     * GNMA REMIC securities.
     * 
     */
    @XmlEnumValue("S450")
    S_450("S450"),

    /**
     * Government Trust Certificate.
     * 
     */
    @XmlEnumValue("S602")
    S_602("S602"),

    /**
     * (IMMI) Institutional MMI Mutual Fund Shares.
     * 
     */
    @XmlEnumValue("S762")
    S_762("S762"),

    /**
     * Junk and Treasury Growth Receipt (JGR).
     * 
     */
    @XmlEnumValue("S603")
    S_603("S603"),

    /**
     * Limited Partnership.
     * 
     */
    @XmlEnumValue("S030")
    S_030("S030"),

    /**
     * MMI Bankers' Acceptance Note (BA).
     * 
     */
    @XmlEnumValue("S502")
    S_502("S502"),

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
     * MMI Deposit Note.
     * 
     */
    @XmlEnumValue("S531")
    S_531("S531"),

    /**
     * MMI Discount Note.
     * 
     */
    @XmlEnumValue("S560")
    S_560("S560"),

    /**
     * MMI Institutional Certificates of Deposit.
     * 
     */
    @XmlEnumValue("S504")
    S_504("S504"),

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
     * MMI Municipal Commercial Paper.
     * 
     */
    @XmlEnumValue("S330")
    S_330("S330"),

    /**
     * MMI Municipal VRDO/CP.
     * 
     */
    @XmlEnumValue("S320")
    S_320("S320"),

    /**
     * MMI Preferred Stock (in CP-like mode).
     * 
     */
    @XmlEnumValue("S120")
    S_120("S120"),

    /**
     * MMI Short-Term Bank Note.
     * 
     */
    @XmlEnumValue("S550")
    S_550("S550"),

    /**
     * MTN Medium Term Note.
     * 
     */
    @XmlEnumValue("S530")
    S_530("S530"),

    /**
     * Municipal Amortized Issue.
     * 
     */
    @XmlEnumValue("S708")
    S_708("S708"),

    /**
     * Municipal Auction Rate Note (ARN).
     * 
     */
    @XmlEnumValue("S312")
    S_312("S312"),

    /**
     * Municipal Bond.
     * 
     */
    @XmlEnumValue("S310")
    S_310("S310"),

    /**
     * Municipal Derivative.
     * 
     */
    @XmlEnumValue("S706")
    S_706("S706"),

    /**
     * Municipal Insured Custodial Receipt.
     * 
     */
    @XmlEnumValue("S315")
    S_315("S315"),

    /**
     * Municipal Note.
     * 
     */
    @XmlEnumValue("S311")
    S_311("S311"),

    /**
     * Municipal debt, classified as other, subject to tax exempt.
     * 
     */
    @XmlEnumValue("S346")
    S_346("S346"),

    /**
     * Municipal Option Call Right.
     * 
     */
    @XmlEnumValue("S112")
    S_112("S112"),

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
     * Mutual Fund.
     * 
     */
    @XmlEnumValue("S760")
    S_760("S760"),

    /**
     * Non-CMO/ABS Amortizing Issue.
     * 
     */
    @XmlEnumValue("S542")
    S_542("S542"),

    /**
     * Non standard asset user CUSIP.
     * 
     */
    @XmlEnumValue("S127")
    S_127("S127"),

    /**
     * Option Derivative.
     * 
     */
    @XmlEnumValue("S710")
    S_710("S710"),

    /**
     * Package.
     * 
     */
    @XmlEnumValue("S700")
    S_700("S700"),

    /**
     * Periodic Payment Commercial Paper.
     * 
     */
    @XmlEnumValue("S511")
    S_511("S511"),

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
     * Real-Estate Investment Trust (REIT).
     * 
     */
    @XmlEnumValue("S130")
    S_130("S130"),

    /**
     * REMIC (Real Estate Mortgage Investment Conduit).
     * 
     */
    @XmlEnumValue("S651")
    S_651("S651"),

    /**
     * Right.
     * 
     */
    @XmlEnumValue("S730")
    S_730("S730"),

    /**
     * Sealed Envelope.
     * 
     */
    @XmlEnumValue("S125")
    S_125("S125"),

    /**
     * Tender Rate Note.
     * 
     */
    @XmlEnumValue("S578")
    S_578("S578"),

    /**
     * Tender Rate Preferred Stock.
     * 
     */
    @XmlEnumValue("S024")
    S_024("S024"),

    /**
     * Unit Investment Trust (UIT).
     * 
     */
    @XmlEnumValue("S795")
    S_795("S795"),

    /**
     * Unit Investment Trust (UIT) - Nuveen Only.
     * 
     */
    @XmlEnumValue("S790")
    S_790("S790"),

    /**
     * U.S. government agency security.
     * 
     */
    @XmlEnumValue("S620")
    S_620("S620"),

    /**
     * US Treasury Bill.
     * 
     */
    @XmlEnumValue("S611")
    S_611("S611"),

    /**
     * US Treasury Bond.
     * 
     */
    @XmlEnumValue("S613")
    S_613("S613"),

    /**
     * U.S. Treasury security.
     * 
     */
    @XmlEnumValue("S610")
    S_610("S610"),

    /**
     * US Treasury Note.
     * 
     */
    @XmlEnumValue("S612")
    S_612("S612"),

    /**
     * Warrant.
     * 
     */
    @XmlEnumValue("S720")
    S_720("S720"),

    /**
     * Z CPN Denomination in Initial Principal Amt.
     * 
     */
    @XmlEnumValue("S551")
    S_551("S551"),

    /**
     * Zero Coupon Bond.
     * 
     */
    @XmlEnumValue("S579")
    S_579("S579");
    private final String value;

    DTCAssetType2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DTCAssetType2Code fromValue(String v) {
        for (DTCAssetType2Code c: DTCAssetType2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
