
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PresentationMedium1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PresentationMedium1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BOTH"/&gt;
 *     &lt;enumeration value="ELEC"/&gt;
 *     &lt;enumeration value="PAPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PresentationMedium1Code")
@XmlEnum
public enum PresentationMedium1Code {


    /**
     * Presentation is made on paper and/or electronically.
     * 
     */
    BOTH,

    /**
     * Presentation is made electronically.
     * 
     */
    ELEC,

    /**
     * Presentation is made on paper.
     * 
     */
    PAPR;

    public String value() {
        return name();
    }

    public static PresentationMedium1Code fromValue(String v) {
        return valueOf(v);
    }

}
