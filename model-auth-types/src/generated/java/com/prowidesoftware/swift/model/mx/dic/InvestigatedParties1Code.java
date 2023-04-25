
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestigatedParties1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestigatedParties1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ALLP"/>
 *     <enumeration value="OWNE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestigatedParties1Code")
@XmlEnum
public enum InvestigatedParties1Code {


    /**
     * Investigated parties are all parties playig a role matching the search criteria.
     * 
     */
    ALLP,

    /**
     * Investigated party is the owner.
     * 
     */
    OWNE;

    public String value() {
        return name();
    }

    public static InvestigatedParties1Code fromValue(String v) {
        return valueOf(v);
    }

}
