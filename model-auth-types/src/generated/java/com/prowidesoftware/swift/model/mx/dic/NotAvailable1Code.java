
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotAvailable1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NotAvailable1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NTAV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NotAvailable1Code")
@XmlEnum
public enum NotAvailable1Code {


    /**
     * Not available (N/A).
     * 
     */
    NTAV;

    public String value() {
        return name();
    }

    public static NotAvailable1Code fromValue(String v) {
        return valueOf(v);
    }

}
