
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RequestStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FNCD"/>
 *     <enumeration value="PDNG"/>
 *     <enumeration value="NTFD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RequestStatus1Code")
@XmlEnum
public enum RequestStatus1Code {


    /**
     * Single Invoice/Instalment financing request has been financed.
     * 
     */
    FNCD,

    /**
     * Single Invoice/Instalment financing request is in a pending status and more checks are ongoing.
     * 
     */
    PDNG,

    /**
     * Single Invoice/Instalment financing request has not been financed.
     * 
     */
    NTFD;

    public String value() {
        return name();
    }

    public static RequestStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
