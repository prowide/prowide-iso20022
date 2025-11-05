
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CAPEExchangeMode1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CAPEExchangeMode1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APIE"/>
 *     <enumeration value="MSGE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CAPEExchangeMode1Code")
@XmlEnum
public enum CAPEExchangeMode1Code {


    /**
     * With this protocol, the communication is done through calls to API.
     * 
     */
    APIE,

    /**
     * With this protocol, the communication is done through message exchanges.
     * 
     */
    MSGE;

    public String value() {
        return name();
    }

    public static CAPEExchangeMode1Code fromValue(String v) {
        return valueOf(v);
    }

}
