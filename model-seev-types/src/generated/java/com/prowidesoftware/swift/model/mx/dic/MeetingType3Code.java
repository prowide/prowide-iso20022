
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeetingType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="XMET"/&gt;
 *     &lt;enumeration value="GMET"/&gt;
 *     &lt;enumeration value="MIXD"/&gt;
 *     &lt;enumeration value="SPCL"/&gt;
 *     &lt;enumeration value="BMET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeetingType3Code")
@XmlEnum
public enum MeetingType3Code {


    /**
     * Meeting that takes place as needed, in addition to the general meetings, is extraordinary as per the bylaws. The resolutions are related to the unusual business of the company, for example approval of takeovers or mergers or spin-offs. These meetings are always issuer initiated.
     * 
     */
    XMET,

    /**
     * Includes annual and ordinary meeting. Statutory meeting(s) usually held at least once a year. The resolutions are related to the usual business of the company, for example approval of dividends, directors, etc. These meetings are always issuer initiated.
     * 
     */
    GMET,

    /**
     * Specifies a meeting which contains both ordinary and extraordinary resolutions.
     * 
     */
    MIXD,

    /**
     * Meeting that takes place as needed that is neither ordinary nor extraordinary.
     * 
     */
    SPCL,

    /**
     * Physical meeting of bond holders.
     * 
     */
    BMET;

    public String value() {
        return name();
    }

    public static MeetingType3Code fromValue(String v) {
        return valueOf(v);
    }

}
