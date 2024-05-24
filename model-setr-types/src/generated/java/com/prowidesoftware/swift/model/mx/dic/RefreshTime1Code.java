
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefreshTime1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RefreshTime1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IMME"/>
 *     <enumeration value="EXHA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
