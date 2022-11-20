
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCAdjustmentPaymentSubReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DTCAdjustmentPaymentSubReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="S777"/&gt;
 *     &lt;enumeration value="SRPO"/&gt;
 *     &lt;enumeration value="SBRH"/&gt;
 *     &lt;enumeration value="SDRH"/&gt;
 *     &lt;enumeration value="SCRK"/&gt;
 *     &lt;enumeration value="SWRH"/&gt;
 *     &lt;enumeration value="SFAP"/&gt;
 *     &lt;enumeration value="SETO"/&gt;
 *     &lt;enumeration value="SAJA"/&gt;
 *     &lt;enumeration value="SASA"/&gt;
 *     &lt;enumeration value="SSR4"/&gt;
 *     &lt;enumeration value="SSR5"/&gt;
 *     &lt;enumeration value="SSOS"/&gt;
 *     &lt;enumeration value="SSLA"/&gt;
 *     &lt;enumeration value="SSPO"/&gt;
 *     &lt;enumeration value="SRPP"/&gt;
 *     &lt;enumeration value="SSME"/&gt;
 *     &lt;enumeration value="SSPE"/&gt;
 *     &lt;enumeration value="SAFA"/&gt;
 *     &lt;enumeration value="SCPK"/&gt;
 *     &lt;enumeration value="SACP"/&gt;
 *     &lt;enumeration value="SACA"/&gt;
 *     &lt;enumeration value="SRTJ"/&gt;
 *     &lt;enumeration value="SWL1"/&gt;
 *     &lt;enumeration value="SSJJ"/&gt;
 *     &lt;enumeration value="SNNG"/&gt;
 *     &lt;enumeration value="SRAH"/&gt;
 *     &lt;enumeration value="SRIH"/&gt;
 *     &lt;enumeration value="SWM1"/&gt;
 *     &lt;enumeration value="SAIA"/&gt;
 *     &lt;enumeration value="SSD6"/&gt;
 *     &lt;enumeration value="SSPJ"/&gt;
 *     &lt;enumeration value="SGLA"/&gt;
 *     &lt;enumeration value="SSRJ"/&gt;
 *     &lt;enumeration value="SABA"/&gt;
 *     &lt;enumeration value="SST6"/&gt;
 *     &lt;enumeration value="SFLD"/&gt;
 *     &lt;enumeration value="SARA"/&gt;
 *     &lt;enumeration value="SSDJ"/&gt;
 *     &lt;enumeration value="SAPP"/&gt;
 *     &lt;enumeration value="SCKS"/&gt;
 *     &lt;enumeration value="SSBK"/&gt;
 *     &lt;enumeration value="SFAF"/&gt;
 *     &lt;enumeration value="SSR6"/&gt;
 *     &lt;enumeration value="SJCB"/&gt;
 *     &lt;enumeration value="SADA"/&gt;
 *     &lt;enumeration value="SANA"/&gt;
 *     &lt;enumeration value="SBEB"/&gt;
 *     &lt;enumeration value="SBB1"/&gt;
 *     &lt;enumeration value="SFI9"/&gt;
 *     &lt;enumeration value="SSDK"/&gt;
 *     &lt;enumeration value="SSCK"/&gt;
 *     &lt;enumeration value="SRDA"/&gt;
 *     &lt;enumeration value="SBDB"/&gt;
 *     &lt;enumeration value="SCSM"/&gt;
 *     &lt;enumeration value="SDMT"/&gt;
 *     &lt;enumeration value="SCDP"/&gt;
 *     &lt;enumeration value="SFLN"/&gt;
 *     &lt;enumeration value="SFL1"/&gt;
 *     &lt;enumeration value="SJEG"/&gt;
 *     &lt;enumeration value="SEEE"/&gt;
 *     &lt;enumeration value="SJDD"/&gt;
 *     &lt;enumeration value="SDAD"/&gt;
 *     &lt;enumeration value="SDCD"/&gt;
 *     &lt;enumeration value="SSC6"/&gt;
 *     &lt;enumeration value="SSS6"/&gt;
 *     &lt;enumeration value="SSE6"/&gt;
 *     &lt;enumeration value="SPCP"/&gt;
 *     &lt;enumeration value="SLCP"/&gt;
 *     &lt;enumeration value="SPGP"/&gt;
 *     &lt;enumeration value="SLGP"/&gt;
 *     &lt;enumeration value="SLNP"/&gt;
 *     &lt;enumeration value="SPNP"/&gt;
 *     &lt;enumeration value="SGLZ"/&gt;
 *     &lt;enumeration value="SGLQ"/&gt;
 *     &lt;enumeration value="SFLE"/&gt;
 *     &lt;enumeration value="SSFF"/&gt;
 *     &lt;enumeration value="SSFR"/&gt;
 *     &lt;enumeration value="SBB3"/&gt;
 *     &lt;enumeration value="SSBB"/&gt;
 *     &lt;enumeration value="SFE8"/&gt;
 *     &lt;enumeration value="SFU9"/&gt;
 *     &lt;enumeration value="SFF8"/&gt;
 *     &lt;enumeration value="SFL9"/&gt;
 *     &lt;enumeration value="SAFR"/&gt;
 *     &lt;enumeration value="SFH9"/&gt;
 *     &lt;enumeration value="SFG8"/&gt;
 *     &lt;enumeration value="SFG9"/&gt;
 *     &lt;enumeration value="SFRO"/&gt;
 *     &lt;enumeration value="SAGA"/&gt;
 *     &lt;enumeration value="SPRG"/&gt;
 *     &lt;enumeration value="SGLT"/&gt;
 *     &lt;enumeration value="SACB"/&gt;
 *     &lt;enumeration value="SAEA"/&gt;
 *     &lt;enumeration value="S66P"/&gt;
 *     &lt;enumeration value="SAC7"/&gt;
 *     &lt;enumeration value="SAM7"/&gt;
 *     &lt;enumeration value="SAR7"/&gt;
 *     &lt;enumeration value="SAP7"/&gt;
 *     &lt;enumeration value="SAT7"/&gt;
 *     &lt;enumeration value="SAMA"/&gt;
 *     &lt;enumeration value="SIGE"/&gt;
 *     &lt;enumeration value="SJIE"/&gt;
 *     &lt;enumeration value="SADM"/&gt;
 *     &lt;enumeration value="SFLL"/&gt;
 *     &lt;enumeration value="SILL"/&gt;
 *     &lt;enumeration value="SDBD"/&gt;
 *     &lt;enumeration value="SWG1"/&gt;
 *     &lt;enumeration value="SDED"/&gt;
 *     &lt;enumeration value="SCMU"/&gt;
 *     &lt;enumeration value="SGLM"/&gt;
 *     &lt;enumeration value="SMAM"/&gt;
 *     &lt;enumeration value="SMEM"/&gt;
 *     &lt;enumeration value="SMDM"/&gt;
 *     &lt;enumeration value="SMBM"/&gt;
 *     &lt;enumeration value="SMCM"/&gt;
 *     &lt;enumeration value="SMMM"/&gt;
 *     &lt;enumeration value="SFLS"/&gt;
 *     &lt;enumeration value="SOP2"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="SCLU"/&gt;
 *     &lt;enumeration value="SCPP"/&gt;
 *     &lt;enumeration value="SCRP"/&gt;
 *     &lt;enumeration value="SAHA"/&gt;
 *     &lt;enumeration value="SAPA"/&gt;
 *     &lt;enumeration value="SSPA"/&gt;
 *     &lt;enumeration value="SCNU"/&gt;
 *     &lt;enumeration value="SJEF"/&gt;
 *     &lt;enumeration value="SJEE"/&gt;
 *     &lt;enumeration value="SDDD"/&gt;
 *     &lt;enumeration value="SWN1"/&gt;
 *     &lt;enumeration value="SFL3"/&gt;
 *     &lt;enumeration value="SDEP"/&gt;
 *     &lt;enumeration value="SSA6"/&gt;
 *     &lt;enumeration value="SSP4"/&gt;
 *     &lt;enumeration value="SPFS"/&gt;
 *     &lt;enumeration value="SSS5"/&gt;
 *     &lt;enumeration value="SRTA"/&gt;
 *     &lt;enumeration value="SFLR"/&gt;
 *     &lt;enumeration value="SFL0"/&gt;
 *     &lt;enumeration value="SWHT"/&gt;
 *     &lt;enumeration value="SJE7"/&gt;
 *     &lt;enumeration value="SGL7"/&gt;
 *     &lt;enumeration value="SGLP"/&gt;
 *     &lt;enumeration value="SFJ9"/&gt;
 *     &lt;enumeration value="SFRB"/&gt;
 *     &lt;enumeration value="SFRA"/&gt;
 *     &lt;enumeration value="SFL2"/&gt;
 *     &lt;enumeration value="SJR7"/&gt;
 *     &lt;enumeration value="STEA"/&gt;
 *     &lt;enumeration value="SAF7"/&gt;
 *     &lt;enumeration value="SAA7"/&gt;
 *     &lt;enumeration value="SAWA"/&gt;
 *     &lt;enumeration value="SRRA"/&gt;
 *     &lt;enumeration value="SJWT"/&gt;
 *     &lt;enumeration value="SBB2"/&gt;
 *     &lt;enumeration value="SWTA"/&gt;
 *     &lt;enumeration value="SJEW"/&gt;
 *     &lt;enumeration value="SPRA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DTCAdjustmentPaymentSubReason1Code")
