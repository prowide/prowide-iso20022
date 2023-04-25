
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeStatus3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INVA"/>
 *     <enumeration value="UMTC"/>
 *     <enumeration value="RSCD"/>
 *     <enumeration value="STLD"/>
 *     <enumeration value="FMTC"/>
 *     <enumeration value="RJCT"/>
 *     <enumeration value="SMAU"/>
 *     <enumeration value="SMNA"/>
 *     <enumeration value="SMAT"/>
 *     <enumeration value="SPLI"/>
 *     <enumeration value="SUSP"/>
 *     <enumeration value="NAUT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradeStatus3Code")
@XmlEnum
public enum TradeStatus3Code {


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
     * Trade is matched.
     * 
     */
    FMTC,

    /**
     * Trade is rejected.
     * 
     */
    RJCT,

    /**
     * Trade has been authorised by the settlement member guaranteeing payment.
     * 
     */
    SMAU,

    /**
     * Trade has not been authorised by the settlement member guaranteeing payment.
     * 
     */
    SMNA,

    /**
     * Trade has been selected for settlement.
     * 
     */
    SMAT,

    /**
     * Trade has been split into subtrades for settlement efficiency.
     * 
     */
    SPLI,

    /**
     * Trade has been marked not ready for settlement.
     * 
     */
    SUSP,

    /**
     * Trade is not authorised.
     * 
     */
    NAUT;

    public String value() {
        return name();
    }

    public static TradeStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
