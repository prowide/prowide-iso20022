
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSetCategory7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataSetCategory7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ATMC"/&gt;
 *     &lt;enumeration value="ATMP"/&gt;
 *     &lt;enumeration value="APPR"/&gt;
 *     &lt;enumeration value="CRAP"/&gt;
 *     &lt;enumeration value="CPRC"/&gt;
 *     &lt;enumeration value="OEXR"/&gt;
 *     &lt;enumeration value="AMNT"/&gt;
 *     &lt;enumeration value="LOCC"/&gt;
 *     &lt;enumeration value="MNOC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataSetCategory7Code")
@XmlEnum
public enum DataSetCategory7Code {


    /**
     * Configuration parameters of the ATM.
     * 
     */
    ATMC,

    /**
     * ATM protocol parameters, including the configuration of the hosts.
     * 
     */
    ATMP,

    /**
     * Payment application specific configuration parameters for the point of interaction (POI) system.
     * 
     */
    APPR,

    /**
     * Configuration parameters of the card application.
     * 
     */
    CRAP,

    /**
     * Configuration of the cards accepted by the terminal.
     * 
     */
    CPRC,

    /**
     * Local rates for currency exchanges.
     * 
     */
    OEXR,

    /**
     * Predefined amounts to be presented to the customer.
     * 
     */
    AMNT,

    /**
     * Configuration of the location.
     * 
     */
    LOCC,

    /**
     * Configuration of the mobile operator cards accepted by the terminal.
     * 
     */
    MNOC;

    public String value() {
        return name();
    }

    public static DataSetCategory7Code fromValue(String v) {
        return valueOf(v);
    }

}
