
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GracePeriodUnitType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GracePeriodUnitType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WEKS"/>
 *     <enumeration value="PMTS"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="MNTH"/>
 *     <enumeration value="DAYS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GracePeriodUnitType1Code")
@XmlEnum
public enum GracePeriodUnitType1Code {


    /**
     * Grace period weeks.
     * 
     */
    WEKS,

    /**
     * Grace period payments.
     * 
     */
    PMTS,

    /**
     * Other Private Grace period.
     * 
     */
    OTHP,

    /**
     * Other National Grace period.
     * 
     */
    OTHN,

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

    public static GracePeriodUnitType1Code fromValue(String v) {
        return valueOf(v);
    }

}
