
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssuanceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="IssuanceType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <length value="4"/>
 *     <enumeration value="CRQL"/>
 *     <enumeration value="CRQC"/>
 *     <enumeration value="ISSU"/>
 *     <enumeration value="ISCO"/>
 *     <enumeration value="ISAD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "IssuanceType1Code")
@XmlEnum
public enum IssuanceType1Code {


    /**
     * Counter-undertaking issued to a correspondent with a request to issue a local undertaking.
     * 
     */
    CRQL,

    /**
     * Counter-undertaking issued to a correspondent with a request to issue another counter-undertaking.
     * 
     */
    CRQC,

    /**
     * Undertaking issued direct to the beneficiary.
     * 
     */
    ISSU,

    /**
     * Undertaking issued to the beneficiary via a confirming party.
     * 
     */
    ISCO,

    /**
     * Undertaking issued to the beneficiary via an advising party.
     * 
     */
    ISAD;

    public String value() {
        return name();
    }

    public static IssuanceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
