
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PowerOfAttorneyLegalisation1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PowerOfAttorneyLegalisation1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOTA"/&gt;
 *     &lt;enumeration value="LOCA"/&gt;
 *     &lt;enumeration value="APOS"/&gt;
 *     &lt;enumeration value="COUN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PowerOfAttorneyLegalisation1Code")
@XmlEnum
public enum PowerOfAttorneyLegalisation1Code {


    /**
     * Indicates that the power of attorney must be legalised by a notary.
     * 
     */
    NOTA,

    /**
     * Indicates that the power of attorney must be legalised by a local authority.
     * 
     */
    LOCA,

    /**
     * Indicates that the power of attorney must be legalised by a legal officer.
     * 
     */
    APOS,

    /**
     * Indicates that the power of attorney must be legalised by a consular officer.
     * 
     */
    COUN;

    public String value() {
        return name();
    }

    public static PowerOfAttorneyLegalisation1Code fromValue(String v) {
        return valueOf(v);
    }

}
