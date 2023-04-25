
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCAssetType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DTCAssetType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="S041"/>
 *     <enumeration value="S110"/>
 *     <enumeration value="S541"/>
 *     <enumeration value="S102"/>
 *     <enumeration value="S340"/>
 *     <enumeration value="S505"/>
 *     <enumeration value="S506"/>
 *     <enumeration value="S507"/>
 *     <enumeration value="S761"/>
 *     <enumeration value="S040"/>
 *     <enumeration value="S010"/>
 *     <enumeration value="S012"/>
 *     <enumeration value="S520"/>
 *     <enumeration value="S011"/>
 *     <enumeration value="S572"/>
 *     <enumeration value="S500"/>
 *     <enumeration value="S575"/>
 *     <enumeration value="S704"/>
 *     <enumeration value="S546"/>
 *     <enumeration value="S573"/>
 *     <enumeration value="S574"/>
 *     <enumeration value="S576"/>
 *     <enumeration value="S577"/>
 *     <enumeration value="S571"/>
 *     <enumeration value="S545"/>
 *     <enumeration value="S023"/>
 *     <enumeration value="S510"/>
 *     <enumeration value="S540"/>
 *     <enumeration value="S126"/>
 *     <enumeration value="S781"/>
 *     <enumeration value="S111"/>
 *     <enumeration value="S005"/>
 *     <enumeration value="S121"/>
 *     <enumeration value="S705"/>
 *     <enumeration value="S780"/>
 *     <enumeration value="S117"/>
 *     <enumeration value="S451"/>
 *     <enumeration value="S450"/>
 *     <enumeration value="S452"/>
 *     <enumeration value="S650"/>
 *     <enumeration value="S601"/>
 *     <enumeration value="S602"/>
 *     <enumeration value="S762"/>
 *     <enumeration value="S042"/>
 *     <enumeration value="S603"/>
 *     <enumeration value="S530"/>
 *     <enumeration value="S526"/>
 *     <enumeration value="S531"/>
 *     <enumeration value="S525"/>
 *     <enumeration value="S502"/>
 *     <enumeration value="S030"/>
 *     <enumeration value="S652"/>
 *     <enumeration value="S791"/>
 *     <enumeration value="S560"/>
 *     <enumeration value="S504"/>
 *     <enumeration value="S533"/>
 *     <enumeration value="S320"/>
 *     <enumeration value="S120"/>
 *     <enumeration value="S708"/>
 *     <enumeration value="S310"/>
 *     <enumeration value="S706"/>
 *     <enumeration value="S311"/>
 *     <enumeration value="S346"/>
 *     <enumeration value="S760"/>
 *     <enumeration value="S542"/>
 *     <enumeration value="S700"/>
 *     <enumeration value="S511"/>
 *     <enumeration value="S550"/>
 *     <enumeration value="S532"/>
 *     <enumeration value="S330"/>
 *     <enumeration value="S312"/>
 *     <enumeration value="S315"/>
 *     <enumeration value="S112"/>
 *     <enumeration value="S314"/>
 *     <enumeration value="S313"/>
 *     <enumeration value="S127"/>
 *     <enumeration value="S710"/>
 *     <enumeration value="S020"/>
 *     <enumeration value="S022"/>
 *     <enumeration value="S130"/>
 *     <enumeration value="S651"/>
 *     <enumeration value="S730"/>
 *     <enumeration value="S125"/>
 *     <enumeration value="S578"/>
 *     <enumeration value="S024"/>
 *     <enumeration value="S795"/>
 *     <enumeration value="S790"/>
 *     <enumeration value="S620"/>
 *     <enumeration value="S611"/>
 *     <enumeration value="S613"/>
 *     <enumeration value="S612"/>
 *     <enumeration value="S610"/>
 *     <enumeration value="S720"/>
 *     <enumeration value="S551"/>
 *     <enumeration value="S579"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DTCAssetType3Code")
@XmlEnum
public enum DTCAssetType3Code {


    /**
     * Asset is an asset-backed security denomination in "Units" or "Undivided Interest".
     * 
     */
    @XmlEnumValue("S041")
    S_041("S041"),

    /**
     * Asset is an American depositary receipt (ADR).
     * 
     */
    @XmlEnumValue("S110")
    S_110("S110"),

