
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSetCategory12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DataSetCategory12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AQPR"/>
 *     <enumeration value="APPR"/>
 *     <enumeration value="TXCP"/>
 *     <enumeration value="AKCP"/>
 *     <enumeration value="DLGT"/>
 *     <enumeration value="MGTP"/>
 *     <enumeration value="MRPR"/>
 *     <enumeration value="SCPR"/>
 *     <enumeration value="SWPK"/>
 *     <enumeration value="STRP"/>
 *     <enumeration value="TRPR"/>
 *     <enumeration value="VDPR"/>
 *     <enumeration value="PARA"/>
 *     <enumeration value="TMSP"/>
 *     <enumeration value="CRTF"/>
 *     <enumeration value="LOGF"/>
 *     <enumeration value="CMRQ"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DataSetCategory12Code")
@XmlEnum
public enum DataSetCategory12Code {


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
     * Data needed to create a terminal management sub-domain.
     * 
     */
    DLGT,

    /**
     * Configuration of management plan in the point of interaction.
     * 
     */
    MGTP,

    /**
     * Merchant configuration parameters for the point of interaction (POI).
     * 
     */
    MRPR,

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
     * Report of software configuration and parameter status.
     * 
     */
    STRP,

    /**
     * Point of interaction parameters attached to the terminal as serial number or physical capabilities.
     * 
     */
    TRPR,

    /**
     * Point of interaction parameters defined by the manufacturer for instance the PIN verification capabilities.
     * 
     */
    VDPR,

    /**
     * Any combination of configuration parameters for the point of interaction (POI).
     * 
     */
    PARA,

    /**
     * Configuration parameters for the TMS protocol.
     * 
     */
    TMSP,

    /**
     * Certificate provided by a terminal manager.
     * 
     */
    CRTF,

    /**
     * Any repository used for recording log traces.
     * 
     */
    LOGF,

    /**
     * Trigger for CertificateManagementRequest.
     * 
     */
    CMRQ;

    public String value() {
        return name();
    }

    public static DataSetCategory12Code fromValue(String v) {
        return valueOf(v);
    }

}
