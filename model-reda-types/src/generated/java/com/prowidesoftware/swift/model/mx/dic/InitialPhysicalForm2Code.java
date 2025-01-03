
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitialPhysicalForm2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InitialPhysicalForm2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GPGP"/>
 *     <enumeration value="DERN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InitialPhysicalForm2Code")
@XmlEnum
public enum InitialPhysicalForm2Code {


    /**
     * Initial Physical Form is GP.
     * 
     */
    GPGP,

    /**
     * Initial Physical Form is definitive.
     * 
     */
    DERN;

    public String value() {
        return name();
    }

    public static InitialPhysicalForm2Code fromValue(String v) {
        return valueOf(v);
    }

}
