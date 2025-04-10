
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OfferType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SQUE"/>
 *     <enumeration value="ERUN"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="FCFS"/>
 *     <enumeration value="FINL"/>
 *     <enumeration value="NDIS"/>
 *     <enumeration value="DISS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OfferType4Code")
@XmlEnum
public enum OfferType4Code {


    /**
     * Offer launched by a company, in possession of a large number of the shares (90% - 95%) of a company (generally as a result of a tender offer), in order to acquire the remaining shares of that company.
     * 
     */
    SQUE,

    /**
     * Exchange of Restricted to Unrestricted (or vice versa).
     * 
     */
    ERUN,

    /**
     * Offer made by the offeror for a portion of the outstanding shares not already owned by the offeror.
     * 
     */
    PART,

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
     * Dissenter’s rights are not applicable for this option of the offer.
     * 
     */
    NDIS,

    /**
     * Securities holder has the right to disagree with a mandatory event. This right is not inherent in all offers and therefore must be noted in announcements only when applicable.
     * 
     */
    DISS;

    public String value() {
        return name();
    }

    public static OfferType4Code fromValue(String v) {
        return valueOf(v);
    }

}
