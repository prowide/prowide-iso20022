
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSetCategory11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataSetCategory11Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACQP"/&gt;
 *     &lt;enumeration value="APPR"/&gt;
 *     &lt;enumeration value="APSB"/&gt;
 *     &lt;enumeration value="KDWL"/&gt;
 *     &lt;enumeration value="KMGT"/&gt;
 *     &lt;enumeration value="RPRT"/&gt;
 *     &lt;enumeration value="SWPK"/&gt;
 *     &lt;enumeration value="TMSP"/&gt;
 *     &lt;enumeration value="MRPR"/&gt;
 *     &lt;enumeration value="TRPR"/&gt;
 *     &lt;enumeration value="CRTF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
