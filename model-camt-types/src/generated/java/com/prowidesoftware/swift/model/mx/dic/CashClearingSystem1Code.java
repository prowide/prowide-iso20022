
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashClearingSystem1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CashClearingSystem1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABE"/&gt;
 *     &lt;enumeration value="ART"/&gt;
 *     &lt;enumeration value="AVP"/&gt;
 *     &lt;enumeration value="AZM"/&gt;
 *     &lt;enumeration value="BAP"/&gt;
 *     &lt;enumeration value="BEL"/&gt;
 *     &lt;enumeration value="BOF"/&gt;
 *     &lt;enumeration value="BRL"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="CAM"/&gt;
 *     &lt;enumeration value="CBJ"/&gt;
 *     &lt;enumeration value="CHP"/&gt;
 *     &lt;enumeration value="DKC"/&gt;
 *     &lt;enumeration value="RTP"/&gt;
 *     &lt;enumeration value="EBA"/&gt;
 *     &lt;enumeration value="ELS"/&gt;
 *     &lt;enumeration value="ERP"/&gt;
 *     &lt;enumeration value="XCT"/&gt;
 *     &lt;enumeration value="HRK"/&gt;
 *     &lt;enumeration value="HRM"/&gt;
 *     &lt;enumeration value="HUF"/&gt;
 *     &lt;enumeration value="LGS"/&gt;
 *     &lt;enumeration value="LVL"/&gt;
 *     &lt;enumeration value="MOS"/&gt;
 *     &lt;enumeration value="MUP"/&gt;
 *     &lt;enumeration value="NOC"/&gt;
 *     &lt;enumeration value="PCH"/&gt;
 *     &lt;enumeration value="PDS"/&gt;
 *     &lt;enumeration value="PEG"/&gt;
 *     &lt;enumeration value="PNS"/&gt;
 *     &lt;enumeration value="PVE"/&gt;
 *     &lt;enumeration value="SEC"/&gt;
 *     &lt;enumeration value="SIT"/&gt;
 *     &lt;enumeration value="SLB"/&gt;
 *     &lt;enumeration value="SPG"/&gt;
 *     &lt;enumeration value="SSK"/&gt;
 *     &lt;enumeration value="TBF"/&gt;
 *     &lt;enumeration value="TGT"/&gt;
 *     &lt;enumeration value="TOP"/&gt;
 *     &lt;enumeration value="FDW"/&gt;
 *     &lt;enumeration value="BOJ"/&gt;
 *     &lt;enumeration value="FEY"/&gt;
 *     &lt;enumeration value="ZEN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CashClearingSystem1Code")
@XmlEnum
public enum CashClearingSystem1Code {


    /**
     * Scheme code for EBA Euro1/Step1.
     * 
     */
    ABE,

    /**
     * Scheme code for AT (Austria) - Austrian RTGS (ARTIS).
     * 
     */
    ART,

    /**
     * Scheme code for NZ (New Zealand) - New Zealand Assured Value Payments.
     * 
     */
    AVP,

    /**
     * Scheme code for AZ (Azerbaijan) - Azerbaijan Interbank Payment System (AZIPS).
     * 
     */
    AZM,

    /**
     * Scheme code for BA (Bosnia and Herzegovina).
     * 
     */
    BAP,

    /**
     * Scheme code for BE (Belgium) - Belgium RTGS (ELLIPS).
     * 
     */
    BEL,

    /**
     * Scheme code for FI (Finland) - RTGS (BOF).
     * 
     */
    BOF,

    /**
     * Scheme code for IT (Italy) - Italy RTGS (BIREL).
     * 
     */
    BRL,

    /**
     * Scheme code for CA (Canada) - Canadian Large Value Transfer System (LVTS).
     * 
     */
    CAD,

    /**
     * Scheme code for ES (Spain).
     * 
     */
    CAM,

    /**
     * Scheme code for IE (Ireland) - Irish RTGS (IRIS).
     * 
     */
    CBJ,

    /**
     * Scheme code for GB (UK) - British Euro RTGS (CHAPS).
     * 
     */
    CHP,

    /**
     * Scheme code for DK (Denmark) - Danish Euro RTGS (KRONOS).
     * 
     */
    DKC,

    /**
     * Scheme code for DE (Germany).
     * 
     */
    RTP,

    /**
     * Scheme code for EBA Euro1.
     * 
     */
    EBA,

    /**
     * Scheme code for DE (Germany).
     * 
     */
    ELS,

    /**
     * Scheme code for EBA step 1 (members).
     * 
     */
    ERP,

    /**
     * Scheme code for EBA step 2.
     * 
     */
    XCT,

    /**
     * Scheme code for HR (Croatia) - HSVP.
     * 
     */
    HRK,

    /**
     * Scheme code for GR (Greece) - Greek RTGS (HERMES).
     * 
     */
    HRM,

    /**
     * Scheme code for HU (Hungary) - VIBER.
     * 
     */
    HUF,

    /**
     * Scheme code for LU (Luxemburg) - Luxembourg RTGS (LIPS).
     * 
     */
    LGS,

    /**
     * Scheme code for LV (Latvia).
     * 
     */
    LVL,

    /**
     * Scheme code for ZA (South Africa) - South-African Multiple Option Settlement.
     * 
     */
    MOS,

    /**
     * Scheme code for MU (Mauritius).
     * 
     */
    MUP,

    /**
     * Scheme code for NO (Norway).
     * 
     */
    NOC,

    /**
     * Scheme code for CH (Switzerland).
     * 
     */
    PCH,

    /**
     * Scheme code for AU (Australia).
     * 
     */
    PDS,

    /**
     * Scheme code for EG (Egypt).
     * 
     */
    PEG,

    /**
     * Scheme code for FR (France).
     * 
     */
    PNS,

    /**
     * Scheme code for Ve (Venezuela).
     * 
     */
    PVE,

    /**
     * Scheme code for SE (Sweden) - Swedish Euro RTGS (SEC).
     * 
     */
    SEC,

    /**
     * Scheme code for SI (Slovenia).
     * 
     */
    SIT,

    /**
     * Scheme code for ES (Spain) - Spanish RTGS (SLBE).
     * 
     */
    SLB,

    /**
     * Scheme code for PT (Portugal) - Portuguese RTGS (SPGT).
     * 
     */
    SPG,

    /**
     * Scheme code for SE (Sweden) - SEK RTGS (RIX).
     * 
     */
    SSK,

    /**
     * Scheme code for FR (France) - French RTGS (TBF).
     * 
     */
    TBF,

    /**
     * Scheme code for Target.
     * 
     */
    TGT,

    /**
     * Scheme code for NL (Netherlands) - Dutch RTGS (TOP).
     * 
     */
    TOP,

    /**
     * Scheme code for the US national real time gross settlement system.
     * 
     */
    FDW,

    /**
     * Scheme code for the Bank of Japan clearing system.
     * 
     */
    BOJ,

    /**
     * Scheme code for the Foreign Exchange Yen Clearing system (FEYCS). It is the Japanese electronic interbank system for sending guaranteed and unconditional yen payments of FX deals for same day settlement from one settlement bank, on behalf of itself or its customers, to another settlement bank.
     * 
     */
    FEY,

    /**
     * Scheme code for the Zengin system. The electronic payment system for domestic third party transfers managed by the Tokyo Bankers Association.
     * 
     */
    ZEN;

    public String value() {
        return name();
    }

    public static CashClearingSystem1Code fromValue(String v) {
        return valueOf(v);
    }

}
