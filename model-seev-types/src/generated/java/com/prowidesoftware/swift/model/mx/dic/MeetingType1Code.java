
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeetingType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AMET"/&gt;
 *     &lt;enumeration value="OMET"/&gt;
 *     &lt;enumeration value="XMET"/&gt;
 *     &lt;enumeration value="MIXD"/&gt;
 *     &lt;enumeration value="CLAS"/&gt;
 *     &lt;enumeration value="CORT"/&gt;
 *     &lt;enumeration value="SPCL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeetingType1Code")
@XmlEnum
public enum MeetingType1Code {


    /**
     * Specifies a meeting held periodically to approve the financial statements and elect the board members and the auditors.
     * 
     */
    AMET,

    /**
     * Specifies a meeting that is not planned in the by laws.
     * 
     */
    OMET,

    /**
     * Meeting that takes place as needed, in addition to the general meetings, is extraordinary as per the bylaws. The resolutions are related to the unusual business of the company, for example approval of takeovers or mergers or spin-offs. These meetings are always issuer initiated.
     * 
     */
    XMET,

    /**
     * Specifies a meeting which contains both ordinary and extraordinary resolutions.
     * 
     */
    MIXD,

    /**
     * Meeting for a class of assets.
     * 
     */
    CLAS,

    /**
     * Specifies that the meeting is the result of a legal proceeding.
     * 
     */
    CORT,

    /**
     * Meeting that takes place as needed that is neither ordinary nor extraordinary.
     * 
     */
    SPCL;

    public String value() {
        return name();
    }

    public static MeetingType1Code fromValue(String v) {
        return valueOf(v);
    }

}
