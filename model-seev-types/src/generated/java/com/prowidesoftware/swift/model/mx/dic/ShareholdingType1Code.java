
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareholdingType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ShareholdingType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BENE"/>
 *     <enumeration value="NOMI"/>
 *     <enumeration value="OOAC"/>
 *     <enumeration value="UKWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ShareholdingType1Code")
@XmlEnum
public enum ShareholdingType1Code {


    /**
     * Shares are held on behalf of the beneficial owner. 
     * Usage: this type should be used to report assets the intermediary holds on behalf of a final beneficial owner.
     * 
     */
    BENE,

    /**
     * Shares are held on behalf of an intermediary.
     * Usage: this type should be used to report assets the intermediary holds on behalf of another intermediary.
     * 
     */
    NOMI,

    /**
     * Shares are held by the responding intermediary for its own account.
     * Usage: this type should only be used to report the intermediary’s own assets if and when the intermediary comingles them with the one of their clients.  Within jurisdictions where commingling is not allowed, this type should not be used.
     * 
     */
    OOAC,

    /**
     * Shareholding type is unknown.
     * Usage: this type should be used when the intermediary’s client hasn’t been classified.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static ShareholdingType1Code fromValue(String v) {
        return valueOf(v);
    }

}
