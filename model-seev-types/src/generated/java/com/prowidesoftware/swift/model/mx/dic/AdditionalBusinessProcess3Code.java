
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalBusinessProcess3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdditionalBusinessProcess3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLAI"/>
 *     <enumeration value="TAXR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdditionalBusinessProcess3Code")
@XmlEnum
public enum AdditionalBusinessProcess3Code {


    /**
     * Relates to a claim on the associated corporate action event.
     * 
     */
    CLAI,

    /**
     * Relates to a tax refund from the authorities on the associated corporate action event.
     * 
     */
    TAXR;

    public String value() {
        return name();
    }

    public static AdditionalBusinessProcess3Code fromValue(String v) {
        return valueOf(v);
    }

}
