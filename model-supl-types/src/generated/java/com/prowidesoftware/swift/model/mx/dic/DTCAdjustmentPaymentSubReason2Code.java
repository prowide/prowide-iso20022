
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCAdjustmentPaymentSubReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DTCAdjustmentPaymentSubReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SCPK"/>
 *     <enumeration value="SACP"/>
 *     <enumeration value="SACA"/>
 *     <enumeration value="SRTJ"/>
 *     <enumeration value="SSRJ"/>
 *     <enumeration value="SST6"/>
 *     <enumeration value="SARA"/>
 *     <enumeration value="SAIA"/>
 *     <enumeration value="SAPP"/>
 *     <enumeration value="SCKS"/>
 *     <enumeration value="SSDK"/>
 *     <enumeration value="SSCK"/>
 *     <enumeration value="SSJJ"/>
 *     <enumeration value="SNNG"/>
 *     <enumeration value="SSR6"/>
 *     <enumeration value="SFLD"/>
 *     <enumeration value="SABA"/>
 *     <enumeration value="SGLA"/>
 *     <enumeration value="SSPJ"/>
 *     <enumeration value="SSD6"/>
 *     <enumeration value="SSDJ"/>
 *     <enumeration value="SSBK"/>
 *     <enumeration value="SRDA"/>
 *     <enumeration value="SFI9"/>
 *     <enumeration value="SFAF"/>
 *     <enumeration value="SBB1"/>
 *     <enumeration value="SJCB"/>
 *     <enumeration value="SBDB"/>
 *     <enumeration value="SBEB"/>
 *     <enumeration value="SANA"/>
 *     <enumeration value="SADA"/>
 *     <enumeration value="SCSM"/>
 *     <enumeration value="SCDP"/>
 *     <enumeration value="SJEG"/>
 *     <enumeration value="SJDD"/>
 *     <enumeration value="SSC6"/>
 *     <enumeration value="SFLN"/>
 *     <enumeration value="SFL1"/>
 *     <enumeration value="SEEE"/>
 *     <enumeration value="SDAD"/>
 *     <enumeration value="SDCD"/>
 *     <enumeration value="SSS6"/>
 *     <enumeration value="SSE6"/>
 *     <enumeration value="SDMT"/>
 *     <enumeration value="SPCP"/>
 *     <enumeration value="SLCP"/>
 *     <enumeration value="SPGP"/>
 *     <enumeration value="SLNP"/>
 *     <enumeration value="SPNP"/>
 *     <enumeration value="SGLZ"/>
 *     <enumeration value="SFLE"/>
 *     <enumeration value="SSFF"/>
 *     <enumeration value="SSFR"/>
 *     <enumeration value="SBB3"/>
 *     <enumeration value="SFF8"/>
 *     <enumeration value="SFH9"/>
 *     <enumeration value="SFU9"/>
 *     <enumeration value="SFE8"/>
 *     <enumeration value="SSBB"/>
 *     <enumeration value="SGLQ"/>
 *     <enumeration value="SLGP"/>
 *     <enumeration value="SFL9"/>
 *     <enumeration value="SAFR"/>
 *     <enumeration value="SFG8"/>
 *     <enumeration value="SFG9"/>
 *     <enumeration value="SFRO"/>
 *     <enumeration value="SAGA"/>
 *     <enumeration value="SPRG"/>
 *     <enumeration value="SRIH"/>
 *     <enumeration value="SGLT"/>
 *     <enumeration value="SACB"/>
 *     <enumeration value="SAEA"/>
 *     <enumeration value="S66P"/>
 *     <enumeration value="SAC7"/>
 *     <enumeration value="SAM7"/>
 *     <enumeration value="SAR7"/>
 *     <enumeration value="SAP7"/>
 *     <enumeration value="SAT7"/>
 *     <enumeration value="SAMA"/>
 *     <enumeration value="SIGE"/>
 *     <enumeration value="SJIE"/>
 *     <enumeration value="SADM"/>
 *     <enumeration value="SFLL"/>
 *     <enumeration value="SILL"/>
 *     <enumeration value="SDBD"/>
 *     <enumeration value="SWG1"/>
 *     <enumeration value="SDED"/>
 *     <enumeration value="SCMU"/>
 *     <enumeration value="SGLM"/>
 *     <enumeration value="SMAM"/>
 *     <enumeration value="SMDM"/>
 *     <enumeration value="SFLS"/>
 *     <enumeration value="SOP2"/>
 *     <enumeration value="SCPP"/>
 *     <enumeration value="SJEE"/>
 *     <enumeration value="SDDD"/>
 *     <enumeration value="SWN1"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="SCLU"/>
 *     <enumeration value="SAHA"/>
 *     <enumeration value="SAPA"/>
 *     <enumeration value="SCNU"/>
 *     <enumeration value="SJEF"/>
 *     <enumeration value="SFL3"/>
 *     <enumeration value="SCRP"/>
 *     <enumeration value="SMMM"/>
 *     <enumeration value="SMEM"/>
 *     <enumeration value="SMCM"/>
 *     <enumeration value="SMBM"/>
 *     <enumeration value="SSPA"/>
 *     <enumeration value="SDEP"/>
 *     <enumeration value="SSA6"/>
 *     <enumeration value="SPFS"/>
 *     <enumeration value="SSP4"/>
 *     <enumeration value="SSS5"/>
 *     <enumeration value="SRTA"/>
 *     <enumeration value="SFLR"/>
 *     <enumeration value="SFL0"/>
 *     <enumeration value="SWHT"/>
 *     <enumeration value="SJE7"/>
 *     <enumeration value="SGLP"/>
 *     <enumeration value="SFJ9"/>
 *     <enumeration value="SFRB"/>
 *     <enumeration value="SFRA"/>
 *     <enumeration value="SFL2"/>
 *     <enumeration value="SJR7"/>
 *     <enumeration value="S777"/>
 *     <enumeration value="SRPO"/>
 *     <enumeration value="SGL7"/>
 *     <enumeration value="SCRK"/>
 *     <enumeration value="SBRH"/>
 *     <enumeration value="SDRH"/>
 *     <enumeration value="SASA"/>
 *     <enumeration value="SSR4"/>
 *     <enumeration value="SSR5"/>
 *     <enumeration value="SSOS"/>
 *     <enumeration value="SSLA"/>
 *     <enumeration value="SSPO"/>
 *     <enumeration value="SSME"/>
 *     <enumeration value="SAFA"/>
 *     <enumeration value="SSPE"/>
 *     <enumeration value="SRPP"/>
 *     <enumeration value="SAJA"/>
 *     <enumeration value="SETO"/>
 *     <enumeration value="SFAP"/>
 *     <enumeration value="SWRH"/>
 *     <enumeration value="STEA"/>
 *     <enumeration value="SAF7"/>
 *     <enumeration value="SAA7"/>
 *     <enumeration value="SAWA"/>
 *     <enumeration value="SRRA"/>
 *     <enumeration value="SWL1"/>
 *     <enumeration value="SWM1"/>
 *     <enumeration value="SJWT"/>
 *     <enumeration value="SBB2"/>
 *     <enumeration value="SWTA"/>
 *     <enumeration value="SRAH"/>
 *     <enumeration value="SJEW"/>
 *     <enumeration value="SPRA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DTCAdjustmentPaymentSubReason2Code")