    /**
     * Asset is an asset-backed security (ABS) or global asset backed security (GABS).
     * 
     */
    @XmlEnumValue("S541")
    S_541("S541"),

    /**
     * Asset is an auction rate preferred stock (ARPS).
     * 
     */
    @XmlEnumValue("S102")
    S_102("S102"),

    /**
     * Asset is a bearer, callable zero coupon bond.
     * 
     */
    @XmlEnumValue("S340")
    S_340("S340"),

    /**
     * Asset is a certificated money market instrument.
     * 
     */
    @XmlEnumValue("S505")
    S_505("S505"),

    /**
     * Asset is a certificated money market - periodic payer.
     * 
     */
    @XmlEnumValue("S506")
    S_506("S506"),

    /**
     * Asset is a certificates of deposit.
     * 
     */
    @XmlEnumValue("S507")
    S_507("S507"),

    /**
     * Asset is a closed end fund.
     * 
     */
    @XmlEnumValue("S761")
    S_761("S761"),

    /**
     * Asset is a collateralized mortgage obligation denomination in "Units" or "Undivided Interest".
     * 
     */
    @XmlEnumValue("S040")
    S_040("S040"),

    /**
     * Asset is a common stock.
     * 
     */
    @XmlEnumValue("S010")
    S_010("S010"),

    /**
     * Asset is a common stock real estate investment trust.
     * 
     */
    @XmlEnumValue("S012")
    S_012("S012"),

    /**
     * Asset is a consumer price index discount commercial paper.
     * 
     */
    @XmlEnumValue("S520")
    S_520("S520"),

    /**
     * Asset is a convertible common stock.
     * 
     */
    @XmlEnumValue("S011")
    S_011("S011"),

    /**
     * Asset is a convertible corporate debt.
     * 
     */
    @XmlEnumValue("S572")
    S_572("S572"),

    /**
     * Asset is a corporate bond (CB) Or a global corporate bond (GCB).
     * 
     */
    @XmlEnumValue("S500")
    S_500("S500"),

    /**
     * Asset is a corporate debenture.
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
     * Asset is a corporate debt, classified as other, subject to tax exempt.
     * 
     */
    @XmlEnumValue("S546")
    S_546("S546"),

    /**
     * Asset is a corporate variable mode obligation (CVMO).
     * 
     */
    @XmlEnumValue("S573")
    S_573("S573"),

    /**
     * Asset is a corporate short-term note.
     * 
     */
    @XmlEnumValue("S574")
    S_574("S574"),

    /**
     * Asset is a corporate variable rate demand obligation or a municipal variable rate demand obligation (MMD).
     * 
     */
    @XmlEnumValue("S576")
    S_576("S576"),

    /**
     * Asset is a corporate insured custodial receipt.
     * 
     */
    @XmlEnumValue("S577")
    S_577("S577"),

    /**
     * Asset is a corporate auction rate note.
     * 
     */
    @XmlEnumValue("S571")
    S_571("S571"),

    /**
     * Asset is a corporate debt, subject to 144a, designated investors.
     * 
     */
    @XmlEnumValue("S545")
    S_545("S545"),

    /**
     * Asset is a convertible preferred stock.
     * 
     */
    @XmlEnumValue("S023")
    S_023("S023"),

    /**
     * Asset is a consumer price index interest at maturity (IAM) commercial paper.
     * 
     */
    @XmlEnumValue("S510")
    S_510("S510"),

    /**
     * Asset is a collateralized mortgage obligation or global collateralized mortgage obligation.
     * 
     */
    @XmlEnumValue("S540")
    S_540("S540"),

    /**
     * Asset is a custody user CUSIP.
     * 
     */
    @XmlEnumValue("S126")
    S_126("S126"),

    /**
     * Asset is a debt unit.
     * 
     */
    @XmlEnumValue("S781")
    S_781("S781"),

    /**
     * Asset is a depositary share.
     * 
     */
    @XmlEnumValue("S111")
    S_111("S111"),

    /**
     * Asset is an equity.
     * 
     */
    @XmlEnumValue("S005")
    S_005("S005"),

    /**
     * Asset is an equity, subject to 144a, designated investors.
     * 
     */
    @XmlEnumValue("S121")
    S_121("S121"),

    /**
     * Asset is an equity derivative.
     * 
     */
    @XmlEnumValue("S705")
    S_705("S705"),

