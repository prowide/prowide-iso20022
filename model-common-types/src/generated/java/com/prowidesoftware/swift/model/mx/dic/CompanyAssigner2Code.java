
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyAssigner2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CompanyAssigner2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASSO"/>
 *     <enumeration value="AUTH"/>
 *     <enumeration value="CPNY"/>
 *     <enumeration value="LEII"/>
 *     <enumeration value="TRAG"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="OTHN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CompanyAssigner2Code")
@XmlEnum
public enum CompanyAssigner2Code {


    /**
     * Any relevant association in charge of assigning an identification to a company.
     * 
     */
    ASSO,

    /**
     * Legal authority assigning an identification to a company (for example, a local, regional or national authority).
     * 
     */
    AUTH,

    /**
     * Identification assigned by the company itself.
     * 
     */
    CPNY,

    /**
     * Legal Entity Identifier.
     * 
     */
    LEII,

    /**
     * Identification assigned by a travel agency.
     * 
     */
    TRAG,

    /**
     * Other company assigner entity defined at private level.
     * 
     */
    OTHP,

    /**
     * Other company assigner entity defined at national level.
     * 
     */
    OTHN;

    public String value() {
        return name();
    }

    public static CompanyAssigner2Code fromValue(String v) {
        return valueOf(v);
    }

}
