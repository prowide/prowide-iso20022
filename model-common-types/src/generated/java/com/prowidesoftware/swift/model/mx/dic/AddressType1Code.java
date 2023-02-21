
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HOME"/&gt;
 *     &lt;enumeration value="BIZZ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AddressType1Code")
@XmlEnum
public enum AddressType1Code {


    /**
     * Address is the home address.
     * 
     */
    HOME,

    /**
     * Address is the business address.
     * 
     */
    BIZZ;

    public String value() {
        return name();
    }

    public static AddressType1Code fromValue(String v) {
        return valueOf(v);
    }

}
