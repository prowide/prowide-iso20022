
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonFinancialPartySector1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NonFinancialPartySector1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WTER"/&gt;
 *     &lt;enumeration value="MING"/&gt;
 *     &lt;enumeration value="MAFG"/&gt;
 *     &lt;enumeration value="SPLY"/&gt;
 *     &lt;enumeration value="CSTR"/&gt;
 *     &lt;enumeration value="AGRI"/&gt;
 *     &lt;enumeration value="ACAF"/&gt;
 *     &lt;enumeration value="EDUC"/&gt;
 *     &lt;enumeration value="AEAR"/&gt;
 *     &lt;enumeration value="FINA"/&gt;
 *     &lt;enumeration value="HHSW"/&gt;
 *     &lt;enumeration value="INCO"/&gt;
 *     &lt;enumeration value="WRRM"/&gt;
 *     &lt;enumeration value="OTSA"/&gt;
 *     &lt;enumeration value="PSTA"/&gt;
 *     &lt;enumeration value="PADS"/&gt;
 *     &lt;enumeration value="RESA"/&gt;
 *     &lt;enumeration value="TRAS"/&gt;
 *     &lt;enumeration value="ASSA"/&gt;
 *     &lt;enumeration value="AHAE"/&gt;
 *     &lt;enumeration value="AEOB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
