
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnaffirmedReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnaffirmedReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NAFF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnaffirmedReason1Code")
@XmlEnum
public enum UnaffirmedReason1Code {


    /**
     * Specifies the reason the counterparty has not affirmed.
     * 
     */
    NAFF;

    public String value() {
        return name();
    }

    public static UnaffirmedReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
