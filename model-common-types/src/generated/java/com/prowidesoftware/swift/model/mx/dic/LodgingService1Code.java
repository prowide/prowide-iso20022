
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LodgingService1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LodgingService1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCO"/&gt;
 *     &lt;enumeration value="AUDI"/&gt;
 *     &lt;enumeration value="BANQ"/&gt;
 *     &lt;enumeration value="BREK"/&gt;
 *     &lt;enumeration value="BUSS"/&gt;
 *     &lt;enumeration value="CONC"/&gt;
 *     &lt;enumeration value="EARA"/&gt;
 *     &lt;enumeration value="EARD"/&gt;
 *     &lt;enumeration value="ENTR"/&gt;
 *     &lt;enumeration value="FCAA"/&gt;
 *     &lt;enumeration value="GAME"/&gt;
 *     &lt;enumeration value="GARA"/&gt;
 *     &lt;enumeration value="GIFT"/&gt;
 *     &lt;enumeration value="HEAL"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *     &lt;enumeration value="LAUN"/&gt;
 *     &lt;enumeration value="LONG"/&gt;
 *     &lt;enumeration value="MINI"/&gt;
 *     &lt;enumeration value="NOSH"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="PARK"/&gt;
 *     &lt;enumeration value="PHON"/&gt;
 *     &lt;enumeration value="REST"/&gt;
 *     &lt;enumeration value="RMSE"/&gt;
 *     &lt;enumeration value="SPAS"/&gt;
 *     &lt;enumeration value="THRD"/&gt;
 *     &lt;enumeration value="TRAN"/&gt;
 *     &lt;enumeration value="VODS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LodgingService1Code")
@XmlEnum
public enum LodgingService1Code {


    /**
     * Room accommodation
     * 
     */
    ACCO,

    /**
     * Audio visual lodging service.
     * 
     */
    AUDI,

    /**
     * Banquet lodging service.
     * 
     */
    BANQ,

    /**
     * Breakfast lodging service.
     * 
     */
    BREK,

    /**
     * Business centre lodging service.
     * 
     */
    BUSS,

    /**
     * Concierge lodging service.
     * 
     */
    CONC,

    /**
     * Early arrival lodging service.
     * 
     */
    EARA,

    /**
     * Early departure lodging service.
     * 
     */
    EARD,

    /**
     * Entertainment lodging service.
     * 
     */
    ENTR,

    /**
     * Folio cash advance lodging service.
     * 
     */
    FCAA,

    /**
     * Games lodging service.
     * 
     */
    GAME,

    /**
     * Garage lodging service.
     * 
     */
    GARA,

    /**
     * Gift shop lodging service.
     * 
     */
    GIFT,

    /**
     * Health lodging service.
     * 
     */
    HEAL,

    /**
     * Internet lodging service.
     * 
     */
    INTE,

    /**
     * Laundry lodging service.
     * 
     */
    LAUN,

    /**
     * Lounge bar lodging service.
     * 
     */
    LONG,

    /**
     * Mini bar lodging service.
     * 
     */
    MINI,

    /**
     * No show lodging service.
     * 
     */
    NOSH,

    /**
     * Other type of service.
     * 
     */
    OTHR,

    /**
     * Parking lodging service.
     * 
     */
    PARK,

    /**
     * Phone lodging service.
     * 
     */
    PHON,

    /**
     * Restaurant lodging service.
     * 
     */
    REST,

    /**
     * Room service.
     * 
     */
    RMSE,

    /**
     * Spa lodging service.
     * 
     */
    SPAS,

    /**
     * Third-party lodging service.
     * 
     */
    THRD,

    /**
     * Transportation lodging service.
     * 
     */
    TRAN,

    /**
     * Video on demand lodging service.
     * 
     */
    VODS;

    public String value() {
        return name();
    }

    public static LodgingService1Code fromValue(String v) {
        return valueOf(v);
    }

}
