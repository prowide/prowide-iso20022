
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateType8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DateType8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UKWN"/>
 *     <enumeration value="ONGO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DateType8Code")
@XmlEnum
public enum DateType8Code {


    /**
     * Date is unknown by the sender or has not been established.
     * 
     */
    UKWN,

    /**
     * Ongoing basis, which indicates that the date is determined by "ongoing basis" process, for example "au fil de l'eau".
     * 
     */
    ONGO;

    public String value() {
        return name();
    }

    public static DateType8Code fromValue(String v) {
        return valueOf(v);
    }

}
