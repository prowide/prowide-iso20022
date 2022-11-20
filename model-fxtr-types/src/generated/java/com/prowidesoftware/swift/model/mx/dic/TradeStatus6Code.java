
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeStatus6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeStatus6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVA"/&gt;
 *     &lt;enumeration value="FMTC"/&gt;
 *     &lt;enumeration value="SMAP"/&gt;
 *     &lt;enumeration value="RJCT"/&gt;
 *     &lt;enumeration value="RSCD"/&gt;
 *     &lt;enumeration value="STLD"/&gt;
 *     &lt;enumeration value="SPLI"/&gt;
 *     &lt;enumeration value="UMTC"/&gt;
 *     &lt;enumeration value="SMAT"/&gt;
 *     &lt;enumeration value="FUMT"/&gt;
 *     &lt;enumeration value="NETT"/&gt;
 *     &lt;enumeration value="PFIX"/&gt;
 *     &lt;enumeration value="OMTC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradeStatus6Code")
@XmlEnum
public enum TradeStatus6Code {


    /**
     * Trade is invalid.
     * 
     */
    INVA,

    /**
     * Trade is matched.
     * 
     */
    FMTC,

    /**
     * Trade has been selected for settlement and is pending.
     * 
     */
    SMAP,

    /**
     * Trade is rejected.
     * 
     */
    RJCT,

    /**
     * Trade is rescinded.
     * 
     */
    RSCD,

    /**
     * Settlement is complete.
     * 
     */
    STLD,

    /**
     * Trade has been split into subtrades for settlement efficiency.
     * 
     */
    SPLI,

    /**
     * Trade is unmatched.
     * 
     */
    UMTC,

    /**
     * Trade has been selected for settlement.
     * 
     */
    SMAT,

    /**
     * For NDF instructions, if a party has submitted both the open and fix confirmations and the counterparty is yet to submit the open and fix confirmation the instruction is updated to ‘Fix Unmatched’ Status.
     * 
     */
    FUMT,

    /**
     * Trade has been netted by the central system.
     * 
     */
    NETT,

    /**
     * For NDF instructions, open confirmations are matched and the Fix confirmations are not matched.
     * 
     */
    PFIX,

    /**
     * For NDF trades, the trade is marked as open match when both open confirmations from both parties match.
     * 
     */
    OMTC;

    public String value() {
        return name();
    }

    public static TradeStatus6Code fromValue(String v) {
        return valueOf(v);
    }

}
