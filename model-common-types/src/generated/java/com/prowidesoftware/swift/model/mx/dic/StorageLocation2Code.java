
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageLocation2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StorageLocation2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CAWL"/>
 *     <enumeration value="DVCE"/>
 *     <enumeration value="ISWL"/>
 *     <enumeration value="ONFL"/>
 *     <enumeration value="TPWL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StorageLocation2Code")
@XmlEnum
public enum StorageLocation2Code {


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
     * Storage location is in wallet managed by a third party.
     * 
     */
    TPWL;

    public String value() {
        return name();
    }

    public static StorageLocation2Code fromValue(String v) {
        return valueOf(v);
    }

}
