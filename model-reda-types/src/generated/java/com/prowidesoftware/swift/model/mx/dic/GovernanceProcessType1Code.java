
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GovernanceProcessType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GovernanceProcessType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BMIF"/>
 *     <enumeration value="NINF"/>
 *     <enumeration value="CMIF"/>
 *     <enumeration value="AMIF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GovernanceProcessType1Code")
@XmlEnum
public enum GovernanceProcessType1Code {


    /**
     * Product governance procedure is comparable to MiFID II.
     * 
     */
    BMIF,

    /**
     * No information is requested from the issuer.
     * 
     */
    NINF,

    /**
     * Product governance procedure is not in accordance with MiFID II.
     * 
     */
    CMIF,

    /**
     * Product governance procedure is pursuant to MiFID II.
     * 
     */
    AMIF;

    public String value() {
        return name();
    }

    public static GovernanceProcessType1Code fromValue(String v) {
        return valueOf(v);
    }

}
