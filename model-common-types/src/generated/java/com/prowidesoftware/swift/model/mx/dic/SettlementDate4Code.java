
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementDate4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementDate4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WISS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementDate4Code")
@XmlEnum
public enum SettlementDate4Code {


    /**
     * Settlement is to be done when the security is issued.
     * 
     */
    WISS;

    public String value() {
        return name();
    }

    public static SettlementDate4Code fromValue(String v) {
        return valueOf(v);
    }

}
