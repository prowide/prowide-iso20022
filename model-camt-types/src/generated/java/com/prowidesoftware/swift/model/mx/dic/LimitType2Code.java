
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LimitType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MULT"/&gt;
 *     &lt;enumeration value="BILI"/&gt;
 *     &lt;enumeration value="MAND"/&gt;
 *     &lt;enumeration value="DISC"/&gt;
 *     &lt;enumeration value="NELI"/&gt;
 *     &lt;enumeration value="INBI"/&gt;
 *     &lt;enumeration value="GLBL"/&gt;
 *     &lt;enumeration value="DIDB"/&gt;
 *     &lt;enumeration value="SPLC"/&gt;
 *     &lt;enumeration value="SPLF"/&gt;
 *     &lt;enumeration value="TDLC"/&gt;
 *     &lt;enumeration value="TDLF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LimitType2Code")
@XmlEnum
public enum LimitType2Code {


    /**
     * Limit is a maximum amount value applied to, or by, a participant to a set of counterparties. The multilateral limit is taken into account by the transaction administrator to contain the risk in the system. With the help of the multilateral limit, the direct participant restricts the use of liquidity when clearing payments with all other direct participants for which no bilateral limit is set.
     * 
     */
    MULT,

    /**
     * Limit is applied by one party to a specific counterparty, and corresponds to the maximum amount of traffic party setting the limit can send to that counterparty. The limit can be expressed as a debit or a credit limit. With the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant.
     * 
     */
    BILI,

    /**
     * Mandatory part of the bilateral limit applied by one party to a specific counterparty, and corresponds to the maximum amount of traffic party setting the limit can send to that counterparty. The limit can be expressed as a debit or a credit limit. With the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant.
     * 
     */
    MAND,

    /**
     * Discretionary part of the bilateral limit applied by one party to a specific counterparty, and corresponds to the maximum amount of traffic party setting the limit can send to that counterparty. The limit can be expressed as a debit or a credit limit. With the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant.
     * 
     */
    DISC,

    /**
     * Limit is applied by one party to a specific counterparty, and corresponds to the maximum net balance acceptable by the party that is setting the limit. The limit is calculated as an arithmetic sum in value of the bilateral flows exchanged between the two parties. The net bilateral limit can be expressed as a debit or a credit balance.
     * 
     */
    NELI,

    /**
     * Limit is a maximum value set by a direct participant with respect to its indirect participant. The limit represents the maximum amount the indirect participant can use to settle its operations.
     * 
     */
    INBI,

    /**
     * Maximum value set by either the transaction administrator or by a member for the participation of a member in the system. The global limit may be expressed as a credit or debit maximum value and is taken into account by the transaction administrator when processing transaction inside the system. With the help of the global limit, the direct participant may limit the use of liquidity when clearing specific type of payments.
     * 
     */
    GLBL,

    /**
     * Limit not to be exceeded for direct debit operations.
     * 
     */
    DIDB,

    /**
     * Single direct debit payment limit not to be exceeded by any single direct debit transaction by a customer.
     * 
     */
    SPLC,

    /**
     * Single direct debit payment limit not to be exceeded by any single direct debit transaction initiated by a financial institution.
     * 
     */
    SPLF,

    /**
     * Total daily payments limit for customer direct debits not to be exceeded by the total of all direct debit transactions initiated by customers.
     * 
     */
    TDLC,

    /**
     * Total daily payments limit for financial institutions direct debits not to be exceeded by the total of all direct debit transactions initiated by financial institutions.
     * 
     */
    TDLF;

    public String value() {
        return name();
    }

    public static LimitType2Code fromValue(String v) {
        return valueOf(v);
    }

}