@XmlEnum
public enum DTCAdjustmentPaymentSubReason2Code {


    /**
     * Adjustment sub-reason is for an accrual claim payment related to a stock distribution payable on user defined date.
     * 
     */
    SCPK("SCPK"),

    /**
     * Adjustment sub-reason is that accrued interest was not previously paid to you for the redemption in this issue. This adjustment is to pay you for this accrued interest.
     * 
     */
    SACP("SACP"),

    /**
     * Adjustment sub-reason is for the accrued interest previously paid to you was at the wrong rate. This adjustment is to correct that erroneous payment.
     * 
     */
    SACA("SACA"),

    /**
     * Adjustment sub-reason is for a distribution of additional rights for round up of fractions as requested for your beneficial owners.
     * 
     */
    SRTJ("SRTJ"),

    /**
     * Adjustment sub-reason is for an allocation adjustment due to fractions rounded up by the agent related adjustment.
     * 
     */
    SSRJ("SSRJ"),

    /**
     * Adjustment sub-reason is for an allocation of dividend reinvestment shares - DRP/TEDS instruction @100%.
     * 
     */
    @XmlEnumValue("SST6")
    SST_6("SST6"),

    /**
     * Adjustment sub-reason is for an allocation for a participant position that was assumed by your good selves paid on retired Participant number.
     * 
     */
    SARA("SARA"),

