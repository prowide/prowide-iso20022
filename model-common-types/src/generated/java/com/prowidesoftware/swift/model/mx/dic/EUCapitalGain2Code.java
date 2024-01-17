
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EUCapitalGain2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EUCapitalGain2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EUSI"/>
 *     <enumeration value="EUSO"/>
 *     <enumeration value="UKWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EUCapitalGain2Code")
@XmlEnum
public enum EUCapitalGain2Code {


    /**
     * Capital gain is in the scope of the directive.
     * 
     */
    EUSI,

    /**
     * Capital gain is out of the scope of the directive.
     * 
     */
    EUSO,

    /**
     * Unknown whether capital gain is in or out of the scope of the directive.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static EUCapitalGain2Code fromValue(String v) {
        return valueOf(v);
    }

}
