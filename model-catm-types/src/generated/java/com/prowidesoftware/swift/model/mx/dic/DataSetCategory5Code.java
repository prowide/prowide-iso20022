
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSetCategory5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataSetCategory5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AQPR"/&gt;
 *     &lt;enumeration value="APPR"/&gt;
 *     &lt;enumeration value="MTMG"/&gt;
 *     &lt;enumeration value="MRPR"/&gt;
 *     &lt;enumeration value="MTOR"/&gt;
 *     &lt;enumeration value="SCPR"/&gt;
 *     &lt;enumeration value="SWPK"/&gt;
 *     &lt;enumeration value="TRPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataSetCategory5Code")
@XmlEnum
public enum DataSetCategory5Code {


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
    TRPR;

    public String value() {
        return name();
    }

    public static DataSetCategory5Code fromValue(String v) {
        return valueOf(v);
    }

}
