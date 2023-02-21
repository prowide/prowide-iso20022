
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyRole3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyRole3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GATR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyRole3Code")
@XmlEnum
public enum PartyRole3Code {


    /**
     * Legal entity, other than the issuer, who gives a guarantee. The guarantor becomes liable in case of default.
     * 
     */
    GATR;

    public String value() {
        return name();
    }

    public static PartyRole3Code fromValue(String v) {
        return valueOf(v);
    }

}
