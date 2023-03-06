
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LodgingActivity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LodgingActivity1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APTM"/&gt;
 *     &lt;enumeration value="BEBR"/&gt;
 *     &lt;enumeration value="COTT"/&gt;
 *     &lt;enumeration value="CRUI"/&gt;
 *     &lt;enumeration value="HOME"/&gt;
 *     &lt;enumeration value="HOST"/&gt;
 *     &lt;enumeration value="HOTL"/&gt;
 *     &lt;enumeration value="LODG"/&gt;
 *     &lt;enumeration value="MOTL"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="RESO"/&gt;
 *     &lt;enumeration value="ROAB"/&gt;
 *     &lt;enumeration value="TOSH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
