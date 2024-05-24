
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwBooleanIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SwBooleanIndicator">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TRUE"/>
 *     <enumeration value="FALSE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SwBooleanIndicator")
@XmlEnum
public enum SwBooleanIndicator {

    TRUE,
    FALSE;

    public String value() {
        return name();
    }

    public static SwBooleanIndicator fromValue(String v) {
        return valueOf(v);
    }

}