    /**
     * Adjustment sub-reason is for an adjustment to avoid fiscal payment.
     * 
     */
    SAIA("SAIA"),

    /**
     * Adjustment sub-reason is for certificates you deposited prior to publication date were subsequently called. The agent paid DTCC the principal redemption proceeds but erroneously paid you the accrued interest.
     * 
     */
    SAPP("SAPP"),

    /**
     * Adjustment sub-reason is for certificates you deposited prior to publication date were subsequently called. The agent paid DTCC the principal proceeds via check, but in your customer’s name. We are forwarding the check today. This adjustment is to charge you for the funds.
     * 
     */
    SCKS("SCKS"),

    /**
     * Adjustment sub-reason is for accrued cash due on DRP share allocation.
     * 
     */
    SSDK("SSDK"),

    /**
     * Adjustment sub-reason is for accrued cash due on a stock dividend adjustment made on user defined date.
     * 
     */
    SSCK("SSCK"),

    /**
     * Adjustment sub-reason is for an adjustment for cash-in-lieu of fractional shares related adjustment.
     * 
     */
    SSJJ("SSJJ"),

    /**
     * Adjustment sub-reason is for an adjustment for cash on increased shares due to a stock distribution payable.
     * 
     */
    SNNG("SNNG"),

    /**
     * Adjustment sub-reason is that, as per your authorization, we are charging your account in lieu of receipt of dividend reinvestment related shares related adjustment.
     * 
     */
    @XmlEnumValue("SSR6")
    SSR_6("SSR6"),

    /**
     * Adjustment sub-reason is for an announcement deleted for fail tracking related adjustment.
     * 
     */
    SFLD("SFLD"),

    /**
     * Adjustment sub-reason is for an allocation of baby bonds amount to be exited in USD.
     * 
     */
    SABA("SABA"),

    /**
     * Adjustment sub-reason is for an allocation adjustment.
     * 
     */
    SGLA("SGLA"),

    /**
     * Adjustment sub-reason is that an agent paid DTC based on combined fractions for all public service New Hampshire. New spinoffs distributed on July 25, 1991.
     * 
     */
    SSPJ("SSPJ"),

    /**
     * Adjustment sub-reason is for an adjustment to your dividend reinvestment (DRP) position related adjustment.
     * 
     */
    @XmlEnumValue("SSD6")
    SSD_6("SSD6"),

    /**
     * Adjustment sub-reason is for a bond paying in baby bonds that are issued in minimum/incremental denominations. This is to adjust for the amount of pending unissued bonds.
     * 
     */
    SSDJ("SSDJ"),

    /**
     * Adjustment sub-reason is for an adjustment for cash due on an accrued stock payment.
     * 
     */
    SSBK("SSBK"),

    /**
     * Adjustment sub-reason is for an allocation adjustment due to a change in the record date.
     * 
     */
    SRDA("SRDA"),

    /**
     * Adjustment sub-reason is for required lists containing discrepancies or which were not forwarded to French paying agent. This charge is at user defined withholding rate.
     * 
     */
    @XmlEnumValue("SFI9")
    SFI_9("SFI9"),

    /**
     * Adjustment sub-reason is that, as per agent, this charge is for French avoid fiscal tax credit.
     * 
     */
    SFAF("SFAF"),

    /**
     * Adjustment sub-reason is that your record date position was adjusted for a COD buy back withdrawal.
     * 
     */
    @XmlEnumValue("SBB1")
    SBB_1("SBB1"),

    /**
     * Adjustment sub-reason is for DTCC COD withdrawal adjustment.
     * 
     */
    SJCB("SJCB"),

    /**
     * Adjustment sub-reason is that your COD withdrawal was not delivered, however the certificate(s) were issued and outstanding over the record date in the name of your good selves.
     * 
     */
    SBDB("SBDB"),

    /**
     * Adjustment sub-reason is that your COD withdrawal was not delivered, however the certificate(s) were issued and outstanding over the record date in the name of your nominee.
     * 
     */
    SBEB("SBEB"),

    /**
     * Adjustment sub-reason is that the company never declared dividend adjust allocation on user defined date.
     * 
     */
    SANA("SANA"),

    /**
     * Adjustment sub-reason is that the Company in default related adjustment.
     * 
     */
    SADA("SADA"),

