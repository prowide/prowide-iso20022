
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefreshTime1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefreshTime1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IMME"/&gt;
 *     &lt;enumeration value="EXHA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RefreshTime1Code")
@XmlEnum
public enum RefreshTime1Code {


    /**
     * After each fill.
     * 
     */
    IMME,

    /**
     * When quantity to be displayed equals 0.
     * 
     */
    EXHA;

    public String value() {
        return name();
    }

    public static RefreshTime1Code fromValue(String v) {
        return valueOf(v);
    }

}