@XmlEnum
public enum DTCAdjustmentPaymentSubReason1Code {


    /**
     * Reorganization related adjustment on user defined date.
     * 
     */
    @XmlEnumValue("S777")
    S_777("S777"),

    /**
     * Rep payment/charge.
     * 
     */
    SRPO("SRPO"),

    /**
     * Reversal of a COD withdrawal related adjustment.
     * 
     */
    SBRH("SBRH"),

    /**
     * Reversal of a deposit adjustment.
     * 
     */
    SDRH("SDRH"),

    /**
     * Reversal of an accrual claim payment related to a stock distribution payable on user defined date.
     * 
     */
    SCRK("SCRK"),

    /**
     * Reversal of a withdrawal by transfer adjustment.
     * 
     */
    SWRH("SWRH"),

    /**
     * Funds previously escheated to ny state, affidavit to follow this is to reverse escheated amount of claim paid on user defined date.
     * 
     */
    SFAP("SFAP"),

    /**
     * Shares escheated to New York state in error; affidavit to follow. This is to reverse.
     * 
     */
    SETO("SETO"),

    /**
     * Revision of charge for withholding tax.
     * 
     */
    SAJA("SAJA"),

    /**
     * Allocation of script shares amount to be exited in dollar value.
     * 
     */
    SASA("SASA"),

