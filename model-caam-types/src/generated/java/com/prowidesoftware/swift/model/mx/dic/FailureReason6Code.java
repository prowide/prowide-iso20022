
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureReason6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FailureReason6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CMPR"/&gt;
 *     &lt;enumeration value="EXPR"/&gt;
 *     &lt;enumeration value="KCVE"/&gt;
 *     &lt;enumeration value="KLOD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FailureReason6Code")
@XmlEnum
public enum FailureReason6Code {


    /**
     * Key is compromised.
     * 
     */
    CMPR,

    /**
     * Key has expired.
     * 
     */
    EXPR,

    /**
     * Key check value is incorrect.
     * 
     */
    KCVE,

    /**
     * Error during the key download in the security device.
     * 
     */
    KLOD;

    public String value() {
        return name();
    }

    public static FailureReason6Code fromValue(String v) {
        return valueOf(v);
    }

}
