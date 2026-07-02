
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareholdingType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShareholdingType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BENE"/&gt;
 *     &lt;enumeration value="NOMI"/&gt;
 *     &lt;enumeration value="OOAC"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
