
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCUnallocatedAdjustmentReason4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DTCUnallocatedAdjustmentReason4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LFID"/>
 *     <enumeration value="APRR"/>
 *     <enumeration value="ANNG"/>
 *     <enumeration value="BDPD"/>
 *     <enumeration value="RESC"/>
 *     <enumeration value="CDIN"/>
 *     <enumeration value="CSHR"/>
 *     <enumeration value="ERLY"/>
 *     <enumeration value="COND"/>
 *     <enumeration value="DFLT"/>
 *     <enumeration value="FVDG"/>
 *     <enumeration value="ANFI"/>
 *     <enumeration value="SAGA"/>
 *     <enumeration value="HICO"/>
 *     <enumeration value="ISNF"/>
 *     <enumeration value="NMAT"/>
 *     <enumeration value="PEND"/>
 *     <enumeration value="LIQD"/>
 *     <enumeration value="MSTK"/>
 *     <enumeration value="NOTL"/>
 *     <enumeration value="MASF"/>
 *     <enumeration value="OFAC"/>
 *     <enumeration value="FDIC"/>
 *     <enumeration value="CHBD"/>
 *     <enumeration value="CHIP"/>
 *     <enumeration value="CSHU"/>
 *     <enumeration value="PUVF"/>
 *     <enumeration value="SPNF"/>
 *     <enumeration value="SDPC"/>
 *     <enumeration value="SANF"/>
 *     <enumeration value="RPLG"/>
 *     <enumeration value="RRNF"/>
 *     <enumeration value="RCNF"/>
 *     <enumeration value="PLEG"/>
 *     <enumeration value="RRFX"/>
 *     <enumeration value="PCHK"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DTCUnallocatedAdjustmentReason4Code")
@XmlEnum
public enum DTCUnallocatedAdjustmentReason4Code {


    /**
     * Issues funded and/or identified after the cycle cut off.
     * 
     */
    LFID,

    /**
     * Rate is not final. Rate is approximate.
     * 
     */
    APRR,

    /**
     * Incorrect announcement.
     * 
     */
    ANNG,

    /**
     * Incorrect payable date.
     * 
     */
    BDPD,

    /**
     * Reason is due to a call rescinded.
     * 
     */
    RESC,

    /**
     * Reason is due to a Canadian depository inventory.
     * 
     */
    CDIN,

    /**
     * Cash rate for allocation is zero.
     * 
     */
    CSHR,

    /**
     * Reason is due to a CD accelerated maturity.
     * 
     */
    ERLY,

    /**
     * Payment is conditional and conditions have not been met yet.
     * 
     */
    COND,

    /**
     * Issue is in default.
     * 
     */
    DFLT,

    /**
     * Reason is due to a five day grace period.
     * 
     */
    FVDG,

    /**
     * Funds were not received by the agent.
     * 
     */
    ANFI,

    /**
     * Company is taking a 30 day grace period.
     * 
     */
    SAGA,

    /**
     * Reason is due to holiday in country of origin.
     * 
     */
    HICO,

    /**
     * Reason is due to issue that was not funded.
     * 
     */
    ISNF,

    /**
     * Reason is due to issue that is not maturing.
     * 
     */
    NMAT,

    /**
     * Reason is due to items pending.
     * 
     */
    PEND,

    /**
     * Issue is being liquidated.
     * 
     */
    LIQD,

    /**
     * Reason is due to maturity for stock payment option.
     * 
     */
    MSTK,

    /**
     * Notional balance principal will not be paid.
     * 
     */
    NOTL,

    /**
     * Reason is due to insufficient funds received from the agent.
     * 
     */
    MASF,

    /**
     * Reason is due to funds held at Chase for official foreign asset control.
     * 
     */
    OFAC,

    /**
     * Reason is due to a failed bank; Federal Deposit Insurance Corporation assumed.
     * 
     */
    FDIC,

    /**
     * Reason is due to a church bond not funded.
     * 
     */
    CHBD,

    /**
     * Reason is due to a CHIPS Payment.
     * 
     */
    CHIP,

    /**
     * Cash rate for allocation is zero.
     * 
     */
    CSHU,

    /**
     * Specific issues have been suppressed.
     * 
     */
    PUVF,

    /**
     * Reason is due to special distribution and the issue was not funded.
     * 
     */
    SPNF,

    /**
     * Reason is due to same day position capture.
     * 
     */
    SDPC,

    /**
     * Reason is that due to sale of asset, issue was not funded.
     * 
     */
    SANF,

    /**
     * Reason is due to released pledge position.
     * 
     */
    RPLG,

    /**
     * Reason is that due to redemption of rates, issue was not funded.
     * 
     */
    RRNF,

    /**
     * Reason is due to recapitalisation and issue not funded.
     * 
     */
    RCNF,

    /**
     * Reason is due to pledged position.
     * 
     */
    PLEG,

    /**
     * Reason is due to pending conversion of funds.
     * 
     */
    RRFX,

    /**
     * Reason is due paid upon receipt of check.
     * 
     */
    PCHK,

    /**
     * Reserved for new user defined reason codes.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static DTCUnallocatedAdjustmentReason4Code fromValue(String v) {
        return valueOf(v);
    }

}
