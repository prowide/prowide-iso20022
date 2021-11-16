
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCUnallocatedAdjustmentReason4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DTCUnallocatedAdjustmentReason4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LFID"/&gt;
 *     &lt;enumeration value="APRR"/&gt;
 *     &lt;enumeration value="ANNG"/&gt;
 *     &lt;enumeration value="BDPD"/&gt;
 *     &lt;enumeration value="RESC"/&gt;
 *     &lt;enumeration value="CDIN"/&gt;
 *     &lt;enumeration value="CSHR"/&gt;
 *     &lt;enumeration value="ERLY"/&gt;
 *     &lt;enumeration value="COND"/&gt;
 *     &lt;enumeration value="DFLT"/&gt;
 *     &lt;enumeration value="FVDG"/&gt;
 *     &lt;enumeration value="ANFI"/&gt;
 *     &lt;enumeration value="SAGA"/&gt;
 *     &lt;enumeration value="HICO"/&gt;
 *     &lt;enumeration value="ISNF"/&gt;
 *     &lt;enumeration value="NMAT"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *     &lt;enumeration value="LIQD"/&gt;
 *     &lt;enumeration value="MSTK"/&gt;
 *     &lt;enumeration value="NOTL"/&gt;
 *     &lt;enumeration value="MASF"/&gt;
 *     &lt;enumeration value="OFAC"/&gt;
 *     &lt;enumeration value="FDIC"/&gt;
 *     &lt;enumeration value="CHBD"/&gt;
 *     &lt;enumeration value="CHIP"/&gt;
 *     &lt;enumeration value="CSHU"/&gt;
 *     &lt;enumeration value="PUVF"/&gt;
 *     &lt;enumeration value="SPNF"/&gt;
 *     &lt;enumeration value="SDPC"/&gt;
 *     &lt;enumeration value="SANF"/&gt;
 *     &lt;enumeration value="RPLG"/&gt;
 *     &lt;enumeration value="RRNF"/&gt;
 *     &lt;enumeration value="RCNF"/&gt;
 *     &lt;enumeration value="PLEG"/&gt;
 *     &lt;enumeration value="RRFX"/&gt;
 *     &lt;enumeration value="PCHK"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * Reason is due to a CD accelerated maturity
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
     * Reason is due to a five day grace period
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
