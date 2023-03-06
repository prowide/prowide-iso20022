
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSetCategory8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataSetCategory8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SWPK"/&gt;
 *     &lt;enumeration value="VDPR"/&gt;
 *     &lt;enumeration value="AQPR"/&gt;
 *     &lt;enumeration value="MRPR"/&gt;
 *     &lt;enumeration value="TXCP"/&gt;
 *     &lt;enumeration value="AKCP"/&gt;
 *     &lt;enumeration value="STRP"/&gt;
 *     &lt;enumeration value="DLGT"/&gt;
 *     &lt;enumeration value="MGTP"/&gt;
 *     &lt;enumeration value="RCLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataSetCategory8Code")
@XmlEnum
public enum DataSetCategory8Code {


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
    MGTP,

    /**
     * Batch of transaction that have generated an error in the totals of the reconciliation.
     * 
     */
    RCLE;

    public String value() {
        return name();
    }

    public static DataSetCategory8Code fromValue(String v) {
        return valueOf(v);
    }

}
