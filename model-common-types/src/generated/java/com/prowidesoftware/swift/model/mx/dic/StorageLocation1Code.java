
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageLocation1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StorageLocation1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CAWL"/>
 *     <enumeration value="DVCE"/>
 *     <enumeration value="ISWL"/>
 *     <enumeration value="ONFL"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="TPWL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StorageLocation1Code")
@XmlEnum
public enum StorageLocation1Code {


    /**
     * Storage is in wallet managed by card acceptor.
     * 
     */
    CAWL,

    /**
     * Stored in device.
     * 
     */
    DVCE,

    /**
     * Storage is in wallet managed by Issuer.
     * 
     */
    ISWL,

    /**
     * Storage is on file.
     * 
     */
    ONFL,

    /**
     * Code defined by national standards organisation.
     * 
     */
    OTHN,

    /**
     * Code defined by private agreement.
     * 
     */
    OTHP,

    /**
     * Storage location is in wallet managed by a third party.
     * 
     */
    TPWL;

    public String value() {
        return name();
    }

    public static StorageLocation1Code fromValue(String v) {
        return valueOf(v);
    }

}
