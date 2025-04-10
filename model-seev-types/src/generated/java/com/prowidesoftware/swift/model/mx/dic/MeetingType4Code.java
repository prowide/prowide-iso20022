
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MeetingType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="XMET"/>
 *     <enumeration value="GMET"/>
 *     <enumeration value="MIXD"/>
 *     <enumeration value="SPCL"/>
 *     <enumeration value="BMET"/>
 *     <enumeration value="CMET"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MeetingType4Code")
@XmlEnum
public enum MeetingType4Code {


    /**
     * Meeting that takes place as needed, in addition to the general meetings, is extraordinary as per the bylaws. The resolutions are related to the unusual business of the company, for example, approval of takeovers or mergers or spin-offs. These meetings are always issuer initiated.
     * 
     */
    XMET,

    /**
     * Includes annual and ordinary meetings. Statutory meeting(s) usually held at least once a year. The resolutions are related to the usual business of the company, for example, approval of dividends and directors. These meetings are always issuer initiated.
     * 
     */
    GMET,

    /**
     * Meeting which contains both ordinary and extraordinary resolutions.
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
    BMET,

    /**
     * Meeting is the result of a legal proceeding.
     * 
     */
    CMET;

    public String value() {
        return name();
    }

    public static MeetingType4Code fromValue(String v) {
        return valueOf(v);
    }

}
