
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EUCapitalGain1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EUCapitalGain1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EUSI"/&gt;
 *     &lt;enumeration value="EUSO"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
