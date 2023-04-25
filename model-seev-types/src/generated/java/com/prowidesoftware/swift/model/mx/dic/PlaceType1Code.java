
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlaceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PlaceType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UKWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PlaceType1Code")
@XmlEnum
public enum PlaceType1Code {


    /**
     * The type of place is unknown.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static PlaceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
