
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VALI"/&gt;
 *     &lt;enumeration value="REGC"/&gt;
 *     &lt;enumeration value="INVA"/&gt;
 *     &lt;enumeration value="SRJC"/&gt;
 *     &lt;enumeration value="REGS"/&gt;
 *     &lt;enumeration value="UMTC"/&gt;
 *     &lt;enumeration value="FMTC"/&gt;
 *     &lt;enumeration value="RSCD"/&gt;
 *     &lt;enumeration value="STLD"/&gt;
 *     &lt;enumeration value="PSTL"/&gt;
 *     &lt;enumeration value="VMTC"/&gt;
 *     &lt;enumeration value="RJCT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradeStatus2Code")
@XmlEnum
public enum TradeStatus2Code {


    /**
     * Trade is validated.
     * 
     */
    VALI,

    /**
     * Trade passed regulatory check.
     * 
     */
    REGC,

    /**
     * Trade is invalid.
     * 
     */
    INVA,

    /**
     * Trade settlement is rejected.
     * 
     */
    SRJC,

    /**
     * Trade is suspended for regulatory reasons.
     * 
     */
    REGS,

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
     * Part, but not all, of a Trade's value has settled, and no further elements of the Trade's value are expected to be settled.
     * 
     */
    PSTL,

    /**
     * Both the Opening and the Valuation details of an NDF trade have been matched with corresponding details of a counterparty's NDF trade.
     * 
     */
    VMTC,

    /**
     * Trade is rejected.
     * 
     */
    RJCT;

    public String value() {
        return name();
    }

    public static TradeStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