    /**
     * Share adjustment resulting from a (buy) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039).
     * 
     */
    @XmlEnumValue("SSR4")
    SSR_4("SSR4"),

    /**
     * Share adjustment resulting from a (sell) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039).
     * 
     */
    @XmlEnumValue("SSR5")
    SSR_5("SSR5"),

    /**
     * Allocation of spinoff security.
     * 
     */
    SSOS("SSOS"),

    /**
     * Stock loan related payment or charge.
     * 
     * 
     */
    SSLA("SSLA"),

    /**
     * Stock loan or repo payment order related adjustment.
     * 
     */
    SSPO("SSPO"),

    /**
     * Supplemental interim activity related adjustment.
     * 
     */
    SRPP("SRPP"),

    /**
     * Supplemental interim activity from midwest (6942).
     * 
     */
    SSME("SSME"),

    /**
     * Supplemental interim activity from Philadelphia (6070).
     * 
     */
    SSPE("SSPE"),

    /**
     * Supplementary interim on user defined date.
     * 
     */
    SAFA("SAFA"),

    /**
     * Accrual claim payment related to a stock distribution payable on user defined date.
     * 
     */
    SCPK("SCPK"),

    /**
     * Accrued interest was not previously paid to you for the redemption in this issue. This adjustment is to pay you for this accrued interest.
     * 
     */
    SACP("SACP"),

