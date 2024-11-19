
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepoCallRequestStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RepoCallRequestStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CACK"/>
 *     <enumeration value="DEND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RepoCallRequestStatus1Code")
@XmlEnum
public enum RepoCallRequestStatus1Code {


    /**
     * Repurchase agreement call request is acknowledged/accepted.
     * 
     */
    CACK,

    /**
     * Repuchase agreement call request is denied.
     * 
     */
    DEND;

    public String value() {
        return name();
    }

    public static RepoCallRequestStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
