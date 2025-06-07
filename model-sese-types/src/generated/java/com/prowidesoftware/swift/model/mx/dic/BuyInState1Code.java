
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyInState1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuyInState1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BSSP"/&gt;
 *     &lt;enumeration value="BSSY"/&gt;
 *     &lt;enumeration value="BSSN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BuyInState1Code")
@XmlEnum
public enum BuyInState1Code {


    /**
     * Buy-in was partially successful.
     * 
     */
    BSSP,

    /**
     * Buy-in was successful.
     * 
     */
    BSSY,

    /**
     * Buy-in was unsuccessful.
     * 
     */
    BSSN;

    public String value() {
        return name();
    }

    public static BuyInState1Code fromValue(String v) {
        return valueOf(v);
    }

}
