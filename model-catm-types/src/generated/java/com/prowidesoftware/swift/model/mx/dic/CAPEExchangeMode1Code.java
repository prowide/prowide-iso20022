
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CAPEExchangeMode1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CAPEExchangeMode1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APIE"/&gt;
 *     &lt;enumeration value="MSGE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