    /**
     * The accrued interest previously paid to you was at the wrong rate. This adjustment is to correct that erroneous payment.
     * 
     */
    SACA("SACA"),

    /**
     * Distribution of additional rights for round up of fractions as requested for your beneficial owners.
     * 
     */
    SRTJ("SRTJ"),

    /**
     * Adjustment made for a withdrawal by transfer that was not transferred into your clients name by the record date.
     * 
     */
    @XmlEnumValue("SWL1")
    SWL_1("SWL1"),

    /**
     * Adjustment for cash-in-lieu of fractional shares related adjustment.
     * 
     */
    SSJJ("SSJJ"),

    /**
     * Adjustment for cash on increased shares due to a stock distribution payable.
     * 
     */
    SNNG("SNNG"),

    /**
     * This adjustment is in responve to your written inquiry.
     * 
     */
    SRAH("SRAH"),

    /**
     * This adjustment is in response to your inquiry. refer to control number:
     * 
     */
    SRIH("SRIH"),

    /**
     * Adjustment made for a withdrawal by transfer set up after the cut off date made transfer into your clients name.
     * 
     */
    @XmlEnumValue("SWM1")
    SWM_1("SWM1"),

    /**
     * Adjustment to avoid fiscal payment.
     * 
     */
    SAIA("SAIA"),

    /**
     * Adjustment to your dividend reinvestment (DRP) position related adjustment.
     * 
     */
    @XmlEnumValue("SSD6")
    SSD_6("SSD6"),

    /**
     * Agent paid DTC based on combined fractions for all public service–new hamp.(new) spinoffs distributed on july 25, 1991.
     * 
     */
    SSPJ("SSPJ"),

    /**
     * Allocation adjustment.
     * 
     */
    SGLA("SGLA"),

    /**
     * Allocation adjustment due to fractions rounded up by the agent related adjustment.
     * 
     */
    SSRJ("SSRJ"),

    /**
     * Allocation of baby bonds amount to be exited in USD.
     * 
     */
    SABA("SABA"),

    /**
     * Allocation of dividend reinvestment shares - DRP/TEDS instruction @100%.
     * 
     */
    @XmlEnumValue("SST6")
    SST_6("SST6"),

    /**
     * Announcement deleted for fail tracking related adjustment.
     * 
     */
    SFLD("SFLD"),

    /**
     * Allocation for a Participant position that was assumed by your goodselves paid on - retired Participant number.
     * 
     */
    SARA("SARA"),

    /**
     * Bond pays in baby bonds that are issued in minimum/incre-mental denominations; this is to adjust for the amount of pending unissued bonds.
     * 
     */
    SSDJ("SSDJ"),

    /**
     * Certificates you deposited prior to publication date were subsequently called. the agent paid DTCC the principal redemption proceeds but erroneously paid you the accrued interest.
     * 
     */
    SAPP("SAPP"),

    /**
     * Certificates you deposited prior to publication date were subsequently called. the agent paid DTCC the principal proceeds via check, but in your customer’s name. we are forwarding the check today. this adjustment is to charge you for the funds.
     * 
     */
    SCKS("SCKS"),

    /**
     * Adjustment for cash due on an accrued stock payment.
     * 
     */
    SSBK("SSBK"),

    /**
     * As per agent, this charge is for french avoid fiscal tax credit.
     * 
     */
    SFAF("SFAF"),

    /**
     * As per your authorization, we are charging your account in lieu of receipt of dividend reinvestment related shares related adjustment.
     * 
     */
    @XmlEnumValue("SSR6")
    SSR_6("SSR6"),

    /**
     * DTCC COD withdrawal adjustment.
     * 
     */
    SJCB("SJCB"),

    /**
     * Company in default related adjustment.
     * 
     */
    SADA("SADA"),

    /**
     * Company never declared dividend adjust allocation on user defined date.
     * 
     */
    SANA("SANA"),

