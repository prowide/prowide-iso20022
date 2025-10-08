
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCAutoOfferProgram1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DTCAutoOfferProgram1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OFFL"/&gt;
 *     &lt;enumeration value="ONLN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DTCAutoOfferProgram1Code")
@XmlEnum
public enum DTCAutoOfferProgram1Code {


    /**
     * No automated interface. Hardcopy reporting required.
     * 
     */
    OFFL,

    /**
     * Automated interface for instruction processing is present.
     * 
     */
    ONLN;

    public String value() {
        return name();
    }

    public static DTCAutoOfferProgram1Code fromValue(String v) {
        return valueOf(v);
    }

}
