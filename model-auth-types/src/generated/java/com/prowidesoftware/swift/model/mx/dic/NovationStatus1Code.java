
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NovationStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NovationStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NONO"/>
 *     <enumeration value="NOVA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NovationStatus1Code")
@XmlEnum
public enum NovationStatus1Code {


    /**
     * Transaction is not a novation.
     * 
     */
    NONO,

    /**
     * Transaction is a novation.
     * 
     */
    NOVA;

    public String value() {
        return name();
    }

    public static NovationStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
