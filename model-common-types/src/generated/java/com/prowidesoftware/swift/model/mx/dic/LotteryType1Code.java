
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LotteryType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LotteryType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ORIG"/&gt;
 *     &lt;enumeration value="SUPP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LotteryType1Code")
@XmlEnum
public enum LotteryType1Code {


    /**
     * Original lottery that has been announced for a specific amount and date.
     * 
     */
    ORIG,

    /**
     * Supplemental or additional quantity called on a previously announced original lottery.
     * 
     */
    SUPP;

    public String value() {
        return name();
    }

    public static LotteryType1Code fromValue(String v) {
        return valueOf(v);
    }

}
