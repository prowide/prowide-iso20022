
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INVA"/>
 *     <enumeration value="VALI"/>
 *     <enumeration value="REGC"/>
 *     <enumeration value="UMTC"/>
 *     <enumeration value="VMTC"/>
 *     <enumeration value="RSCD"/>
 *     <enumeration value="STLD"/>
 *     <enumeration value="PSTL"/>
 *     <enumeration value="REGS"/>
 *     <enumeration value="FMTC"/>
 *     <enumeration value="SRJC"/>
 *     <enumeration value="RJCT"/>
 *     <enumeration value="OPMA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
