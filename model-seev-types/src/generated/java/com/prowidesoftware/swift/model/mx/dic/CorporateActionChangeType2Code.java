
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionChangeType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionChangeType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BERE"/>
 *     <enumeration value="CERT"/>
 *     <enumeration value="DEPH"/>
 *     <enumeration value="GPPH"/>
 *     <enumeration value="GTGP"/>
 *     <enumeration value="GTPH"/>
 *     <enumeration value="NAME"/>
 *     <enumeration value="PHDE"/>
 *     <enumeration value="REBE"/>
 *     <enumeration value="TERM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionChangeType2Code")
@XmlEnum
public enum CorporateActionChangeType2Code {


    /**
     * Change from bearer into registered form.
     * 
     */
    BERE,

    /**
     * Change of all instruments into certificates.
     * 
     */
    CERT,

    /**
     * Change from dematerialised into physical form.
     * 
     */
    DEPH,

    /**
     * Change from global permanent to physical form.
     * 
     */
    GPPH,

    /**
     * Change from global temporary to global permanent form.
     * 
     */
    GTGP,

    /**
     * Change from global temporary to physical form.
     * 
     */
    GTPH,

    /**
     * The issuing company changes its name. CA event shows the change from old name to new name and may involve surrendering physical shares with the old name to the registrar.
     * 
     */
    NAME,

    /**
     * Change from physical into dematerialised form.
     * 
     */
    PHDE,

    /**
     * Change from registered into bearer form.
     * 
     */
    REBE,

    /**
     * Change in the terms of the security.
     * 
     */
    TERM;

    public String value() {
        return name();
    }

    public static CorporateActionChangeType2Code fromValue(String v) {
        return valueOf(v);
    }

}
