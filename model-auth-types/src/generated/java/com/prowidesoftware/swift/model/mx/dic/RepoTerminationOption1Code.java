
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepoTerminationOption1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RepoTerminationOption1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EGRN"/&gt;
 *     &lt;enumeration value="ETSB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RepoTerminationOption1Code")
@XmlEnum
public enum RepoTerminationOption1Code {


    /**
     * Evergreen termination option.
     * 
     */
    EGRN,

    /**
     * Extensible termination option.
     * 
     */
    ETSB;

    public String value() {
        return name();
    }

    public static RepoTerminationOption1Code fromValue(String v) {
        return valueOf(v);
    }

}
