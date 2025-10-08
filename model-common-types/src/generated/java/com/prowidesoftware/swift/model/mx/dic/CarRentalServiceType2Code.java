
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarRentalServiceType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CarRentalServiceType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADJM"/&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *     &lt;enumeration value="BAST"/&gt;
 *     &lt;enumeration value="CLEA"/&gt;
 *     &lt;enumeration value="DMGS"/&gt;
 *     &lt;enumeration value="DLVR"/&gt;
 *     &lt;enumeration value="DPOF"/&gt;
 *     &lt;enumeration value="ENTE"/&gt;
 *     &lt;enumeration value="EXTC"/&gt;
 *     &lt;enumeration value="EXDY"/&gt;
 *     &lt;enumeration value="EXDI"/&gt;
 *     &lt;enumeration value="EXHR"/&gt;
 *     &lt;enumeration value="FINE"/&gt;
 *     &lt;enumeration value="FUEL"/&gt;
 *     &lt;enumeration value="GARA"/&gt;
 *     &lt;enumeration value="GPSY"/&gt;
 *     &lt;enumeration value="INSU"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="LIIN"/&gt;
 *     &lt;enumeration value="LDIN"/&gt;
 *     &lt;enumeration value="MISC"/&gt;
 *     &lt;enumeration value="NAVI"/&gt;
 *     &lt;enumeration value="NOSH"/&gt;
 *     &lt;enumeration value="ONEW"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="PARK"/&gt;
 *     &lt;enumeration value="PRIN"/&gt;
 *     &lt;enumeration value="PFIN"/&gt;
 *     &lt;enumeration value="PHON"/&gt;
 *     &lt;enumeration value="REGD"/&gt;
 *     &lt;enumeration value="SMOK"/&gt;
 *     &lt;enumeration value="TOLL"/&gt;
 *     &lt;enumeration value="TOWI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
