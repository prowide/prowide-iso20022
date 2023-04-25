
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdministrativeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdministrativeType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="TEXT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdministrativeType1Code")
@XmlEnum
public enum AdministrativeType1Code {


    /**
     * Other administrative type defined at national level.
     * 
     */
    OTHN,

    /**
     * Other administrative type defined at private level.
     * 
     */
    OTHP,

    /**
     * Text message.
     * 
     */
    TEXT;

    public String value() {
        return name();
    }

    public static AdministrativeType1Code fromValue(String v) {
        return valueOf(v);
    }

}
