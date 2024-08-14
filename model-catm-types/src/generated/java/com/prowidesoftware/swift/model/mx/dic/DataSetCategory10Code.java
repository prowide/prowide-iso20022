
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSetCategory10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DataSetCategory10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AQPR"/>
 *     <enumeration value="APPR"/>
 *     <enumeration value="MTMG"/>
 *     <enumeration value="MRPR"/>
 *     <enumeration value="MTOR"/>
 *     <enumeration value="SCPR"/>
 *     <enumeration value="SWPK"/>
 *     <enumeration value="TRPR"/>
 *     <enumeration value="CRTF"/>
 *     <enumeration value="TMSP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DataSetCategory10Code")
@XmlEnum
public enum DataSetCategory10Code {


    /**
     * Acquirer specific configuration parameters for the point of interaction (POI) system.
     * 
     */
    AQPR,

    /**
     * Payment application specific configuration parameters for the point of interaction (POI) system.
     * 
     */
    APPR,

    /**
     * The terminal manager is the master.
     * 
     */
    MTMG,

    /**
     * Merchant configuration parameters for the point of interaction (POI).
     * 
     */
    MRPR,

    /**
     * Monitoring of the terminal estate.
     * 
     */
    MTOR,

    /**
     * Point of interaction parameters related to the security of software application and application protocol.
     * 
     */
    SCPR,

    /**
     * Software module.
     * 
     */
    SWPK,

    /**
     * Point of interaction parameters attached to the terminal as serial number or physical capabilities.
     * 
     */
    TRPR,

    /**
     * Certificate provided by a terminal manager.
     * 
     */
    CRTF,

    /**
     * Configuration parameters for the TMS protocol.
     * 
     */
    TMSP;

    public String value() {
        return name();
    }

    public static DataSetCategory10Code fromValue(String v) {
        return valueOf(v);
    }

}
