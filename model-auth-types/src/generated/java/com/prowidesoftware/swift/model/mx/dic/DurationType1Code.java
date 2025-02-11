
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DurationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DurationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="YEAR"/>
 *     <enumeration value="WEEK"/>
 *     <enumeration value="SEAS"/>
 *     <enumeration value="QURT"/>
 *     <enumeration value="MNTH"/>
 *     <enumeration value="MNUT"/>
 *     <enumeration value="HOUR"/>
 *     <enumeration value="DASD"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DurationType1Code")
@XmlEnum
public enum DurationType1Code {


    /**
     * Duration is a year.
     * 
     */
    YEAR,

    /**
     * Event takes place every week.
     * 
     */
    WEEK,

    /**
     * Event takes place every six months or two times a year.
     * 
     */
    SEAS,

    /**
     * Event takes place every three months or four times a year.
     * 
     */
    QURT,

    /**
     * Event takes place every month or once a month.
     * 
     */
    MNTH,

    /**
     * Duration is a minute.
     * 
     */
    MNUT,

    /**
     * Duration is an hour.
     * 
     */
    HOUR,

    /**
     * Duration is a day.
     * 
     */
    DASD,

    /**
     * Duration is expressed in another unit.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static DurationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
