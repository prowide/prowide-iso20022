
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyType7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACQR"/&gt;
 *     &lt;enumeration value="ITAG"/&gt;
 *     &lt;enumeration value="PCPT"/&gt;
 *     &lt;enumeration value="TMGT"/&gt;
 *     &lt;enumeration value="SALE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyType7Code")
@XmlEnum
public enum PartyType7Code {


    /**
     * Entity acquiring card transactions.
     * 
     */
    ACQR,

    /**
     * Party acting on behalf of other parties to process or forward data to other parties.
     * 
     */
    ITAG,

    /**
     * Party component of a POI system or POI terminal (Point of Interaction).
     * 
     */
    PCPT,

    /**
     * Responsible for one or several maintenance functions of a card payment acceptance terminal.
     * 
     */
    TMGT,

    /**
     * Party selling goods and services.
     * 
     */
    SALE;

    public String value() {
        return name();
    }

    public static PartyType7Code fromValue(String v) {
        return valueOf(v);
    }

}
