
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSetCategory7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DataSetCategory7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ATMC"/>
 *     <enumeration value="ATMP"/>
 *     <enumeration value="APPR"/>
 *     <enumeration value="CRAP"/>
 *     <enumeration value="CPRC"/>
 *     <enumeration value="OEXR"/>
 *     <enumeration value="AMNT"/>
 *     <enumeration value="LOCC"/>
 *     <enumeration value="MNOC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
