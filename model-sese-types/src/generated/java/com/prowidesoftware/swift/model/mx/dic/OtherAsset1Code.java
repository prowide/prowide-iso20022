
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherAsset1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OtherAsset1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MOVE"/>
 *     <enumeration value="PROP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OtherAsset1Code")
@XmlEnum
public enum OtherAsset1Code {


    /**
     * Property that is not real estate. Also known as 'movable chattels'.
     * 
     */
    MOVE,

    /**
     * Property that is real estate.
     * 
     */
    PROP;

    public String value() {
        return name();
    }

    public static OtherAsset1Code fromValue(String v) {
        return valueOf(v);
    }

}
