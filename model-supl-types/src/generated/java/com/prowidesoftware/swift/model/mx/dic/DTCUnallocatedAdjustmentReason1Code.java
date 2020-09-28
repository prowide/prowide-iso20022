
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCUnallocatedAdjustmentReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DTCUnallocatedAdjustmentReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ANNG"/&gt;
 *     &lt;enumeration value="BDPD"/&gt;
 *     &lt;enumeration value="CSHR"/&gt;
 *     &lt;enumeration value="CSHU"/&gt;
 *     &lt;enumeration value="COND"/&gt;
 *     &lt;enumeration value="DFLT"/&gt;
 *     &lt;enumeration value="HICO"/&gt;
 *     &lt;enumeration value="MASF"/&gt;
 *     &lt;enumeration value="ISNF"/&gt;
 *     &lt;enumeration value="NMAT"/&gt;
 *     &lt;enumeration value="LFID"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *     &lt;enumeration value="ANFI"/&gt;
 *     &lt;enumeration value="LIQD"/&gt;
 *     &lt;enumeration value="NOTL"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="PCHK"/&gt;
 *     &lt;enumeration value="RRFX"/&gt;
 *     &lt;enumeration value="RCNF"/&gt;
 *     &lt;enumeration value="RRNF"/&gt;
 *     &lt;enumeration value="RPLG"/&gt;
 *     &lt;enumeration value="SANF"/&gt;
 *     &lt;enumeration value="SDPC"/&gt;
 *     &lt;enumeration value="SPNF"/&gt;
 *     &lt;enumeration value="PUVF"/&gt;
 *     &lt;enumeration value="APRR"/&gt;
 *     &lt;enumeration value="SAGA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * Holiday  in country of origin.
     * 
     */
    HICO,

    /**
     * Insufficient funds  were received from the agent.
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
