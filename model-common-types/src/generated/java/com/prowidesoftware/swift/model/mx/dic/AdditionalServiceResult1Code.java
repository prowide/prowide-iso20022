
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalServiceResult1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdditionalServiceResult1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NOPF"/>
 *     <enumeration value="NOSP"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PERF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdditionalServiceResult1Code")
@XmlEnum
public enum AdditionalServiceResult1Code {


    /**
     * The service was not performed.
     * 
     */
    NOPF,

    /**
     * The service is not supported and could not be performed.
     * 
     */
    NOSP,

    /**
     * Other nationally defined code.
     * 
     */
    OTHN,

    /**
     * Other privately defined code.
     * 
     */
    OTHP,

    /**
     * The service was performed.
     * 
     */
    PERF;

    public String value() {
        return name();
    }

    public static AdditionalServiceResult1Code fromValue(String v) {
        return valueOf(v);
    }

}
