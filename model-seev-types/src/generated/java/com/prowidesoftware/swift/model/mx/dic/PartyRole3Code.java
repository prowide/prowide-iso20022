
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyRole3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartyRole3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GATR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
