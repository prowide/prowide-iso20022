
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfferType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DISS"/&gt;
 *     &lt;enumeration value="ERUN"/&gt;
 *     &lt;enumeration value="FCFS"/&gt;
 *     &lt;enumeration value="FINL"/&gt;
 *     &lt;enumeration value="MINI"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="SQUE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OfferType1Code")
@XmlEnum
public enum OfferType1Code {


    /**
     * Securities holder has the right to disagree with a mandatory event. This right is not inherent in all offers and therefore must be noted in announcements only when applicable.
     * 
     */
    DISS,

    /**
     * Exchange of Restricted to Unrestricted (or vice versa).
     * 
     */
    ERUN,

    /**
     * Securities will be accepted in the order they have been submitted until the target number of quantity sought is reached.
     * 
     */
    FCFS,

    /**
     * Final or last offer to holders subject to offer conditions being reached, for example, 50 percent accepted on a tender.
     * 
     */
    FINL,

    /**
     * Tender offer for a security that is priced below the current trading price of that instrument.
     * 
     */
    MINI,

    /**
     * Offer made by the offeror for a portion of the outstanding shares not already owned by the offeror.
     * 
     */
    PART,

    /**
     * Offer launched by a company, in possession of a large number of the shares (90% - 95%) of a company (generally as a result of a tender offer), in order to acquire the remaining shares of that company.
     * 
     */
    SQUE;

    public String value() {
        return name();
    }

    public static OfferType1Code fromValue(String v) {
        return valueOf(v);
    }

}
