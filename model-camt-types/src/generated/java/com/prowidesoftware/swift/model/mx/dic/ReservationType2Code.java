
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReservationType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CARE"/>
 *     <enumeration value="UPAR"/>
 *     <enumeration value="NSSR"/>
 *     <enumeration value="HPAR"/>
 *     <enumeration value="THRE"/>
 *     <enumeration value="BLKD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReservationType2Code")
@XmlEnum
public enum ReservationType2Code {


    /**
     * Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing cash withdrawals.
     * 
     */
    CARE,

    /**
     * Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing critical payments called urgent payments.
     * 
     */
    UPAR,

    /**
     * Amount set aside by a participant to reserve liquidity from its own account, exclusively for the settlement of the multilateral cash balance stemming from the Net Security Settlement System.
     * 
     */
    NSSR,

    /**
     * Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing highly urgent payments.
     * 
     */
    HPAR,

    /**
     * Amount above which funds will be destined for investment.
     * 
     */
    THRE,

    /**
     * Amount blocked or frozen due to external circumstances such as a court order, death of beneficiary or account owner, or bankruptcy.
     * 
     */
    BLKD;

    public String value() {
        return name();
    }

    public static ReservationType2Code fromValue(String v) {
        return valueOf(v);
    }

}
