
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionFrequencyType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionFrequencyType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SPRE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionFrequencyType4Code")
@XmlEnum
public enum CorporateActionFrequencyType4Code {


    /**
     * Special Dividend with reinvestment component.
     * 
     */
    SPRE;

    public String value() {
        return name();
    }

    public static CorporateActionFrequencyType4Code fromValue(String v) {
        return valueOf(v);
    }

}
