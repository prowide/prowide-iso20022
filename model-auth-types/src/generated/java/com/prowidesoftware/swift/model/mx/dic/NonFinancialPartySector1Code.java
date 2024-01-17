
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonFinancialPartySector1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NonFinancialPartySector1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WTER"/>
 *     <enumeration value="MING"/>
 *     <enumeration value="MAFG"/>
 *     <enumeration value="SPLY"/>
 *     <enumeration value="CSTR"/>
 *     <enumeration value="AGRI"/>
 *     <enumeration value="ACAF"/>
 *     <enumeration value="EDUC"/>
 *     <enumeration value="AEAR"/>
 *     <enumeration value="FINA"/>
 *     <enumeration value="HHSW"/>
 *     <enumeration value="INCO"/>
 *     <enumeration value="WRRM"/>
 *     <enumeration value="OTSA"/>
 *     <enumeration value="PSTA"/>
 *     <enumeration value="PADS"/>
 *     <enumeration value="RESA"/>
 *     <enumeration value="TRAS"/>
 *     <enumeration value="ASSA"/>
 *     <enumeration value="AHAE"/>
 *     <enumeration value="AEOB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NonFinancialPartySector1Code")
@XmlEnum
public enum NonFinancialPartySector1Code {


    /**
     * Water supply, sewerage, waste management and remediation activities.
     * 
     * 
     */
    WTER,

    /**
     * Mining and quarrying activities.
     * 
     * 
     */
    MING,

    /**
     * Manufacturing activities.
     * 
     * 
     */
    MAFG,

    /**
     * Electricity, gas, steam and air conditioning supply activities.
     * 
     * 
     */
    SPLY,

    /**
     * Construction activities.
     * 
     */
    CSTR,

    /**
     * Agriculture, forestry and fishing activities.
     * 
     * 
     */
    AGRI,

    /**
     * Accommodation and food service activities.
     * 
     */
    ACAF,

    /**
     * Education activities.
     * 
     */
    EDUC,

    /**
     * Arts, entertainment and recreation activities.
     * 
     * 
     */
    AEAR,

    /**
     * Financial and insurance activities.
     * 
     */
    FINA,

    /**
     * Human health and social work activities.
     * 
     */
    HHSW,

    /**
     * Information and communication activities.
     * 
     */
    INCO,

    /**
     * Wholesale and retail trade, repair of motor vehicles and motorcycles.
     * 
     */
    WRRM,

    /**
     * Other service activities.
     * 
     */
    OTSA,

    /**
     * Professional, scientific and technical activities.
     * 
     * 
     */
    PSTA,

    /**
     * Public administration and defence, compulsory social security.
     * 
     * 
     */
    PADS,

    /**
     * Real estate activities.
     * 
     */
    RESA,

    /**
     * Transportation and storage activities.
     * 
     */
    TRAS,

    /**
     * Administrative and support service activities.
     * 
     * 
     */
    ASSA,

    /**
     * Activities of households as employers; undifferentiated goods – and services –producing activities of households for own use.
     * 
     */
    AHAE,

    /**
     * Activities of extraterritorial organisations and bodies.
     * 
     * 
     */
    AEOB;

    public String value() {
        return name();
    }

    public static NonFinancialPartySector1Code fromValue(String v) {
        return valueOf(v);
    }

}
