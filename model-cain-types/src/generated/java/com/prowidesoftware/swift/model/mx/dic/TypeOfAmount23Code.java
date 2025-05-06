
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount23Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfAmount23Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AMTH"/>
 *     <enumeration value="BAGG"/>
 *     <enumeration value="CARG"/>
 *     <enumeration value="CHTC"/>
 *     <enumeration value="CLUB"/>
 *     <enumeration value="DUTY"/>
 *     <enumeration value="EXTK"/>
 *     <enumeration value="EXTF"/>
 *     <enumeration value="EXTR"/>
 *     <enumeration value="FARE"/>
 *     <enumeration value="FDBV"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="MISC"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PETC"/>
 *     <enumeration value="PHNE"/>
 *     <enumeration value="PRPY"/>
 *     <enumeration value="TOTL"/>
 *     <enumeration value="TOUR"/>
 *     <enumeration value="UPGD"/>
 *     <enumeration value="TKDL"/>
 *     <enumeration value="FEES"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfAmount23Code")
@XmlEnum
public enum TypeOfAmount23Code {


    /**
     * Transaction amount that has been authorised.
     * 
     */
    AMTH,

    /**
     * Baggage related fees
     * 
     */
    BAGG,

    /**
     * Cargo Amount.
     * 
     */
    CARG,

    /**
     * Amount that has been charged to card account
     * 
     */
    CHTC,

    /**
     * Amount for club fee.
     * 
     */
    CLUB,

    /**
     * Duty free amount
     * 
     */
    DUTY,

    /**
     * Fee for exchanging a ticket (modifying an itinerary)
     * 
     */
    EXTK,

    /**
     * Fee for exchanging a ticket (modifying an itinerary)
     * 
     */
    EXTF,

    /**
     * Extra charges (for example,  minibar, etc.)
     * 
     */
    EXTR,

    /**
     * Amount of fare
     * 
     */
    FARE,

    /**
     * Amount of food and beverages
     * 
     */
    FDBV,

    /**
     * Insurance charges 
     * 
     */
    INSU,

    /**
     * Miscellaneous charges not elsewhere defined
     * 
     */
    MISC,

    /**
     * Other type of amount defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of amount defined at private level.
     * 
     */
    OTHP,

    /**
     * Pet carrier.
     * 
     */
    PETC,

    /**
     * Phone charges
     * 
     */
    PHNE,

    /**
     * Amount of prepayment
     * 
     */
    PRPY,

    /**
     * Total amount of charges
     * 
     */
    TOTL,

    /**
     * Tour order amount.
     * 
     */
    TOUR,

    /**
     * Amount for an upgrade.
     * 
     */
    UPGD,

    /**
     * Ticket delivery amount.
     * 
     */
    TKDL,

    /**
     * Fees.
     * 
     */
    FEES;

    public String value() {
        return name();
    }

    public static TypeOfAmount23Code fromValue(String v) {
        return valueOf(v);
    }

}
