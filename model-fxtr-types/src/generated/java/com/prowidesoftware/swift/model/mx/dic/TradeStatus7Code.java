
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeStatus7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeStatus7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVA"/&gt;
 *     &lt;enumeration value="UMTC"/&gt;
 *     &lt;enumeration value="FMTC"/&gt;
 *     &lt;enumeration value="SMAT"/&gt;
 *     &lt;enumeration value="SUSP"/&gt;
 *     &lt;enumeration value="SMAP"/&gt;
 *     &lt;enumeration value="PFIX"/&gt;
 *     &lt;enumeration value="FUMT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradeStatus7Code")
@XmlEnum
public enum TradeStatus7Code {


    /**
     * Trade is invalid.
     * 
     */
    INVA,

    /**
     * Trade is unmatched.
     * 
     */
    UMTC,

    /**
     * Trade is matched.
     * 
     */
    FMTC,

    /**
     * Trade has been selected for settlement.
     * 
     */
    SMAT,

    /**
     * Trade has been marked not ready for settlement.
     * 
     */
    SUSP,

    /**
     * Trade has been selected for settlement and is pending.
     * 
     */
    SMAP,

    /**
     * For NDF instructions, open confirmations are matched and the Fix confirmations are not matched.
     * 
     */
    PFIX,

    /**
     * For NDF instructions, if a party has submitted both the open and fix confirmations and the counterparty is yet to submit the open and fix confirmation the instruction is updated to ‘Fix Unmatched’ Status.
     * 
     */
    FUMT;

    public String value() {
        return name();
    }

    public static TradeStatus7Code fromValue(String v) {
        return valueOf(v);
    }

}
