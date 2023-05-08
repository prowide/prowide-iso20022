
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount18Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfAmount18Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AMTH"/>
 *     <enumeration value="BAGG"/>
 *     <enumeration value="CHTC"/>
 *     <enumeration value="DATA"/>
 *     <enumeration value="EXTK"/>
 *     <enumeration value="EXTR"/>
 *     <enumeration value="FARE"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="FDBV"/>
 *     <enumeration value="MISC"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PHNE"/>
 *     <enumeration value="PRPY"/>
 *     <enumeration value="TOTL"/>
 *     <enumeration value="EXTF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
