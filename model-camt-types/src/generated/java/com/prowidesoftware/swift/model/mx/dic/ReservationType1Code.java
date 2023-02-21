
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReservationType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CARE"/&gt;
 *     &lt;enumeration value="UPAR"/&gt;
 *     &lt;enumeration value="NSSR"/&gt;
 *     &lt;enumeration value="HPAR"/&gt;
 *     &lt;enumeration value="THRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReservationType1Code")
@XmlEnum
public enum ReservationType1Code {


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
    THRE;

    public String value() {
        return name();
    }

    public static ReservationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
