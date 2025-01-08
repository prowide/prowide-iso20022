
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValuationTiming1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ValuationTiming1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EXCP"/>
 *     <enumeration value="USUA"/>
 *     <enumeration value="PATC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ValuationTiming1Code")
@XmlEnum
public enum ValuationTiming1Code {


    /**
     * Price valuation is done exceptionally, outside the timeframe specified in the prospectus.
     * 
     */
    EXCP,

    /**
     * Price valuation is done within the timeframe specified in the prospectus.
     * 
     */
    USUA,

    /**
     * Price valuation that is done outside the usual timeframe, but in conformance with a case specified in the prospectus, eg, market closing day.
     * 
     */
    PATC;

    public String value() {
        return name();
    }

    public static ValuationTiming1Code fromValue(String v) {
        return valueOf(v);
    }

}
