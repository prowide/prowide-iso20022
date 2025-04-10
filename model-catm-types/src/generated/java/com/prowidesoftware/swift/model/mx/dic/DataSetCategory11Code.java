
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSetCategory11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DataSetCategory11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACQP"/>
 *     <enumeration value="APPR"/>
 *     <enumeration value="APSB"/>
 *     <enumeration value="KDWL"/>
 *     <enumeration value="KMGT"/>
 *     <enumeration value="RPRT"/>
 *     <enumeration value="SWPK"/>
 *     <enumeration value="TMSP"/>
 *     <enumeration value="MRPR"/>
 *     <enumeration value="TRPR"/>
 *     <enumeration value="CRTF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DataSetCategory11Code")
@XmlEnum
public enum DataSetCategory11Code {


    /**
     * Configuration parameters of the payment acquirer protocol.
     * 
     */
    ACQP,

    /**
     * Payment application specific configuration parameters for the point of interaction (POI) system.
     * 
     */
    APPR,

    /**
     * Creation of a subset of the configuration parameters of an application.
     * 
     */
    APSB,

    /**
     * Download of cryptographic keys with the related information.
     * 
     */
    KDWL,

    /**
     * Activate, deactivate or revoke loaded cryptographic keys.
     * 
     */
    KMGT,

    /**
     * Reporting on activity, status and error of a point of interaction.
     * 
     */
    RPRT,

    /**
     * Software module.
     * 
     */
    SWPK,

    /**
     * Configuration parameters for the TMS protocol.
     * 
     */
    TMSP,

    /**
     * Merchant configuration parameters for the point of interaction (POI).
     * 
     */
    MRPR,

    /**
     * Point of interaction parameters attached to the terminal as serial number or physical capabilities.
     * 
     */
    TRPR,

    /**
     * Certificate provided by a terminal manager.
     * 
     */
    CRTF;

    public String value() {
        return name();
    }

    public static DataSetCategory11Code fromValue(String v) {
        return valueOf(v);
    }

}
