
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialPurpose2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialPurpose2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BLNK"/&gt;
 *     &lt;enumeration value="NTAV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpecialPurpose2Code")
@XmlEnum
public enum SpecialPurpose2Code {


    /**
     * Blank value.
     * 
     */
    BLNK,

    /**
     * Not available (N/A).
     * 
     */
    NTAV;

    public String value() {
        return name();
    }

    public static SpecialPurpose2Code fromValue(String v) {
        return valueOf(v);
    }

}
