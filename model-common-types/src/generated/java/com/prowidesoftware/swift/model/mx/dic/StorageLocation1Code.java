
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageLocation1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StorageLocation1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CAWL"/&gt;
 *     &lt;enumeration value="DVCE"/&gt;
 *     &lt;enumeration value="ISWL"/&gt;
 *     &lt;enumeration value="ONFL"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="TPWL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
