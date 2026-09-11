
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GracePeriodUnitType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GracePeriodUnitType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WEKS"/>
 *     <enumeration value="MNTH"/>
 *     <enumeration value="DAYS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GracePeriodUnitType2Code")
@XmlEnum
public enum GracePeriodUnitType2Code {


    /**
     * Grace period weeks.
     * 
     */
    WEKS,

    /**
     * Grace period months.
     * 
     */
    MNTH,

    /**
     * Grace period days.
     * 
     */
    DAYS;

    public String value() {
        return name();
    }

    public static GracePeriodUnitType2Code fromValue(String v) {
        return valueOf(v);
    }

}
