
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MeetingType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="XMET"/>
 *     <enumeration value="GMET"/>
 *     <enumeration value="MIXD"/>
 *     <enumeration value="SPCL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MeetingType2Code")
@XmlEnum
public enum MeetingType2Code {


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
    SPCL;

    public String value() {
        return name();
    }

    public static MeetingType2Code fromValue(String v) {
        return valueOf(v);
    }

}
