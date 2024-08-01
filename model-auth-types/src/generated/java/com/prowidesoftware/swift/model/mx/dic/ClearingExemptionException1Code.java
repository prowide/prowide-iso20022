
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingExemptionException1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ClearingExemptionException1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COOP"/>
 *     <enumeration value="ENDU"/>
 *     <enumeration value="AFFL"/>
 *     <enumeration value="NOAL"/>
 *     <enumeration value="NORE"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="SMBK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClearingExemptionException1Code")
@XmlEnum
public enum ClearingExemptionException1Code {


    /**
     * Cooperative exemption.
     * 
     */
    COOP,

    /**
     * End user exemption.
     * 
     */
    ENDU,

    /**
     * Inter affiliate exemption.
     * 
     */
    AFFL,

    /**
     * No action letter relief.
     * 
     */
    NOAL,

    /**
     * No reason.
     * 
     */
    NORE,

    /**
     * Other.
     * 
     */
    OTHR,

    /**
     * Small bank exemption
     * 
     */
    SMBK;

    public String value() {
        return name();
    }

    public static ClearingExemptionException1Code fromValue(String v) {
        return valueOf(v);
    }

}
