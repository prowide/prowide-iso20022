
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValuationTiming1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValuationTiming1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXCP"/&gt;
 *     &lt;enumeration value="USUA"/&gt;
 *     &lt;enumeration value="PATC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
