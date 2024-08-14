
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionallyAcceptedStatusReason3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ConditionallyAcceptedStatusReason3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DOCC"/>
 *     <enumeration value="AWSM"/>
 *     <enumeration value="DUPL"/>
 *     <enumeration value="CRED"/>
 *     <enumeration value="BPID"/>
 *     <enumeration value="ERIS"/>
 *     <enumeration value="AMLD"/>
 *     <enumeration value="APPR"/>
 *     <enumeration value="AFUN"/>
 *     <enumeration value="BMIN"/>
 *     <enumeration value="BMTO"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="PRCT"/>
 *     <enumeration value="BMRA"/>
 *     <enumeration value="BMRV"/>
 *     <enumeration value="LOCK"/>
 *     <enumeration value="ILLI"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="STOP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ConditionallyAcceptedStatusReason3Code")
@XmlEnum
public enum ConditionallyAcceptedStatusReason3Code {


    /**
     * Order is pending until documents are completed and received, eg, legal documents from the successor, legal proceeds because of bankruptcy, missing signature.
     * 
     */
    DOCC,

    /**
     * Order is accepted for further processing but the execution of the order is pending until there is enough cash in the account to pay the subscription.
     * 
     */
    AWSM,

    /**
     * Order is accepted for further processing pending the result of the investigation for possible duplicates.
     * 
     */
    DUPL,

    /**
     * Order is accepted for further processing pending the extension of the trading limit.
     * 
     */
    CRED,

    /**
     * Order is accepted for further processing but the execution of the order is pending the benefit plan investor (BPI) declaration.
     * 
     */
    BPID,

    /**
     * Order is accepted for further processing but the execution of the order is pending the ERISA declaration.
     * 
     */
    ERIS,

    /**
     * Order is accepted for further processing but the execution of the order is pending until the required anti-money laundering documentation is presented to the transfer agent.
     * 
     */
    AMLD,

    /**
     * Order is accepted for further processing but the execution of the order is pending the investment manager's approval.
     * 
     */
    APPR,

    /**
     * Order is accepted for further processing but the execution of the subscription order is pending as additional funding is required.
     * 
     */
    AFUN,

    /**
     * Order is accepted for further processing but the execution of the order is pending as the order is below the minimum initial investment amount and is subject to the investment manager's approval.
     * 
     */
    BMIN,

    /**
     * Order is accepted for further processing but the execution of the subscription order is pending as the order is below the minimum top-up investment and is subject to the investment manager's approval.
     * 
     */
    BMTO,

    /**
     * Order is accepted for further processing but the execution of the order is pending as there is insufficient capacity and the order is subject to the investment manager's approval.
     * 
     */
    INSU,

    /**
     * Order is accepted for further processing but the execution of the order is pending because of a percentage holding breach, eg, PPM rules; taxation rules (ERISA).
     * 
     */
    PRCT,

    /**
     * Order is accepted for further processing but the execution of the redemption order is pending as it is below the minimum redemption amount and subject to the investment manager's approval.
     * 
     */
    BMRA,

    /**
     * Order is accepted for further processing but the execution of the redemption order is pending as the holding will be below the minimum retained value and subject to the investment manager's approval.
     * 
     */
    BMRV,

    /**
     * Order is accepted for further processing but the execution of the order is pending as a lock-up period is in place and subject to the investment manager's approval.
     * 
     */
    LOCK,

    /**
     * Order is accepted for further processing but the execution of the redemption order is pending as assets are illiquid and the order is subject to the investment manager's approval.
     * 
     */
    ILLI,

    /**
     * Order is accepted for further processing but the execution of the redemption order is pending as it is subject to the investment manager's discretion.
     * 
     */
    DISC,

    /**
     * Order is accepted for further processing but the execution of the subscription order is pending as the order is below the minimum investment and a top-up is required.
     * 
     */
    STOP;

    public String value() {
        return name();
    }

    public static ConditionallyAcceptedStatusReason3Code fromValue(String v) {
        return valueOf(v);
    }

}
