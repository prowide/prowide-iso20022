
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionOption5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionOption5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="SECU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionOption5Code")
@XmlEnum
public enum CorporateActionOption5Code {


    /**
     * Option to choose cash.
     * 
     */
    CASH,

    /**
     * Distribution of securities to holders.
     * 
     */
    SECU;

    public String value() {
        return name();
    }

    public static CorporateActionOption5Code fromValue(String v) {
        return valueOf(v);
    }

}
