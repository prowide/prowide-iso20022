
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AddressType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADDR"/>
 *     <enumeration value="PBOX"/>
 *     <enumeration value="HOME"/>
 *     <enumeration value="BIZZ"/>
 *     <enumeration value="MLTO"/>
 *     <enumeration value="DLVY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AddressType2Code")
@XmlEnum
public enum AddressType2Code {


    /**
     * Address is the complete postal address.
     * 
     */
    ADDR,

    /**
     * Address is a postal office (PO) box.
     * 
     */
    PBOX,

    /**
     * Address is the home address.
     * 
     */
    HOME,

    /**
     * Address is the business address.
     * 
     */
    BIZZ,

    /**
     * Address is the address to which mail is sent.
     * 
     */
    MLTO,

    /**
     * Address is the address to which delivery is to take place.
     * 
     */
    DLVY;

    public String value() {
        return name();
    }

    public static AddressType2Code fromValue(String v) {
        return valueOf(v);
    }

}
