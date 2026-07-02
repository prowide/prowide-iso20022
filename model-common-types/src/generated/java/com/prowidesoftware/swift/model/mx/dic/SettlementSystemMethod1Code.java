
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementSystemMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementSystemMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NSET"/&gt;
 *     &lt;enumeration value="YSET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SettlementSystemMethod1Code")
@XmlEnum
public enum SettlementSystemMethod1Code {


    /**
     * Settle through the default settlement system/method. If there is a standing instruction in place for settlement through the alternate settlement system/method, then this standing instruction is to be ignored.
     * 
     */
    NSET,

    /**
     * Settle through the alternate settlement system/method. If there is a standing instruction in place for settlement through the default settlement system/method, then this standing instruction is to be ignored.
     * 
     */
    YSET;

    public String value() {
        return name();
    }

    public static SettlementSystemMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