    /**
     * Adjustment sub-reason code is for the coupon collection service adjustment for coupon deposit.
     * 
     */
    SCSM("SCSM"),

    /**
     * Adjustment sub-reason is for Custody payment.
     * 
     */
    SCDP("SCDP"),

    /**
     * Adjustment sub-reason is that DTCC deliver order related adjustment.
     * 
     */
    SJEG("SJEG"),

    /**
     * Adjustment sub-reason is for DTCC deposit related adjustment.
     * 
     */
    SJDD("SJDD"),

    /**
     * Adjustment sub-reason is for dividend reinvestment allocation why not on normal event.
     * 
     */
    @XmlEnumValue("SSC6")
    SSC_6("SSC6"),

    /**
     * Adjustment sub-reason is for date revision for fail tracking related adjustment.
     * 
     */
    SFLN("SFLN"),

    /**
     * Adjustment sub-reason is for delete for fail tracking related adjustment.
     * 
     */
    @XmlEnumValue("SFL1")
    SFL_1("SFL1"),

    /**
     * Adjustment sub-reason is that your record date position was adjusted for deliver order (DO) activity.
     * 
     */
    SEEE("SEEE"),

    /**
     * Adjustment sub-reason is for adjustment related to the deposit of lost certificate over the record date that was registered in the name of your [user defined].
     * 
     */
    SDAD("SDAD"),

    /**
     * Adjustment sub-reason is for deposit after cut off date transferred into the name of the CEDE on record date.
     * 
     */
    SDCD("SDCD"),

    /**
     * Adjustment sub-reason is for dividend allocation adjustment due to your sub accounting instructions to the agent.
     * 
     */
    @XmlEnumValue("SSS6")
    SSS_6("SSS6"),

    /**
     * Adjustment sub-reason is for dividend reinvestment allocation of cash in lieu of fractions related adjustment.
     * 
     */
    @XmlEnumValue("SSE6")
    SSE_6("SSE6"),

    /**
     * Adjustment sub-reason is for CTF(s) held over record date on which we guarantee to hold you free and harmless of any further claim on this dividend.
     * 
     */
    SDMT("SDMT"),

    /**
     * Adjustment sub-reason is for DTCC claim against registered holder in the name of your customer.
     * 
     */
    SPCP("SPCP"),

    /**
     * Adjustment sub-reason is for DTCC claim against registered holder in the name of your customer. Late identification of missed transfer by Transfer Agent.
     * 
     */
    SLCP("SLCP"),

    /**
     * Adjustment sub-reason is for DTCC claim against registered holder in the name of your good selves.
     * 
     */
    SPGP("SPGP"),

    /**
     * Adjustment sub-reason is for DTCC claim against registered holder in the name of your nominee. Late identification of missed transfer by Transfer Agent.
     * 
     */
    SLNP("SLNP"),

    /**
     * Adjustment sub-reason is for DTCC claim against registered holder in the name of your nominee.
     * 
     */
    SPNP("SPNP"),

    /**
     * Adjustment sub-reason is for DTCC claim on registered holder in the name of your customer.
     * 
     */
    SGLZ("SGLZ"),

    /**
     * Adjustment sub-reason is for due bill for fail tracking related adjustment.
     * 
     */
    SFLE("SFLE"),

    /**
     * Adjustment sub-reason is for due bill fail tracking.
     * 
     */
    SSFF("SSFF"),

    /**
     * Adjustment sub-reason is for due bill fail tracking reversal.
     * 
     */
    SSFR("SSFR"),

    /**
     * Adjustment sub-reason is that your record date position was adjusted for a DWAC withdrawal to effect a buy back/treasury purchase.
     * 
     */
    @XmlEnumValue("SBB3")
    SBB_3("SBB3"),

    /**
     * Adjustment sub-reason is for foreign cash dividends/bonds interest allocation at favourable rate.
     * 
     */
    @XmlEnumValue("SFF8")
    SFF_8("SFF8"),

    /**
     * Adjustment sub-reason is for ten percent French withholding tax, based on your revised instructions to reduce favourable tax status to unfavourable.
     * 
     */
    @XmlEnumValue("SFH9")
    SFH_9("SFH9"),

    /**
     * Adjustment sub-reason is for foreign cash dividends or bond interest allocation at unfavourable rate.
     * 
     */
    @XmlEnumValue("SFU9")
    SFU_9("SFU9"),

