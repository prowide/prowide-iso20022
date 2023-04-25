
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerService6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RetailerService6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RPTQ"/>
 *     <enumeration value="RPAQ"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RetailerService6Code")
@XmlEnum
public enum RetailerService6Code {


    /**
     * The Sale System requests to the POI System a report on a list of transactions.
     * 
     */
    RPTQ,

    /**
     * The Sale System requests to the POI System a report on the totals figures of the POI system.
     * 
     */
    RPAQ;

    public String value() {
        return name();
    }

    public static RetailerService6Code fromValue(String v) {
        return valueOf(v);
    }

}
