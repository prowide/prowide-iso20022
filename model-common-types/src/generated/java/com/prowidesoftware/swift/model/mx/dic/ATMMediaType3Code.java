
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMMediaType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMMediaType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CNTR"/&gt;
 *     &lt;enumeration value="FITN"/&gt;
 *     &lt;enumeration value="FITU"/&gt;
 *     &lt;enumeration value="SPCT"/&gt;
 *     &lt;enumeration value="UNFT"/&gt;
 *     &lt;enumeration value="UNRG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
