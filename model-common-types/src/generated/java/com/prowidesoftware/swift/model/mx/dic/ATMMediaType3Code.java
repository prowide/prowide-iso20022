
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMMediaType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMMediaType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CNTR"/>
 *     <enumeration value="FITN"/>
 *     <enumeration value="FITU"/>
 *     <enumeration value="SPCT"/>
 *     <enumeration value="UNFT"/>
 *     <enumeration value="UNRG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMMediaType3Code")
@XmlEnum
public enum ATMMediaType3Code {


    /**
     * Detected counterfeit media.
     * 
     */
    CNTR,

    /**
     * Fit media.
     * 
     */
    FITN,

    /**
     * Fit or unfit media, if fitness cannot be determined.
     * 
     */
    FITU,

    /**
     * Suspect media.
     * 
     */
    SPCT,

    /**
     * Unfit media (unacceptable quality).
     * 
     */
    UNFT,

    /**
     * Unrecognised media.
     * 
     */
    UNRG;

    public String value() {
        return name();
    }

    public static ATMMediaType3Code fromValue(String v) {
        return valueOf(v);
    }

}