    /**
     * Your COD withdrawal was not delivered, however the certificate(s) were issued and outstanding over the record date in the name of your nominee.
     * 
     */
    SBEB("SBEB"),

    /**
     * Your record date position was adjusted for a COD buy back withdrawal.
     * 
     */
    @XmlEnumValue("SBB1")
    SBB_1("SBB1"),

    /**
     * Required lists contained discrepancies or were not forwarded to french paying agent. This charge is at user defined withholding rate.
     * 
     */
    @XmlEnumValue("SFI9")
    SFI_9("SFI9"),

    /**
     * Accrued cash due on DRP share allocation.
     * 
     */
    SSDK("SSDK"),

    /**
     * Accrued cash due on a stock dividend adjustment made on user defined date.
     * 
     */
    SSCK("SSCK"),

    /**
     * Allocation adjustment due to a change in the record date.
     * 
     */
    SRDA("SRDA"),

    /**
     * Your COD withdrawal was not delivered, however the certificate(s) were issued and outstanding over the record date in the name of your goodselves.
     * 
     */
    SBDB("SBDB"),

    /**
     * Coupon collection service adjustment for coupon deposit.
     * 
     */
    SCSM("SCSM"),

    /**
     * CTF(s) held over record date on which we guarantee to hold you free and harmless of any further claim on this dividend.
     * 
     */
    SDMT("SDMT"),

    /**
     * Custody payment.
     * 
     */
    SCDP("SCDP"),

    /**
     * Date revision for fail tracking related adjustment.
     * 
     */
    SFLN("SFLN"),

    /**
     * Deletefor fail tracking related adjustment.
     * 
     */
    @XmlEnumValue("SFL1")
    SFL_1("SFL1"),

    /**
     * DTCC deliver order related adjustment.
     * 
     */
    SJEG("SJEG"),

    /**
     * Your record date position was adjusted for deliver order (DO) activity.
     * 
     */
    SEEE("SEEE"),

    /**
     * DTCC deposit related adjustment.
     * 
     */
    SJDD("SJDD"),

    /**
     * Adjustment related to the deposit of lost certificate over the record date was registered in the name of your [user defined].
     * 
     */
    SDAD("SDAD"),

    /**
     * Deposit after cut off date transferred into the name of the CEDE on record date.
     * 
     */
    SDCD("SDCD"),

    /**
     * Dividend reinvestment allocation why not on normal event.
     * 
     */
    @XmlEnumValue("SSC6")
    SSC_6("SSC6"),

    /**
     * DRP allocation adjustment due to your sub accounting instructions to the agent.
     * 
     */
    @XmlEnumValue("SSS6")
    SSS_6("SSS6"),

    /**
     * Dividend reinvestment (DRP) allocation of cash in lieu of fractions related adjustment.
     * 
     */
    @XmlEnumValue("SSE6")
    SSE_6("SSE6"),

    /**
     * DTCC claim against registered holder in the name of your customer.
     * 
     */
    SPCP("SPCP"),

    /**
     * DTCC claim against registered holder in the name of your customer. Late identification of missed transfer by Transfer Agent.
     * 
     */
    SLCP("SLCP"),

    /**
     * DTCC claim against registered holder in the name of your goodselves.
     * 
     */
    SPGP("SPGP"),

    /**
     * DTCC claim against registered holder in the name of your goodselves. Late identification of missed transfer by Transfer Agent.
     * 
     */
    SLGP("SLGP"),

    /**
     * DTCC claim against registered holder in the name of your nominee. Late identification of missed transfer by Transfer Agent.
     * 
     */
    SLNP("SLNP"),

    /**
     * DTCC claim against registered holder in the name of your nominee.
     * 
     */
    SPNP("SPNP"),

    /**
     * DTCC claim on registered holder in the name of your customer.
     * 
     */
    SGLZ("SGLZ"),

    /**
     * DTCC claim on registered holder in the name of your goodselves.
     * 
     */
    SGLQ("SGLQ"),

    /**
     * Due bill for fail tracking related adjustment.
     * 
     */
    SFLE("SFLE"),

    /**
     * Due bill fail tracking.
     * 
     */
    SSFF("SSFF"),

