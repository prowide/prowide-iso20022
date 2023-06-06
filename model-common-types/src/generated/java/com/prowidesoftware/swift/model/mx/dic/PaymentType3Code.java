
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CBS"/>
 *     <enumeration value="BCK"/>
 *     <enumeration value="BAL"/>
 *     <enumeration value="CLS"/>
 *     <enumeration value="CTR"/>
 *     <enumeration value="CBH"/>
 *     <enumeration value="CBP"/>
 *     <enumeration value="DPG"/>
 *     <enumeration value="DPN"/>
 *     <enumeration value="EXP"/>
 *     <enumeration value="TCH"/>
 *     <enumeration value="LMT"/>
 *     <enumeration value="LIQ"/>
 *     <enumeration value="DPP"/>
 *     <enumeration value="DPH"/>
 *     <enumeration value="DPS"/>
 *     <enumeration value="STF"/>
 *     <enumeration value="TRP"/>
 *     <enumeration value="TCS"/>
 *     <enumeration value="LOA"/>
 *     <enumeration value="LOR"/>
 *     <enumeration value="TCP"/>
 *     <enumeration value="OND"/>
 *     <enumeration value="MGL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentType3Code")
@XmlEnum
public enum PaymentType3Code {


    /**
     * Payment has an origin in one country, a destination in another, and is made in the currency of either the origin or destination country.
     * 
     */
    CBS,

    /**
     * Payment is made under the recovery procedure to move liquidity to/from the settlement account of a member according to the specifications of the system.
     * 
     */
    BCK,

    /**
     * Transaction is a payment offsetting the net cash balance owed/due in a retail payment system.
     * 
     */
    BAL,

    /**
     * Payment is linked to CLS activities.
     * 
     */
    CLS,

    /**
     * Payment is made to settle an operation made with the central bank.
     * 
     */
    CTR,

    /**
     * Transaction is a high value payment that has an origin in one country and a destination in another country and is made in the currency of either the origin or destination country.
     * 
     */
    CBH,

    /**
     * Transaction is a priority payment that has an origin in one country and a destination in another and is made in the currency of either the origin or destination country.
     * 
     */
    CBP,

    /**
     * Gross cash payment offsetting the amount owed/due for a securities transaction settlement.
     * 
     */
    DPG,

    /**
     * Net payment offsetting the cash balance due/owed for a series of securities transactions settlement.
     * 
     */
    DPN,

    /**
     * Transaction is a payment that is processed whenever liquidity is available on the settlement account of a member of the RTGSPlus system.
     * 
     */
    EXP,

    /**
     * Transaction is a high value payment that is made in a third currency to the origin and destination countries. The origin and destination countries may be one and the same country.
     * 
     */
    TCH,

    /**
     * Transaction is a payment that is processed when the pool of liquidity exceeds the minimum value reserved for an express payment in the RTGSPlus system.
     * 
     */
    LMT,

    /**
     * Payment is made to transfer liquidity to/from the settlement account of a member, to/from the current account held at the central institution or any other institution.
     * 
     */
    LIQ,

    /**
     * Transaction is a priority payment that has an origin and a destination in the same country and is made in the currency of that country.
     * 
     */
    DPP,

    /**
     * Transaction is a high value payment that has an origin and a destination in the same country and is made in the currency of that country.
     * 
     */
    DPH,

    /**
     * Payment has an origin and a destination in the same country, and is made in the currency of that country.
     * 
     */
    DPS,

    /**
     * Payment is linked to overnight deposits and the marginal lending facility.
     * 
     */
    STF,

    /**
     * Payment is linked to the Treasury State.
     * 
     */
    TRP,

    /**
     * Transaction is a payment that is made in a third currency to the origin and destination countries. The origin and destination countries may be one and the same country.
     * 
     */
    TCS,

    /**
     * Transaction is the payment of a specific amount of money lent by a creditor/lender.
     * 
     */
    LOA,

    /**
     * Transaction is an amount of money transferred in repayment of loan.
     * 
     */
    LOR,

    /**
     * Payment is made in a third currency to the origin and destination countries. The origin and destination countries may be the same country.
     * 
     */
    TCP,

    /**
     * Transaction is linked to an overnight deposit.
     * 
     */
    OND,

    /**
     * Transaction is linked to the marginal lending facility.
     * 
     */
    MGL;

    public String value() {
        return name();
    }

    public static PaymentType3Code fromValue(String v) {
        return valueOf(v);
    }

}
