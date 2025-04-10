
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureReason6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FailureReason6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CMPR"/>
 *     <enumeration value="EXPR"/>
 *     <enumeration value="KCVE"/>
 *     <enumeration value="KLOD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
