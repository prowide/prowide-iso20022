
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrequencyGranularityType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FrequencyGranularityType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EMON"/&gt;
 *     &lt;enumeration value="EWEK"/&gt;
 *     &lt;enumeration value="ESEM"/&gt;
 *     &lt;enumeration value="EQRT"/&gt;
 *     &lt;enumeration value="EFRT"/&gt;
 *     &lt;enumeration value="EDAY"/&gt;
 *     &lt;enumeration value="ENDY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FrequencyGranularityType1Code")
@XmlEnum
public enum FrequencyGranularityType1Code {


    /**
     * Event takes place at the end of each month or period of one month.
     * 
     */
    EMON,

    /**
     * Event takes place at the end of each week.
     * 
     */
    EWEK,

    /**
     * Event takes place at the end of each six months (or two times a year).
     * 
     */
    ESEM,

    /**
     * Event takes place at the end of each period of three months (or four times a year).
     * 
     */
    EQRT,

    /**
     * Event takes place at the end of each two weeks.
     * 
     */
    EFRT,

    /**
     * Event takes place at the end of each day.
     * 
     */
    EDAY,

    /**
     * Event takes place at the end of each year.
     * 
     */
    ENDY;

    public String value() {
        return name();
    }

    public static FrequencyGranularityType1Code fromValue(String v) {
        return valueOf(v);
    }

}