    /**
     * Due bill fail tracking reversal.
     * 
     */
    SSFR("SSFR"),

    /**
     * Your record date position was adjusted for a DWAC withdrawal to effect a buy back/treasury purchase.
     * 
     */
    @XmlEnumValue("SBB3")
    SBB_3("SBB3"),

    /**
     * Your record date position was adjusted for a DWAC buy back withdrawal.
     * 
     */
    SSBB("SSBB"),

    /**
     * Foreign cash dividends/bond interest allocation at exempt rate.
     * 
     */
    @XmlEnumValue("SFE8")
    SFE_8("SFE8"),

    /**
     * Foreign cash dividends or bond interest allocation at unfavorable rate.
     * 
     */
    @XmlEnumValue("SFU9")
    SFU_9("SFU9"),

    /**
     * Foreign cash dividends/bonds interest allocation at favorable rate.
     * 
     */
    @XmlEnumValue("SFF8")
    SFF_8("SFF8"),

    /**
     * Foreign cash dividends allocation at unfavorable rate.
     * 
     */
    @XmlEnumValue("SFL9")
    SFL_9("SFL9"),

    /**
     * Allocation of fractional rights.
     * 
     */
    SAFR("SAFR"),

    /**
     * Ten percent french withholding tax, based on your revised instructions to reduce favorable tax status to unfavorable.
     * 
     */
    @XmlEnumValue("SFH9")
    SFH_9("SFH9"),

    /**
     * Fifteen percent french withholding tax, based on your option election of 100% ADRs at the favorable rate.
     * 
     */
    @XmlEnumValue("SFG8")
    SFG_8("SFG8"),

    /**
     * Twenty five percent french withholding tax, based on your option election of 100% ADRs at the unfavorable rate.
     * 
     */
    @XmlEnumValue("SFG9")
    SFG_9("SFG9"),

    /**
     * As per memo requesting a frozen letter movement from part number.
     * 
     */
    SFRO("SFRO"),

    /**
     * Company is taking 30 day grace period.
     * 
     */
    SAGA("SAGA"),

    /**
     * This adjustment represents credits/debits to your account in lieu of reorg deposit activity.
     * 
     */
    SPRG("SPRG"),

    /**
     * In settlement of a trade - DTCC reorg account 428-10271-1-2-039.
     * 
     */
    SGLT("SGLT"),

    /**
     * Interest adjusted due to early withdrawal (certificate of deposit).
     * 
     */
    SACB("SACB"),

    /**
     * Interest allocated in error first payment on "date user defined".
     * 
     */
    SAEA("SAEA"),

    /**
     * The interest due on the above cusip was erroneously paid to you by the issuer although the certificate of deposit was transferred to CEDE (DTCC) prior to the interest payment date.
     * 
     */
    @XmlEnumValue("S66P")
    S_66_P("S66P"),

    /**
     * Interest or dividend due on conversion related adjustment.
     * 
     */
    @XmlEnumValue("SAC7")
    SAC_7("SAC7"),

    /**
     * Interest or dividend due on merger related adjustment.
     * 
     */
    @XmlEnumValue("SAM7")
    SAM_7("SAM7"),

    /**
     * Interest or dividend due on redemption.
     * 
     */
    @XmlEnumValue("SAR7")
    SAR_7("SAR7"),

    /**
     * Interest or dividend due on repayment option.
     * 
     */
    @XmlEnumValue("SAP7")
    SAP_7("SAP7"),

    /**
     * Interestor dividend due on tender.
     * 
     */
    @XmlEnumValue("SAT7")
    SAT_7("SAT7"),

    /**
     * Interest pays at maturity. Allocated in error onn user defined date.
     * 
     */
    SAMA("SAMA"),

    /**
     * Your interim position was adjusted for deliver orderactivity.
     * 
     */
    SIGE("SIGE"),

    /**
     * DTCC investment id related adjustment.
     * 
     */
    SJIE("SJIE"),

    /**
     * Issue in default related adjustment.
     * 
     */
    SADM("SADM"),

