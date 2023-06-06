
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCUnallocatedAdjustmentReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DTCUnallocatedAdjustmentReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ANNG"/>
 *     <enumeration value="BDPD"/>
 *     <enumeration value="CSHR"/>
 *     <enumeration value="CSHU"/>
 *     <enumeration value="COND"/>
 *     <enumeration value="DFLT"/>
 *     <enumeration value="HICO"/>
 *     <enumeration value="MASF"/>
 *     <enumeration value="ISNF"/>
 *     <enumeration value="NMAT"/>
 *     <enumeration value="LFID"/>
 *     <enumeration value="PEND"/>
 *     <enumeration value="ANFI"/>
 *     <enumeration value="LIQD"/>
 *     <enumeration value="NOTL"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PCHK"/>
 *     <enumeration value="RRFX"/>
 *     <enumeration value="RCNF"/>
 *     <enumeration value="RRNF"/>
 *     <enumeration value="RPLG"/>
 *     <enumeration value="SANF"/>
 *     <enumeration value="SDPC"/>
 *     <enumeration value="SPNF"/>
 *     <enumeration value="PUVF"/>
 *     <enumeration value="APRR"/>
 *     <enumeration value="SAGA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DTCUnallocatedAdjustmentReason1Code")
@XmlEnum
public enum DTCUnallocatedAdjustmentReason1Code {


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
     * Cash rate for allocation is zero.
     * 
     */
    CSHR,

    /**
     * Cash rate for allocation is zero.
     * 
     */
    CSHU,

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
     * Holiday in country of origin.
     * 
     */
    HICO,

    /**
     * Insufficient funds were received from the agent.
     * 
     */
    MASF,

    /**
     * Issue was not funded.
     * 
     */
    ISNF,

    /**
     * Issue is not maturing.
     * 
     */
    NMAT,

    /**
     * Issues funded and/or identified after the cycle cut off.
     * 
     */
    LFID,

    /**
     * Item is pending.
     * 
     */
    PEND,

    /**
     * Funds were not received by the agent.
     * 
     */
    ANFI,

    /**
     * Issue is being liquidated.
     * 
     */
    LIQD,

    /**
     * Notional balance pincipal will not be paid.
     * 
     */
    NOTL,

    /**
     * Reserved for new user defined reason codes.
     * 
     */
    OTHR,

    /**
     * Paid upon receipt of check.
     * 
     */
    PCHK,

    /**
     * Pending conversion of funds.
     * 
     */
    RRFX,

    /**
     * Recapitalization. Issue not funded.
     * 
     */
    RCNF,

    /**
     * Redemption of rates. Issue not funded.
     * 
     */
    RRNF,

    /**
     * Released pledge position.
     * 
     */
    RPLG,

    /**
     * Sale of asset. Issue not funded.
     * 
     */
    SANF,

    /**
     * Same day position capture.
     * 
     */
    SDPC,

    /**
     * Special distribution. Issue not funded.
     * 
     */
    SPNF,

    /**
     * Specific issues have been suppressed.
     * 
     */
    PUVF,

    /**
     * Rate is not final. Rate is approximate.
     * 
     */
    APRR,

    /**
     * Company is taking a 30 day grace period.
     * 
     */
    SAGA;

    public String value() {
        return name();
    }

    public static DTCUnallocatedAdjustmentReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
