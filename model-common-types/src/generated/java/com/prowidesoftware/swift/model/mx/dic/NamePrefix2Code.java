
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamePrefix2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NamePrefix2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DOCT"/>
 *     <enumeration value="MADM"/>
 *     <enumeration value="MISS"/>
 *     <enumeration value="MIST"/>
 *     <enumeration value="MIKS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NamePrefix2Code")
@XmlEnum
public enum NamePrefix2Code {


    /**
     * Title of the person is Doctor or Dr.
     * 
     */
    DOCT,

    /**
     * Title of the person is Madam.
     * 
     */
    MADM,

    /**
     * Title of the person is Miss.
     * 
     */
    MISS,

    /**
     * Title of the person is Mister or Mr.
     * 
     */
    MIST,

    /**
     * Title of the person is gender neutral (Mx).
     * 
     */
    MIKS;

    public String value() {
        return name();
    }

    public static NamePrefix2Code fromValue(String v) {
        return valueOf(v);
    }

}
