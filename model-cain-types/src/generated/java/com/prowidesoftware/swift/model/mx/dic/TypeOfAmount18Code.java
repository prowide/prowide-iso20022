
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount18Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfAmount18Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AMTH"/&gt;
 *     &lt;enumeration value="BAGG"/&gt;
 *     &lt;enumeration value="CHTC"/&gt;
 *     &lt;enumeration value="DATA"/&gt;
 *     &lt;enumeration value="EXTK"/&gt;
 *     &lt;enumeration value="EXTR"/&gt;
 *     &lt;enumeration value="FARE"/&gt;
 *     &lt;enumeration value="INSU"/&gt;
 *     &lt;enumeration value="FDBV"/&gt;
 *     &lt;enumeration value="MISC"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="PHNE"/&gt;
 *     &lt;enumeration value="PRPY"/&gt;
 *     &lt;enumeration value="TOTL"/&gt;
 *     &lt;enumeration value="EXTF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfAmount18Code")
@XmlEnum
public enum TypeOfAmount18Code {


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
     * Amount that has been charged to card account
     * 
     */
    CHTC,

    /**
     * Data communication related charges
     * 
     */
    DATA,

    /**
     * Fee for exchanging a ticket (modifying an itinerary)
     * 
     */
    EXTK,

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
     * Insurance charges 
     * 
     */
    INSU,

    /**
     * Amount of food and beverages
     * 
     */
    FDBV,

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
     * Fee for exchanging a ticket (modifying an itinerary)
     * 
     */
    EXTF;

    public String value() {
        return name();
    }

    public static TypeOfAmount18Code fromValue(String v) {
        return valueOf(v);
    }

}
