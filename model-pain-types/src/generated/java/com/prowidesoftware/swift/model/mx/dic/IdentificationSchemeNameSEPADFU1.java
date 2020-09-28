
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentificationSchemeNameSEPA_DFU1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdentificationSchemeNameSEPA_DFU1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SEPA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IdentificationSchemeNameSEPA_DFU1")
@XmlEnum
public enum IdentificationSchemeNameSEPADFU1 {


    /**
     * SEPA
     * 
     */
    SEPA;

    public String value() {
        return name();
    }

    public static IdentificationSchemeNameSEPADFU1 fromValue(String v) {
        return valueOf(v);
    }

}
