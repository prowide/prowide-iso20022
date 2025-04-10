
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExposureType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExposureType10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SBSC"/>
 *     <enumeration value="MGLD"/>
 *     <enumeration value="SLEB"/>
 *     <enumeration value="REPO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExposureType10Code")
@XmlEnum
public enum ExposureType10Code {


    /**
     * Securities buy sell back.
     * 
     */
    SBSC,

    /**
     * Margin lending transaction. 
     * 
     */
    MGLD,

    /**
     * Exposure is linked to a securities lending or borrowing activity.
     * 
     */
    SLEB,

    /**
     * Relates to repurchase agreement trading.
     * 
     */
    REPO;

    public String value() {
        return name();
    }

    public static ExposureType10Code fromValue(String v) {
        return valueOf(v);
    }

}
