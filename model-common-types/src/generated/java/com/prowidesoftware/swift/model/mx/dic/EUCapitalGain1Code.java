
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EUCapitalGain1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EUCapitalGain1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EUSI"/>
 *     <enumeration value="EUSO"/>
 *     <enumeration value="UKWN"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EUCapitalGain1Code")
@XmlEnum
public enum EUCapitalGain1Code {


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
    UKWN,

    /**
     * Another type of EU capital gain.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static EUCapitalGain1Code fromValue(String v) {
        return valueOf(v);
    }

}
