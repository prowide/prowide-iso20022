
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingEquityType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnderlyingEquityType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHR"/>
 *     <enumeration value="ETFS"/>
 *     <enumeration value="SHRS"/>
 *     <enumeration value="DVSE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnderlyingEquityType5Code")
@XmlEnum
public enum UnderlyingEquityType5Code {


    /**
     * Underlying is of other type.
     * 
     */
    OTHR,

    /**
     * Underlying is an exchange traded fund.
     * 
     */
    ETFS,

    /**
     * Underlying is a share.
     * 
     */
    SHRS,

    /**
     * Underlying is a stock dividend.
     * 
     */
    DVSE;

    public String value() {
        return name();
    }

    public static UnderlyingEquityType5Code fromValue(String v) {
        return valueOf(v);
    }

}