    /**
     * Fail tracking for fail tracking related adjustment.
     * 
     */
    SFLL("SFLL"),

    /**
     * Late announcement activity due bill activity related adjustment.
     * 
     */
    SILL("SILL"),

    /**
     * Adjustment related to the deposit of lost certificate over the record date was registered in the name of your goodselves.
     * 
     */
    SDBD("SDBD"),

    /**
     * Withdrawal by transfer - lost certificate over the record date was registered in the name of your customer.
     * 
     */
    @XmlEnumValue("SWG1")
    SWG_1("SWG1"),

    /**
     * Adjustment related to the deposit of lost certificate over the record date was registered in the name of your nominee.
     * 
     */
    SDED("SDED"),

    /**
     * Adjustment made for the Midwest depository (6942).
     * 
     */
    SCMU("SCMU"),

    /**
     * Muni bearer bond coupon adjustment (same as line 118).
     * 
     */
    SGLM("SGLM"),

    /**
     * Muni bearer bond coupon related adjustment.
     * 
     */
    SMAM("SMAM"),

    /**
     * Muni bearer bond coupon adjustment excess coupon(s) deposited on user defined date.
     * 
     */
    SMEM("SMEM"),

    /**
     * Muni bearer bond coupon adjustment excess coupon(s) withdrawn on user defined date.
     * 
     */
    SMDM("SMDM"),

    /**
     * Muni bearer bond coupon adjustment for coupon(s) missing from a deposit related adjustment.
     * 
     */
    SMBM("SMBM"),

    /**
     * Muni bearer bond coupon adjustment for coupon(s) missing from a withdrawal.
     * 
     */
    SMCM("SMCM"),

    /**
     * Muni bearer bond coupon adjustment your interim position was adjusted for deposit activity.
     * 
     */
    SMMM("SMMM"),

    /**
     * Non allocation for fail tracking related adjustment.
     * 
     */
    SFLS("SFLS"),

    /**
     * Optional dividend (ops) allocation related adjustment.
     * 
     */
    @XmlEnumValue("SOP2")
    SOP_2("SOP2"),

    /**
     * Reserved for new user defined reason codes.
     * 
     */
    OTHR("OTHR"),

    /**
     * Adjustment made for the Pacific depository (3097).
     * 
     */
    SCLU("SCLU"),

    /**
     * Part claim payment.
     * 
     */
    SCPP("SCPP"),

    /**
     * Part-claim reversal.
     * 
     */
    SCRP("SCRP"),

    /**
     * Payment of full avoid fiscal tax refund (equal to 42.5% of the dividend).
     * 
     */
    SAHA("SAHA"),

    /**
     * Payment of partial avoid fiscal tax refund (equal to 15% of the dividend).
     * 
     */
    SAPA("SAPA"),

    /**
     * Allocation of a Pay in Kind distribution.
     * 
     */
    SSPA("SSPA"),

    /**
     * Adjustment made for the Philadelphia depository (6070).
     * 
     */
    SCNU("SCNU"),

    /**
     * DTCC pledge related adjustment.
     * 
     */
    SJEF("SJEF"),

    /**
     * DTCC pledge release related adjustment.
     * 
     */
    SJEE("SJEE"),

    /**
     * Your record date position was adjusted for deposit activity.
     * 
     */
    SDDD("SDDD"),

    /**
     * Your position was reinstated for a withdrawal by transfer. However the certificates(s) were issued and outstanding over the record date in the name of your customer(s).
     * 
     */
    @XmlEnumValue("SWN1")
    SWN_1("SWN1"),

    /**
     * Post date changefor fail tracking related adjustment.
     * 
     */
    @XmlEnumValue("SFL3")
    SFL_3("SFL3"),

    /**
     * You deposited securities that were previously called. the agent paid DTCC the redemption proceeds. this adjustment is to pass these proceeds on to you. your free account security position will be adjusted (shorted) today for the called quantity.
     * 
     */
    SDEP("SDEP"),

    /**
     * Allocation adjustment for dividend reinvestment due to price correction by the agent.
     * 
     */
    @XmlEnumValue("SSA6")
    SSA_6("SSA6"),

