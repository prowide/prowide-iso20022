
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonTradingDayReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NonTradingDayReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="THOL"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="HALF"/>
 *     <enumeration value="PHOL"/>
 *     <enumeration value="BHOL"/>
 *     <enumeration value="WKND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NonTradingDayReason1Code")
@XmlEnum
public enum NonTradingDayReason1Code {


    /**
     * The date is a full day trading holiday with no trades performed.
     * 
     */
    THOL,

    /**
     * Other reasons a day is a non-trading day e.g. technical fault, company specific non-trading day not known in advance.
     * 
     */
    OTHR,

    /**
     * Trading venue was open for an amount of time, up to half the day.
     * 
     */
    HALF,

    /**
     * Date is a public holiday.
     * 
     */
    PHOL,

    /**
     * Date is a bank holiday.
     * 
     */
    BHOL,

    /**
     * Date being reported falls during the weekend.
     * 
     */
    WKND;

    public String value() {
        return name();
    }

    public static NonTradingDayReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
