
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepoTerminationOption2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RepoTerminationOption2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EGRN"/>
 *     <enumeration value="EGAE"/>
 *     <enumeration value="ETSB"/>
 *     <enumeration value="NOAP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RepoTerminationOption2Code")
@XmlEnum
public enum RepoTerminationOption2Code {


    /**
     * Evergreen termination option.
     * 
     */
    EGRN,

    /**
     * Evergreen and extendable termination option. 
     * 
     */
    EGAE,

    /**
     * Extendable termination option.
     * 
     */
    ETSB,

    /**
     * Search for requested data not complete yet.
     * 
     */
    NOAP;

    public String value() {
        return name();
    }

    public static RepoTerminationOption2Code fromValue(String v) {
        return valueOf(v);
    }

}