    /**
     * Adjustment sub-reason is for foreign cash dividends/bond interest allocation at exempt rate.
     * 
     */
    @XmlEnumValue("SFE8")
    SFE_8("SFE8"),

    /**
     * Adjustment sub-reason is that your record date position was adjusted for a DWAC buy back withdrawal.
     * 
     */
    SSBB("SSBB"),

    /**
     * Adjustment sub-reason is for DTCC claim on registered holder in the name of your good selves.
     * 
     */
    SGLQ("SGLQ"),

    /**
     * Adjustment sub-reason is for DTCC claim against registered holder in the name of your good selves. Late identification of missed transfer by Transfer Agent.
     * 
     */
    SLGP("SLGP"),

    /**
     * Adjustment sub-reason is for foreign cash dividends allocation at unfavourable rate.
     * 
     */
    @XmlEnumValue("SFL9")
    SFL_9("SFL9"),

    /**
     * Adjustment sub-reason is for allocation of fractional rights.
     * 
     */
    SAFR("SAFR"),

    /**
     * Adjustment sub-reason is for fifteen percent French withholding tax, based on your option election of 100% ADRs at the favourable rate.
     * 
     */
    @XmlEnumValue("SFG8")
    SFG_8("SFG8"),

    /**
     * Adjustment sub-reason is for twenty five percent French withholding tax, based on your option election of 100% ADRs at the unfavourable rate.
     * 
     */
    @XmlEnumValue("SFG9")
    SFG_9("SFG9"),

    /**
     * Adjustment sub-reason is as per memo requesting a frozen letter movement from part number.
     * 
     */
    SFRO("SFRO"),

    /**
     * Adjustment sub-reason is that company is taking 30 day grace period.
     * 
     */
    SAGA("SAGA"),

    /**
     * Adjustment sub-reason is that this adjustment represents credits/debits to your account in lieu of reorganisation deposit activity.
     * 
     */
    SPRG("SPRG"),

    /**
     * Adjustment sub-reason is that adjustment is in response to your inquiry. Refer to control number.
     * 
     */
    SRIH("SRIH"),

    /**
     * Adjustment sub-reason is for in settlement of a trade - DTCC reorganisation account 428-10271-1-2-039.
     * 
     */
    SGLT("SGLT"),

    /**
     * Adjustment sub-reason is for Interest adjusted due to early withdrawal (certificate of deposit).
     * 
     */
    SACB("SACB"),

    /**
     * Adjustment sub-reason is for interest allocated in error first payment on "date user defined".
     * 
     */
    SAEA("SAEA"),

    /**
     * Adjustment sub-reason is that the interest due on the above CUSIP was erroneously paid to you by the issuer although the certificate of deposit was transferred to CEDE (DTCC) prior to the interest payment date.
     * 
     */
    @XmlEnumValue("S66P")
    S_66_P("S66P"),

    /**
     * Adjustment sub-reason is for interest or dividend due on conversion related adjustment.
     * 
     */
    @XmlEnumValue("SAC7")
    SAC_7("SAC7"),

    /**
     * Adjustment sub-reason is for interest or dividend due on merger related adjustment.
     * 
     */
    @XmlEnumValue("SAM7")
    SAM_7("SAM7"),

    /**
     * Adjustment sub-reason is for interest or dividend due on redemption.
     * 
     */
    @XmlEnumValue("SAR7")
    SAR_7("SAR7"),

    /**
     * Adjustment sub-reason is for interest or dividend due on repayment option.
     * 
     */
    @XmlEnumValue("SAP7")
    SAP_7("SAP7"),

    /**
     * Adjustment sub-reason is for interest or dividend due on tender.
     * 
     */
    @XmlEnumValue("SAT7")
    SAT_7("SAT7"),

    /**
     * Adjustment sub-reason is that interest pays at maturity. Allocated in error on user defined date.
     * 
     */
    SAMA("SAMA"),

    /**
     * Adjustment sub-reason is for that your interim position was adjusted for deliver order activity.
     * 
     */
    SIGE("SIGE"),

    /**
     * Adjustment sub-reason is that DTCC investment identification related adjustment.
     * 
     */
    SJIE("SJIE"),

    /**
     * Adjustment sub-reason is for issue in default related adjustment.
     * 
     */
    SADM("SADM"),

