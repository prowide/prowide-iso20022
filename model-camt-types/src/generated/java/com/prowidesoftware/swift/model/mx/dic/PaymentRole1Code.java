
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentRole1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentRole1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LQMG"/&gt;
 *     &lt;enumeration value="LMMG"/&gt;
 *     &lt;enumeration value="PYMG"/&gt;
 *     &lt;enumeration value="REDR"/&gt;
 *     &lt;enumeration value="BKMG"/&gt;
 *     &lt;enumeration value="STMG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentRole1Code")
@XmlEnum
public enum PaymentRole1Code {


    /**
     * Party in a financial institution responsible for the management of liquidity for the financial institution. This party has access to some functions available on the system, such as the liquidity transfers ormanagement of standing instructions for liquidity control.
     * 
     */
    LQMG,

    /**
     * Party in a financial institution responsible for the management of the limits. This party is responsible for fixing, modifying, or suspending limits as relevant for the management of counterpart risk or systemic risk containment.
     * 
     */
    LMMG,

    /**
     * Party in a financial institution responsible for the management of payment processing for the financial institution. This includes authorising, recycling, and modification of payment transactions.
     * 
     */
    PYMG,

    /**
     * Party in a financial institution entitled to obtain information from the system, but not act upon/alter this information.
     * 
     */
    REDR,

    /**
     * Party responsible for managing the recovery functions related to a system.
     * 
     */
    BKMG,

    /**
     * Party in a financial institution responsible for the management of settlement processing.
     * 
     */
    STMG;

    public String value() {
        return name();
    }

    public static PaymentRole1Code fromValue(String v) {
        return valueOf(v);
    }

}
