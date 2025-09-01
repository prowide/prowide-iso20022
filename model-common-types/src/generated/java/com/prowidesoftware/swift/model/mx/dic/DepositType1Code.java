
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepositType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DepositType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FITE"/&gt;
 *     &lt;enumeration value="CALL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DepositType1Code")
@XmlEnum
public enum DepositType1Code {


    /**
     * Specifies that it is a fixed term deposit.
     * 
     */
    FITE,

    /**
     * Specifies that it is a call/notice deposit.
     * 
     */
    CALL;

    public String value() {
        return name();
    }

    public static DepositType1Code fromValue(String v) {
        return valueOf(v);
    }

}
