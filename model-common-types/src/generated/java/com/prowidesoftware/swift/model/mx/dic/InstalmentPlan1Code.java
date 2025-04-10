
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalmentPlan1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InstalmentPlan1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EQPM"/>
 *     <enumeration value="NQPM"/>
 *     <enumeration value="DFRI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InstalmentPlan1Code")
@XmlEnum
public enum InstalmentPlan1Code {


    /**
     * The payment is split in several instalments of equal amounts.
     * 
     */
    EQPM,

    /**
     * The payment is split in several instalments of different amounts.
     * 
     */
    NQPM,

    /**
     * The first instalment is deferred.
     * 
     */
    DFRI;

    public String value() {
        return name();
    }

    public static InstalmentPlan1Code fromValue(String v) {
        return valueOf(v);
    }

}