    /**
     * Asset is an equity unit.
     * 
     */
    @XmlEnumValue("S780")
    S_780("S780"),

    /**
     * Asset is an exchange traded funds.
     * 
     */
    @XmlEnumValue("S117")
    S_117("S117"),

    /**
     * Asset is a government national mortgage association pass-through security.
     * 
     */
    @XmlEnumValue("S451")
    S_451("S451"),

    /**
     * Asset is a government national mortgage association real estate mortgage investment conduit security.
     * 
     */
    @XmlEnumValue("S450")
    S_450("S450"),

    /**
     * Asset is a government national mortgage association serial note security.
     * 
     */
    @XmlEnumValue("S452")
    S_452("S452"),

    /**
     * Asset is a government national mortgage association (GNMA).
     * 
     */
    @XmlEnumValue("S650")
    S_650("S650"),

    /**
     * Asset is a government national mortgage association government security.
     * 
     */
    @XmlEnumValue("S601")
    S_601("S601"),

    /**
     * Asset is a government trust certificate.
     * 
     */
    @XmlEnumValue("S602")
    S_602("S602"),

    /**
     * Asset is an institutional money market instrument mutual fund share.
     * 
     */
    @XmlEnumValue("S762")
    S_762("S762"),

    /**
     * Asset is an issue denomination in "Units" or "Undivided Interest".
     * 
     */
    @XmlEnumValue("S042")
    S_042("S042"),

    /**
     * Asset is a junk and treasury growth receipt (JGR).
     * 
     */
    @XmlEnumValue("S603")
    S_603("S603"),

    /**
     * Asset is a medium term note (MTN).
     * 
     */
    @XmlEnumValue("S530")
    S_530("S530"),

    /**
     * Asset is a money market instrument corporate variable rate demand obligation commercial paper.
     * 
     */
    @XmlEnumValue("S526")
    S_526("S526"),

    /**
     * Asset is a money market instrument deposit note.
     * 
     */
    @XmlEnumValue("S531")
    S_531("S531"),

    /**
     * Asset is a money market instrument corporate commercial paper.
     * 
     */
    @XmlEnumValue("S525")
    S_525("S525"),

    /**
     * Asset is a money market instrument bankers' acceptance note (BA).
     * 
     */
    @XmlEnumValue("S502")
    S_502("S502"),

    /**
     * Asset is a limited partnership.
     * 
     */
    @XmlEnumValue("S030")
    S_030("S030"),

    /**
     * Asset is a government national mortgage association serial note.
     * 
     */
    @XmlEnumValue("S652")
    S_652("S652"),

    /**
     * Asset is a global unit trust.
     * 
     */
    @XmlEnumValue("S791")
    S_791("S791"),

    /**
     * Asset is a money market instrument discount note.
     * 
     */
    @XmlEnumValue("S560")
    S_560("S560"),

    /**
     * Asset is a money market instrument institutional certificates of deposit.
     * 
     */
    @XmlEnumValue("S504")
    S_504("S504"),

    /**
     * Asset is a money market instrument medium term note.
     * 
     */
    @XmlEnumValue("S533")
    S_533("S533"),

    /**
     * Asset is a money market instrument municipal variable rate demand obligation commercial paper.
     * 
     */
    @XmlEnumValue("S320")
    S_320("S320"),

    /**
     * Asset is a money market instrument preferred stock (in CP-like mode).
     * 
     */
    @XmlEnumValue("S120")
    S_120("S120"),

    /**
     * Asset is a municipal amortized issue.
     * 
     */
    @XmlEnumValue("S708")
    S_708("S708"),

    /**
     * Asset is a municipal bond.
     * 
     */
    @XmlEnumValue("S310")
    S_310("S310"),

    /**
     * Asset is a municipal derivative.
     * 
     */
    @XmlEnumValue("S706")
    S_706("S706"),

    /**
     * Asset is a municipal note.
     * 
     */
    @XmlEnumValue("S311")
    S_311("S311"),

    /**
     * Asset is a municipal debt, classified as other, subject to tax exempt.
     * 
     */
    @XmlEnumValue("S346")
    S_346("S346"),

    /**
     * Asset is a mutual fund.
     * 
     */
    @XmlEnumValue("S760")
    S_760("S760"),

