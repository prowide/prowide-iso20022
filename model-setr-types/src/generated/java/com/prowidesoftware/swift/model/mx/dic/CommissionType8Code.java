
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommissionType8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CommissionType8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="STEP"/>
 *     <enumeration value="REGU"/>
 *     <enumeration value="STEI"/>
 *     <enumeration value="SOFT"/>
 *     <enumeration value="SOIN"/>
 *     <enumeration value="SOUT"/>
 *     <enumeration value="PLAN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CommissionType8Code")
@XmlEnum
public enum CommissionType8Code {


    /**
     * Commission for a step-out trade, charged by the step-out broker.
     * 
     */
    STEP,

    /**
     * Commission that is regular.
     * 
     */
    REGU,

    /**
     * Commission for a step-in trade, charged by the step-in broker.
     * 
     */
    STEI,

    /**
     * Commission designated by the broker for third party services. The soft dollar arrangement refers to an arrangement wherean investment manager directs transactions to a brokerand, in exchange, the broker provides brokerage and research services to the investment manager. Soft dollar arrangements include proprietary and third party research arrangements, but do not include client-directed brokerage arrangements. The U.S. Securities Exchange Act of 1934, Section 238(e), created a "safe harbor" to protect investment managers from claims that they had breached their fiduciary duties by using their client commissions to pay a higher commission than they might have paid for execution services to acquire investment research. The SEC defines soft dollars as: The Commission has defined soft dollar practices as arrangements under which products or services, other than execution of securities transactions, are obtained through an adviser or a broker-dealer in exchange for the direction by the adviser of client brokerage transactions to the broker-dealer. An individual or firm must exercise "investment discretion" over an account, as defined in Section 3(a)(35) of the Exchange Act, in order to use client commissions to obtain research under Section 28(e) of the Exchange Act ("Section 28(e)").
     * 
     */
    SOFT,

    /**
     * Commission that combines soft dollar and step-in commission characteristics.
     * 
     */
    SOIN,

    /**
     * Commission that combines soft dollar and step-out commission characteristics.
     * 
     */
    SOUT,

    /**
     * Commission for a plan sponsor's services.
     * 
     */
    PLAN;

    public String value() {
        return name();
    }

    public static CommissionType8Code fromValue(String v) {
        return valueOf(v);
    }

}
