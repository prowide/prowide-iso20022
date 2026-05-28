
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguageVersion1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LanguageVersion1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ORIG"/>
 *     <enumeration value="TRAN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LanguageVersion1Code")
@XmlEnum
public enum LanguageVersion1Code {


    /**
     * Original language.
     * 
     */
    ORIG,

    /**
     * Translated version.
     * 
     */
    TRAN;

    public String value() {
        return name();
    }

    public static LanguageVersion1Code fromValue(String v) {
        return valueOf(v);
    }

}