    /**
     * Proceeds resulting from a (buy) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039).
     * 
     */
    @XmlEnumValue("SSP4")
    SSP_4("SSP4"),

    /**
     * Proceeds from sale of.
     * 
     */
    SPFS("SPFS"),

    /**
     * Proceeds resulting from a (sell) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039).
     * 
     */
    @XmlEnumValue("SSS5")
    SSS_5("SSS5"),

    /**
     * This allocation was adjusted for a rate change. Please refer to DIVA comment field for additional information.
     * 
     */
    SRTA("SRTA"),

    /**
     * Rate revisionfor fail tracking related adjustment.
     * 
     */
    SFLR("SFLR"),

    /**
     * Rate unknown for fail tracking related adjustment.
     * 
     */
    @XmlEnumValue("SFL0")
    SFL_0("SFL0"),

    /**
     * Our record date position was adjusted for a withdrawal by transfer activity.
     * 
     */
    SWHT("SWHT"),

    /**
     * DTCC redemption related adjustment.
     * 
     */
    @XmlEnumValue("SJE7")
    SJE_7("SJE7"),

    /**
     * Redemption cash settlement.
     * 
     */
    @XmlEnumValue("SGL7")
    SGL_7("SGL7"),

    /**
     * Redemption payment due to pledge release.
     * 
     */
    SGLP("SGLP"),

    /**
     * The 25% french withholding rate has been revised. This adjustment is based on the refunded tax rate.
     * 
     */
    @XmlEnumValue("SFJ9")
    SFJ_9("SFJ9"),

    /**
     * Refund of french tax based on acceptance of global reclamation for the july 1992 distribution refer to important notice b # 1352‑93.
     * 
     */
    SFRB("SFRB"),

    /**
     * Refund of french tax based on acceptance of global reclamation for the june 1992 distribution refer to important notice b # 1352‑93.
     * 
     */
    SFRA("SFRA"),

    /**
     * Reinstate for fail tracking related adjustment.
     * 
     */
    @XmlEnumValue("SFL2")
    SFL_2("SFL2"),

    /**
     * DTCC reorganization related adjustment.
     * 
     * 
     */
    @XmlEnumValue("SJR7")
    SJR_7("SJR7"),

    /**
     * To adjust allocation at 100% on your tax exempt instructions.
     * 
     */
    STEA("STEA"),

    /**
     * Interest adjusted due to tender fee deduction.
     * 
     */
    @XmlEnumValue("SAF7")
    SAF_7("SAF7"),

    /**
     * Your account is being credited at the unfav rate (20%) as a result of the reorg merger pd on 4/2/93 (Armstrong Pharm to Medeva plc, eff 1/15/93; if entitled to fav rate(15%), you must follow attached.
     * 
     */
    @XmlEnumValue("SAA7")
    SAA_7("SAA7"),

    /**
     * Uninsured interest withheld as per FSLICN.
     * 
     */
    SAWA("SAWA"),

    /**
     * Option to receive Vodafone Group adrs at 11.354392 for every 100 adrs.
     * 
     */
    SRRA("SRRA"),

    /**
     * DTCC WT related adjustment.
     * 
     */
    SJWT("SJWT"),

    /**
     * Your record date position was adjusted for a w/t buy back withdrawal.
     * 
     */
    @XmlEnumValue("SBB2")
    SBB_2("SBB2"),

    /**
     * Adjustment to allocation to charge (user defined percentage) withholding tax in (user defined) country.
     * 
     */
    SWTA("SWTA"),

    /**
     * Write off reorganization related adjustment.
     * 
     */
    SJEW("SJEW"),

    /**
     * The principal previously paid to you was at the wrong rate. This adjustment is to correct that erroneous payment.
     * 
     */
    SPRA("SPRA");
    private final String value;

    DTCAdjustmentPaymentSubReason1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DTCAdjustmentPaymentSubReason1Code fromValue(String v) {
        for (DTCAdjustmentPaymentSubReason1Code c: DTCAdjustmentPaymentSubReason1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
