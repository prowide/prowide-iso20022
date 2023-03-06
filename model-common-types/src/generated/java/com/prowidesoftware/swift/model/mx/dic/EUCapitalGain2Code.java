
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EUCapitalGain2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EUCapitalGain2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EUSI"/&gt;
 *     &lt;enumeration value="EUSO"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
