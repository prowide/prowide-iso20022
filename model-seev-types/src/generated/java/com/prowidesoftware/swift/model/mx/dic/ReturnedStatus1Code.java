
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnedStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReturnedStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NARR"/>
 *     <enumeration value="PROR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReturnedStatus1Code")
@XmlEnum
public enum ReturnedStatus1Code {


    /**
     * See narrative field for reason.
     * 
     */
    NARR,

    /**
     * Shares returned due to prorated acceptance.
     * 
     */
    PROR;

    public String value() {
        return name();
    }

    public static ReturnedStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
