
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeStatus4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeStatus4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RJCT"/>
 *     <enumeration value="FMTC"/>
 *     <enumeration value="SUSP"/>
 *     <enumeration value="SMAT"/>
 *     <enumeration value="NAUT"/>
 *     <enumeration value="UMTC"/>
 *     <enumeration value="SPLI"/>
 *     <enumeration value="INVA"/>
 *     <enumeration value="SMNA"/>
 *     <enumeration value="STLD"/>
 *     <enumeration value="RSCD"/>
 *     <enumeration value="SMAU"/>
 *     <enumeration value="VALI"/>
 *     <enumeration value="REGC"/>
 *     <enumeration value="VMTC"/>
 *     <enumeration value="PSTL"/>
 *     <enumeration value="REGS"/>
 *     <enumeration value="SRJC"/>
 *     <enumeration value="OPMA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradeStatus4Code")
@XmlEnum
public enum TradeStatus4Code {


    /**
     * Trade is rejected.
     * 
     */
    RJCT,

    /**
     * Trade is matched.
     * 
     */
    FMTC,

    /**
     * Trade has been marked not ready for settlement.
     * 
     */
    SUSP,

    /**
     * Trade has been selected for settlement.
     * 
     */
    SMAT,

    /**
     * Trade is not authorised.
     * 
     */
    NAUT,

    /**
     * Trade is unmatched.
     * 
     */
    UMTC,

    /**
     * Trade has been split into subtrades for settlement efficiency.
     * 
     */
    SPLI,

    /**
     * Trade is invalid.
     * 
     */
    INVA,

    /**
     * Trade has not been authorised by the settlement member guaranteeing payment.
     * 
     */
    SMNA,

    /**
     * Settlement is complete.
     * 
     */
    STLD,

    /**
     * Trade is rescinded.
     * 
     */
    RSCD,

    /**
     * Trade has been authorised by the settlement member guaranteeing payment.
     * 
     */
    SMAU,

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
     * Both the Opening and the Valuation details of an NDF trade have been matched with corresponding details of a counterparty's NDF trade.
     * 
     */
    VMTC,

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
     * Trade settlement is rejected.
     * 
     */
    SRJC,

    /**
     * Option has matured.
     * 
     */
    OPMA;

    public String value() {
        return name();
    }

    public static TradeStatus4Code fromValue(String v) {
        return valueOf(v);
    }

}
