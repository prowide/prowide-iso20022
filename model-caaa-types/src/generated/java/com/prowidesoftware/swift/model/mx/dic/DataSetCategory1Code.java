
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSetCategory1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DataSetCategory1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SWPK"/>
 *     <enumeration value="VDPR"/>
 *     <enumeration value="AQPR"/>
 *     <enumeration value="MRPR"/>
 *     <enumeration value="TXCP"/>
 *     <enumeration value="AKCP"/>
 *     <enumeration value="STRP"/>
 *     <enumeration value="DLGT"/>
 *     <enumeration value="MGTP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DataSetCategory1Code")
@XmlEnum
public enum DataSetCategory1Code {


    /**
     * Software module.
     * 
     */
    SWPK,

    /**
     * Point of interaction parameters defined by the manufacturer for instance the PIN verification capabilities.
     * 
     */
    VDPR,

    /**
     * Acquirer specific configuration parameters for the point of interaction (POI) system.
     * 
     */
    AQPR,

    /**
     * Merchant configuration parameters for the point of interaction (POI).
     * 
     */
    MRPR,

    /**
     * Batch upload of transaction data (data capture of a group of transactions).
     * 
     */
    TXCP,

    /**
     * Batch download response for the batch capture of transactions.
     * 
     */
    AKCP,

    /**
     * Report of software configuration and parameter status.
     * 
     */
    STRP,

    /**
     * Data needed to create a terminal management sub-domain.
     * 
     */
    DLGT,

    /**
     * Configuration of management plan in the point of interaction.
     * 
     */
    MGTP;

    public String value() {
        return name();
    }

    public static DataSetCategory1Code fromValue(String v) {
        return valueOf(v);
    }

}
