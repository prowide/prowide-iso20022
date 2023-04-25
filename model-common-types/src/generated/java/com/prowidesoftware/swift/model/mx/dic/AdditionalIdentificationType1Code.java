
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalIdentificationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdditionalIdentificationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHP"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="ICSN"/>
 *     <enumeration value="ATNU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdditionalIdentificationType1Code")
@XmlEnum
public enum AdditionalIdentificationType1Code {


    /**
     * Other Additional Identification defined at a private level.
     * 
     */
    OTHP,

    /**
     * Other Additional Identification defined at a national level.
     * 
     */
    OTHN,

    /**
     * Contains the North American Industry Classification System (NAICS) code assigned to the card acceptor.
     * 
     */
    ICSN,

    /**
     * Contains the Austin-Tetra Number assigned to the card acceptor.
     * 
     */
    ATNU;

    public String value() {
        return name();
    }

    public static AdditionalIdentificationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
