
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionAttribute1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionAttribute1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AGGR"/>
 *     <enumeration value="CADB"/>
 *     <enumeration value="DBRP"/>
 *     <enumeration value="DFRD"/>
 *     <enumeration value="INST"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="RCPT"/>
 *     <enumeration value="TPUP"/>
 *     <enumeration value="PPYT"/>
 *     <enumeration value="INCR"/>
 *     <enumeration value="PAUT"/>
 *     <enumeration value="PACP"/>
 *     <enumeration value="SUBR"/>
 *     <enumeration value="FRCP"/>
 *     <enumeration value="CPLT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionAttribute1Code")
@XmlEnum
public enum TransactionAttribute1Code {


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
     * An occurrence of a recurring payment..
     * 
     */
    RCPT,

    /**
     * Service to replenish value in an account (for example, mobile account, prepaid account, etc.).
     * 
     */
    TPUP,

    /**
     * Payment in advance of receiving goods or services.
     * 
     */
    PPYT,

    /**
     * To authorise additional amounts for a previously authorised transaction.
     * 
     */
    INCR,

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
     * Subsequent occurrence of a recurring payment.
     * 
     */
    SUBR,

    /**
     * First occurence of a recurring payment.
     * 
     */
    FRCP,

    /**
     * Transaction previously initiated is completed and contains the actual amount.
     * 
     */
    CPLT;

    public String value() {
        return name();
    }

    public static TransactionAttribute1Code fromValue(String v) {
        return valueOf(v);
    }

}