    /**
     * Adjustment sub-reason is for fail tracking for fail tracking related adjustment.
     * 
     */
    SFLL("SFLL"),

    /**
     * Adjustment sub-reason is for late announcement activity due bill activity related adjustment.
     * 
     */
    SILL("SILL"),

    /**
     * Adjustment sub-reason is for that the adjustment related to the deposit of lost certificate over the record date was registered in the name of your good selves.
     * 
     */
    SDBD("SDBD"),

    /**
     * Adjustment sub-reason is for withdrawal by transfer - lost certificate over the record date was registered in the name of your customer.
     * 
     */
    @XmlEnumValue("SWG1")
    SWG_1("SWG1"),

    /**
     * Adjustment sub-reason is for adjustment related to the deposit of lost certificate over the record date that was registered in the name of your nominee.
     * 
     */
    SDED("SDED"),

    /**
     * Adjustment sub-reason is for adjustment made for the Midwest depository (6942).
     * 
     */
    SCMU("SCMU"),

    /**
     * Adjustment sub-reason is for muni bearer bond coupon adjustment.
     * 
     */
    SGLM("SGLM"),

    /**
     * Adjustment sub-reason is for muni bearer bond coupon related adjustment.
     * 
     */
    SMAM("SMAM"),

    /**
     * Adjustment sub-reason is for muni bearer bond coupon adjustment excess coupon(s) withdrawn on user defined date.
     * 
     */
    SMDM("SMDM"),

    /**
     * Adjustment sub-reason is for non allocation for fail tracking related adjustment.
     * 
     */
    SFLS("SFLS"),

    /**
     * Adjustment sub-reason is for optional dividend (ops) allocation related adjustment.
     * 
     */
    @XmlEnumValue("SOP2")
    SOP_2("SOP2"),

    /**
     * Adjustment sub-reason is for part claim payment.
     * 
     */
    SCPP("SCPP"),

    /**
     * Adjustment sub-reason is for DTCC pledge release related adjustment.
     * 
     */
    SJEE("SJEE"),

    /**
     * Adjustment sub-reason is that your record date position was adjusted for deposit activity.
     * 
     */
    SDDD("SDDD"),

    /**
     * Adjustment sub-reason is that your position was reinstated for a withdrawal by transfer. However the certificates(s) were issued and outstanding over the record date in the name of your customer(s).
     * 
     */
    @XmlEnumValue("SWN1")
    SWN_1("SWN1"),

    /**
     * Reserved for new user defined reason codes.
     * 
     */
    OTHR("OTHR"),

    /**
     * Adjustment sub-reason is for adjustment made for the Pacific depository (3097).
     * 
     */
    SCLU("SCLU"),

    /**
     * Adjustment sub-reason is that payment of full avoid fiscal tax refund (equal to 42.5% of the dividend).
     * 
     */
    SAHA("SAHA"),

    /**
     * Adjustment sub-reason is that payment of partial avoid fiscal tax refund (equal to 15% of the dividend).
     * 
     */
    SAPA("SAPA"),

    /**
     * Adjustment sub-reason is for adjustment made for the Philadelphia depository (6070).
     * 
     */
    SCNU("SCNU"),

    /**
     * Adjustment sub-reason is for DTCC pledge related adjustment.
     * 
     */
    SJEF("SJEF"),

    /**
     * Adjustment sub-reason is for post date change for fail tracking related adjustment.
     * 
     */
    @XmlEnumValue("SFL3")
    SFL_3("SFL3"),

    /**
     * Adjustment sub-reason is for part-claim reversal.
     * 
     */
    SCRP("SCRP"),

    /**
     * Adjustment sub-reason is for muni bearer bond coupon adjustment. Your interim position was adjusted for deposit activity.
     * 
     */
    SMMM("SMMM"),

    /**
     * Adjustment sub-reason is for muni bearer bond coupon adjustment excess coupon(s) deposited on user defined date.
     * 
     */
    SMEM("SMEM"),

    /**
     * Adjustment sub-reason is for muni bearer bond coupon adjustment for coupon(s) missing from a withdrawal.
     * 
     */
    SMCM("SMCM"),

    /**
     * Adjustment sub-reason is for muni bearer bond coupon adjustment for coupon(s) missing from a deposit related adjustment.
     * 
     */
    SMBM("SMBM"),

