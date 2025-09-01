
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnExcessCash1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnExcessCash1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RTND"/&gt;
 *     &lt;enumeration value="RTDN"/&gt;
 *     &lt;enumeration value="SSPD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReturnExcessCash1Code")
@XmlEnum
public enum ReturnExcessCash1Code {


    /**
     * Excess cash in the currency is returned.
     * 
     */
    RTND,

    /**
     * Automatic return of excess cash has not been requested for the currency. 
     * 
     */
    RTDN,

    /**
     * Automatic return of cash is temporarily suspended (for example due to a currency holiday).
     * 
     */
    SSPD;

    public String value() {
        return name();
    }

    public static ReturnExcessCash1Code fromValue(String v) {
        return valueOf(v);
    }

}
