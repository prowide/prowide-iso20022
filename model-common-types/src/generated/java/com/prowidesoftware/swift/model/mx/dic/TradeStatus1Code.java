
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVA"/&gt;
 *     &lt;enumeration value="VALI"/&gt;
 *     &lt;enumeration value="REGC"/&gt;
 *     &lt;enumeration value="UMTC"/&gt;
 *     &lt;enumeration value="VMTC"/&gt;
 *     &lt;enumeration value="RSCD"/&gt;
 *     &lt;enumeration value="STLD"/&gt;
 *     &lt;enumeration value="PSTL"/&gt;
 *     &lt;enumeration value="REGS"/&gt;
 *     &lt;enumeration value="FMTC"/&gt;
 *     &lt;enumeration value="SRJC"/&gt;
 *     &lt;enumeration value="RJCT"/&gt;
 *     &lt;enumeration value="OPMA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradeStatus1Code")
@XmlEnum
public enum TradeStatus1Code {


    /**
     * Trade is invalid.
     * 
     */
    INVA,

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
     * Trade is unmatched.
     * 
     */
    UMTC,

    /**
     * Both the Opening and the Valuation details of an NDF trade have been matched with corresponding details of a counterparty's NDF trade.
     * 
     */
    VMTC,

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
     * Trade is suspended for regulatory reasons.
     * 
     */
    REGS,

    /**
     * Trade is matched.
     * 
     */
    FMTC,

    /**
     * Trade settlement is rejected.
     * 
     */
    SRJC,

    /**
     * Trade is rejected.
     * 
     */
    RJCT,

    /**
     * Option has matured.
     * 
     */
    OPMA;

    public String value() {
        return name();
    }

    public static TradeStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
