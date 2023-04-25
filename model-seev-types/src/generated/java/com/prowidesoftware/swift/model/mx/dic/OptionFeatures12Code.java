
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionFeatures12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OptionFeatures12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPLF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OptionFeatures12Code")
@XmlEnum
public enum OptionFeatures12Code {


    /**
     * Tender or exchange with the odd lot preference.
     * 
     */
    OPLF;

    public String value() {
        return name();
    }

    public static OptionFeatures12Code fromValue(String v) {
        return valueOf(v);
    }

}
