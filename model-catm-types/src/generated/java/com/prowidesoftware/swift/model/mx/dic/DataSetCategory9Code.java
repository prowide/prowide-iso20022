
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSetCategory9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataSetCategory9Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AQPR"/&gt;
 *     &lt;enumeration value="APPR"/&gt;
 *     &lt;enumeration value="TXCP"/&gt;
 *     &lt;enumeration value="AKCP"/&gt;
 *     &lt;enumeration value="DLGT"/&gt;
 *     &lt;enumeration value="MGTP"/&gt;
 *     &lt;enumeration value="MRPR"/&gt;
 *     &lt;enumeration value="SCPR"/&gt;
 *     &lt;enumeration value="SWPK"/&gt;
 *     &lt;enumeration value="STRP"/&gt;
 *     &lt;enumeration value="TRPR"/&gt;
 *     &lt;enumeration value="VDPR"/&gt;
 *     &lt;enumeration value="PARA"/&gt;
 *     &lt;enumeration value="TMSP"/&gt;
 *     &lt;enumeration value="CRTF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataSetCategory9Code")
@XmlEnum
public enum DataSetCategory9Code {


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
    CRTF;

    public String value() {
        return name();
    }

    public static DataSetCategory9Code fromValue(String v) {
        return valueOf(v);
    }

}
