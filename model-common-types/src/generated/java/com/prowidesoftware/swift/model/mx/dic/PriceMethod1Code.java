
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PriceMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FORW"/>
 *     <enumeration value="HIST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PriceMethod1Code")
@XmlEnum
public enum PriceMethod1Code {


    /**
     * Price will be calculated after the close of the dealing period. An investor, therefore, does not know the exact buy or sell price.
     * 
     */
    FORW,

    /**
     * Price is calculated at an earlier valuation point preceding the dealing period. An investor, therefore, knows the exact buy or sell price.
     * 
     */
    HIST;

    public String value() {
        return name();
    }

    public static PriceMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
