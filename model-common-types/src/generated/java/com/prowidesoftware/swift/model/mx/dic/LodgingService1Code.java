
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LodgingService1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LodgingService1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCO"/>
 *     <enumeration value="AUDI"/>
 *     <enumeration value="BANQ"/>
 *     <enumeration value="BREK"/>
 *     <enumeration value="BUSS"/>
 *     <enumeration value="CONC"/>
 *     <enumeration value="EARA"/>
 *     <enumeration value="EARD"/>
 *     <enumeration value="ENTR"/>
 *     <enumeration value="FCAA"/>
 *     <enumeration value="GAME"/>
 *     <enumeration value="GARA"/>
 *     <enumeration value="GIFT"/>
 *     <enumeration value="HEAL"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="LAUN"/>
 *     <enumeration value="LONG"/>
 *     <enumeration value="MINI"/>
 *     <enumeration value="NOSH"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PARK"/>
 *     <enumeration value="PHON"/>
 *     <enumeration value="REST"/>
 *     <enumeration value="RMSE"/>
 *     <enumeration value="SPAS"/>
 *     <enumeration value="THRD"/>
 *     <enumeration value="TRAN"/>
 *     <enumeration value="VODS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
