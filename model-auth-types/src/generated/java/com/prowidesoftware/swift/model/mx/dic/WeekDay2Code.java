
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeekDay2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="WeekDay2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WEDD"/>
 *     <enumeration value="TUED"/>
 *     <enumeration value="THUD"/>
 *     <enumeration value="SUND"/>
 *     <enumeration value="SATD"/>
 *     <enumeration value="MOND"/>
 *     <enumeration value="FRID"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "WeekDay2Code")
@XmlEnum
public enum WeekDay2Code {


    /**
     * Wednesday.
     * 
     */
    WEDD,

    /**
     * Tuesday.
     * 
     */
    TUED,

    /**
     * Thursday.
     * 
     */
    THUD,

    /**
     * Sunday.
     * 
     */
    SUND,

    /**
     * Saturday.
     * 
     */
    SATD,

    /**
     * Monday.
     * 
     */
    MOND,

    /**
     * Friday.
     * 
     */
    FRID;

    public String value() {
        return name();
    }

    public static WeekDay2Code fromValue(String v) {
        return valueOf(v);
    }

}
