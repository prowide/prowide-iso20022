
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DateType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPEN"/>
 *     <enumeration value="UKWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DateType4Code")
@XmlEnum
public enum DateType4Code {


    /**
     * Open-dated, which indicates that the date has not been established.
     * 
     */
    OPEN,

    /**
     * Date is unknown by the sender or has not been established.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static DateType4Code fromValue(String v) {
        return valueOf(v);
    }

}
