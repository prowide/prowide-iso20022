
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalBusinessProcess2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdditionalBusinessProcess2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLAI"/>
 *     <enumeration value="REVR"/>
 *     <enumeration value="TAXR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdditionalBusinessProcess2Code")
@XmlEnum
public enum AdditionalBusinessProcess2Code {


    /**
     * Relates to a claim on the associated corporate action event.
     * 
     */
    CLAI,

    /**
     * Indicates a preadvice of movement reversal.
     * 
     */
    REVR,

    /**
     * Relates to a tax refund from the authorities on the associated corporate action event.
     * 
     */
    TAXR;

    public String value() {
        return name();
    }

    public static AdditionalBusinessProcess2Code fromValue(String v) {
        return valueOf(v);
    }

}