    /**
     * Adjustment sub-reason is for an allocation of a pay in kind distribution.
     * 
     */
    SSPA("SSPA"),

    /**
     * Adjustment sub-reason is for that you deposited securities that were previously called. The agent paid DTCC the redemption proceeds. This adjustment is to pass these proceeds on to you. Your free account security position will be adjusted (shorted) today for the called quantity.
     * 
     */
    SDEP("SDEP"),

    /**
     * Adjustment sub-reason is for allocation adjustment for dividend reinvestment due to price correction by the agent.
     * 
     */
    @XmlEnumValue("SSA6")
    SSA_6("SSA6"),

    /**
     * Adjustment sub-reason is for proceeds from sale of.
     * 
     */
    SPFS("SPFS"),

    /**
     * Adjustment sub-reason is for proceeds resulting from a (buy) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039).
     * 
     */
    @XmlEnumValue("SSP4")
    SSP_4("SSP4"),

    /**
     * Adjustment sub-reason is for proceeds resulting from a (sell) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039).
     * 
     */
    @XmlEnumValue("SSS5")
    SSS_5("SSS5"),

    /**
     * Adjustment sub-reason is that this allocation was adjusted for a rate change. Please refer to DIVA comment field for additional information.
     * 
     */
    SRTA("SRTA"),

    /**
     * Adjustment sub-reason is for rate revision for fail tracking related adjustment.
     * 
     */
    SFLR("SFLR"),

    /**
     * Adjustment sub-reason is for rate unknown for fail tracking related adjustment.
     * 
     */
    @XmlEnumValue("SFL0")
    SFL_0("SFL0"),

    /**
     * Adjustment sub-reason is that our record date position was adjusted for a withdrawal by transfer activity.
     * 
     */
    SWHT("SWHT"),

    /**
     * Adjustment sub-reason is for DTCC redemption related adjustment.
     * 
     */
    @XmlEnumValue("SJE7")
    SJE_7("SJE7"),

    /**
     * Adjustment sub-reason is for redemption payment due to pledge release.
     * 
     */
    SGLP("SGLP"),

    /**
     * Adjustment sub-reason is that the 25% French withholding rate has been revised. This adjustment is based on the refunded tax rate.
     * 
     */
    @XmlEnumValue("SFJ9")
    SFJ_9("SFJ9"),

    /**
     * Adjustment sub-reason is for refund of French tax based on acceptance of global reclamation for the July 1992 distribution refer to important notice b # 1352‑93.
     * 
     */
    SFRB("SFRB"),

    /**
     * Adjustment sub-reason is for refund of French tax based on acceptance of global reclamation for the June 1992 distribution refer to important notice b # 1352‑93.
     * 
     */
    SFRA("SFRA"),

    /**
     * Adjustment sub-reason is for reinstate for fail tracking related adjustment.
     * 
     */
    @XmlEnumValue("SFL2")
    SFL_2("SFL2"),

    /**
     * Adjustment sub-reason is for DTCC reorganisation related adjustment.
     * 
     * 
     */
    @XmlEnumValue("SJR7")
    SJR_7("SJR7"),

    /**
     * Adjustment sub-reason is for reorganisation related adjustment on user defined date.
     * 
     */
    @XmlEnumValue("S777")
    S_777("S777"),

    /**
     * Adjustment sub-reason is for Rep payment / charge.
     * 
     */
    SRPO("SRPO"),

    /**
     * Adjustment sub-reason is for redemption cash settlement.
     * 
     */
    @XmlEnumValue("SGL7")
    SGL_7("SGL7"),

    /**
     * Adjustment sub-reason is for a reversal of an accrual claim payment related to a stock distribution payable on user defined date.
     * 
     */
    SCRK("SCRK"),

    /**
     * Adjustment sub-reason is for a reversal of a COD withdrawal related adjustment.
     * 
     */
    SBRH("SBRH"),

    /**
     * Adjustment sub-reason is for a reversal of a deposit adjustment.
     * 
     */
    SDRH("SDRH"),

    /**
     * Adjustment sub-reason is for allocation of script shares amount to be exited in dollar value.
     * 
     */
    SASA("SASA"),

    /**
     * Adjustment sub-reason is for share adjustment resulting from a (buy) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039).
     * 
     */
    @XmlEnumValue("SSR4")
    SSR_4("SSR4"),

