
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CAPEEncodingMode1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CAPEEncodingMode1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="XMLE"/>
 *     <enumeration value="JSON"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CAPEEncodingMode1Code")
@XmlEnum
public enum CAPEEncodingMode1Code {


    /**
     * Data exchanged with the protocol between both parties are encoded in XML.
     * 
     */
    XMLE,

    /**
     * Data exchanged with the protocol between both parties are encoded in JSON.
     * 
     */
    JSON;

    public String value() {
        return name();
    }

    public static CAPEEncodingMode1Code fromValue(String v) {
        return valueOf(v);
    }

}
