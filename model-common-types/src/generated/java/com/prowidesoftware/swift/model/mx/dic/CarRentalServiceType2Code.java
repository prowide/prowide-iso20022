
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarRentalServiceType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CarRentalServiceType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADJM"/>
 *     <enumeration value="AUTH"/>
 *     <enumeration value="BAST"/>
 *     <enumeration value="CLEA"/>
 *     <enumeration value="DMGS"/>
 *     <enumeration value="DLVR"/>
 *     <enumeration value="DPOF"/>
 *     <enumeration value="ENTE"/>
 *     <enumeration value="EXTC"/>
 *     <enumeration value="EXDY"/>
 *     <enumeration value="EXDI"/>
 *     <enumeration value="EXHR"/>
 *     <enumeration value="FINE"/>
 *     <enumeration value="FUEL"/>
 *     <enumeration value="GARA"/>
 *     <enumeration value="GPSY"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="LIIN"/>
 *     <enumeration value="LDIN"/>
 *     <enumeration value="MISC"/>
 *     <enumeration value="NAVI"/>
 *     <enumeration value="NOSH"/>
 *     <enumeration value="ONEW"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PARK"/>
 *     <enumeration value="PRIN"/>
 *     <enumeration value="PFIN"/>
 *     <enumeration value="PHON"/>
 *     <enumeration value="REGD"/>
 *     <enumeration value="SMOK"/>
 *     <enumeration value="TOLL"/>
 *     <enumeration value="TOWI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CarRentalServiceType2Code")
@XmlEnum
public enum CarRentalServiceType2Code {


    /**
     * Rental amount adjustment
     * 
     */
    ADJM,

    /**
     * Authorised amount
     * 
     */
    AUTH,

    /**
     * Baby seat.
     * 
     */
    BAST,

    /**
     * Extra charges due to the need to clean the car.
     * 
     */
    CLEA,

    /**
     * Charge for damages
     * 
     */
    DMGS,

    /**
     * Charge for delivery of rental vehicle
     * 
     */
    DLVR,

    /**
     * Drop off charges
     * 
     */
    DPOF,

    /**
     * Entertainment
     * 
     */
    ENTE,

    /**
     * Extra charges
     * 
     */
    EXTC,

    /**
     * Charges for extra days
     * 
     */
    EXDY,

    /**
     * Charges for additional distance
     * 
     */
    EXDI,

    /**
     * Charges for extra hours
     * 
     */
    EXHR,

    /**
     * Police and related fines or violation fees reinvoiced by vehicle rental company.
     * 
     */
    FINE,

    /**
     * Fuel
     * 
     */
    FUEL,

    /**
     * Garage
     * 
     */
    GARA,

    /**
     * Global Positioning System (GPS)
     * 
     */
    GPSY,

    /**
     * Insurance
     * 
     */
    INSU,

    /**
     * Car returned late.
     * 
     */
    LATE,

    /**
     * Charges for liability insurance
     * 
     */
    LIIN,

    /**
     * Charges for Loss Damage Insurance
     * 
     */
    LDIN,

    /**
     * Miscellaneous charges
     * 
     */
    MISC,

    /**
     * Charges for navigation system
     * 
     */
    NAVI,

    /**
     * Customer no-show charges.
     * 
     */
    NOSH,

    /**
     * Drop-off charges.
     * 
     */
    ONEW,

    /**
     * Other National
     * 
     */
    OTHN,

    /**
     * Other Private
     * 
     */
    OTHP,

    /**
     * Parking charges.
     * 
     */
    PARK,

    /**
     * Personal Accident Insurance
     * 
     */
    PRIN,

    /**
     * Personal Effects Insurance
     * 
     */
    PFIN,

    /**
     * On-board telephone service.
     * 
     */
    PHON,

    /**
     * Charges for regular distance
     * 
     */
    REGD,

    /**
     * Extra charges due to smoking in the car.
     * 
     */
    SMOK,

    /**
     * Charges for tolls
     * 
     */
    TOLL,

    /**
     * Extra charges due to car towing.
     * 
     */
    TOWI;

    public String value() {
        return name();
    }

    public static CarRentalServiceType2Code fromValue(String v) {
        return valueOf(v);
    }

}
