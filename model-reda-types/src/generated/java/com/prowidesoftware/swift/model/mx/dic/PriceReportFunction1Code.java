
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceReportFunction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PriceReportFunction1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REPL"/>
 *     <enumeration value="NEWP"/>
 *     <enumeration value="PART"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PriceReportFunction1Code")
@XmlEnum
public enum PriceReportFunction1Code {


    /**
     * The price report conveys the correction of the complete set of prices previously sent for the same price report identification.
     * 
     */
    REPL,

    /**
     * The price report is ‘new’, that is the report is not being used as a correction of previously sent prices.
     * 
     */
    NEWP,

    /**
     * The price report conveys the correction of some of the prices previously sent for the same price report identification.
     * 
     */
    PART;

    public String value() {
        return name();
    }

    public static PriceReportFunction1Code fromValue(String v) {
        return valueOf(v);
    }

}
