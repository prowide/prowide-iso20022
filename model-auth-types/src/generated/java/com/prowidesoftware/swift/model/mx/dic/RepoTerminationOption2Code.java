
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepoTerminationOption2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RepoTerminationOption2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EGRN"/&gt;
 *     &lt;enumeration value="EGAE"/&gt;
 *     &lt;enumeration value="ETSB"/&gt;
 *     &lt;enumeration value="NOAP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * Evergreen and extensible termination option. 
     * 
     */
    EGAE,

    /**
     * Extensible termination option.
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
