
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashClearingSystem1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CashClearingSystem1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ABE"/>
 *     <enumeration value="ART"/>
 *     <enumeration value="AVP"/>
 *     <enumeration value="AZM"/>
 *     <enumeration value="BAP"/>
 *     <enumeration value="BEL"/>
 *     <enumeration value="BOF"/>
 *     <enumeration value="BRL"/>
 *     <enumeration value="CAD"/>
 *     <enumeration value="CAM"/>
 *     <enumeration value="CBJ"/>
 *     <enumeration value="CHP"/>
 *     <enumeration value="DKC"/>
 *     <enumeration value="RTP"/>
 *     <enumeration value="EBA"/>
 *     <enumeration value="ELS"/>
 *     <enumeration value="ERP"/>
 *     <enumeration value="XCT"/>
 *     <enumeration value="HRK"/>
 *     <enumeration value="HRM"/>
 *     <enumeration value="HUF"/>
 *     <enumeration value="LGS"/>
 *     <enumeration value="LVL"/>
 *     <enumeration value="MOS"/>
 *     <enumeration value="MUP"/>
 *     <enumeration value="NOC"/>
 *     <enumeration value="PCH"/>
 *     <enumeration value="PDS"/>
 *     <enumeration value="PEG"/>
 *     <enumeration value="PNS"/>
 *     <enumeration value="PVE"/>
 *     <enumeration value="SEC"/>
 *     <enumeration value="SIT"/>
 *     <enumeration value="SLB"/>
 *     <enumeration value="SPG"/>
 *     <enumeration value="SSK"/>
 *     <enumeration value="TBF"/>
 *     <enumeration value="TGT"/>
 *     <enumeration value="TOP"/>
 *     <enumeration value="FDW"/>
 *     <enumeration value="BOJ"/>
 *     <enumeration value="FEY"/>
 *     <enumeration value="ZEN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
