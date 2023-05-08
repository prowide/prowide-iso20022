
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Frequency14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Frequency14Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <minLength value="1"/>
 *     <maxLength value="4"/>
 *     <enumeration value="DAIL"/>
 *     <enumeration value="WEEK"/>
 *     <enumeration value="MNTH"/>
 *     <enumeration value="ADHO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Frequency14Code")
@XmlEnum
public enum Frequency14Code {


    /**
     * Event takes place every day.
     * 
     */
    DAIL,

    /**
     * Event takes place once a week.
     * 
     */
    WEEK,

    /**
     * Event takes place every month or once a month.
     * 
     */
    MNTH,

    /**
     * Event takes place on request or as necessary.
     * 
     */
    ADHO;

    public String value() {
        return name();
    }

    public static Frequency14Code fromValue(String v) {
        return valueOf(v);
    }

}
