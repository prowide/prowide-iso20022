
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Holding1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Holding1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CERT"/>
 *     <enumeration value="NPRH"/>
 *     <enumeration value="PRTH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Holding1Code")
@XmlEnum
public enum Holding1Code {


    /**
     * Certificate.
     * 
     */
    CERT,

    /**
     * Non partial holding.
     * 
     */
    NPRH,

    /**
     * Partial holding.
     * 
     */
    PRTH;

    public String value() {
        return name();
    }

    public static Holding1Code fromValue(String v) {
        return valueOf(v);
    }

}
