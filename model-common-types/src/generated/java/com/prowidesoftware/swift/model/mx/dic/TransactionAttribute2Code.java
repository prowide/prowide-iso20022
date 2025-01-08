
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionAttribute2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionAttribute2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AGGR"/>
 *     <enumeration value="CADB"/>
 *     <enumeration value="CPLT"/>
 *     <enumeration value="DBRC"/>
 *     <enumeration value="DBRP"/>
 *     <enumeration value="DFRD"/>
 *     <enumeration value="INCR"/>
 *     <enumeration value="FRCP"/>
 *     <enumeration value="INST"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PAUT"/>
 *     <enumeration value="PACP"/>
 *     <enumeration value="PPYT"/>
 *     <enumeration value="RCPT"/>
 *     <enumeration value="SUBR"/>
 *     <enumeration value="TPUP"/>
 *     <enumeration value="UCOF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionAttribute2Code")
@XmlEnum
public enum TransactionAttribute2Code {


    /**
     * Payment is an aggregation one.
     * 
     */
    AGGR,

    /**
     * Withdrawal is a cardless cash disbursement one.
     * 
     */
    CADB,

    /**
     * Transaction previously initiated is completed and contains the actual amount.
     * 
     */
    CPLT,

    /**
     * Debt Recovery.
     * 
     * 
     */
    DBRC,

    /**
     * Payment is a debt repayment one.
     * 
     */
    DBRP,

    /**
     * Payment is a deferred one.
     * 
     */
    DFRD,

    /**
     * To authorise additional amounts for a previously authorised transaction.
     * 
     */
    INCR,

    /**
     * First occurence of a recurring payment.
     * 
     */
    FRCP,

    /**
     * Payment is an instalment one.
     * 
     */
    INST,

    /**
     * Attribute defined at national level.
     * 
     */
    OTHN,

    /**
     * Attribute defined at private level
     * 
     */
    OTHP,

    /**
     * Preauthorisation for an amount which is unknown at the time when the transaction is initiated and to be cleared within a specified timeframe.
     * 
     */
    PAUT,

    /**
     * Financial completion of a pre-authorised transaction within a specified timeframe.
     * 
     */
    PACP,

    /**
     * Payment in advance of receiving goods or services.
     * 
     */
    PPYT,

    /**
     * An occurrence of a recurring payment..
     * 
     */
    RCPT,

    /**
     * Subsequent occurrence of a recurring payment.
     * 
     */
    SUBR,

    /**
     * Service to replenish value in an account (for example, mobile account, prepaid account, etc.).
     * 
     */
    TPUP,

    /**
     * Unscheduled Card On File.
     * 
     * 
     */
    UCOF;

    public String value() {
        return name();
    }

    public static TransactionAttribute2Code fromValue(String v) {
        return valueOf(v);
    }

}
