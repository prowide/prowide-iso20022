
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceTransferWindow1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BalanceTransferWindow1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DAYH"/&gt;
 *     &lt;enumeration value="EARL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BalanceTransferWindow1Code")
@XmlEnum
public enum BalanceTransferWindow1Code {


    /**
     * Indicates in business hours processing.
     * 
     */
    DAYH,

    /**
     * Indicates out of business hours processing.
     * 
     */
    EARL;

    public String value() {
        return name();
    }

    public static BalanceTransferWindow1Code fromValue(String v) {
        return valueOf(v);
    }

}
