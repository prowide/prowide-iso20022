
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommissionType9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CommissionType9Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLDI"/>
 *     <enumeration value="STEP"/>
 *     <enumeration value="SOFT"/>
 *     <enumeration value="PERN"/>
 *     <enumeration value="FLAT"/>
 *     <enumeration value="PERU"/>
 *     <enumeration value="PWCD"/>
 *     <enumeration value="PWEU"/>
 *     <enumeration value="BRKR"/>
 *     <enumeration value="DFDP"/>
 *     <enumeration value="PBOC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CommissionType9Code")
@XmlEnum
public enum CommissionType9Code {


    /**
     * Commission is as per client agreement.
     * 
     */
    CLDI,

    /**
     * Commission for a step-out trade, charged by the step-out broker.
     * 
     */
    STEP,

    /**
     * Commission designated by the broker for third party services. The soft dollar arrangement refers to an arrangement wherean investment manager directs transactions to a brokerand, in exchange, the broker provides brokerage and research services to the investment manager. Soft dollar arrangements include proprietary and third party research arrangements, but do not include client-directed brokerage arrangements. The U.S. Securities Exchange Act of 1934, Section 238(e), created a "safe harbor" to protect investment managers from claims that they had breached their fiduciary duties by using their client commissions to pay a higher commission than they might have paid for execution services to acquire investment research. The SEC defines soft dollars as: The Commission has defined soft dollar practices as arrangements under which products or services, other than execution of securities transactions, are obtained through an adviser or a broker-dealer in exchange for the direction by the adviser of client brokerage transactions to the broker-dealer. An individual or firm must exercise "investment discretion" over an account, as defined in Section 3(a)(35) of the Exchange Act, in order to use client commissions to obtain research under Section 28(e) of the Exchange Act ("Section 28(e)").
     * 
     */
    SOFT,

    /**
     * Commission is a percentage of principal.
     * 
     */
    PERN,

    /**
     * Commission is a flat fee.
     * 
     */
    FLAT,

    /**
     * Commission is per unit of financial instrument.
     * 
     */
    PERU,

    /**
     * Commission is a percentage commission waived as cash discount.
     * 
     */
    PWCD,

    /**
     * Commission is a percentage commission waived as additional units.
     * 
     */
    PWEU,

    /**
     * Brokerage commission.
     * 
     */
    BRKR,

    /**
     * Differential or deferred payment commission rate.  .
     * 
     */
    DFDP,

    /**
     * Commission is based on points per bond or contract.
     * 
     */
    PBOC;

    public String value() {
        return name();
    }

    public static CommissionType9Code fromValue(String v) {
        return valueOf(v);
    }

}
