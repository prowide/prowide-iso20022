
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResidenceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ResidenceType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DMST"/>
 *     <enumeration value="FRGN"/>
 *     <enumeration value="MXED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ResidenceType1Code")
@XmlEnum
public enum ResidenceType1Code {


    /**
     * Residence is domestic.
     * 
     */
    DMST,

    /**
     * Residence is foreign.
     * 
     */
    FRGN,

    /**
     * Residence is mixed
     * 
     */
    MXED;

    public String value() {
        return name();
    }

    public static ResidenceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