    /**
     * Adjustment sub-reason is for share adjustment resulting from a (sell) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039).
     * 
     */
    @XmlEnumValue("SSR5")
    SSR_5("SSR5"),

    /**
     * Adjustment sub-reason is for an allocation of spinoff security.
     * 
     */
    SSOS("SSOS"),

    /**
     * Adjustment sub-reason is for stock loan related payment or charge.
     * 
     * 
     */
    SSLA("SSLA"),

    /**
     * Adjustment sub-reason is for stock loan or repo payment order related adjustment.
     * 
     */
    SSPO("SSPO"),

    /**
     * Adjustment sub-reason is for supplemental interim activity from Midwest (6942).
     * 
     */
    SSME("SSME"),

    /**
     * Adjustment sub-reason is for supplementary interim on user defined date.
     * 
     */
    SAFA("SAFA"),

    /**
     * Adjustment sub-reason is for supplemental interim activity from Philadelphia (6070).
     * 
     */
    SSPE("SSPE"),

    /**
     * Adjustment sub-reason is for supplemental interim activity related adjustment.
     * 
     */
    SRPP("SRPP"),

    /**
     * Adjustment sub-reason is for revision of charge for withholding tax.
     * 
     */
    SAJA("SAJA"),

    /**
     * Adjustment sub-reason is due to shares escheated to New York state in error. This is to reverse.
     * 
     */
    SETO("SETO"),

    /**
     * Adjustment sub-reason is due to a reverse of escheated amount of claim.
     * 
     */
    SFAP("SFAP"),

    /**
     * Adjustment sub-reason is for a reversal of a withdrawal by transfer adjustment.
     * 
     */
    SWRH("SWRH"),

    /**
     * Adjustment sub-reason is to adjust allocation at 100% on your tax exempt instructions.
     * 
     */
    STEA("STEA"),

    /**
     * Adjustment sub-reason is for interest adjusted due to tender fee deduction.
     * 
     */
    @XmlEnumValue("SAF7")
    SAF_7("SAF7"),

    /**
     * Adjustment sub-reason is that your account is being credited at the unfavourable rate (20%) as a result of the reorg merger paid on 4/2/93 (Armstrong Pharm to Medeva plc, effective 1/15/93). If entitled to favourable rate(15%), you must follow attached.
     * 
     */
    @XmlEnumValue("SAA7")
    SAA_7("SAA7"),

    /**
     * Adjustment sub-reason is for uninsured interest withheld as per FSLICN.
     * 
     */
    SAWA("SAWA"),

    /**
     * Adjustment sub-reason is for option to receive Vodafone Group American Depository Receipt at 11.354392 for every 100 ADRS.
     * 
     */
    SRRA("SRRA"),

    /**
     * Adjustment sub-reason is for adjustment made for a withdrawal by transfer that was not transferred into your clients name by the record date.
     * 
     */
    @XmlEnumValue("SWL1")
    SWL_1("SWL1"),

    /**
     * Adjustment sub-reason code is for adjustment made for a withdrawal by transfer set up after the cut off date made transfer into your clients name.
     * 
     */
    @XmlEnumValue("SWM1")
    SWM_1("SWM1"),

    /**
     * Adjustment sub-reason is for DTCC WT related adjustment.
     * 
     */
    SJWT("SJWT"),

    /**
     * Adjustment sub-reason is that your record date position was adjusted for a w/t buy back withdrawal.
     * 
     */
    @XmlEnumValue("SBB2")
    SBB_2("SBB2"),

    /**
     * Adjustment sub-reason is for adjustment to allocation to charge (user defined percentage) withholding tax in (user defined) country.
     * 
     */
    SWTA("SWTA"),

    /**
     * Adjustment sub-reason is in response to your written inquiry.
     * 
     */
    SRAH("SRAH"),

    /**
     * Adjustment sub-reason is for write off reorganisation related adjustment.
     * 
     */
    SJEW("SJEW"),

    /**
     * Adjustment sub-reason is that the principal previously paid to you was at the wrong rate. This adjustment is to correct that erroneous payment.
     * 
     */
    SPRA("SPRA");
    private final String value;

    DTCAdjustmentPaymentSubReason2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DTCAdjustmentPaymentSubReason2Code fromValue(String v) {
        for (DTCAdjustmentPaymentSubReason2Code c: DTCAdjustmentPaymentSubReason2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
