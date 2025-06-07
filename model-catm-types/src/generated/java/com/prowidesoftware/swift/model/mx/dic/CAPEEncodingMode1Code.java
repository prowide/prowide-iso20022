
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CAPEEncodingMode1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CAPEEncodingMode1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="XMLE"/&gt;
 *     &lt;enumeration value="JSON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
