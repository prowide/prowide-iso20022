
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotionalOrUnitBased1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotionalOrUnitBased1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNIT"/&gt;
 *     &lt;enumeration value="NOTI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotionalOrUnitBased1Code")
@XmlEnum
public enum NotionalOrUnitBased1Code {


    /**
     * Basis of a financial instrument is unit.
     * 
     */
    UNIT,

    /**
     * Basis of a financial instrument is notional.
     * 
     */
    NOTI;

    public String value() {
        return name();
    }

    public static NotionalOrUnitBased1Code fromValue(String v) {
        return valueOf(v);
    }

}
