
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitialPhysicalForm1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InitialPhysicalForm1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GTGT"/>
 *     <enumeration value="GPGP"/>
 *     <enumeration value="DERN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InitialPhysicalForm1Code")
@XmlEnum
public enum InitialPhysicalForm1Code {


    /**
     * Initial Physical Form is GT.
     * 
     */
    GTGT,

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

    public static InitialPhysicalForm1Code fromValue(String v) {
        return valueOf(v);
    }

}
