
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherAmountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OtherAmountType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PINT"/>
 *     <enumeration value="SINT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OtherAmountType1Code")
@XmlEnum
public enum OtherAmountType1Code {


    /**
     * Interest that was pre-paid.
     * 
     */
    PINT,

    /**
     * Interest on the interest.
     * 
     */
    SINT;

    public String value() {
        return name();
    }

    public static OtherAmountType1Code fromValue(String v) {
        return valueOf(v);
    }

}
