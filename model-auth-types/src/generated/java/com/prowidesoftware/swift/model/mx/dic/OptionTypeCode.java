
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OptionTypeCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CALL"/>
 *     <enumeration value="PUTO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OptionTypeCode")
@XmlEnum
public enum OptionTypeCode {


    /**
     * Right to buy a quantity of an asset for an agreed price at exercise date.
     * 
     */
    CALL,

    /**
     * Right to sell a quantity of an asset for an agreed price at exercise date.
     * 
     */
    PUTO;

    public String value() {
        return name();
    }

    public static OptionTypeCode fromValue(String v) {
        return valueOf(v);
    }

}
