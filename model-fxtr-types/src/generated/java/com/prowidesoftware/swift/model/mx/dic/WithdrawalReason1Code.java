
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WithdrawalReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WithdrawalReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RJCT"/&gt;
 *     &lt;enumeration value="RSCD"/&gt;
 *     &lt;enumeration value="WTDN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WithdrawalReason1Code")
@XmlEnum
public enum WithdrawalReason1Code {


    /**
     * Alleged trade is rejected.
     * 
     */
    RJCT,

    /**
     * Alleged trade is rescinded.
     * 
     */
    RSCD,

    /**
     * Alleged trade is withdrawn due to an amendment.
     * 
     */
    WTDN;

    public String value() {
        return name();
    }

    public static WithdrawalReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
