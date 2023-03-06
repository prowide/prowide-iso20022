
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GracePeriodUnitType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GracePeriodUnitType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WEKS"/&gt;
 *     &lt;enumeration value="PMTS"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="DAYS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
