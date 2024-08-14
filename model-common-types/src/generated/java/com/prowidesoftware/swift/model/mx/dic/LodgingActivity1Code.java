
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LodgingActivity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LodgingActivity1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APTM"/>
 *     <enumeration value="BEBR"/>
 *     <enumeration value="COTT"/>
 *     <enumeration value="CRUI"/>
 *     <enumeration value="HOME"/>
 *     <enumeration value="HOST"/>
 *     <enumeration value="HOTL"/>
 *     <enumeration value="LODG"/>
 *     <enumeration value="MOTL"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="RESO"/>
 *     <enumeration value="ROAB"/>
 *     <enumeration value="TOSH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LodgingActivity1Code")
@XmlEnum
public enum LodgingActivity1Code {


    /**
     * Apartment residence.
     * 
     */
    APTM,

    /**
     * Bed and breakfast or related lodging.
     * 
     */
    BEBR,

    /**
     * Cottage and related lodging.
     * 
     */
    COTT,

    /**
     * Cruise line lodging.
     * 
     */
    CRUI,

    /**
     * An individual offering lodging facilities.
     * 
     */
    HOME,

    /**
     * Hostel or related lodging.
     * 
     */
    HOST,

    /**
     * Hotel or related lodging.
     * 
     */
    HOTL,

    /**
     * Lodge or related lodging.
     * 
     */
    LODG,

    /**
     * Motel or related lodging.
     * 
     */
    MOTL,

    /**
     * Other type of lodging defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of lodging defined at private level.
     * 
     */
    OTHP,

    /**
     * Resort or related lodging.
     * 
     */
    RESO,

    /**
     * Room and board or related lodging.
     * 
     */
    ROAB,

    /**
     * Tourist shelter and related lodging.
     * 
     */
    TOSH;

    public String value() {
        return name();
    }

    public static LodgingActivity1Code fromValue(String v) {
        return valueOf(v);
    }

}