    /**
     * Asset is a non-collateralized mortgage obligation ABS amortizing issue.
     * 
     */
    @XmlEnumValue("S542")
    S_542("S542"),

    /**
     * Asset is a package.
     * 
     */
    @XmlEnumValue("S700")
    S_700("S700"),

    /**
     * Asset is a periodic payment commercial paper.
     * 
     */
    @XmlEnumValue("S511")
    S_511("S511"),

    /**
     * MMI Short-Term Bank Note.
     * 
     */
    @XmlEnumValue("S550")
    S_550("S550"),

    /**
     * Asset is a money market instrument medium-term bank note.
     * 
     */
    @XmlEnumValue("S532")
    S_532("S532"),

    /**
     * Asset is a money market instrument municipal commercial paper.
     * 
     */
    @XmlEnumValue("S330")
    S_330("S330"),

    /**
     * Asset is a municipal auction rate note (ARN).
     * 
     */
    @XmlEnumValue("S312")
    S_312("S312"),

    /**
     * Asset is a municipal insured custodial receipt.
     * 
     */
    @XmlEnumValue("S315")
    S_315("S315"),

    /**
     * Asset is a municipal option call right.
     * 
     */
    @XmlEnumValue("S112")
    S_112("S112"),

    /**
     * Asset is a municipal variable rate demand obligation (VRDO).
     * 
     */
    @XmlEnumValue("S314")
    S_314("S314"),

    /**
     * Asset is a municipal variable mode obligation (VMO).
     * 
     */
    @XmlEnumValue("S313")
    S_313("S313"),

    /**
     * Asset is a non standard asset user CUSIP.
     * 
     */
    @XmlEnumValue("S127")
    S_127("S127"),

    /**
     * Asset is an option derivative.
     * 
     */
    @XmlEnumValue("S710")
    S_710("S710"),

    /**
     * Asset is a preferred stock.
     * 
     */
    @XmlEnumValue("S020")
    S_020("S020"),

    /**
     * Asset is a preferred stock real estate investment trust.
     * 
     */
    @XmlEnumValue("S022")
    S_022("S022"),

    /**
     * Asset is a real estate investment trust (REIT).
     * 
     */
    @XmlEnumValue("S130")
    S_130("S130"),

    /**
     * Asset is a real estate mortgage investment conduit (REMIC).
     * 
     */
    @XmlEnumValue("S651")
    S_651("S651"),

    /**
     * Asset is a right.
     * 
     */
    @XmlEnumValue("S730")
    S_730("S730"),

    /**
     * Asset is a sealed envelope.
     * 
     */
    @XmlEnumValue("S125")
    S_125("S125"),

    /**
     * Asset is a tender rate note.
     * 
     */
    @XmlEnumValue("S578")
    S_578("S578"),

    /**
     * Asset is a tender rate preferred stock.
     * 
     */
    @XmlEnumValue("S024")
    S_024("S024"),

    /**
     * Asset is a unit investment trust (UIT).
     * 
     */
    @XmlEnumValue("S795")
    S_795("S795"),

    /**
     * Asset is a unit investment trust (UIT) nuveen only.
     * 
     */
    @XmlEnumValue("S790")
    S_790("S790"),

    /**
     * Asset is a U.S. government agency security.
     * 
     */
    @XmlEnumValue("S620")
    S_620("S620"),

    /**
     * Asset is a US treasury bill.
     * 
     */
    @XmlEnumValue("S611")
    S_611("S611"),

    /**
     * Asset is a US treasury bond.
     * 
     */
    @XmlEnumValue("S613")
    S_613("S613"),

    /**
     * Asset is a US treasury note.
     * 
     */
    @XmlEnumValue("S612")
    S_612("S612"),

    /**
     * Asset is a U.S. treasury security.
     * 
     */
    @XmlEnumValue("S610")
    S_610("S610"),

    /**
     * Asset is a warrant.
     * 
     */
    @XmlEnumValue("S720")
    S_720("S720"),

    /**
     * Asset is a zero coupon denomination in initial principal amount.
     * 
     */
    @XmlEnumValue("S551")
    S_551("S551"),

    /**
     * Asset is a zero coupon bond.
     * 
     */
    @XmlEnumValue("S579")
    S_579("S579");
    private final String value;

    DTCAssetType3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DTCAssetType3Code fromValue(String v) {
        for (DTCAssetType3Code c: DTCAssetType3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
