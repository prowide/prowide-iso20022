
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortfolioWithdrawalReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PortfolioWithdrawalReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FTRS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PortfolioWithdrawalReason1Code")
@XmlEnum
public enum PortfolioWithdrawalReason1Code {


    /**
     * Withdrawal is for a first time residential property.
     * 
     * 
     * 
     */
    FTRS;

    public String value() {
        return name();
    }

    public static PortfolioWithdrawalReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
