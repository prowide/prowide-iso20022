
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileActionScope1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FileActionScope1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FILE"/>
 *     <enumeration value="RECD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FileActionScope1Code")
@XmlEnum
public enum FileActionScope1Code {


    /**
     * Action applies to a file
     * 
     */
    FILE,

    /**
     * Action applies to a record
     * 
     */
    RECD;

    public String value() {
        return name();
    }

    public static FileActionScope1Code fromValue(String v) {
        return valueOf(v);
    }

}
