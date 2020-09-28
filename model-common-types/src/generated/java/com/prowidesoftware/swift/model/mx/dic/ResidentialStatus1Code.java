
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResidentialStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResidentialStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RESI"/&gt;
 *     &lt;enumeration value="PRES"/&gt;
 *     &lt;enumeration value="NRES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResidentialStatus1Code")
@XmlEnum
public enum ResidentialStatus1Code {


    /**
     * Resident.
     * 
     */
    RESI,

    /**
     * Pernament resident.
     * 
     */
    PRES,

    /**
     * Non-resident.
     * 
     */
    NRES;

    public String value() {
        return name();
    }

    public static ResidentialStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
