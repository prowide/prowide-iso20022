
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingStatementStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingStatementStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ORGN"/&gt;
 *     &lt;enumeration value="RPLC"/&gt;
 *     &lt;enumeration value="TEST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BillingStatementStatus1Code")
@XmlEnum
public enum BillingStatementStatus1Code {


    /**
     * Statement is the original statement.
     * 
     */
    ORGN,

    /**
     * Statement replaces the original statement.
     * 
     */
    RPLC,

    /**
     * Statement is a test statement.
     * 
     */
    TEST;

    public String value() {
        return name();
    }

    public static BillingStatementStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
