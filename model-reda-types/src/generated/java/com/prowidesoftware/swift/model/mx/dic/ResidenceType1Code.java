
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResidenceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResidenceType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DMST"/&gt;
 *     &lt;enumeration value="FRGN"/&gt;
 *     &lt;enumeration value="MXED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
