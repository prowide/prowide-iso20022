
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashClearingSystem3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CashClearingSystem3Code"&gt;
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
 *     &lt;enumeration value="DDK"/&gt;
 *     &lt;enumeration value="AIP"/&gt;
 *     &lt;enumeration value="BCC"/&gt;
 *     &lt;enumeration value="BDS"/&gt;
 *     &lt;enumeration value="BGN"/&gt;
 *     &lt;enumeration value="BHS"/&gt;
 *     &lt;enumeration value="BIS"/&gt;
 *     &lt;enumeration value="BSP"/&gt;
 *     &lt;enumeration value="EPM"/&gt;
 *     &lt;enumeration value="EPN"/&gt;
 *     &lt;enumeration value="FDA"/&gt;
 *     &lt;enumeration value="GIS"/&gt;
 *     &lt;enumeration value="INC"/&gt;
 *     &lt;enumeration value="JOD"/&gt;
 *     &lt;enumeration value="KPS"/&gt;
 *     &lt;enumeration value="LKB"/&gt;
 *     &lt;enumeration value="MEP"/&gt;
 *     &lt;enumeration value="MRS"/&gt;
 *     &lt;enumeration value="NAM"/&gt;
 *     &lt;enumeration value="PTR"/&gt;
 *     &lt;enumeration value="ROL"/&gt;
 *     &lt;enumeration value="ROS"/&gt;
 *     &lt;enumeration value="SCP"/&gt;
 *     &lt;enumeration value="STG"/&gt;
 *     &lt;enumeration value="THB"/&gt;
 *     &lt;enumeration value="TIS"/&gt;
 *     &lt;enumeration value="TTD"/&gt;
 *     &lt;enumeration value="UIS"/&gt;
 *     &lt;enumeration value="MOS"/&gt;
 *     &lt;enumeration value="ZET"/&gt;
 *     &lt;enumeration value="ZIS"/&gt;
 *     &lt;enumeration value="CHI"/&gt;
 *     &lt;enumeration value="COP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CashClearingSystem3Code")
@XmlEnum
public enum CashClearingSystem3Code {


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
     * Scheme code for CA (Canada) - Canadian Large Value Transfer System (LVTS)
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
     * Scheme code for DK (Denmark) - Danish Euro RTGS (KRONOS)
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
     * Scheme code for NL (Netherlands) - Dutch RTGS (TOP)
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
    ZEN,

    /**
     * Scheme code for DK (Denmark) - Danish Krone RTGS (KRONOS)
     * 
     */
    DDK,

    /**
     * Scheme code for AL (Albania) -  Albania Interbank Payment System.
     * 
     */
    AIP,

    /**
     * Scheme code for SE (Sweden) - Sweden BGC Clearing CUG.
     * 
     */
    BCC,

    /**
     * Scheme code for BB (Barbados) - Barbados RTGS (CBRTGS).
     * 
     */
    BDS,

    /**
     * Scheme code for BG (Bulgaria) - Bulgaria RTGS.
     * 
     */
    BGN,

    /**
     * Scheme code for BS (Bahamas) - Bahamas RTGS.
     * 
     */
    BHS,

    /**
     * Scheme code for BW (Botswana) - Botswana Interbank Settlement System.
     * 
     */
    BIS,

    /**
     * Scheme code for PH (Philippines) - Philippines Payment System.
     * 
     */
    BSP,

    /**
     * Scheme code for ECB (European Central Bank) - ECB Payment Mechanism.
     * 
     */
    EPM,

    /**
     * Scheme code for the US CHIPS-ACH.
     * 
     */
    EPN,

    /**
     * Scheme code for the US FED-ACH.
     * 
     */
    FDA,

    /**
     * Scheme code for GH (Ghana) - Ghana Interbank Settlement System (GISS).
     * 
     */
    GIS,

    /**
     * Scheme code for NL (Netherlands) - Netherlands Interpay CUG.
     * 
     */
    INC,

    /**
     * Scheme code for JO (Jordan) - Jordan RTGS.
     * 
     */
    JOD,

    /**
     * Scheme code for KE (Kenya) - Kenyan Electronic Payment Settlement System.
     * 
     */
    KPS,

    /**
     * Scheme code for LK (Sri Lanka) - Sri Lanka (Lankasettle).
     * 
     */
    LKB,

    /**
     * Scheme code for SG (Singapore) - Singapore RTGS (MEPS+).
     * 
     */
    MEP,

    /**
     * Scheme code for MT (Malta) - Malta Realtime Interbank Settlement System.
     * 
     */
    MRS,

    /**
     * Scheme code for NA (Namibian) - Namibian Interbank Settlement System.
     * 
     */
    NAM,

    /**
     * Scheme code for AO (Angola) - Angola RTGS.
     * 
     */
    PTR,

    /**
     * Scheme code for RO (Romania) - Romanian Electronic Payment Operations RT.
     * 
     */
    ROL,

    /**
     * Scheme code for RO (Romania) - Romanian GSRS.
     * 
     */
    ROS,

    /**
     * Scheme code for CL (Chile) - Chilean Interbank Payment System.
     * 
     */
    SCP,

    /**
     * Scheme code for UK (United Kingdom) - CHAPS Sterling RTGS.
     * 
     */
    STG,

    /**
     * Scheme code for TH (Thailand) - Thailand Payment System (Bahtnet/2).
     * 
     */
    THB,

    /**
     * Scheme code for TZ (Tanzania) - Tanzania Interbank Settlement System (TISS).
     * 
     */
    TIS,

    /**
     * Scheme code for TT (Trinidad and Tobago ) - Trinidad and Tobago SAFE-TT.
     * 
     */
    TTD,

    /**
     * Scheme code for UG (Uganda) - Uganda National Interbank Settlement System.
     * 
     */
    UIS,

    /**
     * Scheme code for ZA (South Africa) - South-African Multiple Option Settlement.
     * 
     */
    MOS,

    /**
     * Scheme code for ZW (Zimbabwe) - Zimbabwe Electronic Transfer & Settlement System.
     * 
     */
    ZET,

    /**
     * Scheme code for ZM (Zambia) - Zambian Interbank Payment &Settlement System.
     * 
     */
    ZIS,

    /**
     * CHIPS is the Clearing House Interbank Payment System in the US.
     * 
     */
    CHI,

    /**
     * Scheme code for Columbia (CO) - Colombian ACH CENIT Central Bank Payment System.
     * 
     */
    COP;

    public String value() {
        return name();
    }

    public static CashClearingSystem3Code fromValue(String v) {
        return valueOf(v);
    }

}
