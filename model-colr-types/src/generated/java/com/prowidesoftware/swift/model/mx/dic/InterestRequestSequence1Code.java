
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestRequestSequence1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InterestRequestSequence1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INIT"/>
 *     <enumeration value="UPDA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InterestRequestSequence1Code")
@XmlEnum
public enum InterestRequestSequence1Code {


    /**
     * Indicates this is a new interest payment request.
     * 
     */
    INIT,

    /**
     * Indicates this is an updated interest payement request.
     * 
     */
    UPDA;

    public String value() {
        return name();
    }

    public static InterestRequestSequence1Code fromValue(String v) {
        return valueOf(v);
    }

}
