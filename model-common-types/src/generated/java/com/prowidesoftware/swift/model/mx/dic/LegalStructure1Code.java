
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalStructure1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LegalStructure1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STAE"/&gt;
 *     &lt;enumeration value="PVIN"/&gt;
 *     &lt;enumeration value="MUNI"/&gt;
 *     &lt;enumeration value="CNTY"/&gt;
 *     &lt;enumeration value="NATI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LegalStructure1Code")
@XmlEnum
public enum LegalStructure1Code {


    /**
     * Legal structure is a state.
     * 
     */
    STAE,

    /**
     * Legal structure is a province.
     * 
     */
    PVIN,

    /**
     * Legal structure is a municipal.
     * 
     */
    MUNI,

    /**
     * Legal structure is a county.
     * 
     */
    CNTY,

    /**
     * Legal structure is a state.
     * 
     */
    NATI;

    public String value() {
        return name();
    }

    public static LegalStructure1Code fromValue(String v) {
        return valueOf(v);
    }

}
