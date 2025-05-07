
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount20Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfAmount20Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AMTH"/&gt;
 *     &lt;enumeration value="BAGG"/&gt;
 *     &lt;enumeration value="CARG"/&gt;
 *     &lt;enumeration value="CHTC"/&gt;
 *     &lt;enumeration value="CLUB"/&gt;
 *     &lt;enumeration value="DUTY"/&gt;
 *     &lt;enumeration value="EXTK"/&gt;
 *     &lt;enumeration value="EXTF"/&gt;
 *     &lt;enumeration value="EXTR"/&gt;
 *     &lt;enumeration value="FARE"/&gt;
 *     &lt;enumeration value="FDBV"/&gt;
 *     &lt;enumeration value="INSU"/&gt;
 *     &lt;enumeration value="MISC"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="PETC"/&gt;
 *     &lt;enumeration value="PHNE"/&gt;
 *     &lt;enumeration value="PRPY"/&gt;
 *     &lt;enumeration value="TOTL"/&gt;
 *     &lt;enumeration value="TOUR"/&gt;
 *     &lt;enumeration value="UPGD"/&gt;
 *     &lt;enumeration value="TKDL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfAmount20Code")
@XmlEnum
public enum TypeOfAmount20Code {


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
    TKDL;

    public String value() {
        return name();
    }

    public static TypeOfAmount20Code fromValue(String v) {
        return valueOf(v);
    }

}
