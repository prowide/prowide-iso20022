
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeStatus5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeStatus5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INVA"/>
 *     <enumeration value="FMTC"/>
 *     <enumeration value="AMUI"/>
 *     <enumeration value="SMAP"/>
 *     <enumeration value="NAUT"/>
 *     <enumeration value="RJCT"/>
 *     <enumeration value="RSCD"/>
 *     <enumeration value="STLD"/>
 *     <enumeration value="SMAU"/>
 *     <enumeration value="SMNA"/>
 *     <enumeration value="SPLI"/>
 *     <enumeration value="SUSP"/>
 *     <enumeration value="UMTC"/>
 *     <enumeration value="SMAT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradeStatus5Code")
@XmlEnum
public enum TradeStatus5Code {


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
     * Trade is amended.
     * 
     */
    AMUI,

    /**
     * Trade has been selected for settlement and is pending.
     * 
     */
    SMAP,

    /**
     * Trade is not authorised.
     * 
     */
    NAUT,

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
     * Trade is unmatched.
     * 
     */
    UMTC,

    /**
     * Trade has been selected for settlement.
     * 
     */
    SMAT;

    public String value() {
        return name();
    }

    public static TradeStatus5Code fromValue(String v) {
        return valueOf(v);
    }

}
